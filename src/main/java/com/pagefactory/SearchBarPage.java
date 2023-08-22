package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseTest;
/*
 *This class contains all the methods which is related search bar page
 *of teams application and validating the search bar is selected 
 *@Author Mohammed Imran */
public class SearchBarPage extends BaseTest{
	WebDriver driver;
	public SearchBarPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='controlbox-input-group']/descendant::input")
	private WebElement searchbar;
/*This method is used to click on search bar */
public void clickSearchBar() {
	utilities.expicitWaitForVisibilityOfElement(searchbar, 30);
	try {
	utilities.clickElement(searchbar);
	log.Info("Search bar is clicked");
	}
	catch(WebDriverException e) {
		e.printStackTrace();
	}
}
/*This method is used to validate that search bar is selected*/
public void validatingSearchBar() {
	try {
	validations.verifySelection(searchbar);
	log.Info("Searchbar is validated");
	}
	 catch(WebDriverException e) {
		  e.printStackTrace();
	 }
}
  }
