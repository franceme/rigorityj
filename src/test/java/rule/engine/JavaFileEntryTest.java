package rule.engine;

import frontEnd.MessagingSystem.routing.EnvironmentInformation;
import frontEnd.MessagingSystem.routing.Listing;
import org.junit.After;
import org.junit.Before;
import util.Utils;

import java.io.ByteArrayOutputStream;

/**
 * <p>JavaFileEntryTest class.</p>
 *
 * @author franceme
 * @version $Id: $Id
 * @since V03.03.10
 */
public class JavaFileEntryTest {


    //region Attributes
    private final String baseRigorityJPath = System.getProperty("user.dir").replace("/main", "");
    private final String javaFilePath = Utils.osPathJoin(
            baseRigorityJPath, "testable-jar", "src",
            "main", "java", "tester", "Crypto.java");

    private final EngineType fileType = EngineType.JAVAFILES;
    private final EntryHandler handler = new JavaFileEntry();

    //region Used for any testing through the src/main entry points
    private ByteArrayOutputStream customStream;
    private EnvironmentInformation info;
    private final Listing output = Listing.ScarfXML;
    //endregion

    //endregion

    //region Test Environment Setup

    /**
     * <p>setUp.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @Before
    public void setUp() throws Exception {
        this.customStream = new ByteArrayOutputStream();
    }

    /**
     * <p>tearDown.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @After
    public void tearDown() throws Exception {
        this.customStream = null;
        this.info = null;
    }
    //endregion
}