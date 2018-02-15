package com.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.LandingPage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestBase;



public class R001_CreateAccount_Test extends TestBase{

	LandingPage landingPage;
	LoginPage loginPage;
	CreateAccountPage accountPage;
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		driver=launchBrowser();
		System.out.println("Create Account Driver 2:: "+driver);
		enterURL(AUTOMATION_URL);
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		accountPage=new CreateAccountPage(driver);
	}
	@Test
	public void tc_1() {
	landingPage.clickSignIn();
	loginPage.enter_cat_emailAddress("manoj345@mailinator.com");
	loginPage.clickCreateAccountButton();
	accountPage.enterFirstName("manoj");
	accountPage.enterLastName();
	Assert.assertTrue(true);
	}
	
	//@Test
	public void tc_2() {

		landingPage.clickSignIn();
		//loginPage.enter_cat_emailAddress();
		loginPage.clickCreateAccountButton();
		//accountPage.enterFirstName();
		accountPage.enterLastName();
	}
	
}
