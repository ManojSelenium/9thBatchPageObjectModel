package com.sprint1.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.util.TestBase;

public class R002_EditAccount_Test extends TestBase{
	
	@BeforeMethod
	public void setUP() {
		launchBrowser();
		enterURL(AUTOMATION_URL);
	}
	
	//@Test
	public void tc_3() {
		
	}
	
	
}
