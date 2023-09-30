package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		//maximise the browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		//find the username element using css selector and enter the username
		driver.findElement(By.cssSelector("input[type ='text']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//find the password element  and enter the password
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		Thread.sleep(2000);
		
		//identify the login button and click it
		//driver.findElement(By.cssSelector("[id='loginButton']")).click();
		
		//in place of id we can use #
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
