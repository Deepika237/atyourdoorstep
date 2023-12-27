package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartByUsingCSS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("[class='_30XB9F']"));
		Thread.sleep(1000);
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {}
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("[class*='iLD__']")).click();//we can use type also
		
		
		
		
	}

}
