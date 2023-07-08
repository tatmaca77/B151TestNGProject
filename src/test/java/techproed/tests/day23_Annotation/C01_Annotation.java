package techproed.tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {
    /**
    BeforeSuite , test ve class en basta bir sefer ..AfterSuite, test ve class en son da bir sefer calisir
    before ve after methodlar ise her testin basinda sonunda bir kez calisir
     */

    @BeforeSuite
    public void suite() {
        System.out.println("Her seyden once BeforeSuite bir kez calisir");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Testlerden once bir kez BeforeTest calisir");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Her Class'tan once BeforeClass bir kez calisir");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Junitteki @Before notasyonu gibi her methottan once calisir");
    }

    @Test
    public void testtest01() {
        System.out.println("Test01 calisti");
    }

    @Test
    public void testtest02() {
        System.out.println("Test02 calisti");
    }

    @Test
    public void testtest03() {
        System.out.println("Test03 calisti");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Her seyden sonra 1 kez calisir.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Testlerden sonra 1 kez calisir.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Her Class'tan sonra 1 kez calisir.");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Junit'teki @After notasyonu gibi her method'tan sonra calisir.");
    }


}
