package AlertsHandlings;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertINFO {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		WebElement ClickBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		ClickBtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		String TextOnAlert=alert.getText();
		System.out.println(TextOnAlert);
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		
		//driver.switchTo().defaultContent(); selenium controlling coming into the pageload from alert
		
		WebElement text1= driver.findElement(By.xpath("//p[@id='result']"));
		
		String PageOnText =text1.getText();
		System.out.println(PageOnText);
	
	
	
	}

}
