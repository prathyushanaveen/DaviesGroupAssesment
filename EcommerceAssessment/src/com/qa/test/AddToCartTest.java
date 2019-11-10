package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.page.AddToCartPage;
import com.qa.page.SigninPage;

public class AddToCartTest {
	
	AddToCartPage ACPage;
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace2\\ECommerceTestAutomation\\"
				+ "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		ACPage=new AddToCartPage(driver);
	}
	
	@Test
	public void ValidateAddToCart() {
		Assert.assertTrue(ACPage.addToCartValidation(driver));
	}
	
	

}
