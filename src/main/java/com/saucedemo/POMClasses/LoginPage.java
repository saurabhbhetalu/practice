package com.saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username; 
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login-button']")
	private WebElement signinButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickloginButton()
	{
		signinButton.click();
	}
	
	
	

}
