package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {

    WebDriver driver;
    @AfterMethod
    public void tearDown() {
        //driver.close();   //Burda her test methodlarindan sonra AfterMethod calisacagi icin driver.close yaparsak ilerlemez.
    }

    @BeforeClass
    public void setUp() {   // Class basinda 1 kez calisir.Sonra test01 calistirdi sonra bagli oldugu test methdolari calistirdi.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();     // BeforeMethod calistiraydik hataya düserdik. Her methodtan önce 1 kez calisirdi.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
    }
    @Test
    public void test03() {
        System.out.println("test03");
    }
    @Test(dependsOnMethods = "test03")
    public void test04() {
        System.out.println("test04");
    }

    @Test(dependsOnMethods = "test04")
    public void test05() {
        System.out.println("test05");
    }

    @Test(priority = 5)
    public void test06() {
        System.out.println("test06");
    }

}