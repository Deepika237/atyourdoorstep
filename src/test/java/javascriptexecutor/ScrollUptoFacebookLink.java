package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoFacebookLink {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.location=arguments[0]", "https://www.amazon.in");
	for(;;) {
		try {
			driver.findElement(By.xpath("//a[.='Facebook']")).click();
		} catch (Exception e) {
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}
	}
	
	
	
}
	
}

