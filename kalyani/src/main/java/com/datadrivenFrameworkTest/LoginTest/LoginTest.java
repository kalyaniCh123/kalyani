package com.datadrivenFrameworkTest.LoginTest;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.datadriven.framework.utils.ExtentReportManager;

public class LoginTest {

	public static Object report;

	public LoginTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused") 	class loginTest extends Base64 {
			ExtentReports report = ExtentReportManager.getReportInstance();
			@Test
			public void testOne() {
				ExtentReports report = ExtentReportManager.getReportInstance();
				ExtentTest logger=report.createTest("Test one");
				logger.log(Status.INFO,"Intializing the Browser");
						invokeBrowser("chrome");
						logger.log(Status.INFO,"Opening the Website");
					openURL("websiteURL");
					logger.log(Status.INFO,"Click on Sign-In Button");
				elementClick("signinBtn_Xpath");
				logger.log(Status.INFO,"Entering email and Password");
				enterText("usernameTextbox_id","kallu99");
				enterText("PasswordTextbox_CSS","PasswordText");
				logger.log(Status.PASS,"Test executed Successfully");
				//tearDown();
			}
			@AfterTest
			public void endReport() {
				report.flush();
			}
			//@Test (dependsOnMethods="testOne")
			public void textTwo() {
				invokeBrowser("safari");
				openURL("webSiteURL");
				elementClick("signinBtn_xpath");
				enterText("usernameTextbox_Xpath","kallu99");
				enterText("PasswordTextbox_CSS","PasswordText");
			}
			private void enterText(String string, String string2) {
				// TODO Auto-generated method stub
				
			}
			private void elementClick(String string) {
				// TODO Auto-generated method stub
				
			}
			private void openURL(String string) {
				// TODO Auto-generated method stub
				
			}
				
			}
		}

	public static void invokeBrowser(String string) {
		// TODO Auto-generated method stub
		
	}

	}

