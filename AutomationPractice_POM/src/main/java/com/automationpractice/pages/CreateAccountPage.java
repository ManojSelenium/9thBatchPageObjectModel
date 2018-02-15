package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.CreateAccoutPagePropertyFile;
import com.automationpractice.util.WebElements;

public class CreateAccountPage extends WebElements implements CreateAccoutPagePropertyFile{

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(String testData) {
		enterText(FIRSTNAME_LOCATOR, testData);
	}
	
	public void enterLastName() {
		System.out.println("Last Name Entered");
	}
}
