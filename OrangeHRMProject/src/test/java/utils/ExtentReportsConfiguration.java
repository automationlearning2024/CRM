package utils;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsConfiguration {
	
	

	@Test(priority=1)
	public static ExtentReports getReportsConfiguration()
	{
		
		// ExtentSparkReporter     > setting configuration details , file location , report name
		
	String path=	System.getProperty("user.dir")+"\\testreports\\report.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Smoke Test Result");
		
		
		// ExtentReports   > generating reports
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}
	
	@Test(priority=2)
	public void testcase1()
	{
		
		System.out.println("testcase 1 executed");
	}
	
	
	@Test(priority=3)
	public void testcase2()
	{
		
		System.out.println("testcase 2 executed");
	}
	
	// 50 testcases
	
	
	
}
