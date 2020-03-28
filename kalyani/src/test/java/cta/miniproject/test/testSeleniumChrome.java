package cta.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.Config;

public class testSeleniumChrome<get> {

		// TODO Auto-generated method stub

			@BeforeTest
			public void setup() {

			@SuppressWarnings("unused")
			Config config1 = new Config();

			System.getProperty("webdriver.chrome.driver");

			System.out.println("Set up is Ready");

			}

			@Test
			void testchrome() {
			System.out.println("Navigate to URL");
			@SuppressWarnings("unused")
			WebDriver driver=new ChromeDriver();
	
	}
}
	
			
