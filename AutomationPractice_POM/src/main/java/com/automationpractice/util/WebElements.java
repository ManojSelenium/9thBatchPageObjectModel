package com.automationpractice.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements {

	WebDriver driver=null;
	

	public WebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		System.out.println("WebElements 4 ::: "+driver);
		
		driver.findElement(prop).click();
	}

	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}

	public void selectValueFromDropDown(By prop,String text) {
		new Select(driver.findElement(prop)).selectByVisibleText(text);
	}

	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
}
