package popuphandel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraNotification {

	public static void main(String[] args) {

		ChromeOptions url = new ChromeOptions();
		url.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://www.yatra.com/");

	}

}
