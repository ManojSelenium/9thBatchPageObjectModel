package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.LoginPagePropertyFile;
import com.automationpractice.util.WebElements;

public class LoginPage extends WebElements implements LoginPagePropertyFile{

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void enter_cat_emailAddress(String testData) {
		enterText(CAT_EMAIlADDRESSLOCATOR, testData);
	}
	
	public void clickCreateAccountButton() {
		click(CREATEACCOUNTBUTTON_LOCATOR);
	}
	
	public void clickForgotPassword() {
		
	}
	public void clickSIgnin() {
		
	}
}
