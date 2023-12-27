package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationByusingXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		driver.findElement(By.xpath("//button[.='Submit']")).click();//by using visible text
		driver.findElement(By.xpath("//button[contains(@id,'s')]")).click();//by using contains
	}

}
