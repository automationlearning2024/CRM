package modules;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObject.ApplyleaveLocators;

import org.apache.logging.log4j.*;


public class AppyLeave {
	
	Logger log = LogManager.getLogger(AppyLeave.class);
	
   WebDriver driver;  
   ApplyleaveLocators alobject;
   
	
	//Design pattern > Page object model
   //20 modules > 
	
	AppyLeave() throws IOException
	{
		// contructor is first method that will get executed
		BaseTest bt = new BaseTest();
		driver =bt.loginToApplication();
		alobject= new ApplyleaveLocators();
		

		
	}
	
	@Test
	public void clickOnApplyLeaveIcon()
	{
		log.error("--- apply leave button is clicked----");
		driver.findElement(alobject.getApplyLeaveButton()).click();
	
		
	}
	

	

}
