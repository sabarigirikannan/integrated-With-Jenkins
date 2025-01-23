package com.AppName.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public static WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="ap_email") private WebElement emailInputField;
	public void enterTheEmailId(String email) {
		emailInputField.sendKeys(email);
	}
	
	public String getTheValueOfEmailId() {
		return emailInputField.getAttribute("value");
	}
}
