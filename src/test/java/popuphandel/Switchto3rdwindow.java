package popuphandel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto3rdwindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone15");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).click();
		
		Set<String> Allid = driver.getWindowHandles();
		for (String r : Allid) {
			String title = driver.switchTo().window(r).getTitle();
			if (title.contains("APPLE")) {
				break;
			}
		}
		WebElement ele = driver.findElement(By.xpath("//span[.='APPLE iPhone 15 (Blue, 128 GB)']"));
		System.out.println(ele.getText());
	}
}
