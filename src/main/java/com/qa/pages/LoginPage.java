package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "UserLoginName")
	 WebElement userName;

	@FindBy(name = "Password")
	 WebElement password;

	@FindBy(xpath = "//input[@id = 'chkUserConsent']")
	 WebElement useConsentCheckBox;

	@FindBy(xpath = "//button[@id = 'btn-signin']")
	 WebElement btnSignIn;

	@FindBy(xpath = "(//img[contains(@class, 'mx-auto')])[1]")
	 WebElement qwikCilverLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateQwikCilverImg() {
		return qwikCilverLogo.isDisplayed();
	}

	public void loginToQwikHome(String uname, String pass) {
		userName.sendKeys(uname);
		password.sendKeys(pass);

	}

	public void clickOnUserConsent() {
		useConsentCheckBox.click();
	}

	public HomePage clickOnLogin() {
		btnSignIn.click();
		return new HomePage();
	}

	public void closeBrowser() {
		driver.close();
	}
}
