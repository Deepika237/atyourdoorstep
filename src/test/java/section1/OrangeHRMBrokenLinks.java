package section1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");

		pwd.submit();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		List<WebElement> Allimage = driver.findElements(By.tagName("img"));
		for (WebElement r : Allimage) {
			String images = r.getAttribute("src");
			System.out.println(images);
		}
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		ArrayList<String> BrokenLinks = new ArrayList<String>();
		for (WebElement r : Alllinks) {
			String links = r.getAttribute("href");
			int statuscode = 0;
			try {
				// convert the links into url
				URL url1 = new URL(links);
				// open a connection to server
				URLConnection urlconn = url1.openConnection();
				// connect to server using http,url,connection
				HttpURLConnection httpurl = (HttpURLConnection) urlconn;
				// get the statuscode
				statuscode = httpurl.getResponseCode();
				if (statuscode >= 400) {
					BrokenLinks.add(links + " " + statuscode);
				}

			} catch (Exception e) {
				continue;
			}

		}
		System.out.println(BrokenLinks);//there is no broken links in this web page thats why its print[]zero

	}

}

