package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import base.BaseTest;

public class Listeners extends BaseTest implements ITestListener {
	
	// Unimplemnted methods
	// 10 testcases > 5 testcases got passed
	
	 ExtentReports extent;  //activate ; 

	@Override
	public void onTestStart(ITestResult result) {
		
		// before executing each testcase ; this method will be trigerred
	if(extent==null)
	{
	 extent=	ExtentReportsConfiguration.getReportsConfiguration();
	}
		extent.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onStart(ITestContext context) {
		
		// before starting of 10 testcases
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase got success " + result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// take screenshot // Jenkins CI/CD 
		System.out.println("Testcase got failed " + result.getMethod().getMethodName());
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		
	 File sourceLocation=	tks.getScreenshotAs(OutputType.FILE);
	 
	 
	 String path=  System.getProperty("user.dir")+"\\FailedScreenshots\\"+ result.getMethod().getMethodName()+".png";
	 
	   File destinationLocation = new File(path);
	   
	   try {
		FileUtils.copyFile(sourceLocation, destinationLocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		// after  executing all testcases
		
		extent.flush();
		
		
	}

	
}
