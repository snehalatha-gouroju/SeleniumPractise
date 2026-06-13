package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownLoopingUI{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  driver=new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		  Thread.sleep(2000);
		  int i=1;
		  /*
		  while(i<7) {
		  driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		  i++;
		   

	}
		  driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
*/
		  
		  //using for loop
		  for(i=1;i<7;i++) {
			  driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		      //Thread.sleep(1000);
		      System.out.println(i);
		  }
		  
			  driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
			  System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());		
	
}
}
