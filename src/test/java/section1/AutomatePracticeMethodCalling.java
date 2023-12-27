package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePracticeMethodCalling {

	WebDriver driver;
	public  void accessBrowser() {
	//open
		driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//access the app
		driver.get(" https://practicetestautomation.com/practice-test-login/");
	}
		public void login()
		{
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.className("btn")).click();
		}



	public static void main(String[] args) {
		AutomatePracticeMethodCalling ap=new AutomatePracticeMethodCalling();
		ap.accessBrowser();
		ap.login();

	}

}
