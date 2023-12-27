package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_overmessageOrange {
	WebDriver driver;

	public void accessBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	/**
	 * This method perform login action//for comment method for what purpose we use this method 
	 */
	public void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	/**
	 * this method return hover msg
	 * 
	 * @return
	 */
	public String getHovermsg() {
		WebElement ele = driver.findElement(By.xpath("//button[@title='Assign Leave']"));
		String text = ele.getAttribute("title");
		return text;

	}

	public static void main(String[] args) {
		H_overmessageOrange pho = new H_overmessageOrange();
		pho.accessBrowser();
		pho.login();
		String text = pho.getHovermsg();
		System.out.println(text);
		
	}

}
