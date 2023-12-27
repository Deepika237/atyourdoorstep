package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAutomation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html ");
		//multiple attribute
		//String value = driver.findElement(By.xpath("(//p[@name='a'])[1]")).getText();
		//String value = driver.findElement(By.xpath("(//p[@name='a'])[position()=1]")).getText();
		String value = driver.findElement(By.xpath("//p[@name='a'and@id='a']")).getText();
		System.out.println(value);
		driver.close();
		

	}

}
		  
