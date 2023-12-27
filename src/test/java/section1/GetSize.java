package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icicibank.com/ ");
		Thread.sleep(2000);
		Dimension d= driver.manage().window().getSize();
		System.out.println(d);
		driver.quit();
		

	}

}
