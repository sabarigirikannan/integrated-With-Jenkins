package com.AppName.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import com.AppName.pages.HomePage;
import com.AppName.pages.SignInPage;
import com.beust.jcommander.Parameter;

public class baseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static HomePage home;
	public static SignInPage signIn;
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		String browser="chrome";
		 
		 if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		 }else if(browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		 }else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		 }else {
			 System.out.println("invalid driver");
		 }
		 
		 
		 
		 driver.get(prop.getProperty("website"));
		 
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 
		home=new HomePage(driver);
		signIn=new SignInPage(driver);
			
		
	}
	
	@BeforeTest
	public void beforeTest() throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\input.properties"); 
		 FileInputStream fis=new FileInputStream(f);
		 prop=new Properties();
		 prop.load(fis);
	}
	
	@AfterMethod
	public void afterMethod() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
}
