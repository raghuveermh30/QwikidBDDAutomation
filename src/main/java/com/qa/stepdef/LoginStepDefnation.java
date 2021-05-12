package com.qa.stepdef;

import org.junit.Assert;

import com.qa.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefnation extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	@Given("^User present on Login Page$")
	public void user_present_on_Login_Page() throws Throwable {
		TestBase.initialization();
	}

	@Given("^Title of Login page is Qwikhome$")
	public void title_of_Login_page_is_Qwikhome() throws Throwable {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("SignIn", title);
	}

	@Given("^User Enters credentials$")
	public void user_Enters_credentials() throws Throwable {
		loginPage = new LoginPage();
		loginPage.loginToQwikHome(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Given("^User accept the consent$")
	public void user_accept_the_consent() throws Throwable {
		loginPage = new LoginPage();
		loginPage.clickOnUserConsent();
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateHomePage();
	}

	@Given("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.clickOnLogin();
	}

	@Given("^User click on Home Button$")
	public void user_click_on_Home_Button() throws Throwable {
		homePage = new HomePage();
		homePage.clickOnMenu();
	}

	@Given("^User clicks on Logout Button$")
	public void user_clicks_on_Logout_Button() throws Throwable {
		homePage = new HomePage();
		homePage.clickOnLogout();
	}

	@When("^User accepts the alert$")
	public void user_accepts_the_alert() throws Throwable {
		homePage = new HomePage();
		homePage.clickOnYesOnAlert();
	}

	@Then("^User Should redirect to signIn Page$")
	public void user_Should_redirect_to_signIn_Page() throws Throwable {
		homePage = new HomePage();
		loginPage = new LoginPage();
		loginPage = homePage.validateSignInPage();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		loginPage = new LoginPage();
		loginPage.closeBrowser();
	}

}
