package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.PageObjects.LoginPageObj;
import com.facebook.Utilities.XLUtils;

public class TC_FacebookLoginDDT_002 extends FaceBaseClass 
{

	@Test(dataProvider="DDTLoginData")
	
	public void loginDDT(String user, String pwd ) throws IOException
	{
		logger.info("URL is opened");
		
		LoginPageObj lpo=new LoginPageObj(driver);
		
		lpo.setFacebookUserName(user);
		logger.info("Entered username");
		
		lpo.setFacebookPassword(pwd);
		logger.info("Entered password");
		
		lpo.setFaceSubmit();
		
		if(driver.getTitle().equals("Facebook – log in or sign up1"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			logger.info("Login test failed");
			captureScreen(driver,"FaceloginTest");
			Assert.assertTrue(false);
			
			
		}
		
		
		
		
		
	}

	
	
	
	@DataProvider(name="DDTLoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/facebook/TestData/FaceLoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
}
