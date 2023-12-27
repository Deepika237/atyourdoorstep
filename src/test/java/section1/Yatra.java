package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Yatra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.yatra.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.quit();
	}
}
