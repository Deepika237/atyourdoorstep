package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontendSourceCode {

	public static void main(String[] args) {
		//open chrom browser
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//accesss amazon
		driver.get("https://www.amazon.in/");
		//get soure code
		String source = driver.getPageSource();
		//print source code
		System.out.println(source);
		//close window
		driver.close();

	}

}
