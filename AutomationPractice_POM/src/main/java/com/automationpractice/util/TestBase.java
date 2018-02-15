package com.automationpractice.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements SetUp{

	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		 driver=new ChromeDriver();
		 System.out.println("Test Base Driver 1 :: "+driver);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
	
}
