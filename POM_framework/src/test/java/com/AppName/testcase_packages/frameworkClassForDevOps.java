package com.AppName.testcase_packages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.AppName.pages.HomePage;
import com.AppName.utilities.baseClass;

public class frameworkClassForDevOps extends baseClass {
	
	
	@Test(priority = 1)
	public void test() {
		
		
		String actualTitle=home.clickOnTheSignButton();
		String expectedTitle=prop.getProperty("signInPageTitle");
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println(actualTitle);
		
		
		signIn.enterTheEmailId(prop.getProperty("emailId"));
		String actualValueOfEmailInput=signIn.getTheValueOfEmailId();
		String expectedValueOfEmailInput=prop.getProperty("emailId");
		
		Assert.assertEquals(actualValueOfEmailInput, expectedValueOfEmailInput);
		System.out.println(actualValueOfEmailInput);
	}

}
