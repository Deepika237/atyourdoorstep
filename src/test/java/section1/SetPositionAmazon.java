package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		//set size
		driver.manage().window().setSize(new Dimension(400, 200));
		//get size
		Dimension d=driver.manage().window().getSize();
		System.out.println(d);
		//set position
		driver.manage().window().setPosition(new Point(200,300));
		Thread.sleep(3000);
		//get position
		Point p= driver.manage().window().getPosition();
		System.out.println(p);//print
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
