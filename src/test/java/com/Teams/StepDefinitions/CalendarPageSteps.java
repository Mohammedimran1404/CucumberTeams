package com.Teams.StepDefinitions;

import com.global.BaseTest;
import com.pagefactory.CalendarPage;

import io.cucumber.java.en.*;

public class CalendarPageSteps extends BaseTest{
	
	@When("the user click on clendar button")
	public void the_user_click_on_clendar_button() {
		calendarpage = new CalendarPage(driver);
		calendarpage.clickCalendorBtn();
	}

	@Then("the user should see the calendar page")
	public void the_user_should_see_the_calendar_page() {
		calendarpage.validatingCalendarPage();
	   
	}


}
