package org.serenity.test.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://login.me.zing.vn/")
public class LoginPage extends PageObject {
	@FindBy(id = "u")
	WebElement username;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	@FindBy(id = "login_errormsg")
	WebElement errorMasg;

	@FindBy(id = "pp")
	WebElement txtPass;

	public void typingUsername(String username2) {
		username.sendKeys(username2);
	}

	public void clickLoginbtn() {
		btnLogin.click();
	}

	public boolean errorMsg(String errorMsg) {

		return false;
	}

	public String getStringError() {
		// TODO Auto-generated method stub
		return errorMasg.getText();
	}

	public void passwordField(String password) {
		txtPass.sendKeys(password);
	}

}
