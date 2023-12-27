package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(" https://licindia.in/");
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().minimize();
		driver.quit();

	}
}
