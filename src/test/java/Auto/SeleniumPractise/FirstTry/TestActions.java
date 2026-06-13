package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.className("//input[@name='password']")).sendKeys("Admin123");
	    driver.findElement(By.xpath("//button[text()=' Login '])")).click();
	   driver.findElement(By.xpath("//span[text()='Admin']"));
	   
	   
	 //a[@class='oxd-main-menu-item active'] 
	 //a[text()='Locations']
	
	
	}

}
