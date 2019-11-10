package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SigninPage {

	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement mailID;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@id=\"SubmitLogin\"]")
	WebElement signinBtn;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement category;
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
		}
	
	public boolean SigninPageTitleValidation(String title, WebDriver driver) {
		
		mailID.sendKeys("mprathyusha482@gmail.com");
		password.sendKeys("Pineapple@1");
		signinBtn.click();
		String CurrentTitle= driver.getCurrentUrl();
		if(CurrentTitle.equals(title))
		{
			return true;
		}
		return false;
		
	
	}
	
}
