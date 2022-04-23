package com.saucedemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;

public class TC04selectproductFuctionality extends BaseClass
{	
	@Test(priority=4)
	public void verifySelectProductFunctionality()
	{
		log.info("TC04");
		HomePage hp = new HomePage(driver);
		hp.clickproduct1();	
		log.info("Select the product");

		String actualtext = "REMOVE";
		String expectedtext = hp.clickproductselected();
		Assert.assertEquals(actualtext, expectedtext);
		

		hp.clickburgerButton();
		log.info("Click on Burger Button");
		hp.clicklogoutButton();
		log.info("Click on Logout Button");
	
	}	
	
}
