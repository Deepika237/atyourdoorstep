package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullscreenAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize()	;
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}
