package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameCssSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch the browser 
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//enter the url 
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		Thread.sleep(5000);
		
		//find the username 
		WebElement user_name = driver.findElement(By.name("user_name"));
		
		Thread.sleep(5000);
		
		//enter the username
		user_name.sendKeys("admin");
		
		Thread.sleep(5000);
		
		//find the password textfield
		WebElement user_password = driver.findElement(By.name("user_password"));
		
		Thread.sleep(5000);
		
		//enter the password 
		user_password.sendKeys("admin");
		
		Thread.sleep(5000);
		
		//identify the login button 
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(5000);
		
		//click on contact tab 
		driver.findElement(By.linkText("Contacts")).click();
		
		Thread.sleep(10000);
		
		driver.close();
				

	}

}
