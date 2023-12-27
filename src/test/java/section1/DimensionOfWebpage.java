package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionOfWebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/ ");
		Thread.sleep(3000);
		// set window dimension
		driver.manage().window().setSize(new Dimension(200,400));//optimized approach
		//Dimension d = new Dimension(200, 400);
		//driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.quit();

	}
}
