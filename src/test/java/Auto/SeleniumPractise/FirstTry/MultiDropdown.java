package Auto.SeleniumPractise.FirstTry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
        WebElement ideElement=driver.findElement(By.id("ide"));
        Select ideDropdown =new Select(ideElement);
        List<WebElement> ideDropdownOptions=ideDropdown.getOptions(); 
        for(WebElement option : ideDropdownOptions) {
        	System.out.println(option.getText());
        }
        ideDropdown.selectByIndex(0);//eclips
        Thread.sleep(3000);
        ideDropdown.selectByValue("ij");//intelij idea
        Thread.sleep(3000);
        ideDropdown.selectByVisibleText("NetBeans"); //netbeans
        Thread.sleep(3000);
        ideDropdown.deselectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);       
        List<WebElement>selectedOptions=ideDropdown.getAllSelectedOptions();
        for(WebElement selectedOption : selectedOptions) {
        	System.out.println("Selected Visible text - "+selectedOption.getText());
        }
        
        
	}

}
