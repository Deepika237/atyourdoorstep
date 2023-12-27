package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//click
		  WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		  String tag=ele.getTagName();
		  System.out.println(tag);
		  String value=ele.getAttribute("href");
		  System.out.println(value);
		  String text=ele.getText();
		  System.out.println(text);
		  Thread.sleep(2000);
		  driver.quit();
		

	}

}
