package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesR_S {
	static  WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type!='password']")).click();
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).click();
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input")).click();
        driver.findElement(By.xpath("//td[text()='UK']/preceding-sibling::td[2]/child::input")).click();
	    driver.findElement(By.xpath("//td[text()='UK']/following-sibling::td[2]/child::a")).click();
	    driver.findElement(By.xpath("//td[text()='Italy']/parent::tr")).click();
	driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div[1]")); //or
	driver.findElement(By.xpath("//label[text()='Password']/following::input[1]"));
	//following preceding
	driver.findElement(By.xpath("//label[text()='Password']/following::div[1]/child::input[1]"));
	driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input[1]")); //following
	driver.findElement(By.xpath("//label[text()='Password']/preceding::input[3]"));   //preceding 
	
	}
	

}
