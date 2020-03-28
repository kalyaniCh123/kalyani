package cta.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cts.miniproject.utility.BrowserFactory;
import junit.framework.Assert;

public class verifywordpresslogin {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		// TODO Auto-generated method stub
		class VerifyWordpressLoginPageFactory<LoginPageWithPageFactory> {
			@SuppressWarnings("deprecation")
			@Test
			public void checkValidUser() {
			//This will Launch browser and specific url
			BrowserFactory browserfactory=new BrowserFactory();
			WebDriver driver=browserfactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

			//Create pageObject using PageFactory
			
			Object loginpage;
			((Object) loginpage).typeUserNameAndPassword("admin", "demo123");
			() loginpage).clickOnLoginButton();

			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);

			}
			}

	}

}
