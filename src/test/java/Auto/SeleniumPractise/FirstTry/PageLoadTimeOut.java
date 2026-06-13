package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		
		driver.get("http://selenium143.blogspot.com/");
		WebElement LinkClick=driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
		
		LinkClick.click();
		
		

	}

}
