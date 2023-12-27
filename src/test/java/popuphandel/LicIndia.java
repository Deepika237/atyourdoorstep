package popuphandel;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicIndia {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://licindia.in/");
		driver.findElement(By.cssSelector("[title='Login']")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.switchTo().alert().accept();
		//using id
		String parentId=driver.getWindowHandle();
		Set<String>AllId=driver.getWindowHandles();
		for(String r:AllId) {
			if(!(parentId.equals(r))) {
				driver.switchTo().window(r);
			}
		}
		
		
		
		//using iterator
		Iterator<String>ids=AllId.iterator();
		while(ids.hasNext()) {
			String id=ids.next();
			if(!(parentId.equals(id))) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.id("da_textfield-1157-inputEl")).sendKeys("deepika");
		
		
	}
}

