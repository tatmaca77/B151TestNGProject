package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.Driver;

public class OpenSourcePageClass {

    public static WebElement username (){
        return Driver.getDriver().findElement(By.xpath("//*[@name='username']"));
    }

    public static WebElement password (){
        return Driver.getDriver().findElement(By.xpath("//*[@name='password']"));
    }

    public static WebElement submitbutton (){
        return Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
    }

    public static WebElement verify (){
        return Driver.getDriver().findElement(By.xpath("//h6"));
    }

}
