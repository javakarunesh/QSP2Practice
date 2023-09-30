package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

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
		
		Thread.sleep(2000);
		/* input username*/
		username.sendKeys("admin");
		
		Thread.sleep(2000);
		
		/* identfy the password*/
	    WebElement	password = driver.findElement(By.name("user_password"));
	    Thread.sleep(2000);
	    password.sendKeys("admin");
	    
	    Thread.sleep(2000);
	    /*identify login button*/
	    driver.findElement(By.id("submitButton")).click();
		
		//click on contact link 
	    /*we go for linkText() 
	     * if link is small
	     * there is no dynamic data
	     */
	    driver.findElement(By.linkText("Contacts")).click();
		//partialLinkText
	    /* we use partialLinkText() 
	     * when text is too lengthy 
	     * contains space 
	     * link name is dynamic
	     */
	    driver.findElement(By.partialLinkText("Cont")).click();

	}

}
