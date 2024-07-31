package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObject.TimeSheetLocators;

public class Timesheet {
	
	WebDriver  driver;  
	TimeSheetLocators ts;
	
	Timesheet() throws IOException
	{
		
		BaseTest bt = new BaseTest();
	  driver =	bt.loginToApplication();
	  ts = new TimeSheetLocators();
	}
	
	
	// pre-req = login should happen
	
	// testcase1  > click on mytimesheet icon
	//testcase2
	
	@Test
	public void clickOnTimeSheetIcon()
	{
		
		driver.findElement(ts.getTimesheetButton()).click();
	}

}
