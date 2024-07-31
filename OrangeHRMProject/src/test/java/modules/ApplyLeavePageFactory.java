package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;

public class ApplyLeavePageFactory {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//button[@title='Apply Leave']")
	private WebElement applyLeaveButton;
	
	
	ApplyLeavePageFactory() throws IOException
	{
		
		BaseTest bt = new BaseTest();
		driver=bt.loginToApplication();
		PageFactory.initElements(driver, this);
		
	}
	
	
	@Test
	public void clickOnApplyLeaveIcon()
	{
		
		applyLeaveButton.click();
		
	}
	
}
