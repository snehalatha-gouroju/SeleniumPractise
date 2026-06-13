package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickableWaiting{
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown=driver.findElement(By.xpath("//button[text()='Check this']"));
		
		dropdown.click();
		
		WebDriverWait flipkartOpt=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		@NonNull
		WebElement Openflipkart = flipkartOpt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
		Openflipkart.click();
	}

}
