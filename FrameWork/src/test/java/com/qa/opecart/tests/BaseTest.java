package com.qa.opecart.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegistrationPage;
import com.qa.opencart.pages.SearchResultPage;

public class BaseTest {

	DriverFactory df;
	Properties prop;
	WebDriver driver;
	LoginPage loginpage;
	AccountsPage accountPage;
	
	SearchResultPage searchResultsPage;
	ProductInfoPage productInfoPage;
	
	RegistrationPage registrationPage;
	
	@BeforeTest
	public void setup()
	{
	df = new DriverFactory();
	prop=df.init_prop();
	driver=df.init_driver(prop);
	loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}

