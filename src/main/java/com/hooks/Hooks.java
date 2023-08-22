package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.global.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

/* This class contains all browser which is used to run the application
 *@Author Mohammed Imran */
public class Hooks extends BaseTest {
	@Before
	/*This method will invoke for every class to initiate the browser*/
	public void setUp() {
	switch(browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		url();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		url();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		url();
		break;
	case "safari":
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		url();
	default:
		driver= new ChromeDriver();
		url();
	  }
	
	}
	/*This method is used to quit the browser after every class and add screen shot when the test case get failed*/
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
		driver.quit();
	}
	
	public void url() {
		driver.get(url);
	}

}
