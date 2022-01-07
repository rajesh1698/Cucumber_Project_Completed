package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sleeve_Checkout {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Sleeve_Checkout;
	
	public Sleeve_Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSleeve_Checkout() {
		return Sleeve_Checkout;
	}

}
