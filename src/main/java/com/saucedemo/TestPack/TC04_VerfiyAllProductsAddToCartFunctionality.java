package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC04_VerfiyAllProductsAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verfiyAllProductsAddToCartFunctionality()
	{
		//all products add to cart
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickMultiProducts();
		log.info("Click on all products");
		
		log.info("Apply the validation");
		
		String expectedProductSelected = "6";
		String actualProductSelected = hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualProductSelected, expectedProductSelected);
	}
}
