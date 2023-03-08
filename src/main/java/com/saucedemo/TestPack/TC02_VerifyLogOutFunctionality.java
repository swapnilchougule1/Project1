package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality() throws IOException  
	{	
		//logOut Activity
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickMenuBtn();
		log.info("Click on menu button");
		
		hp.clickLogoutBtn();
		log.info("Click on logout button");
		
		log.info("Went on login page");
		
		//take screenshot
	    UtilityClass.screenshotMethod(driver, "TC02_loginPage_PageScreenshot");
	    log.info("Screenshot is taken");

	    log.info("Apply Verification");
		
	    //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";	//given
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
