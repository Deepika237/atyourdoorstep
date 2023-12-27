package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTotalNoOfImage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		// fetch theink and images
		List<WebElement> ele = driver.findElements(By.xpath("//a|//img"));
		/*
		 * int size=ele.size(); System.out.println(size);
		 */
		// another way
		int count = 0;
		for (WebElement r : ele) {
			count++;
		}
		System.out.println(count);
	}

}
