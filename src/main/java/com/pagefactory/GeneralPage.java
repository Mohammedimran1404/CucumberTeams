package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.global.BaseTest;
/*
 *This class contains all the methods which is related general page
 *of teams application and validating the visibility of the page
 *@Author Mohammed Imran */

public class GeneralPage extends BaseTest {
	WebDriver driver;
	
	public GeneralPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='settings-menu-button']//ng-include//*[name()='svg']")
	private WebElement threedotsmenu;
	@FindBy(xpath = "//button[normalize-space()='Settings']")
	private WebElement settingsicon;
	@FindBy(xpath = "//div[@class='analytics-panel']")
	private WebElement generalpage;
	
	/*This method is used to click on three dots button icon  */
	public void threeDotsMenuBtn() {
		utilities.explictWaitForElementClickable(threedotsmenu, 50);
		try {
		utilities.clickElement(threedotsmenu);
		log.Info("Three dots menu is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
		}
	/*This method is used to click on settings  icon  */
	public void settingsIconBtn() {
		utilities.explictWaitForElementClickable(settingsicon, 30);
		try {
		utilities.clickElement(settingsicon);
		log.Info("Settings icon is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
			
		}
	}
	/*This method is used to validate the visibility of general page */
	public void validatingGeneralPage() {
		try {
		validations.validatingElementVisibility(generalpage);
		log.Info("General page is validated");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	

}
