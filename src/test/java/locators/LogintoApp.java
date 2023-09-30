package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoApp {

	public static void main(String[] args) {

		//Initiate the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the application
		driver.get("http://localhost:8888");

	}

}
