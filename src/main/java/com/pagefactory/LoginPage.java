package com.pagefactory;

import org.openqa.selenium.By;
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

public class LoginPage extends BaseTest{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign in") private WebElement signinbutton;
	@FindBy(xpath="//input[@name='loginfmt']")private WebElement emailtextbox;
	@FindBy(xpath = "//input[starts-with(@id,'idSIButton')]")private WebElement nextbutton;
	@FindBy(xpath="//input[@name='passwd']")private WebElement passwordtextbox;
	@FindBy(xpath="//input[contains(@id,'idSIButton')]")private WebElement passsigninbutton;
	@FindBy(xpath = "//div[contains(text(),'Text')]")private WebElement textmsgbtn;
	@FindBy(xpath = "//input[contains(@id,'idSubmit')]")private WebElement verifybtn;
	@FindBy(xpath = "//input[contains(@id,'idSIButton')]")private WebElement staysignedbtn;
	
	/*This method is used to maximize the window and click on signin button and handling the winodw*/
	public void clickOnSigninBtn() {
		try {
		utilities.maxmizeWindow();
		utilities.clickElement(signinbutton);
		log.Info("Sign in button is clicked");
		utilities.windowHandle("Sign in to your account");
		}
		catch(WebDriverException e) {
		e.printStackTrace();
		}
	}
	/*This method is used to enter the mail and click on the next button */
	public void enterEmailAndClickNxtBtn(String email) {
		
		utilities.expicitWaitForVisibilityOfElement(emailtextbox, 30);
		try {
		utilities.sendText(emailtextbox, email);
		log.Info("Email is entered");
		utilities.clickElement(nextbutton);
		log.Info("Next button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	/*This method is used to enter the password and click on the signin button */
	public void enterPassAndClickSigninBtn(String pass) {
		utilities.explicitWaitForLoacatorLocated(50,By.xpath("//input[@name='passwd']"));
		try {
		utilities.sendText(passwordtextbox, pass);
		log.Info("Password is entered");
		utilities.clickElement(passsigninbutton);
		log.Info("Buttton is clicked");
		}
		catch(WebDriverException e) {
		e.printStackTrace();
		}
	}
	/*This method is used to click on text message button to get the text*/
	public void clickTextMsgBtn() {
		try {
		utilities.clickElement(textmsgbtn);
		log.Info("Text msg button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
		utilities.wait(16000);
	}
	/*This method is used to enter the OTP and clik on verify button*/
	public void enterOtpAndClickVerifyBtn() {
		try {
		utilities.clickElement(verifybtn);
		log.Info("Verify button is clicked");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	/*This method is used to click on stay signed button*/
	public void clickStaysignedBtn() {
		utilities.expicitWaitForVisibilityOfElement(staysignedbtn, 30);
		try {
		utilities.clickElement(staysignedbtn);
		log.Info("Stay signed in button is clicked");
		}
		catch(WebDriverException e) {
		e.printStackTrace();
	  }
	}
	/*This method is used to check the homepage is visible */
	public void validatingPageTitle()  {
		try {
		utilities.explicitWaitForTitleToLoad(50, "Microsoft Teams - loading");
		String intendentTitle="Microsoft Teams - loading";
		String realizedTitle=driver.getTitle();
		validations.verifyTwoValues(realizedTitle, intendentTitle);
		log.Info("Page is validated");
		}
		catch(WebDriverException e) {
			e.printStackTrace();
		}
	}
	

}
