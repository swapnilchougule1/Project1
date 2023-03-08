package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC03_VerifyBagProductAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verifyBagProductAddToCartFunctionality()  
	{	
		//bag product add to cart
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickOnBagProduct();
		log.info("Clock on bag product");
		
		log.info("Apply the validation");
		
		String expectedProductSelected = "1";
		String actualProductSelected = hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualProductSelected, expectedProductSelected);
	}
}
