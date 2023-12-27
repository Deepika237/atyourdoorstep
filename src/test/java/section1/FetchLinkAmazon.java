package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinkAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		for(WebElement r:Alllinks) {
			//for links
			String links=r.getAttribute("href");
			System.out.println("Attributes link are:"+links);
			//for linktext
			String linktext=r.getText();
			System.out.println("text is :"+linktext);
		}

	}
}

//<a href=href attribute type
	//string url format link=attribute vale
			//link paen <a
			//open anchor tag and closing anchor tsg between link text
