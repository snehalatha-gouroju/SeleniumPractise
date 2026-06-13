package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletextBoxes {
    static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //WebDriverManager.chromedriver().setup();
     
      driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://github.com/login");
      Thread.sleep(5000);
      //driver.findElement(By.id("login_field")).sendKeys("sneha");
     WebElement UsernameTxt=driver.findElement(By.id("login_field"));
      if(UsernameTxt.isDisplayed()) {
    	  if(UsernameTxt.isEnabled()) {
    		  
    		  UsernameTxt.sendKeys("Sneha");
    		  String EnteredTxt=UsernameTxt.getAttribute("value");
    		  System.out.println(EnteredTxt);
    		  Thread.sleep(3000);
    		 // UsernameTxt.clear();
    		  UsernameTxt.sendKeys(" gouroju");
     		 UsernameTxt.clear();

    		  
    	  }
    	  else {
    		  System.out.println("username textbox is not enable");
    	  }
    	  
    	  
      }
      else {
    	  System.out.println("username textbox is not displayed");
      }
	
	
	
	
	
	
	}

}
