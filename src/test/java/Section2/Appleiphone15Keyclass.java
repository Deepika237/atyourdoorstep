package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appleiphone15Keyclass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		// login using keys

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT, "apple", Keys.NULL, "iphone15",
				Keys.ENTER);

	}
}
