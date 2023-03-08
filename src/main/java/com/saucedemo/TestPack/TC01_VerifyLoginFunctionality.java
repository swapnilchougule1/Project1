package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException 
	{
		log.info("Apply verification.");
//	    System.out.println("Apply verification.");
		
		//BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";		//given
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
