package Auto.SeleniumPractise.FirstTry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
///FOURTH COMMIT
public class Conditions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    
		//List<WebElement> elements=driver.findElements(By.xpath("//input[@maxlength<=15 and @name='namer' and @type=\"ef\"]"));
	   // System.out.println(elements.size());
	  // List<WebElement> elementss=driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type=\"text\"]"));
	   // System.out.println(elementss.size());
	    List<WebElement> elementsss=driver.findElements(By.xpath("//input[not(@maxlength=10)]"));
	    System.out.println(elementsss.size());
	    driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")).click();
	   driver .findElement(By.xpath("((//table[@id='contactList']/tbody/tr/td))[23]"));
	
	
	}

}
