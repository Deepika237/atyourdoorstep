package shadowroot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internetiframe {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/iframe");
		//switch to frame using webelement
		WebElement ele = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(ele);
		
		//by using frame id or name
		//driver.switchTo().frame("mce_0_ifr");
		
		//by using index
		//driver.switchTo().frame(0);
		String text = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='File']")).click();

	}

}
