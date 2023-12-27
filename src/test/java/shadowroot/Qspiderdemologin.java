package shadowroot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiderdemologin {
	WebDriver driver;

	public void accessBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/shadow");
	}

	public void login() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(
				"document.querySelector(\"form[class='pe-5']>div\").shadowRoot.querySelector(\"input[placeholder='Enter your username']\").value=\"deepika\"");
		jse.executeScript(
				"document.querySelector(\"form[class='pe-5']>div+div\").shadowRoot.querySelector(\"input[placeholder='Enter your password']\").value=\"deepika123\"");
		
		 driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}

	public static void main(String[] args)   {
		Qspiderdemologin ql = new Qspiderdemologin();
		{
			ql.accessBrowser();
			ql.login();
		}
	}
}

