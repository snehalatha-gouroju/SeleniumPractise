package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement alertbtn=driver.findElement(By.xpath("//input[@id='alert1']"));
		alertbtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		String TextOnAlert=alert.getText();
		System.out.println(TextOnAlert);
		Thread.sleep(4000);
		alert.accept();
	}

}
