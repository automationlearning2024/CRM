package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	Logger log = LogManager.getLogger(BaseTest.class);
	
  public static WebDriver driver; // null
  // pass same value to other classes , objects
	
	  @Test
	  public WebDriver loginToApplication() throws IOException
	  {
		  
		  FileInputStream  fis = new FileInputStream("C:\\Users\\Psd\\eclipse-workspace\\OrangeHRMProject\\src\\test\\resources\\config.properties");
		  Properties prop = new Properties();
		  prop.load(fis);

		  
		  if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		  {
			 
		     driver = new ChromeDriver();
		  WebDriverManager.chromedriver().setup();
          
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		  {
			  driver = new FirefoxDriver();
			  WebDriverManager.firefoxdriver().setup();
			
		  }
		  else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		  {
			  driver = new EdgeDriver();
			  WebDriverManager.edgedriver().setup();
			 
		  }
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		  
		  driver.manage().window().maximize();
		  driver.get(prop.getProperty("url")); // change
		  driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));  // change
		 log.info("------username value is entered------------");
		  driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));   //change
		log.info("------password value is entered------------");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		 log.info("------submit button is clicked------------");
		  
          
		  

		  return driver;
		  
	  }
	
	
}
