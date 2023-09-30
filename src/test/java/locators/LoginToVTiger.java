package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToVTiger {

	public static void main(String[] args) throws InterruptedException 
	{
		/*STEP 1
		 *  Launch the browser
		 */
		WebDriver driver = new ChromeDriver();
        
		/*STEP 2 
		 * MAXIMISE THE BROWSER
		 */
		driver.manage().window().maximize();
		
		/*STEP 3
		 * LOAD THE BROWSER -- vTiger App
		 */
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		/* STEP 4
		 * Identify  username in the application
		 */
		
		/*findElement(By by)----returns WebElement interface
		 * coming from SearchContext interface
		 * it is used to find single webElement 
		 * we can use any one locators from 8 locators
		 * if the element is not identified it will throw "NoSuchElementexception" it is a selenium exception
		 *
		 */
		WebElement username= driver.findElement(By.name("user_name"));
		
		/* clear() method is used to clear the textfields*/
		username.clear();
		
		Thread.sleep(5000);
		/* input username*/
		username.sendKeys("admin");
		
		Thread.sleep(5000);
		
		/* identfy the password*/
	    WebElement	password = driver.findElement(By.name("user_password"));
	    Thread.sleep(5000);
	    password.sendKeys("admin");
	    
	    Thread.sleep(5000);
	    /*identify login button*/
	    driver.findElement(By.id("submitButton")).click();
		
		/* to close the window
		 * close() method is used to close the window current tab/page
		 */
		Thread.sleep(5000);
		driver.close();
		
	}

}
