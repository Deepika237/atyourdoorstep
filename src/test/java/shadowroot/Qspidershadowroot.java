package shadowroot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspidershadowroot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/shadow");
		WebElement ele = driver.findElement(By.cssSelector("form[class='pe-5']>div"));
		SearchContext shadow = ele.getShadowRoot();
		shadow.findElement(By.cssSelector("[placeholder='Enter your username']")).sendKeys("deepika");
		
		//for password
		WebElement ele1 = driver.findElement(By.cssSelector("form[class='pe-5']>div+div"));
		SearchContext shadow1 = ele1.getShadowRoot();
		shadow1.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("panda");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		

	}

}
