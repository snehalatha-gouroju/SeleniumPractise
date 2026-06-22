package AlertsHandlings;

//import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertException {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//without exception
		
		/* 
		WebElement btnOne=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		btnOne.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
	
		String TextOnAlert=alert.getText();
		System.out.println(TextOnAlert);
		
		Thread.sleep(3000);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		
		
		WebElement PageHeading = driver.findElement(By.xpath("//div[@class='example']/h3[1]"));
		String PageOnText=PageHeading.getText();
		System.out.println(PageOnText);

		
		*/
		
		//or with exception
		
		WebElement BtnOne=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		BtnOne.click();
		//Thread.sleep(2000);
		
		WebElement gettingText=driver.findElement(By.xpath("//h3[text()='JavaScript Alerts']"));
		String PageOnText=gettingText.getText();
		System.out.println(PageOnText);
			
		}
//pop-up window
		
		
		

}

