package com.Teams.StepDefinitions;

import com.global.BaseTest;
import com.pagefactory.GeneralPage;
import com.pagefactory.ManageDelegatePage;

import io.cucumber.java.en.*;

public class SettingsPageSteps extends BaseTest{
	
	
	@When("the user click on three dots menu")
	public void the_user_click_on_three_dots_menu() {
		generalpage = new GeneralPage(driver);
		generalpage.threeDotsMenuBtn();
	  
	}

	@When("the user click on settings icon")
	public void the_user_click_on_settings_icon() {
		generalpage.settingsIconBtn();
	    
	}

	@Then("the user should see the general page")
	public void the_user_should_see_the_general_page() {
		generalpage.validatingGeneralPage();
	}

	@When("the user click on manage delegates")
	public void the_user_click_on_manage_delegates() {
		manage_delegatepage = new ManageDelegatePage(driver);
		manage_delegatepage.clickManageDelegateBtn();
	   
	}

	@When("the user click on your delegate")
	public void the_user_click_on_your_delegate() {
		manage_delegatepage.clickYourDelegateBtn();
	}

	@When("the user enter {string} in the search bar")
	public void the_user_enter_in_the_search_bar(String name) {
		manage_delegatepage.enterDataOnSearchBar(name);
	}

	@When("the user click on add delegate")
	public void the_user_click_on_add_delegate() {
		manage_delegatepage.clickAddBtn();
	}

	@Then("the user should see the delegate name get added")
	public void the_user_should_see_the_delegate_name_get_added() {
		manage_delegatepage.validatingAddDelegate();
	}

	@Then("the user click on threedots menu")
	public void the_user_click_on_threedots_menu() {
		manage_delegatepage.clickThreeDotsMenu();
	}

	@Then("the user click on remove delgates to remove delegate name")
	public void the_user_click_on_remove_delgates_to_remove_delegate_name() {
		manage_delegatepage.clickRemoveDelegates();
	}


}
