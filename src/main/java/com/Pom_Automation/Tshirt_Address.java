package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Address {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement Tshirt_Address;
	
	public Tshirt_Address(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddress_Checkout() {
		return Tshirt_Address;
	}

}
