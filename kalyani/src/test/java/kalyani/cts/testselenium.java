package kalyani.cts;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testselenium {

		class LogDemo<WebElement> {

		public void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "F:\\sumi\\sample-selenium\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		logger.info("Chrome Driver Opened");

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		logger.info("Navigated to URL");

		driver.manage().window().maximize();

		logger.info("Browser Maximized");



		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Alfreds Futterkiste')]")).getText());

		org.openqa.selenium.WebElement table=driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));

		java.util.List<org.openqa.selenium.WebElement> listOfDataInTable=table.findElements(By.tagName("td"));


		System.out.println(listOfDataInTable.size());

		}

		}

}
