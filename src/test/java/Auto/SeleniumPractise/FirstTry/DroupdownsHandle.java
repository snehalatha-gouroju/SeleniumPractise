package Auto.SeleniumPractise.FirstTry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupdownsHandle {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      driver =new ChromeDriver();
      driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
      Thread.sleep(3000);
      WebElement courseElmt=driver.findElement(By.id("course"));
      
      Select courseNameDropdown=new Select(courseElmt);
       List <WebElement> DropdownOptions= courseNameDropdown.getOptions();
       for(WebElement Options : DropdownOptions) {
           System.out.println(Options.getText());
       }
      courseNameDropdown.selectByIndex(1);//java
      Thread.sleep(3000);
      courseNameDropdown.selectByValue("net");  //dot net
      Thread.sleep(3000);
      courseNameDropdown.selectByVisibleText("Javascript");  
      String selectedTxt=courseNameDropdown.getFirstSelectedOption().getText();
      System.out.println("Selected visible text is - " +selectedTxt);
      
		
		
	}

}
