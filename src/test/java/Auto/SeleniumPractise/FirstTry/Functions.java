package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
      //driver.findElement(By.xpath("//a[text()='Sign in']")).click();
      driver.findElement(By.xpath("//h1[text()='Register']"));
	  driver .findElement(By.xpath("//button[@class='btn' and @type='reset']")).click();
	  driver.findElement(By.xpath(" //div[contains(@class,'signin')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
	  driver.findElement(By.xpath("//div[contains(@class,'signin')]"));
	  driver.findElement(By.xpath("//h2[contains(text(),'Work')]"));  // verification with partial text
	  driver.findElement(By.xpath("//select[contains(@id ,'nav2')]")); //verification with partial attribute	
	  driver.findElement(By.xpath("//a[starts-with (text(),'Sign in')]")).click(); //--> 1/2
	  driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")).click();  //-->normalize-space on text ,attribute
	  driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")).click();
	  driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=2]")).click();  //position with multiple conditions like < > <= >=
	  System.out.println(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).getSize());
	
	
	}
	

}
