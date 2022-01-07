package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Checkout1 {
	public WebDriver driver;
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement Checkout1;
	
	public Proceed_Checkout1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckout1() {
		return Checkout1;
	}
}