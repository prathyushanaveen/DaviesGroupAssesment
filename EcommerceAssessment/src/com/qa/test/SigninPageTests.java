package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.page.RegistrationPage;
import com.qa.page.SigninPage;

public class SigninPageTests {
	
	 WebDriver driver;
	SigninPage spage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace2\\ECommerceTestAutomation\\"
				+ "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		spage=new SigninPage(driver);
		}
	
	@Test
	public void signinPageValidation() {
		String title="My account - My Store";
		boolean result=spage.SigninPageTitleValidation(title, driver);
		Assert.assertTrue(result);
	}

}
