package AlertsHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assertion {

    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("input-email")).sendKeys("snehagouroju804@mail.com");

        driver.findElement(By.id("input-password")).sendKeys("gouroju12345");

        driver.findElement(By.xpath("//input[@value='Login']")).click();



    }
}
