package cts.miniproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class wordpressloginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


@SuppressWarnings("unused")
By username=By.id("user_login");
By.xpath("//input[@id='user_pass']");
@SuppressWarnings("unused")
By loginButton=By.xpath("//input[@id='wp-submit']");
@SuppressWarnings("unused")
By checkbox=By.id("rememberme");

}

@SuppressWarnings("null")
public void typeUserName1() {

Object username = null;
By driver = null;
driver.findElement((SearchContext) username).sendKeys("admin");
}

@SuppressWarnings("null")
public void typePassword1() {

SearchContext password = null;
By driver = null;
driver.findElement(password).sendKeys("demo123");
}
@SuppressWarnings("null")
public void clickOnLoginButton1() {

SearchContext loginButton = null;
By driver = null;
driver.findElement(loginButton).click();
}

}
