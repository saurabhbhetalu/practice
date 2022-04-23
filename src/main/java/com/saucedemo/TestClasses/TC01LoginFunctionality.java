package com.saucedemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;

public class TC01LoginFunctionality extends BaseClass 
{
	
	@Test(priority=1, invocationCount =1)
	
	public void verifyloginfunctionality()
	{
		log.info("TC01");
		String actualurl = "https://www.saucedemo.com/inventory.html";
		String expectedurl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, actualurl);
		
		HomePage hp = new HomePage(driver);
		hp.clickburgerButton();
		log.info("Click on Burger Button");
		hp.clicklogoutButton();
		log.info("Click on Logout Button");
	}
		
	
		
		
	

}
