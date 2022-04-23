package com.saucedemo.TestClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;
import com.saucedemo.UtilityClasses.UtilityClass;

public class TC02LogoutFunctionality extends BaseClass 
{	
			@Test(priority=2)
			public void verifylogoutfunction() throws IOException
			{
				log.info("TC02");
				HomePage hp = new HomePage(driver);
				hp.clickburgerButton();
				log.info("Click on Burger Button");
				hp.clicklogoutButton();
				log.info("click on Logout Button");
				
				UtilityClass.screenshot(driver);
				
				String actualtitle = "Swag Labs";
				String expectedtitle = driver.getTitle();
				
				Assert.assertEquals(actualtitle, expectedtitle, "Test Case Pass");	
			}

}
