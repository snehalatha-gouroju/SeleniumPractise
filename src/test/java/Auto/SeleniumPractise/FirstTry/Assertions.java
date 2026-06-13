package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
	
      static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		//driver.findElement(By.xpath("//input[@id='SeniorCitizenDiscount']")).isSelected();
		driver.findElement(By.xpath("//input[@id='SeniorCitizenDiscount']")).click();
		

	}

}
