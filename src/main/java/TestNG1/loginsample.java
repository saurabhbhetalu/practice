package TestNG1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.saucedemo.UtilityClasses.UtilityClass;

@Listeners(com.saucedemo.UtilityClasses.Listener.class)
public class loginsample 
{
//	@Test
//	public void verifyURL() 
//	{
//		System.out.println("Verifying url");
//		Assert.assertTrue(true);
//	}
//	
//	@Test
//	public void verfyTitle() 
//	{
//		System.out.println("Verifying title");
//		Assert.assertTrue(false);
//	}
	
	@Test
	public void login() throws IOException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("01.Open the Browser");
		
		driver.get("https://kite.zerodha.com/");
		
		String actualurl = "https://kite.zerodha.com";
		String expectedurl = driver.getCurrentUrl();

		Assert.assertEquals(expectedurl, actualurl);
		
	}

}
