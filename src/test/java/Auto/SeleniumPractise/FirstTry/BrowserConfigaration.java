package Auto.SeleniumPractise.FirstTry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class BrowserConfigaration {
	//static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().minimize();
		
		//driver.get("https://www.google.com/");
		
		//Second-Way
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-minimized");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://www.google.com/");
		
		

		

	}

}
