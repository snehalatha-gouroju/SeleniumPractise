package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRS {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
;		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sneha");
		driver.findElement(By.name("inputPassword")).sendKeys("sneha12345");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='* Incorrect username or password']")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9398286646");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
	    //driver.findElement(By.xpath("//button[contains(@class='submit']")).click();

	    //driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	
	    //driver.findElement(By.xpath("//form/input[2]")).sendKeys("snehagoroju@gmail.com");
//
     // driver.findElement(By.xpath("go-to-login-btn")).click();
      //driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

      System.out.println(driver.findElement(By.xpath("//form/p")).getText());
      Thread.sleep(1000);
         driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
 	   Thread.sleep(1000);
         
         
         driver.findElement(By.cssSelector("#inputUsername")).sendKeys("snehalatha");
         driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("sneha12345");
      // driver.findElement(By.id("chkboxOne")).click();
     //driver.findElement(By.xpath("//div[@class='checkbox-container']/span[1]/label")).click();
      driver.findElement(By.id("chkboxOne")).click(); 
       //driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]"));
      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	}
}
