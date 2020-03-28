package kalyani.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class validInvalid {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		class ValidAndInvalidLogin extends BaseClassFinder {
		WebDriver driver;
		@Test(description="Valid login",priority=1)
		public void validlogin() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard",driver.getCurrentUrl());
		}
		@Test(description="Invalid login",priority=2)
		public void Invalidlogin() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin111");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123111");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals("Invalid credentials",driver.findElement(By.id("spanMessage")).getText());
		}
		}

	}

}
