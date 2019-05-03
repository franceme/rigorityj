package frontEnd;

import frontEnd.MessagingSystem.routing.Listing;
import rule.engine.EngineType;

/**
 * <p>argsIdentifier class.</p>" -o " + tempFileOutApk_Scarf
 *
 * @author RigorityJTeam
 * Created on 2/5/19.
 * @version $Id: $Id
 * @since 03.00.00
 *
 * <p>The central point for identifying the arguments and their description.</p>
 */
public enum argsIdentifier {

    FORMAT("in", "format", "(Req'd) The format of input you want to scan, available styles " + EngineType.retrieveEngineTypeValues() + "."),
    SOURCE("s", "file(s)/dir", "(Req'd) The source(s) to be scanned, use the absolute path)."),
    DEPENDENCY("d", "dir", "The dependency to be scanned, (use the relative path)."),
    OUT("o", "file", "The file to be created with the output (default will be the project name)."),
    TIMEMEASURE("t", null, "Output the time of the internal processes."),
    FORMATOUT("m", "formatType", "The output format you want to produce " + Listing.getShortHelp() + "."),
    PRETTY("n", null, "Output the analysis information in a 'pretty' format."),
    SKIPINPUTVALIDATION("x", null, "Skip input validation."),
    EXPERIMENTRESULTS("exp", null, "View the experiment based results."),
    VERSION("v", null, "Output the version number."),
    TIMESTAMP("ts", null, "Add a timestamp to the file output."),
    LOG("L", null, "Enable logging to the console."),
    STREAM("st", null, "Stream the analysis to the output file (still being tested)."),
    HELP("h", null, "Print out the Help Information.");

    private String id;
    private String defaultArg;
    private String desc;

    argsIdentifier(String id, String defaultArg, String desc) {
        this.id = id;
        this.defaultArg = defaultArg;
        this.desc = desc;
    }

    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getId() {
        return this.id;
    }

    /**
     * <p>getArg.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getArg() {
        return "-" + this.id;
    }

    /**
     * <p>Getter for the field <code>desc</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDesc() {
        return this.name() + ": " + this.desc;
    }

    /**
     * <p>hasDefaultArg.</p>
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean hasDefaultArg() {
        return defaultArg != null;
    }

    /**
     * <p>Getter for the field <code>defaultArg</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDefaultArg() {
        return defaultArg;
    }

    /**
     * <p>Setter for the field <code>defaultArg</code>.</p>
     *
     * @param defaultArg a {@link java.lang.String} object.
     */
    public void setDefaultArg(String defaultArg) {
        this.defaultArg = defaultArg;
    }

    /**
     * <p>lookup.</p>
     *
     * @param id a {@link java.lang.String} object.
     * @return a {@link frontEnd.argsIdentifier} object.
     */
    public static argsIdentifier lookup(String id) {
        for (argsIdentifier in : argsIdentifier.values())
            if (in.getId().equals(id))
                return in;
        return null;
    }

}