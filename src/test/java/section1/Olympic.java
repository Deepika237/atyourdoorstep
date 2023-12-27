package section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> CN = driver.findElements(By.xpath("(//span[@data-cy='country-name'])[position()<6]"));
		List<WebElement> Gold = driver.findElements(By.xpath("(//div[@title='Gold'])[position()<6]"));
		List<WebElement> Silver = driver.findElements(By.xpath("(//div[@title='Silver'])[position()<6]"));
		List<WebElement> Bronze = driver.findElements(By.xpath("(//div[@title='Bronze'])[position()<6]"));
		for (int i = 0; i < CN.size(); i++) {
			System.out.println(CN.get(i).getText() + " " +	Gold.get(i).getText() + " "  + Silver.get(i).getText()	+" "+	Bronze.get(i).getText());
		}
		driver.close();

	}

}
