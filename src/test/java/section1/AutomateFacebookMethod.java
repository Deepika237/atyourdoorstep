package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookMethod {
	WebDriver driver;
	public void accessBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
	}
	public void Forgotpassword() {
		driver.findElement(By.linkText("Forgotten password?")).click();
	}
	public static void main(String[] args) {
		AutomateFacebookMethod	fb=new AutomateFacebookMethod();
		fb.accessBrowser();
		fb.Forgotpassword();
	}
}
