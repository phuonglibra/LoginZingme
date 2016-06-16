package org.serenity.test.steps.serenity;

import org.serenity.test.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginUser {
	LoginPage loginpage;

	@Step
	public void openZingme() {
		loginpage.open();
	}

	@Step
	public void inputUsername(String username) {
		loginpage.typingUsername(username);
	}

	@Step
	public void clickLogin() {
		loginpage.clickLoginbtn();
	}

	@Step
	public String getErrorMsg() {
		// TODO Auto-generated method stub
		return loginpage.getStringError();
	}

	public void inputPassword(String password) {

		loginpage.passwordField(password);
	}

}
