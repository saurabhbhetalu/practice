package com.saucedemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener 
{
	WebDriver driver;
	public void onTestStart(ITestResult result)
	{
		System.out.println("Execution is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case failed");
		try {
			UtilityClass.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
