package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingRefresh {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		//driver.get(driver.getCurrentUrl());
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();

	}

}
