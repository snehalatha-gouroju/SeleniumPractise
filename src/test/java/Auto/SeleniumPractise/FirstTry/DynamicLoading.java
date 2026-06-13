package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(2000);
		//WebElement StartBtn = driver.findElement(By.xpath("//button[text()='Start']"));
		//StartBtn.click();
		//Thread.sleep(2000);
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement AfterLoading=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		//String text=AfterLoading.getText();
	    //System.out.println(text);
		//
		
		//or
		WebElement StartBtn = driver.findElement(By.xpath("//button[text()='Start']"));
		StartBtn.click();
		Thread.sleep(2000);
		WebElement startBtn=driver.findElement(By.xpath("//div[@id='start']/img"))	;
		startBtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']/img")));  //ajax call so waiting
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement text1=wait.until(ExpectedConditions.visibilityOfElementLocated("//h4[text()='Hello World!']"));
         System.out.println(text1.getText());
	    
	    driver.quit();
	    
	    //pending
	    

	}

}
