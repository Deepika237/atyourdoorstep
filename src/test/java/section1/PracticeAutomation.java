package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("student");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Password123");
		WebElement button = driver.findElement(By.className("btn"));
		button.click();
		

	}

}

