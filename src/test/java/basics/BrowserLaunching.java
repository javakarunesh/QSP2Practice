package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
