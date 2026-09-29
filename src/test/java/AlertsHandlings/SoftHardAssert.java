package AlertsHandlings;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftHardAssert {

    public static void main(String[] args){

        SoftAssert soft=new SoftAssert();

        WebDriver driver=new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          //Hard assert
        //Assert.assertTrue(driver.getTitle().equals("xyz"));

        soft.assertTrue(driver.getTitle().equals("xyz"));



        driver.findElement(By.id("input-email")).sendKeys("snehagouroju804@gmail.com");

        driver.findElement(By.id("input-password")).sendKeys("Gouroju12345");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
