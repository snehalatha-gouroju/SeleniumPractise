package Auto.SeleniumPractise.FirstTry;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitex {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdownbtn = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		dropdownbtn.click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L)) // selenium is by-default waiting machanism 30sec ,we can change
														// the sec also ,check the waiting sec's by selenium for every
														// 5or 10 sec based on number
				.ignoring(NoSuchElementException.class); // if test is fail's no sunch element error is ignore anothere
															// one rised..anothere.

		     WebElement flipkartOption = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
				    return driver.findElement(By.xpath("//a[text()='Flipkart']")); //not executable
				    

			     }
		     });
         flipkartOption.click();

	}

}
