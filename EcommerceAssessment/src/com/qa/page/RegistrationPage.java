package com.qa.page;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	@FindBy(xpath="//*[@id=\"email_create\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement btnCreateAcnt;
	
	@FindBy(xpath=" //div[@id='uniform-id_gender2'] ")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"id_state\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement postcode;
	
	@FindBy(xpath="//*[@id=\"phone_mobile\"]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement submitbtn;
	
	
	public RegistrationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public boolean validateRegistrationPage(String title, WebDriver driver) {
		Email.sendKeys("test123@gmail.com");
		btnCreateAcnt.click();
		String CurrentTitle= driver.getTitle();
		if(CurrentTitle.equals(title))
		{
			return true;
		}
		return false;
		
		
	}
	
	public boolean detailsRegistrationpage(String title, WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		gender.click();
		firstname.sendKeys("John");
		lastname.sendKeys("Sam");
		password.sendKeys("test@123");
		address.sendKeys("City center, Birmingham");
		city.sendKeys("Birmingham");
		
		Select State=new Select(state);
		State.selectByVisibleText("Florida");
		
		postcode.sendKeys("12345");
		mobile.sendKeys("6789067890");
		submitbtn.click();
		
		String CurrentTitle= driver.getTitle();
		if(CurrentTitle.equals(title))
		{
			return true;
		}
		return false;
		
		
		}
	
	public boolean validateSubmitPage(String title, WebDriver driver) {
		
		
		String CurrentTitle= driver.getTitle();
		if(CurrentTitle.equals(title))
		{
			return true;
		}
		return false;
	
}
}
