package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime
{
	public static void main(String[] args) throws InterruptedException 
	{
		//lauch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximise the browser
		driver.manage().window().maximize();
		
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		// idemtify the username textfield
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		
		//enter the username
		username.sendKeys("admin");
		Thread.sleep(5000);
		
		//identiy the password element
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//identify keepLoggedInCheckBox 
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		Thread.sleep(5000);
		//identify login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
