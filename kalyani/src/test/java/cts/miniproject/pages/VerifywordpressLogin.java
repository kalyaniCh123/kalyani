package cts.miniproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class VerifywordpressLogin {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		// TODO Auto-generated method stub
		class VerifyWordpressLogin {
			@Test
			public void verifyValidLogin() {

			System.setProperty("webdriver.chrome.driver", "F:\\sumi\\sample-selenium\\src\\test\\resources\\binaries\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get("http://demosite.center/wordpress/wp-login.php");
			driver.manage().window().maximize();

			wordpressloginpage login=new wordpressloginpage();

			login.typeUserName1();
			login.typePassword1();
			login.clickOnLoginButton1();


			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);
			}
			}
	}

}
