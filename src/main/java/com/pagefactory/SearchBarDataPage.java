package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;

/*
 *This class contains all the methods which is related search bardata page
 *of teams application and validating the intendent and realized names
 *@Author Mohammed Imran */
public class SearchBarDataPage extends BaseTest{
	String str_IntendentValue;
	WebDriver driver;
	public SearchBarDataPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='control-input']" )
	private WebElement enterdatainsearchbar;
	@FindBy(xpath = "//h2[@id='chat-header-title']")
	private WebElement validatingdata;
	/* This method is used to send text to the search bar */
	public void enterDataInSearchBar(String name)  {
	   utilities.explicitWaitForLoacatorLocated(10,By.xpath("//input[@id='control-input']"));
	   try {
	   utilities.actionClassToClickAndSendData(name, enterdatainsearchbar);
	   log.Info("Search bar is clicked and data is enter");
	   utilities.wait(2000);
	   utilities.robotclass();	
	   str_IntendentValue=name;
	   }
	   catch (WebDriverException e) {
		   e.printStackTrace();
	}
	  
	}
	/* This method is used to validate the intendent and realized names */
	public void validatingDataInSearchBar() {
	    utilities.explicitWaitForLoacatorLocated(10,By.xpath("//h2[@id='chat-header-title']"));
	    try {
		String str_RealizedValue=validatingdata.getText();
		validations.assertionEquals(str_RealizedValue, str_IntendentValue);
		log.Info("Search data is validated");
	    }
	    catch(WebDriverException e) {
	    	e.printStackTrace();
	    }
	}
	
}


