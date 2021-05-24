package com.facebook.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePass
{
	WebDriver ldriver;
	public ChangePass(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//div[@aria-label='Account']//i[@class='hu5pjgll lzf7d6o1']")
	@CacheLookup
	WebElement faceAccountInfo;
	
	@FindBy(xpath="//span[normalize-space()='Settings & privacy']")
	@CacheLookup
	WebElement FaceSettingsprivacy;
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
	@CacheLookup
	WebElement FaceSettings;
	
	@FindBy(xpath="//span[normalize-space()='Security and login']")
	@CacheLookup
	WebElement FaceSecurityandLogin;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
	@CacheLookup
	WebElement FaceEditpwdchange;
	
	@FindBy(xpath="//input[@id='password_old']")
	@CacheLookup
	WebElement FaceOldPassword;
	
	@FindBy(xpath="//input[@id='password_new']")
	@CacheLookup
	WebElement FacenewPassword;
	
	@FindBy(xpath="//input[@id='password_confirm']")
	@CacheLookup
	WebElement FaceConfPassword;
	
	@FindBy(xpath="//input[@id='u_1_1_xZ']")
	@CacheLookup
	WebElement FaceChangeSavechanges;
	
	
	
	public void faceaccountinfo()
	{
		faceAccountInfo.click();
	}
	public void faceSettingsprivacy()
	{
		FaceSettingsprivacy.click();
	}
	public void faceSettings()
	{
		FaceSettings.click();
	}
	public void facesettingsandlogin()
	{
		FaceSecurityandLogin.click();
	}
	public void faceChangeEdit()
	{
		FaceEditpwdchange.click();
	}
	public void faceOldPass(String oldpass)
	{
		FaceOldPassword.sendKeys(oldpass);
	}
	public void faceNewPass(String newpass)
	{
		FacenewPassword.sendKeys(newpass);
	}
	public void faceConfNewPass(String Confpass)
	{
		FaceConfPassword.sendKeys(Confpass);
	}
	public void facesaveChanges()
	{
		FaceChangeSavechanges.click();
	}
}
