package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		  
		//driver.get("https://www.w3schools.com");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		 //driver.findElement(By.xpath("/html/body/div[3]/a[4]"));   //absolute Xpath,follows order so it's sometimes fail
	      driver.findElement(By.xpath("//span[text()='Exercises']")).click();   //Relatives Xpath  it does't follows the oder then not fail
	      driver.findElement(By.xpath("//div[@id='tnb-search-suggestions']"));
	      driver.findElement(By.xpath("//div[@class='w3-container']"));
	      driver.findElement(By.xpath("//div[@class='w3-container']")).click();
	      driver.findElement(By.xpath("//div[@id='tnb-login-btn']")).click();
	      driver.findElement(By.xpath("//a[text()='Learn HTML']")).click();
	      driver.findElement(By.xpath("//a[text()='Video Tutorial']")).click();
	      driver.findElement(By.xpath("//a[text()='HTML Reference']")).click();	// --> 1/2    
          driver.findElement(By.xpath("//input[@type='password']")).click();
          driver.findElement(By.xpath("//input[@type='email']")).click();
          driver.findElement(By.xpath("//button[@title='Facebook']")).click();
          driver.findElement(By.xpath("//button[@id='toggle-password-visibility']")).click();
          driver.findElement(By.xpath("//a[text()='Register']")).click();
          driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
          driver.findElement(By.xpath("//span[@class='price-main']")).click();    //---->  1/3
          driver.findElement(By.xpath("//div[@class='-svg-icon -off -active']")).click();
          //driver.findElement(By.xpath("")).click();
          driver.findElement(By.xpath(""));
          
                 
         
     
    	   
       }

	}


