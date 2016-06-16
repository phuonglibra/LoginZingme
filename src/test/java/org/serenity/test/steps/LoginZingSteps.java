package org.serenity.test.steps;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.serenity.test.steps.serenity.LoginUser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginZingSteps {
	@Steps
	LoginUser loginuser;// reusable

	//
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		loginuser.openZingme();
	}

	@When("^user input username is \"([^\"]*)\"$")
	public void user_input_username_is(String username) throws Throwable {
		loginuser.inputUsername(username);
	}

	@When("^user click Login button$")
	public void user_click_Login_button() throws Throwable {
		loginuser.clickLogin();
	}

	@Then("^user check alert message is \"([^\"]*)\"$")
	public void user_check_alert_message_is(String errorMsg) throws Throwable {
		Assert.assertEquals(loginuser.getErrorMsg(), errorMsg);
		// loginuser.checkErrorMsg(errorMsg);
	}

	@When("^user input password is \"([^\"]*)\"$")
	public void user_input_password_is(String password) throws Throwable {
		loginuser.inputPassword(password);
	}
}
