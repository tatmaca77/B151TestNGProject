package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/**
                             POM(Page Object Model)
    Test senaryolarının daha az kod ile yazılmasına ve bakımının daha kolay yapılmasına
    olanak sağlayan yazılım test yöntemidir. "TestNG" de ve "CUCUMBER" da "POM" kalıbını kullanırız.
 */

/**  SingletonPattern = Tekli Kullanım  */

public class Driver {

    static WebDriver driver;
    private Driver(){
        /**
        Driver class'ından obje oluşturmanın önüne geçmek için
      default constructor'ı private yaparak bunun önüne geçebiliriz.
      Bu uygulamaya "singleton patter" denir.
         */
    }

    public static WebDriver getDriver() {  /** Methodlari static yapariz diger Class'larda sadece method ismi ile cagirmak icin. */
        /**
         Driver'i her çağırdığımızda yeni bir pencere açılmasının önüne geçmek için
         if bloğu içinde Eğer driver'a değer atanmamışsa değer ata, eğer değer atanmışsa
         Driver'i aynı sayfada return et.
         */
        if (driver == null){ // --> Driver'a deger atanmamissa
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }
    public static void closeDriver(){
        if (driver != null){ //-->driver'a değer ATANMIŞSA, yani bos degilse
            driver.close();
            driver = null; //-->driver'ı kapattıktan sonra boşalt
        }

    }
    public static void quitDriver(){
        if (driver != null){ //-->driver'a değer ATANMIŞSA
            driver.quit();
            driver = null; //-->driver'ı kapattıktan sonra boşalt
        }
    }

}