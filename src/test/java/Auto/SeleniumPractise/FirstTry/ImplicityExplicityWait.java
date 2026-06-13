package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityExplicityWait {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

	//	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		
		//driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		
		//or
		
	/*	
	 */
		//ExpectedConditions.visibilityOfElementLocated
    
		/*WebElement dropdownbtn=driver.findElement(By.xpath("//button[text()='Dropdown']"));
     dropdownbtn.click();
    
     
     WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
     
     WebElement flipkart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
     flipkart.click();
    	
    		 */
		
		//or Clikable method of ExpectedConditions
		
    WebElement Checkbox=driver.findElement(By.xpath("//button[text()='Check this']"));
    Checkbox.click();
    
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
    WebElement checkable=wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//input[@id='dte']")));
    checkable.click();
    
	}

}
