package techproed.tests.day23_Annotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BeforeGroupsAfterGroups {

    WebDriver driver;
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("En basta beforeSuite calisir. Test FAILDE olsa bile calisir. Cünkü Herseyden önce calisir.");
    }
    @BeforeGroups({"gp1","tolga"}) // Farkli iki grupu baglayabiliriz. Araya süslü parantez atarak!!!!
    public void beforeGroups() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(groups = "gp1")                /** Biz bazi methodlarimizi gruplandirma yapabiliriz. */
    public void test01() {
        String amazonUrl = "https://amazon.com";
        driver.get(amazonUrl);
    }

    @Test(groups = "gp1")
    public void test02() {
        String youtubeUrl = "https://youtube.com";
        driver.get(youtubeUrl);
        driver.close();    // Burda driver.close ile kapatmamiza ragmen gruplandirma yaptigimiz icin hemen facebook'a gitti.
    }

    @Test(groups = "tolga")
    public void test03() {
        String facebookUrl = "https://facebook.com";
        driver.get(facebookUrl);
    }
}
