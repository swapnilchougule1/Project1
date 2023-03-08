package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	//POM class
	//1.WebDriver globally declared
	//2.@FindBy ele find
	//3.Ele action->method create
	//4.COnstructor create-

	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement MenuBtn;
	
	public void clickMenuBtn() 
	{
		MenuBtn.click();
	}
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement LogoutBtn;
	
	public void clickLogoutBtn() 
	{
		LogoutBtn.click();
	}
	
	//bag ele-add to cart
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement bagProduct;
	
	public void clickOnBagProduct() 
	{
		bagProduct.click();
	}
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement addToCart;
	
	public String getTextFromAddToCart() 
	{
		String actualProductSelected = addToCart.getText();
		return actualProductSelected;	//=1
	}
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement>multiProducts;
	
	public void clickMultiProducts() 
	{
		for(int i=0; i<multiProducts.size(); i++) 
		{
			multiProducts.get(i).click();
		}
	}
	
	public HomePOMClass(WebDriver driver) 
	{
		//global	  local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}
