package rule;

import analyzer.UniqueRuleAnalyzer;
import frontEnd.Interface.outputRouting.ExceptionHandler;
import frontEnd.MessagingSystem.AnalysisIssue;
import frontEnd.MessagingSystem.routing.outputStructures.OutputStructure;
import rule.engine.EngineType;
import rule.engine.RuleChecker;
import slicer.forward.ForwardInfluenceInstructions;
import slicer.forward.SlicingCriteria;
import slicer.forward.SlicingResult;
import soot.*;
import soot.jimple.IfStmt;
import soot.jimple.internal.JAssignStmt;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.graph.UnitGraph;
import util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>SSLSocketFactoryFinder class.</p>
 *
 * @author CryptoguardTeam
 * @version 03.07.01
 * @since V01.00.00
 */
public class SSLSocketFactoryFinder implements RuleChecker {

//  Ref:  https://developer.android.com/training/articles/security-ssl.html

    private static final List<String> SLICING_CRITERIA = new ArrayList<>();

    static {

        SLICING_CRITERIA.add("<javax.net.ssl.SSLSocketFactory: javax.net.SocketFactory getDefault()>");
        SLICING_CRITERIA.add("<javax.net.ssl.SSLContext: javax.net.ssl.SSLSocketFactory getSocketFactory()>");
        SLICING_CRITERIA.add("<javax.net.ssl.HttpsURLConnection: javax.net.ssl.SSLSocketFactory getDefaultSSLSocketFactory()>");
    }

    private static final String METHOD_TO_FIND = "<javax.net.ssl.HostnameVerifier: boolean verify(java.lang.String,javax.net.ssl.SSLSession)>";

    /**
     * {@inheritDoc}
     */
    @Override
    public void checkRule(EngineType type, List<String> projectJarPath, List<String> projectDependencyPath, List<String> sourcePaths, OutputStructure output, String mainKlass) throws ExceptionHandler {

        for (String slicing_criterion : SLICING_CRITERIA) {

            SlicingCriteria criteria = new SlicingCriteria(slicing_criterion);
            Map<String, List<Unit>> analysisLists = getForwardSlice(
                    UniqueRuleAnalyzer.environmentRouting(projectJarPath, projectDependencyPath, type)
                    , criteria);

            for (String method : analysisLists.keySet()) {

                if (method.contains("java.net.Socket createSocket")) { // ignore cases that are from subclasses of SocketFactory
                    continue;
                }

                List<Unit> analysis = analysisLists.get(method);

                if (!analysis.isEmpty()) {

                    boolean isVulnerable = true;
                    ValueBox defBox = null;

                    boolean getSocketAppeared = false;

                    for (Unit unit : analysis) {

                        if (unit instanceof JAssignStmt) {
                            if (((JAssignStmt) unit).containsInvokeExpr()
                                    && ((JAssignStmt) unit).getInvokeExpr().toString().contains("createSocket")) {
                                getSocketAppeared = true;
                            }
                        }

                        if (getSocketAppeared && unit.toString().contains(METHOD_TO_FIND) && unit.getDefBoxes().size() > 0) {
                            defBox = unit.getDefBoxes().get(0);
                        }

                        if (defBox != null && unit instanceof IfStmt) {
                            IfStmt ifStmt = (IfStmt) unit;
                            if (ifStmt.getConditionBox().getValue().toString().contains(defBox.getValue().toString())) {
                                isVulnerable = false;
                            }
                        }
                    }

                    if (getSocketAppeared && isVulnerable) {
                        AnalysisIssue issue = new AnalysisIssue(method, 12,
                                "Didn't manually verify hostname in " +
                                        Utils.retrieveMethodFromSootString(method), sourcePaths);

                        output.addIssue(issue);

                    }

                }
            }
        }
    }

    private static Map<String, List<Unit>> getForwardSlice(List<String> classNames, SlicingCriteria slicingCriteria) {

        Map<String, List<Unit>> analysisListMap = new HashMap<>();

        for (String className : classNames) {

            SootClass sClass = Scene.v().loadClassAndSupport(className);

            sClass.setApplicationClass();

            for (SootMethod method : sClass.getMethods()) {

                if (method.toString().contains("java.net.Socket createSocket")) {
                    continue;
                }

                SlicingResult slicingResult = getInfluencingInstructions(slicingCriteria, method);

                if (slicingResult != null) {
                    analysisListMap.put(method.toString(), slicingResult.getAnalysisResult());
                }
            }
        }

        return analysisListMap;
    }

    /**
     * <p>getInfluencingInstructions.</p>
     *
     * @param slicingCriteria a {@link slicer.forward.SlicingCriteria} object.
     * @param m               a {@link soot.SootMethod} object.
     * @return a {@link slicer.forward.SlicingResult} object.
     */
    public static SlicingResult getInfluencingInstructions(SlicingCriteria slicingCriteria,
                                                           SootMethod m) {
        if (m.isConcrete()) {

            Body b = m.retrieveActiveBody();

            UnitGraph graph = new ExceptionalUnitGraph(b);
            ForwardInfluenceInstructions vbe = new ForwardInfluenceInstructions(graph, slicingCriteria);
            return vbe.getSlicingResult();
        }
        return null;
    }
}
