package com.saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement burgerButton;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocartButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocart;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement product1;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement product1selected;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickburgerButton()
	{
		burgerButton.click();
	}
	
	public void clicklogoutButton()
	{
		logoutButton.click();
	}
	
	public void clickaddtocart()
	{
		addtocart.click();
	}
	
	public void clickproduct1()
	{
		product1.click();
	}
	
	public String clickproductselected()
	{
		String x = product1selected.getText();
		return x;
		
	}
	
}
