package Auto.SeleniumPractise.FirstTry;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operators {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		driver =new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength]")).sendKeys("Text1");
        driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("Text2");
	 List<WebElement> elementss =driver.findElements(By.xpath("//input[@maxlength<=15]"));
	  for(WebElement elements : elementss) {
		   System.out.println(elements);    //how to print element
	   }
	}
}


