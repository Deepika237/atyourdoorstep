package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//access
		driver.get("http://localhost:8888/");
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin", Keys.TAB, "password", Keys.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[title*='Cr']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("industry"));
		Select se = new Select(ele);
		//se.selectByIndex(2);
		//se.selectByValue("Banking");
		se.selectByVisibleText("Banking");

	}

}
