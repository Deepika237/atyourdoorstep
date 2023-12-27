package section1;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWindowId {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		String title = driver.getTitle();
		System.out.println(title);
		//String source = driver.getPageSource();
		//System.out.println(source);
		// print parent window id
		String pid = driver.getWindowHandle();
		// print id
		System.out.println(pid);
		// print all id
		Set<String> Allid = driver.getWindowHandles();
		System.out.println(Allid);
		driver.close();

	}
}
