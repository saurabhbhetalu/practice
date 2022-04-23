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

public class UtilityClass 
{

	public static void screenshot(WebDriver driver) throws IOException 
	{

		DateFormat d = new SimpleDateFormat("MM-dd-yyyy & HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String newfile = d.format(cal.getTime());
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourcefile =  t.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./screenshot//"+newfile+".jpg");
		FileHandler.copy(sourcefile, destfile);
		System.out.println("Screenshot taken");
	}

}
