package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MobileAccessories {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		WebElement laptop = driver.findElement(By.linkText("Laptops & Accessories"));
		Actions act = new Actions(driver);
		act.moveToElement(laptop).perform();
		//by finding parent and following sibling
		//driver.findElement(By.xpath("//a[.='Dell']/parent::li/following-sibling::li//a[.='HP']")).click();
		driver.findElement(By.xpath("(//a[.='HP'])[position()=1]")).click();
		WebElement ele = driver.findElement(By.name("s"));
		Select se=new Select(ele);
		se.selectByVisibleText("Price: Low to High");
		WebElement price = driver.findElement(By.xpath("//a[.='Price: Low to High']"));
		act.click(price).perform();

	}

}
