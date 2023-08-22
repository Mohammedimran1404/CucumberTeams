package com.global;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/* This class contains all the generic methods which is related to WebDriver
 *@Author Mohammed Imran */
public class UtilFunctions  {
	 WebDriver driver;
	public UtilFunctions(WebDriver driver) {
		this.driver=driver;
	}

	 /* This method is used to maximize the window */	
	public void maxmizeWindow() {
		driver.manage().window().maximize();
	}

	/* This method is used to minimize the window */
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}

	/*This method will wait all the elements which is present in the class 
	 @Paran time */
	public void implictWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}


	/* This method will wait for particular element to be clickable
	  * @Param element
	  * @Param time */
	public void explictWaitForElementClickable(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/*
	  * This method will wait till the particular webelement get visible
	  * @Param element
	  * @Param time */
	public void expicitWaitForVisibilityOfElement(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/*This method is used to select drop down element by using index value
	  @Param element, index*/
	public void dropDownByIndex(WebElement element, int index) {
		Select sele = new Select(element);
		sele.selectByIndex(index);
	}

	/*This method is used to select drop down element by using visible text
	  @Param element, index*/
	public void dropDownByVisibleText(WebElement element, String text) {
		Select sele = new Select(element);
		sele.selectByVisibleText(text);
	}

	/*This method is used to select drop down element by using value
	  @Param element, index*/
	public void dropDownByValue(WebElement element, String value) {
		Select sele = new Select(element);
		sele.selectByValue(value);
	}

	/*This method is used to do double click on the element*/
	public void doubleClick() {
		Actions action = new Actions(driver);
		action.doubleClick().build().perform();
	}

	/*This method is used to do double click on the particular element
	 @Param element */
	public void doubleClickOnParticularElement(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	/*This method is used to do right click on the element
	 @Param element */
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}

	/* This method is used to move the curser on the element
	  * @Param element */
	public void mouseHover( WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	/* This method is used to do window handle from one tab to another tab
	  *@Param title */
	public void windowHandle(String title) {
		Set<String>allwindowhandleID=driver.getWindowHandles();
		for(String wind:allwindowhandleID) {
		String currenttitle=driver.switchTo().window(wind).getTitle();
		 if (currenttitle.equals(title)) {
			 break;
	}
}
}
	/*
	  * This method will wait till the title get visible
	  * @Param title
	  * @Param time */
	
	public void explicitWaitForTitleToLoad(int time,String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	/* This method is used to scroll the page by using index
	  * @Param y */	
	    public void javascriptExecutorToScroll(int y) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,"+y+")","");
		}
	/* This method is used to click the webelement using java script execeutor
	  * @Param element */
	public void javascriptExecutorToClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	/* This method is used to do keyboard actions 
	  * @Param number_of_times_to_click */
	public void robotclass(int number_of_times_to_click)  {
		try {
		Robot robo = new Robot();
		for(int i=0;i<= number_of_times_to_click;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception e) {
			
		}
	}
	/*
	  * This method will wait till the particular webelement get invisible
	  * @Param element
	  * @Param time */
	public void explicitWaitForInvisibilityOfElement( int time,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	/*This method is used to click and send data using action class
	 @Param data, element*/
	public void actionClassToClickAndSendData(String data,WebElement element) {
	Actions action = new Actions(driver);
	action.click(element).sendKeys(data).build().perform();
	}
	/* This method is used to do keyboard actions */
	public void robotclass() {
		try {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	catch(AWTException e) {
	}
	  }
	
	
	/*This method is used to click on the web element using action class*/
	public void actionClassToEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	/*This method is used to click on the particular web element using action class*/	
	public void actionClassToClick(WebElement ele) {
		Actions action = new Actions(driver);
		action.click(ele).build().perform();

	}
	/*
	  * This method will wait till the particular locator get visible
	  * @Param locator
	  * @Param time */
	public void explicitWaitForLoacatorLocated(int time,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/*This method is used to click on the webelement*/
	public void clickElement(WebElement element) {
		element.click();
	}
	/*This method is used to send text to the element*/ 
	public void sendText(WebElement element, String data) {
		element.sendKeys(data);
		
	}
	public void wait(int time) {
		try {
		Thread.sleep(time);
		}
		catch(InterruptedException e) {
		}
	}
	
}
  