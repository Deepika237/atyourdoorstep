package Section2;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfparticularportionofwebpage {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement portion = driver.findElement(By.id("nav-xshop-container"));
		File source = portion.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + "portion" + ".png");
		Files.copy(source, dest);
		driver.close();

	}
}

