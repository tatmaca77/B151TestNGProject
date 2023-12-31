package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class Hausaufgabe {

    /**
    Soft Assert Class Work
Yeni bir Class Olusturun : C03_SoftAssert
1. “http://zero.webappsecurity.com/” Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
(dollar)","Thailand (baht)"
     */

    @BeforeMethod
    public void setUp() {
        System.out.println("Test01 baslatildi.");
    }

    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");


        // 2. Sign in butonuna basin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        Thread.sleep(2000);


        /**                   1.YOL
         *
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

         */


        /**                   2.YOL                     */

        /*
        3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
         */
        Actions action = new Actions(driver);

        WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));

        action.click(login).
                sendKeys("username").
                sendKeys(Keys.TAB).
                sendKeys("password").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();

        Thread.sleep(2000);

        // Syfa kendine gelsin diye back yaptim.
        driver.navigate().back();

        Thread.sleep(2000);


        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();

        Thread.sleep(2000);

        WebElement payBills = driver.findElement(By.xpath("//span[@id='pay_bills_link']"));

        action.scrollToElement(payBills);
        payBills.click();

        Thread.sleep(2000);



        // 7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("(//li[@class='ui-state-default ui-corner-top'])[2]")).click();

        Thread.sleep(2000);


        // 8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm = driver.findElement(By.xpath("//select[@id='pc_currency']"));

        Select select = new Select(ddm);

        select.selectByVisibleText("Eurozone (euro)");


        Thread.sleep(2000);



        // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(select,"Eurozone (euro)");



        // 10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test

        /** Tekrar ddm locate ettik. */
        WebElement currency = driver.findElement(By.xpath("//select[@name='currency']"));

        /** Tekrar select objesi olusturdum */
        Select select2 = new Select(currency);

        /** Tüm secenekleri almak icin getOptions kullandim ve list icine attim */
        List<WebElement> liste = select2.getOptions();

        /** Expected yani beklenileni String icine attim karsilastirma yaparken kolay olmasi icin */
        String options = "\"Select One\", \"Australia (dollar)\", \"Canada (dollar)\",\"Switzerland\n" +
                "(franc)\",\"China (yuan)\",\"Denmark (krone)\",\"Eurozone (euro)\",\"Great Britain\n" +
                "(pound)\",\"Hong Kong (dollar)\",\"Japan (yen)\",\"Mexico (peso)\",\"Norway\n" +
                "(krone)\",\"New Zealand (dollar)\",\"Sweden (krona)\",\"Singapore\n" +
                "(dollar)\",\"Thailand (baht)\"";

        /** Lambda ile tüm secenekleri konsola yazdirdim */
        liste.stream().forEach(t-> System.out.println(t.getText()));


        /** En son da daha önce olusturdugum SoftAssert ile kontrolümü yaptim */
        softAssert.assertTrue(liste.contains(options));

        /** AssertAll ile kontolün bittigini belirttim. Eger hata varsa bile devam eder ama kendisinden sonra bir kod
           varsa o calismaz. Ancak bu durumda kednisinden sonra bir kod yaok ve hic bir FAIL DURUMUDA YOKTUR.
         */

    }

    @Test @Ignore
    public void test02() {
        System.out.println("Bu method gecici olarak calismayacaktir.");
    }

    @Test (enabled = false)
    public void testName() {
        System.out.println("Bu method hic bir zaman calismayacaktir. Ve raporlamada olmayacaktir.");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Test01 sonlandirildi.");
    }
}
