package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//button[@id = 'dropdownMenu2']")
	public WebElement menuButton;
	
	@FindBy(xpath = "//button[@id = 'bootbox-logout']")
	public WebElement btnLogout;
	
	@FindBy(xpath = "//button[contains(text(), 'Yes')]")
	public WebElement alertAccept;
	
	@FindBy(xpath = "//button[contains(text(), 'No')")
	public WebElement alertReject;
	
	@FindBy(xpath = "(//img[contains(@class, 'mx-auto')])[1]")
	public WebElement qwikCilverLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean validateHomePage() {
		return menuButton.isDisplayed();
	}
	
	public void clickOnMenu() {
		menuButton.click();
	}
	
	public void clickOnLogout() {
		btnLogout.click();
	}
	
	public void clickOnYesOnAlert() {
		alertAccept.click();
	}
	
	public LoginPage validateSignInPage() {
	 boolean flag = qwikCilverLogo.isDisplayed();
	 Assert.assertTrue(flag);
	 return new LoginPage();
	}	

}
