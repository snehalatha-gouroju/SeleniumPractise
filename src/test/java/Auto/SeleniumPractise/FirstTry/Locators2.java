package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;
//import org.testing.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="sneha";
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Locators2 obj=new Locators2();
		//obj.getPassword(driver);
		//String password=getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("sneha");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in."); 
       
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello sneha,");
		driver.findElement(By.xpath("//div[@class='login-container']/button")).click();
		driver.close();
		
	}
	//this method is written for name,passowrd without values mention it
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		String passwordText=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//String manipulation 
		//passwordText.split("'");
		//0th index-please use temporary pswd.
		//1 th index-rahulshettyacademy to login.
        String[] passwordArray=passwordText.split("'");
       // String[] passwordArray2=passwordArray[1].split("'");
        //passwordArray2[0];
		
		String password=passwordArray[1].split("'")[0];
		return password;
		
	}
	
	}

