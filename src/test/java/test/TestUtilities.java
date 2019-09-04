package test;

import frontEnd.MessagingSystem.routing.Listing;
import frontEnd.MessagingSystem.routing.inputStructures.ScarfXMLId;
import frontEnd.argsIdentifier;
import rule.engine.EngineType;
import util.Utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>TestUtilities class.</p>
 *
 * @author franceme
 * @version $Id: $Id
 * @since V03.03.10
 */
public class TestUtilities {


    //region String Statics
    /**
     * Constant <code>isLinux</code>
     */
    public static final Boolean isLinux = !System.getProperty("os.name").contains("Windows");

    /**
     * Constant <code>basePath="System.getProperty(user.dir)"</code>
     */
    public static final String basePath = System.getProperty("user.dir");
    /**
     * Constant <code>scarfArgs="Utils.osPathJoin(basePath, src, main, r"{trunked}</code>
     */
    public static final String scarfArgs = Utils.osPathJoin(basePath, "src", "main", "resources", "Scarf", "sample.properties");
    /**
     * Constant <code>srcOneGrv="Utils.osPathJoin(basePath, samples, tes"{trunked}</code>
     */
    public static final String testRec = Utils.osPathJoin(basePath, "samples");
    public static final String srcOneGrv = Utils.osPathJoin(testRec, "testable-jar");
    public static final String javaSource = Utils.osPathJoin(srcOneGrv, "src", "main", "java", "tester");
    public static final String classSource = Utils.osPathJoin(srcOneGrv, "build", "classes", "java", "main", "tester");
    public static final String[] classFiles = {Utils.osPathJoin(classSource, "PBEUsage.class"), Utils.osPathJoin(classSource, "UrlFrameWorks.class"), Utils.osPathJoin(classSource, "NewTestCase1.class"), Utils.osPathJoin(classSource, "NewTestCase2.class")};
    public static final String[] javaFiles = {Utils.osPathJoin(javaSource, "PBEUsage.java"), Utils.osPathJoin(javaSource, "UrlFrameWorks.java")};
    /**
     * Constant <code>jarOne="Utils.osPathJoin(basePath, samples, tes"{trunked}</code>
     */
    public static final String jarOne = Utils.osPathJoin(testRec, "testable-jar", "build", "libs", "testable-jar.jar");
    /**
     * Constant <code>srcOneGrvDep="Utils.osPathJoin(basePath, samples, tes"{trunked}</code>
     */
    public static final String srcOneGrvDep = Utils.osPathJoin(testRec, "testable-jar", "build", "dependencies");
    /**
     * Constant <code>testPath="Utils.osPathJoin(basePath, build, tmp)"</code>
     */
    public static final String testPath = Utils.osPathJoin(basePath, "build", "tmp");
    public static final String javaFileOne = Utils.osPathJoin(basePath, "build", "tmp", "java-file_One.xml");
    public static final String javaFileTwo = Utils.osPathJoin(basePath, "build", "tmp", "java-file_Two.txt");
    public static final String javaFileThree = Utils.osPathJoin(basePath, "build", "tmp", "java-file_Three.txt");
    /**
     * Constant <code>pathToSchema="Utils.osPathJoin(basePath, src, main, r"{trunked}</code>
     */
    public static final String pathToSchema = Utils.osPathJoin(basePath, "src", "main", "resources", "Scarf", "scarf_v1.2.xsd");
    /**
     * Constant <code>pathToAPK="Utils.osPathJoin(basePath, samples, app"{trunked}</code>
     */
    public static final String pathToAPK = Utils.osPathJoin(testRec, "app-debug.apk");
    public static final String tempFileOutTxt = Utils.osPathJoin(testPath, "testable-jar.txt");
    public static final String tempFileOutXML = Utils.osPathJoin(testPath, "testable-jar.xml");
    public static final String tempStreamXML = Utils.osPathJoin(testPath, "testable-jar_Stream.xml");
    public static final String tempFileOutTxt_two = Utils.osPathJoin(testPath, "testable-jar_classFiles.txt");
    public static final String tempFileOutXML_two = Utils.osPathJoin(testPath, "testable-jar_classFiles.xml");
    public static final String tempFileOutTxt_Class = Utils.osPathJoin(testPath, "java-class-file.txt");
    public static final String tempFileOutXML_Class = Utils.osPathJoin(testPath, "java-class-file.xml");
    public static final String tempFileOutXML_Class_Stream = Utils.osPathJoin(testPath, "java-class-file-stream.xml");


    public static final String tempFileOutApk = Utils.osPathJoin(testPath, "app-debug.txt");
    public static final String tempFileOutApk_Steam = Utils.osPathJoin(testPath, "app-debug_Stream.txt");
    public static final String tempFileOutApk_Scarf = Utils.osPathJoin(testPath, "app-debug.xml");
    public static final String tempFileOutApk_Scarf_Steam = Utils.osPathJoin(testPath, "app-debug_Stream.xml");
    public static final String tempFileOutApk_Default = Utils.osPathJoin(testPath, "app-debug.json");
    public static final String tempFileOutApk_Default_Steam = Utils.osPathJoin(testPath, "app-debug_Stream.json");

    public static final String tempJarFile_txt = Utils.osPathJoin(testPath, "tempJarFile_txt.txt");
    public static final String tempJarFile_Scarf_0 = Utils.osPathJoin(testPath, "tempJarFile_Scarf_0.xml");
    public static final String tempJarFile_Scarf_1 = Utils.osPathJoin(testPath, "tempJarFile_Scarf_1.xml");
    public static final String tempJarFile_Scarf_2 = Utils.osPathJoin(testPath, "tempJarFile_Scarf_2.xml");
    public static final String tempJarFile_Scarf_Steam_1 = Utils.osPathJoin(testPath, "tempJarFile_Scarf_Steam_1.xml");
    public static final String tempJarFile_Default_0 = Utils.osPathJoin(testPath, "tempJarFile_Default_0.json");
    public static final String tempJarFile_Default_Stream_0 = Utils.osPathJoin(testPath, "tempJarFile_Default_Stream_0.json");


    public static final ArrayList<String> sampleAuxClassPathOneList = new ArrayList<String>(Arrays.asList(testRec, jarOne, javaFiles[0], javaFiles[1], classFiles[0], classFiles[1]));
    public static final String sampleAuxClassPathOne = Utils.join(":", sampleAuxClassPathOneList);

    public static final ArrayList<String> sampleAuxClassPathTwoList = new ArrayList<String>(Arrays.asList(testRec, jarOne, javaFiles[0], javaFiles[1], classFiles[0], classFiles[1], scarfArgs));
    public static final String sampleAuxClassPathTwo = Utils.join(":", sampleAuxClassPathTwoList);
    //endregion

    /**
     * <p>makeArg.</p>
     *
     * @param id    a {@link frontEnd.argsIdentifier} object.
     * @param value a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String makeArg(argsIdentifier id, String value) {
        return makeArg(id.getId(), value);
    }

    public static String makeArg(argsIdentifier id, EngineType value) {
        return makeArg(id.getId(), value.getFlag());
    }

    /**
     * <p>makeArg.</p>
     *
     * @param id a {@link frontEnd.argsIdentifier} object.
     * @return a {@link java.lang.String} object.
     */
    public static String makeArg(argsIdentifier id) {
        return " " + id.getArg() + " ";
    }

    /**
     * <p>makeArg.</p>
     *
     * @param id    a {@link frontEnd.MessagingSystem.routing.inputStructures.ScarfXMLId} object.
     * @param value a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String makeArg(ScarfXMLId id, String value) {
        return makeArg(id.getId(), value);
    }

    /**
     * <p>makeArg.</p>
     *
     * @param id    a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String makeArg(String id, String value) {
        return " -" + id + " " + value + " ";
    }

    /**
     * <p>makeArg.</p>
     *
     * @param id    a {@link frontEnd.argsIdentifier} object.
     * @param value a {@link frontEnd.MessagingSystem.routing.Listing} object.
     * @return a {@link java.lang.String} object.
     */
    public static String makeArg(argsIdentifier id, Listing value) {
        return makeArg(id, value.getFlag());
    }
}
