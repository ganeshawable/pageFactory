package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "txtUsername")
	WebElement user;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginfunctionality(String username, String Password) {
		user.sendKeys(username);
		pass.sendKeys(Password);
		login.click();
	}

}
