package com.saucedemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMClasses.LoginPage;
import com.saucedemo.UtilityClasses.UtilityClass;

public class BaseClass 
{
	WebDriver driver;
	Logger log;
	@Parameters("browserName")
	@BeforeMethod
	public void setUpMethod(String browserName) throws IOException
	{
		log = Logger.getLogger("SaucedemoProjectv1");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Open the Browser");
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",".\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			log.info("Open the Browser");
		}
		driver.get("https://www.saucedemo.com/");
		log.info("Enter the Saucedemo Website");
		
		driver.manage().window().maximize();
		log.info("Maximize the Browser");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername();
		log.info("enter the username");
		lp.sendPassword();
		log.info("Enter the Password");
		lp.clickloginButton();
		log.info("Click on the Log In Button");
		
		UtilityClass.screenshot(driver);
	}
	

	@AfterMethod
	public void tearDownMethood()
	{
		
		driver.quit();
		log.info("Close the Browser");
	
		
	}

}
