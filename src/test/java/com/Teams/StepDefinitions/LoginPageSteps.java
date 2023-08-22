package com.Teams.StepDefinitions;

import com.global.BaseTest;
import com.pagefactory.LoginPage;

import io.cucumber.java.en.*;

public class LoginPageSteps extends BaseTest{
	
	@Given("the user on the teams sign in page and click on the signin button")
	public void the_user_on_the_teams_sign_in_page_and_click_on_the_signin_button() {
		loginpage=new LoginPage(driver);
		loginpage.clickOnSigninBtn();
	}

	@When("the user enter email id and click on next button")
	public void the_user_enter_email_id_and_click_on_next_button() {
		loginpage.enterEmailAndClickNxtBtn(email);
	}

	@When("the user enter password and click on on signin button")
	public void the_user_enter_password_and_click_on_on_signin_button() {
		loginpage.enterPassAndClickSigninBtn(pass);
	}

	@When("the user click on text button to get otp")
	public void the_user_click_on_text_button_to_get_otp() {
		loginpage.clickTextMsgBtn();
	}

	@When("the user enter the otp and click on verify button")
	public void the_user_enter_the_otp_and_click_on_verify_button() {
		loginpage.enterOtpAndClickVerifyBtn();
	}

	@When("the user click on stay signed yes button")
	public void the_user_click_on_stay_signed_yes_button() {
		loginpage.clickStaysignedBtn();
	}

	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() {
		loginpage.validatingPageTitle();
	}

}

	
