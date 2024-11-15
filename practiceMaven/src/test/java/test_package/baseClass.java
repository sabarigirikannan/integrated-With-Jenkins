package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import pages.homePage;

public class baseClass {

	public static WebDriver driver;
	public static homePage home;
	
	@BeforeTest
	public void beforeTest() {
		
//		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		
		home=new homePage(driver);
		
		
	}
	
}
