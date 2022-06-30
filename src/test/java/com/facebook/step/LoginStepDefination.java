package com.facebook.step;

import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefination extends LoginPage  {
	
		LoginPage loginpage = new LoginPage();
	
	@Given("^User should be able to open Facebook Application$")
	public void user_should_be_able_to_open_Facebook_Application() throws Throwable {
	    loginpage.openUrl();
	}

	@When("^User enter Username$")
	public void user_enter_Username() throws Throwable {
	    loginpage.userNeme();
	}

	@When("^User enter Password$")
	public void user_enter_Password() throws Throwable {
	    loginpage.passWord();
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	    
	}
	@When("^User click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
	   loginpage.loginButton();
	}
	@When("User click on create new account")
	public void user_click_on_create_new_account() {
	    loginpage.createAccount();
	}

	@Then("User Should be able to signup Sucessfully")
	public void user_should_be_able_to_signup_sucessfully() {
	    loginpage.verifySignup();
	}
	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    loginpage.verifyLogin();
	}
	


}
