package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.TestPack.TestBaseClass;

//import projectWith_5Annotation.TestBaseClass;

public class LoginPOMClass extends TestBaseClass
{
	//No execution
	//no main method
	//ele find and ele action maintain
		
	//1.WebDriver globally declared
	WebDriver driver;
	
	//userName
	//passWord
	//loginBtn
	
	//we r not going to use this findElement method
//	WebElement username =driver.findElement(By.xpath("username xpath"));
	
	//annotation -> starts with @
    //annotations works like method only
    //	@FindBy
		
	//2.Element find with @FindBy
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	
	//3.Element action perform in a method
	public void sendUsername() 
	{
		Username.sendKeys("standard_user");
	}
	
//	@FindBy(id="password")
	
	//or
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	
	public void sendPassword() 
	{
		Password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement LoginBtn;
	
	public void clickLoginBtn() 
	{
		LoginBtn.click();
	}
	
	//4.constructor create
	public LoginPOMClass(WebDriver driver) 
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//POM class
	//1.WebDriver globally declared
	//2.@FindBy ele find
	//3.Ele action->method create
	//4.COnstructor create-


}
