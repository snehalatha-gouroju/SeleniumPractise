package CodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/dp/B0FNCPKFP6?ref=cm_sw_r_cp_ud_dp_AWQZW8EG9NBMPMRFFNEN&ref_=cm_sw_r_cp_ud_dp_AWQZW8EG9NBMPMRFFNEN&social_share=cm_sw_r_cp_ud_dp_AWQZW8EG9NBMPMRFFNEN&th=1");	
		Thread.sleep(3000);
		driver.findElement(By.id("//span[@id='dealBadgeSupportingText']"));
		driver.findElement(By.id("//a[@id='bylineInfo']")).click();
        driver.findElement(By.xpath("//a[@title='Share']")).click();
	}

}
