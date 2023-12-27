package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintProductFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.cssSelector("span[role='button']"));
		ele.click();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
		List<WebElement> productname = driver.findElements(By.cssSelector("[class*='rR']"));
		for(WebElement r:productname) {
			String name = r.getText();
			System.out.println(name);
		}
		driver.quit();
		 
		

	}

}
