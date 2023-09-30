package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {
	public static void main(String[] args) {
		
		//initiating the browser specific class
		WebDriver driver = new FirefoxDriver();
		
		//launching the application
				driver.get("https://demo.actitime.com/login.do");
				
				//locate the username textfield 
				driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin");
		
				//locating the password text field
				driver.findElement(By.cssSelector("[type='password']")).sendKeys("manager");
				
				//locating login button 
				driver.findElement(By.className("initial")).click();
		
		
	}

}
