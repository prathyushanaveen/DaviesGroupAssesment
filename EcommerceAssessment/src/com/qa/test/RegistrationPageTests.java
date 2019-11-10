package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.page.RegistrationPage;

public class RegistrationPageTests {
	
	WebDriver driver;
	RegistrationPage page;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace2\\ECommerceTestAutomation\\"
				+ "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		page=new RegistrationPage(driver);
		}

	@Test
	public void RegistrationPageValidation() {
		String title="Login - My Store";
		boolean result=page.validateRegistrationPage(title, driver);
		Assert.assertTrue(result);
	}
	
	@Test
	public void submitRegistrationPage() throws InterruptedException {
		String title="My account - My Store";
		boolean result=page.detailsRegistrationpage(title, driver);
		Assert.assertTrue(result);
	}
	
//	@AfterTest
//	public void tearoff() {
//		driver.quit();
//	}
	
}
