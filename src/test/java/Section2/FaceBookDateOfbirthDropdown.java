package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDateOfbirthDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		//day drop down
		WebElement dy = driver.findElement(By.id("day"));
		Select se=new Select(dy);
		se.selectByIndex(3);
		Thread.sleep(3000);
		//month drop down
		WebElement bm = driver.findElement(By.name("birthday_month"));
		Select s=new Select(bm);
		s.selectByValue("8");
		Thread.sleep(3000);
		//year drop down
		WebElement ye = driver.findElement(By.id("year"));
		Select sel=new Select(ye);
		sel.selectByVisibleText("2020");

	}

}
