package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassNameLocator {
	public static void main(String[] args) {
		
		//launching the browser specific class.
		WebDriver driver = new EdgeDriver();
		
		//launching the application
		driver.get("https://demo.actitime.com/login.do");
		
		//locate the username textfield 
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		//locating the password text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//locating login button 
		driver.findElement(By.className("initial")).click();
	}

}
