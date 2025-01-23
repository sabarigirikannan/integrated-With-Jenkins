package com.AppName.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	public static WebDriver driver;

	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="nav-link-accountList-nav-line-1") private WebElement signInButton;
	public String clickOnTheSignButton() {
		driver.navigate().refresh();
		 signInButton.click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return driver.getTitle();
	}
	
	
	
}
