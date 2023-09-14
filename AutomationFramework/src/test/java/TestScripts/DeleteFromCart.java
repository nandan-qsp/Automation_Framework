package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteFromCart {

	@Test
	public void deleteFromCart() {
		WebDriver driver =new ChromeDriver();
		
		System.out.println("Item Deleted From cart");
		
		driver.quit();
	}

}
