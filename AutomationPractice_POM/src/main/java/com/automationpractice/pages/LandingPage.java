package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.LandingPagePropertyFile;
import com.automationpractice.util.WebElements;

public class LandingPage extends WebElements implements LandingPagePropertyFile{
	
	WebDriver driver=null;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignIn(){
		System.out.println("Landing Page 3::: "+driver);
		click(SIGNINLocator);
		
	}
	
	public void clickContactUs() {
		click(CONTACTUSLOcator);
	}
	
	public void searchItem() {
		System.out.println("Item Searched");
	}
}
