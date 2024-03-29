package cta.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdExcelWordpressLogin {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		// TODO Auto-generated method stub
		class DdWordpressLogin<driver> {
			WebDriver driver;
			@Test(dataProvider="wordpress")
			public void loginToWordpress(String username,String password) {

			System.setProperty("webdriver.chrome.driver", "F:\\sumi\\sample-selenium\\src\\test\\resources\\binaries\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("http://demosite.center/wordpress/wp-login.php");
			driver.manage().window().maximize();
			driver.findElement(By.id("user_login")).sendKeys(username);
			driver.findElement(By.id("user_pass")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='user_pass']")).click();

			System.out.println(driver.getTitle());
			}
			@AfterMethod
			public void tearDown() {
			driver.quit();
			}

			@DataProvider(name="wordpress")
			public Object[][] passData() {

			Object[][] data=new Object[3][2];

			data[0][0]="admin1";
			data[0][1]="demo1";

			data[1][0]="admin";
			data[1][1]="demo123";

			data[2][0]="admin2";
			data[2][1]="demo1234";

			return data;
			}

			}

	}

}
