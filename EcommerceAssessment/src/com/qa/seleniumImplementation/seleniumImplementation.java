package com.qa.seleniumImplementation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniumImplementation {
	public void loginmail(WebElement element, String mail) {
		element.sendKeys(mail);
	}
	
	public void loginpassword(WebElement element, String password) {
		element.sendKeys(password);
	}
	
	public void loginSubmit(WebElement element) {
		element.click();
	}
	
	public void category(WebElement element) {
		element.click();
	}
	
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mouseHover(WebElement element, WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		}
	
	public void moreBtnclick(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void typeQuantity(WebElement element, String quantity) {
		element.sendKeys(quantity);
	}
	
	public void selectSize(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void proceedToCheckoutBtn(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public boolean validateNumberOfProducts(WebDriver driver, WebElement element, String expectedNumber) {
		String observedNumber=element.getText();
		if(observedNumber.equals(expectedNumber))
		{
			return true;
		}
		return false;
		
	}
	
}
