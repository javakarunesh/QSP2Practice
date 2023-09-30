package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the url
		driver.get("https://www.flipkart.com/");
		
		//find the login buttom
	    WebElement loginButton =	driver.findElement(By.className("_1_3w1N"));
	    loginButton.click();
	    
	    //find the enter email/mobile text field
	    WebElement email = driver.findElement(By.className("_2IX_2- VJZDxU"));
	    email.sendKeys("9304708754");
	    
	    driver.close();
	    
	    

	}

}
