package javascriptexecutor;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewwindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// amazon
		driver.get("https://licindia.in/");
		Thread.sleep(2000);
		// new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.hdfcbank.com/");

	}

}
