package Auto.SeleniumPractise.FirstTry;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTry {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//Thread.sleep(3000);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  driver.findElement(By.id("inputUsername")).sendKeys("sneha");
	  driver.findElement(By.name("inputPassword")).sendKeys("12345");
	  driver.findElement(By.className("signInBtn")).click();
	  //System.out.println(driver.findElement(By.cssSelector("p.error")).getText();
	 // driver.findElement(By.xpath[name "inputPassword"]);
	    
	
	 
     
	}

}

