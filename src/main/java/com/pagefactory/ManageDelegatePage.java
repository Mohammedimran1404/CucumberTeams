package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;
/*
 *This class contains all the methods which is related manage delegate page
 *of teams application and validating the intendent and realized names
 *@Author Mohammed Imran */

public class ManageDelegatePage extends BaseTest{
	WebDriver driver;
	public ManageDelegatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='openDelegateSettingsDialogBtn']")
	private WebElement managedelegatebtn;
	@FindBy(xpath = "//span[text()='Your delegates']")
	private WebElement yourdelegatebtn;
	@FindBy(xpath = "//input[@type=\"search\"]")
	private WebElement delegatesearchbar;
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement addbtn;
	@FindBy(xpath = "//div[@class='display-name']")
	private WebElement validatingname;
	@FindBy(xpath = "//button[@aria-label='More options']")
	private WebElement threedotsmenu;
	@FindBy(xpath = "//span[text()='Remove delegate']")
	private WebElement removedelegate;
	/*This methodo is used to click on manage delegate button*/
	   String str_IntendentName;
	public void clickManageDelegateBtn() {
		try {
		utilities.javascriptExecutorToScroll(400);
		utilities.explictWaitForElementClickable(managedelegatebtn, 20);
		utilities.javascriptExecutorToClick( managedelegatebtn);
		log.Info("Manage delegate is click");
		}
		catch(WebDriverException e) {
		e.printStackTrace();
		}
	}
	/*This method is used to click on the your delegate button*/
	public void clickYourDelegateBtn() {
		try {
		utilities.clickElement(yourdelegatebtn);
		log.Info("Your delegate is click");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	/*This method is used to enter data into search bar to search the realized name*/
	public void enterDataOnSearchBar(String name) {
		try {
		utilities.expicitWaitForVisibilityOfElement(delegatesearchbar, 10);
		utilities.sendText(delegatesearchbar, name);
		log.Info("Data is enter");
		utilities.wait(2000);
	    utilities.actionClassToEnter();
	    log.Info("Action class click ");
		str_IntendentName=name;
		}
		catch (WebDriverException e) {
			e.printStackTrace();
		}
	}	
	/*This method is used to clik on add buttton*/
	public void clickAddBtn() {
		utilities.expicitWaitForVisibilityOfElement(addbtn, 10);
		try {
		utilities.clickElement(addbtn);
		log.Info("Add btn is click");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
		
	}
	/*This method is used to check the intendent and realized name are same*/
	public void validatingAddDelegate()  {
		utilities.expicitWaitForVisibilityOfElement(validatingname, 10);
		try {
		String str_RealizedName=validatingname.getText();
		validations.assertContains(str_IntendentName,str_RealizedName);
		log.Info("Validation is done");
		}
		catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	/*This method is used to click on three dots icon*/
	public void clickThreeDotsMenu() {
		try {
		utilities.mouseHover(validatingname);
		utilities.explictWaitForElementClickable(threedotsmenu, 20);
		utilities.clickElement(threedotsmenu);
		log.Info("Threed dots icon is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
		
	}
	/*This method is used to click on remove delegate button to remove the delegate*/
	public void clickRemoveDelegates() {
		try {
		utilities.clickElement(removedelegate);
		log.Info("Delegate is removed");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}

}





