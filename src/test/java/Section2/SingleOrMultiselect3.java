package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SingleOrMultiselect3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Deepa/OneDrive/Documents/movies2.html");
		WebElement ele = driver.findElement(By.id("movies"));
		//check
		Select se=new Select(ele);
		//select all
		List<WebElement> Allopt = se.getOptions();
		for(WebElement r:Allopt) {
			r.click();
		}
		String first=se.getFirstSelectedOption().getText();
		System.out.println(first);
		List<WebElement> Allselect = se.getAllSelectedOptions();
		for(WebElement e:Allselect) {
			System.out.println(e.getText());
		}

	}

}
