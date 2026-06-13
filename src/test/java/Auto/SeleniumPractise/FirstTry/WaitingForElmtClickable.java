package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingForElmtClickable {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://verifalia.com/validate-email");
		WebElement emailAddField = driver.findElement(By.id("inputData"));
		emailAddField.sendKeys("sne@2.com");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clickableValidate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']")));
		clickableValidate.click();
		

	}

}
