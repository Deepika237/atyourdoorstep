package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionMyntra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("Jeans");
		List<WebElement> ele = driver.findElements(By.cssSelector("[class='desktop-suggestion null']"));
		for (WebElement r : ele) {
			if (r.getText().equals("Jeans Women")) {
				r.click();
				break;
			}
		}
	}
}
