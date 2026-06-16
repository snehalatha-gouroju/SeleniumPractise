package CodingPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//single dropdown

public class SingleDropdown {
    
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement coursename =driver.findElement(By.id("course"));
		Select coursenameDD=new Select(coursename);
		List <WebElement> coursenameoptionsDD=coursenameDD.getOptions();
		  for(WebElement option:coursenameoptionsDD) {
			  System.out.println(option.getText());
		  }
		coursenameDD.selectByIndex(0);
	     Thread.sleep(3000);
	    coursenameDD.selectByValue("vs");
	    Thread.sleep(3000);
	    coursenameDD.selectByVisibleText("IntelliJ");
	    Thread.sleep(3000);
	    String selectedText=coursenameDD.getFirstSelectedOption().getText();
	    System.out.println("Selected visible text is: " +selectedText);
	}

}
