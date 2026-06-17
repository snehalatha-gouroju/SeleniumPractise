package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAjaxCalls {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement Dropdown=driver.findElement(By.xpath("//button[text()='Dropdown']"));
		Dropdown.click();
		
		WebDriverWait obj=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement flipkart =obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		flipkart.click();
///html
		
	
	}

}
