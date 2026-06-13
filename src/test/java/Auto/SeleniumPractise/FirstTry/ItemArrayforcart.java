package Auto.SeleniumPractise.FirstTry;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemArrayforcart {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] array= {"Cucumber" ,"Brocolli"};
		List<WebElement> products=driver.findElements(By.xpath("product-name"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			List arrayList=Arrays.asList(array);
			
			if(arrayList.contains(name)) 
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
	}

}
