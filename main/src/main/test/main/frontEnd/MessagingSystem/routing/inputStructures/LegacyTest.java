package main.frontEnd.MessagingSystem.routing.inputStructures;

import main.frontEnd.MessagingSystem.routing.EnvironmentInformation;
import main.frontEnd.MessagingSystem.routing.Listing;
import main.rule.engine.EngineType;
import org.junit.After;
import org.junit.Before;

public class LegacyTest {

    //region Attributes
    private EnvironmentInformation testInfo;
    private String[] args;
    private Legacy inputTest;
    private final EngineType type = EngineType.APK;
    private final String dependencies = null;
    private final String helpString = "No extra inputs are needed for this output type\nThis is the default output type";
    //endregion

    //region Test Environment Management
    @Before
    public void setUp() throws Exception {
        inputTest = new Legacy();
        args = new String[]{"TestSource", type.getName(), dependencies, Listing.Legacy.getFlag()};
    }

    @After
    public void tearDown() throws Exception {
        testInfo = null;
        args = null;
        inputTest = null;
    }
    //endregion
}