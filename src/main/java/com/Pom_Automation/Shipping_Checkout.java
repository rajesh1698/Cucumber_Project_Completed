package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Checkout {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement Terms_Agree;
	
	public WebElement getTerms_Agree() {
		return Terms_Agree;
	}
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement Checkout4;
	
	public Shipping_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckout4() {
		return Checkout4;
	}

}
