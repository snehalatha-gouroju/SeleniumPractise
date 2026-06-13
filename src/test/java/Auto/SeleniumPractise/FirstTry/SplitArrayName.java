package Auto.SeleniumPractise.FirstTry;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SplitArrayName {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		int j=0;
		String[] itemsNeeded= {"Cucumber","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> products=driver.findElements(By.className("//h4[@class='product-name']"));
		  
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			System.out.println(name);
			String formatedName=name[0].trim();
			System.out.println(name);
		
	     List itemsNeededList=Arrays.asList(itemsNeeded);
			
	     System.out.println(name);
		 if(itemsNeededList.contains(formatedName))
		     {
			 j++;
			 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			     
				if(j==3)
				{
					break;
				}
			}
		}
	
	
	
	
	
	}

}
