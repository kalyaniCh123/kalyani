package cts.miniproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginpagewithpageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		class LoginPageWithPageFactory {

			@SuppressWarnings("unused")
			WebDriver driver;

			@FindBy(how=How.ID,using="user_login")
			@CacheLookup
			WebElement username;

			@FindBy(how=How.XPATH,using="//input[@id='user_pass']")
			@CacheLookup
			WebElement password;

			@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
			@CacheLookup
			WebElement submit_button;

			@SuppressWarnings("unused")
			public LoginPageWithPageFactory(WebDriver deriver, WebDriver driver) {
			this.driver=driver;
			}

			@SuppressWarnings("unused")
			public void typeUserNameAndPassword(String userid,String pass) {
			username.sendKeys(userid);
			password.sendKeys(pass);
			}

			public void clickOnLoginButton() {
			submit_button.click();
			}

			}


	}

}
