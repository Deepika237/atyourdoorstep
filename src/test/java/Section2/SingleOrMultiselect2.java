package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SingleOrMultiselect2 {

	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/Deepa/OneDrive/Documents/movies2.html");
			WebElement ele = driver.findElement(By.id("movies"));
			Select se = new Select(ele);
			System.out.println(se.isMultiple());
			List<WebElement> AllOptions = se.getOptions();
			for(WebElement r:AllOptions) {
				r.click();
			}

	}

}
