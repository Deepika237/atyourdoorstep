package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrmMethodcall{
	
		WebDriver  driver;
		public void accessBrowser() {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));                                                     
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		public void Clicklink() {
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		}


	public static void main(String[] args) {
		OrangeHrmMethodcall ab=new OrangeHrmMethodcall();
		ab.accessBrowser();
		ab.Clicklink();
	}
}


