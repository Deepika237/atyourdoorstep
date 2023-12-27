package section1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlWithoutGetmethod {

	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//access amazon widout using get method
		URL url = new URL("https://amazon.in/");
		driver.navigate().to(url);
		//access flipkart widout using get
		driver.navigate().to("https://www.flipkart.com/ ");

	}

}
