package com.saucedemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;
import com.saucedemo.UtilityClasses.UtilityClass;

public class TC03AddtocartFunctionality extends BaseClass
{	
	@Test(priority=3)
	public void verifyaddtocart() throws IOException
	{
		log.info("TC03");
		
		HomePage hp = new HomePage(driver);
		hp.clickproduct1();
		log.info("Select the product");
		
		hp.clickaddtocart();
		log.info("Click on add to cart button");

		UtilityClass.screenshot(driver);
		
		String actualurl = "https://www.saucedemo.com/cart.html";
		String expectedurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, expectedurl, "Test case is failed");
		
		hp.clickburgerButton();
		log.info("Click on Burger Button");
		hp.clicklogoutButton();
		log.info("Click on Logout Button");
	}
	
	
	
	
}
