package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.PageObjects.LoginPageObj;

public class TC_FacebookLogin_001 extends FaceBaseClass{
	
	
	@Test
	public void facelogintest() throws IOException
	{
		logger.info("URL is opened");
		
		LoginPageObj lpo=new LoginPageObj(driver);
		
		lpo.setFacebookUserName(username);
		logger.info("Entered username");
		
		lpo.setFacebookPassword(password);
		logger.info("Entered password");
		
		lpo.setFaceSubmit();
		
		
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
			System.out.println("Hello World");
		}
		else
		{
			captureScreen(driver,"FaceloginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
	
	
	

}
