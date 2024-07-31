package pageObject;

import org.openqa.selenium.By;

public class TimeSheetLocators {
	
	
private	By timesheet = By.xpath("//button[@title='My Timesheet']");


public By getTimesheetButton()
{
	  return timesheet;
}

}
