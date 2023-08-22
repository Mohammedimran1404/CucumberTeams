package com.Teams.StepDefinitions;

import com.global.BaseTest;
import com.pagefactory.SearchBarDataPage;
import com.pagefactory.SearchBarPage;

import io.cucumber.java.en.*;

public class SearchBarPageSteps extends BaseTest{
	
	@When("the user Click on search bar")
	public void the_user_click_on_search_bar() {
		searchbarpage = new SearchBarPage(driver);
		searchbarpage.clickSearchBar();
	}

	@Then("the user should see the search bar get highlighted")
	public void the_user_should_see_the_search_bar_get_highlighted() {
		searchbarpage.validatingSearchBar();
	}
	@When("the user enter {string} in search bar")
	public void the_user_enter_in_search_bar(String name) {
		searchbar_datapage = new SearchBarDataPage(driver);
		searchbar_datapage.enterDataInSearchBar(name);
	}


	@Then("the user should see the same user name")
	public void the_user_should_see_the_same_user_name() {
		searchbar_datapage.validatingDataInSearchBar();
	}

}
