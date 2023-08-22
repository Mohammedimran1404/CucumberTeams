package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.global.BaseTest;

/*
 *This class contains all the methods which is related calendarpage
 *of teams application and validating the visibility of the page
 *@Author Mohammed Imran */


public class CalendarPage extends BaseTest{
	WebDriver driver;
	
	public CalendarPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Calendar']")
	private WebElement calendorbtn;
	@FindBy(xpath = "//div[@id='page-content-wrapper']")
	private WebElement calendarpage;
	/*This method is used to click on calendar button icon  */
	public void clickCalendorBtn() {
		utilities.expicitWaitForVisibilityOfElement(calendorbtn, 10);
		try {
		utilities.clickElement(calendorbtn);
		log.Info("Calendor button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	/*This method is used to check the visibility of the calendar page*/
	public void validatingCalendarPage() {
		utilities.wait(3000);
		try {
		validations.validatingElementVisibility(calendarpage);
		log.Info("Calendar page is displayed");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
			
		}
	}

}
