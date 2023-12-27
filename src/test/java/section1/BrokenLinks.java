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

public class BrokenLinks {

	public static void main(String[] args) {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// access
		driver.get("https://www.amazon.in/");
		// fetch
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		ArrayList<String> BrokenLinks = new ArrayList<String>();
		for (WebElement r : Alllinks) {
			String links = r.getAttribute("href");
			int statuscode = 0;
			try {
				// convert the links into url
				URL url = new URL(links);
				// open a connection to server
				URLConnection urlconn = url.openConnection();
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
		System.out.println(BrokenLinks);

	}
}
