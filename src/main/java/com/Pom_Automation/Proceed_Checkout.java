package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Checkout {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceed_Checkout;
	
	public Proceed_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getproceed_Checkout() {
		return proceed_Checkout;
	}

}
