package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHtmlControls {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  driver =new ChromeDriver();
  driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	Thread.sleep(3000);
	driver.findElement(By.id("femalerb")).click();
	Thread.sleep(3000);//label text-only getText(); and getAttribute for only textBoxs
	driver.findElement(By.id("englishchbx")).click();
	Thread.sleep(3000);
	WebElement hindhiChk=driver.findElement(By.id("hindichbx"));
	hindhiChk.click(); //check
	Thread.sleep(3000);
	//driver.findElement(By.id("//input[@id='hindichbx']")).click();
	if(hindhiChk.isSelected()) {
		hindhiChk.click();  //uncheckZZ
     Thread.sleep(3000);
     driver.findElement(By.id("registerbtn")).click();
	System.out.println(driver.findElement(By.id("msg")).getText());
	Thread.sleep(3000);
	driver.findElement(By.linkText("Click here to nagigate to the home page")).click();
	
	
	}
	
	
	
	}

}
