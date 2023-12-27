package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoPracticeAutomationusingCSS {

	public static void main(String[] args) throws Throwable {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the webpage
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//access
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//login
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		driver.findElement(By.cssSelector("[id*='pas']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("[id*='sub']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
