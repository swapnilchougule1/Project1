package com.saucedemo.TestPack;

import java.io.IOException;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("project1-15Oct-JavaBatch");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException 
	{
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Swapnil\\Automation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\Swapnil\\Automation\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is open.");
		
//	    System.out.println("Browser is open.");
			
		driver.manage().window().maximize();
		log.info("Browser is maximized.");
//		System.out.println("Browser is maximized.");
			
		driver.get("https://www.saucedemo.com/");
		log.info("URL is open.");
//		System.out.println("URL is open.");
			
	    //take screenshot
	    UtilityClass.screenshotMethod(driver, "TC01_loginPageScreenshot");
	    log.info("Screenshot is taken.");
//		System.out.println("Screenshot is taken");
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		LoginPOMClass lp = new LoginPOMClass(driver);   
		    
	    lp.sendUsername();
	    log.info("Username is entered.");
//		System.out.println("Username is entered");
		    
		lp.sendPassword();
		log.info("Password is entered.");
//	    System.out.println("Password is entered");
		    
		lp.clickLoginBtn();
		log.info("Clicked on login button.");
//		System.out.println("Clicked on login button");
		
		//homePage
		log.info("Went on home page.");
//	  	System.out.println("Went on homePage");
	  		 
	  	//take screenshot
	  	UtilityClass.screenshotMethod(driver, "TC01_homePageScreenshot");
	  	log.info("Screenshot is taken.");
//	  	System.out.println("Screenshot is taken");	  		
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
		log.info("Browser is closed.");
		log.info("End of program.");
//		System.out.println("Browser is closed");
//		System.out.println("End of program");
	}
}

