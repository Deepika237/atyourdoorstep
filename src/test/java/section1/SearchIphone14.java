package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone14 {

	public static void main(String[] args) throws Throwable {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// wait for 2 second
		Thread.sleep(2000);
		// maximize the webpage
		driver.manage().window().maximize();
		// access amazon
		driver.get("https://www.amazon.in");
		// search iphone14
		WebElement product = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		product.sendKeys("iphone14");
		WebElement prod = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(2000);
		prod.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
