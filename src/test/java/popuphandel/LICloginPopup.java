package popuphandel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICloginPopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://licindia.in/");
		//login path
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		//for alert msg
		Alert al = driver.switchTo().alert();
		//get text
		String text = al.getText();
		//print text
		System.out.println(text);
		Thread.sleep(2000);
		//for cancel
		al.dismiss();
	}

}
