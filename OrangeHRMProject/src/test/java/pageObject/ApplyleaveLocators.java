package pageObject;

import org.openqa.selenium.By;

public class ApplyleaveLocators {
	
	
	// Encapsulation ; private variables and provide public methods
	
   private   By applyLeaveButton = By.xpath("//button[@title='Apply Leavess']");
   private By reportsButton = By.xpath("//*[text()='reports']");
   
   
   
   public By getApplyLeaveButton()
   {
	   
	   return applyLeaveButton;
   }
   
   public By getReportsButton()
   {
	   
	   return reportsButton;
   }

}
