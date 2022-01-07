package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='quantity_wanted']")
	private WebElement quantity;

	public WebElement getquantity() {
		return quantity;
	}
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement dress_Size;

	public WebElement getdress_Size() {
		return dress_Size;
	}
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addCart;
	
	public Printed_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getaddCart() {
		return addCart;
	}

}
