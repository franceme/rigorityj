package main.frontEnd.MessagingSystem.routing;

import main.frontEnd.MessagingSystem.routing.inputStructures.InputStructure;
import main.frontEnd.MessagingSystem.routing.outputStructures.OutputStructure;
import main.rule.engine.EngineType;

/**
 * The enum containing all of the different messaging types available for the user.
 *
 * @author franceme
 * @since V01.00.00
 */
public enum Listing {
    //region Different Values
    Legacy("Legacy", "L"),
    ScarfXML("ScarfXML", "SX");
    //endregion
    //region Attributes
    private String type;
    private String flag;
    private final String inputPath = "main.frontEnd.MessagingSystem.routing.inputStructures";
    private final String outputPath = "main.frontEnd.MessagingSystem.routing.outputStructures";
    //endregion

    //region Constructor
    /**
     * The inherint constructor of all the enum value types listed here
     *
     * @param Type - the string value of the type of
     * @param Flag - the flag used to identify the specific messaging type
     */
    Listing(String Type, String Flag) {
        this.type = Type;
        this.flag = Flag;
    }
    //endregion

    //region Overridden Methods

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "{ \"type\": \"" + this.type + "\", \"flag\": \"" + this.flag + "\"}";
    }
    //endregion

    //region Getter

    /**
     * The dynamic loader for the Listing Type based on the flag
     *
     * @param flag {@link java.lang.String} - The input type looking for the flag type
     * @return {@link Listing} - The messaging Type retrieved by flag, if not found the default will be used
     */
    public static Listing retrieveListingType(String flag) {
        for (Listing type : Listing.values())
            if (type.flag.equals(flag))
                return type;

        return Listing.Legacy;
    }

    /**
     * Getter for flag
     *
     * <p>getFlag()</p>
     *
     * @return a {@link String} object.
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Getter for type
     *
     * <p>getType()</p>
     *
     * @return {@link String} - The type.
     */
    public String getType() {
        return type;
    }
    //endregion

    //region Helpers Based on the enum type

    /**
     * A method to dynamically retrieve the type of messaging structure asked for by the flag type.
     * NOTE: if there is any kind of issue instantiating the class name, it will default to the Legacy Output
     *
     * @return outputStructure - the type of messaging structure to be used to return information
     */
    public OutputStructure getTypeOfMessagingOutput() {


        try {
            //Return a dynamically loaded instantiation of the class
            return (OutputStructure) Class.forName(this.outputPath + "." + this.type).newInstance();
        }
        //In Case of any error, default to the Legacy Output
        catch (Exception e) {
            return new main.frontEnd.MessagingSystem.routing.outputStructures.Legacy();
        }
    }

    /**
     * A method to dynamically retrieve the type of messaging structure asked for by the flag type.
     * NOTE: if there is any kind of issue instantiating the class name, it will default to the Legacy Input
     *
     * @return outputStructure - the type of messaging structure to be used to return information
     */
    public InputStructure getTypeOfMessagingInput() {

        try {
            //Return a dynamically loaded instantiation of the class
            return (InputStructure) Class.forName(inputPath + "." + this.type).newInstance();
        } catch (Exception e) {
            return new main.frontEnd.MessagingSystem.routing.inputStructures.Legacy();
        }
    }

    /**
     * The method retrieving all of the input help for each of the messaging system types
     *
     * @return {@link java.lang.String} - The full multi-line string describing help for each type
     */
    public static String getInputHelp() {
        StringBuilder help = new StringBuilder();
        help.append("===========================================================\n");
        help.append("key: {}=required ()=optional \n");
        help.append("General Useage : java -jar {thisJar} {Engine Flag, as shown below} {.apk/.jar file, .class/.java file(s), or sourcecode dir} ({-d} {dir of dependencies for .class/.jar file(s), \"\" if there are none}) (Output Type flag) ({required depending on the output Type}) \n");
        help.append(EngineType.getHelp());
        help.append("===========================================================\n\n");

        for (Listing type : Listing.values()) {
            help.append("===========================================================\n");
            help.append("Type : ").append(type.type).append("\n");
            help.append("Flag : ").append(type.flag).append("\n");
            help.append(type.getTypeOfMessagingInput().helpInfo()).append("\n");
            help.append("===========================================================\n\n");
        }

        return help.toString();
    }
    //endregion
}