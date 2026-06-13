package CodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes {
   static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		WebElement usernamePswd = driver.findElement(By.id("password"));
		if(usernamePswd.isDisplayed()) {
			if(usernamePswd.isEnabled()) {
				usernamePswd.sendKeys("12345");
				String enteredTxt =usernamePswd.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(3000);
				usernamePswd.clear();
				
			}
			else
				System.out.println("User Password textbox is not Enabled");
		}
		else
			System.err.println("User Password textbox is not Displayed");
		

	}

}
