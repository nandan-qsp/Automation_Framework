package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTestCase {
	@Test
	public void registerTestCase() {
		WebDriver driver =new ChromeDriver();
		
		System.out.println("Registration succesfull");
		
		driver.quit();
	}

}
