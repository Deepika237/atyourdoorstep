package shadowroot;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookPasstextByusingJavascript {
	WebDriver driver;

	public void accessBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://books-pwakit.appspot.com/");
	}

	public void doTheTask() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(
				"document.querySelector(\"[apptitle='BOOKS']\").shadowRoot.querySelector(\"[id='input']\").value=\"Mama\"");
	}

	public static void main(String[] args) {
		BookPasstextByusingJavascript bk = new BookPasstextByusingJavascript();
		{
			bk.accessBrowser();
			bk.doTheTask();
		}
	}
}
//using method call
