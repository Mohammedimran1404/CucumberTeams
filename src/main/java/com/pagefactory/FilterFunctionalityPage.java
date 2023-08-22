package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;
/*
 *This class contains all the methods which is related filter functionality page
 *of teams application and validating the visibility of the icons of filter functionality
 *@Author Mohammed Imran */
public class FilterFunctionalityPage extends BaseTest {
	WebDriver driver;
	public FilterFunctionalityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//nav[@id='teams-app-bar']/descendant::button[2]")
	private WebElement chatbtn;
	@FindBy(xpath = "//ng-include[@src='leftRailHeader.filterIconSrc']//*[name()='svg']")
	private WebElement tribaricon;
	@FindBy(xpath = "//button[@aria-label='Close filter']/preceding::button[@aria-label='More options']//*[name()='svg'][@class='app-svg icons-unfilled icons-default-fill']")
	private WebElement threedotsicon;
	@FindBy(xpath = "//div[@class='rcs_scrollbarWidthMeasurer']/following::div/child::ul")
	private WebElement filterallfunctions;
	
	/*This method is used to click on the chat button icon*/
	public void clickOnChatBtn() {
		utilities.explictWaitForElementClickable(chatbtn, 30);
		try {
		utilities.clickElement(chatbtn);
		log.Info("Chat button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
			
		}
	}
	/*This method is used to click on the tribar icon*/
	public void clickTribar()  {
		utilities.wait(2000);
		try{
		utilities.clickElement(tribaricon);
		log.Info("tribar is clicked");
		}
		catch(WebDriverException e ) {
			e.printStackTrace();
		}
	}
	/*This method is used to click on the three dots icon*/
	public void clickThreeDotsIcon() {
		try {
		utilities.mouseHover(chatbtn);
		utilities.clickElement(threedotsicon);
		log.Info("threedots button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
			
		}
	
	}
	/*This method is used to validate the filter functionality icons visibility*/
	public void validatingFilterFunctions() {
		try {
		validations.validatingElementVisibility(filterallfunctions);
		log.Info("Filer functions is validated");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
			
		}
	}
	}

