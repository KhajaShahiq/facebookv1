package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObj {
	
	

	WebDriver ldriver;
	public LoginPageObj(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement faceUserName;
	
	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	WebElement facePassword;

	@FindBy(xpath="//button[normalize-space()='Log In']")
	@CacheLookup
	WebElement faceSubmit;
	
	
	public void setFacebookUserName(String faceusername)
	{
		faceUserName.sendKeys(faceusername);
	}
	
	
	public void setFacebookPassword(String facepassword)
	{
		facePassword.sendKeys(facepassword);
	}
	
	public void setFaceSubmit()
	{
		faceSubmit.click();
		
	}
	
}
