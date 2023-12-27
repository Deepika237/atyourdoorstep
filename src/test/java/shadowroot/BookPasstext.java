package shadowroot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookPasstext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//by using selenium
		driver.get("https://books-pwakit.appspot.com/explore?q=");
		// css selector or xpath we use both
		WebElement ele = driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"));
		SearchContext shadow = ele.getShadowRoot();
		shadow.findElement(By.cssSelector("[effects='waterfall'] [id='input']")).sendKeys("Mama");

	}

}
