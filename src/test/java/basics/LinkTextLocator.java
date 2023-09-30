package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
 
		//initialize the browser specific class
	     	WebDriver driver = new EdgeDriver();
				
				//launch the application
				driver.get("http://localhost:8888/");
				
				//maximize the browser 
				driver.manage().window().maximize();
				
				//locate the username textfield
				driver.findElement(By.name("user_name")).sendKeys("admin");
				//locate passowrd textfield
				driver.findElement(By.name("user_password")).sendKeys("admin");
				//locate the login button
				driver.findElement(By.id("submitButton")).click();
				
				//locating ORGANISATION tab in home page
				driver.findElement(By.linkText("Organizations")).click();
	}

}
