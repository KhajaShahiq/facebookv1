package com.facebook.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.facebook.PageObjects.ChangePass;
import com.facebook.PageObjects.LoginPageObj;

public class TC_FacebookChangepass_003 extends FaceBaseClass {

	
	
	@Test
	public void facechangepassword() throws InterruptedException 
	{
		logger.info("URL is opened");
		
		LoginPageObj lpo=new LoginPageObj(driver);
		
		lpo.setFacebookUserName(username);
		logger.info("Entered username");
		
		lpo.setFacebookPassword(password);
		logger.info("Entered password");
		
		lpo.setFaceSubmit();
		
		
		
		ChangePass cp=new ChangePass(driver);
		
		cp.faceaccountinfo();
		Thread.sleep(3000);
		
		cp.faceSettingsprivacy();
		Thread.sleep(3000);
		
		cp.faceSettings();
		Thread.sleep(3000);
		
		cp.facesettingsandlogin();
		Thread.sleep(3000);
		
		cp.faceChangeEdit();
		Thread.sleep(10000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
		cp.faceOldPass("abcdef123");
		Thread.sleep(2000);
		
		cp.faceNewPass("iamking123");
		Thread.sleep(2000);
		
		cp.faceConfNewPass("iamking123");
		Thread.sleep(2000);
		
		cp.facesaveChanges();
		
		
	}
	
	
	
	
	
}
