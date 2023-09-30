package launchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser
{
	public static void main(String[] args) throws Throwable
	{
		// to launch chrome browser
		//ChromeDriver driver = new ChromeDriver();
		
		//upcasted to webdriver type
		WebDriver driver = new ChromeDriver();		
		
		/* to maximise the broser
		 * return type is Options interface
		 */
		driver.manage().window().maximize();
		
		// to load url 
		driver.get("https://www.facebook.com/");
		
		// to cature the page title 
		String  title=driver.getTitle();
		System.out.println("PAGE TITLE"+title);
		
		// to capture the url of the current page
		String url=driver.getCurrentUrl();
		System.out.println("CURRENT PAGE URL"+url);
		
		/* to capture the source code of the webpage
		*String sourcecode = driver1.getPageSource();
		*System.out.println("PAGE SOURCE CODE"+sourcecode);
		*/
		
		/* CAPTURE THE SESSION ID
		 *getWindowHandle() method used to read the main webpage session id 
		 */
		String Id =driver.getWindowHandle();
		System.out.println("SESSION ID OF THE PAGE IS "+Id);
		
		
		
		/* to close the window
		 * close() method is used to close the window current tab/page
		 */
		Thread.sleep(5000);
		driver.close();
		
	}

	
	

}
