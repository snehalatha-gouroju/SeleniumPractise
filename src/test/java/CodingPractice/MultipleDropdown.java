package CodingPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
          static WebDriver driver;
          
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
        WebElement ideElement=driver.findElement(By.id("ide"));
        Select ideDropdown=new Select(ideElement);
        List<WebElement> selectedDropdownOptions=ideDropdown.getOptions();
        for(WebElement options:selectedDropdownOptions) {
        	System.out.println(options.getText());
        	
        }
        
        ideDropdown.selectByIndex(0);  //eclipse
        Thread.sleep(3000);
        ideDropdown.selectByValue("vs");  //vs
        Thread.sleep(3000);
        ideDropdown.selectByVisibleText("IntelliJ IDEA");    // ij
        Thread.sleep(3000);
        ideDropdown.deselectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);
        
        ideDropdown.selectByVisibleText("NetBeans");
        Thread.sleep(3000);
        
        List<WebElement> selectedOptions=ideDropdown.getAllSelectedOptions();
        for(WebElement option: selectedOptions) {
        	System.out.println("Selected option is: "+option.getText());
        }
        
        
       
        
        
        }
    	
        
	}


