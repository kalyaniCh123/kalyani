package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		// TODO Auto-generated method stub
		class BaseClass {
			public WebDriver driver;
			@BeforeMethod
			public void setup() {
			System.setProperty("webdriver.chrome.driver", "F:\\sumi\\sample-selenium\\src\\test\\resources\\binaries\\chromedriver.exe");
			driver=new ChromeDriver();
			System.setProperty("chromeDriver=F:\\\\sumi\\\\sample-java-project\\\\src\\\\test\\\\resources\\\\binaries\\\\chromedriver.exe", null);

			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

			Reporter.log("---Application started----",true);
			}

			@AfterMethod
			public void teardown() {
			driver.quit();
			Reporter.log("Browser session End",true);
			}
			}




	}

}
