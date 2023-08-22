package com.Teams.StepDefinitions;

import com.global.BaseTest;
import com.pagefactory.FilterFunctionalityPage;

import io.cucumber.java.en.*;

public class FilterFunctionalityPageSteps extends BaseTest{

	
	@When("the user click on the chat button")
	public void the_user_click_on_the_chat_button() {
		filter_functionalitypage = new FilterFunctionalityPage(driver);
		filter_functionalitypage.clickOnChatBtn();
	   
	}

	@When("the user click on the tribar button")
	public void the_user_click_on_the_tribar_button() {
		filter_functionalitypage.clickTribar();
	   
	}

	@When("the user click on three dots button")
	public void the_user_click_on_three_dots_button() {
		filter_functionalitypage.clickThreeDotsIcon();
	
	}

	@Then("the user should see the filter functionality icons")
	public void the_user_should_see_the_filter_functionality_icons() {
		filter_functionalitypage.validatingFilterFunctions();
	}

}
