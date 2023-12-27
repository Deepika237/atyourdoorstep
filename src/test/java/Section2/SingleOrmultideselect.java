package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrmultideselect {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Deepa/OneDrive/Documents/movies2.html");
		WebElement ele = driver.findElement(By.id("movies"));

		Select se = new Select(ele);
		System.out.println(se.isMultiple());
		List<WebElement> Allopt = se.getOptions();
		for (WebElement r : Allopt) {
			r.click();

		}
		// se.deselectByIndex(2);

		// se.deselectByValue("4");

		se.deselectByVisibleText("Jawan");

		// se.deselectAll();
	}
}
