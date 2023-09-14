package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Logged in Suucessfully");
		driver.quit();
	}

}
