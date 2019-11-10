package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.seleniumImplementation.seleniumImplementation;

public class AddToCartPage {
	
	seleniumImplementation selenium;
	

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement mailID;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@id=\"SubmitLogin\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement category;
	
	@FindBy(css="#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img")
	WebElement image;

	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")
	WebElement moreBtn;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	WebElement Quantity;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement size;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement proceedBtn;
	
	@FindBy(css="#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > span.ajax_cart_quantity")
	WebElement numberOfProducts;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium=new seleniumImplementation();
	}
	
	public boolean addToCartValidation(WebDriver driver)  {
		selenium.loginmail(mailID, "mprathyusha482@gmail.com");
		selenium.loginpassword(password, "Pineapple@1");
		selenium.loginSubmit(loginBtn);
		selenium.category(category);
		selenium.scrollDown(driver);
		selenium.mouseHover(image, driver);
		selenium.moreBtnclick(moreBtn);
		selenium.clear(Quantity);
		selenium.typeQuantity(Quantity, "3");
		selenium.selectSize(size, "M");
		selenium.moreBtnclick(addToCartBtn);
		selenium.proceedToCheckoutBtn(driver, proceedBtn);
		selenium.refresh(driver);
		boolean flag= selenium.validateNumberOfProducts(driver, numberOfProducts, "3");
		return flag;
		}
}
