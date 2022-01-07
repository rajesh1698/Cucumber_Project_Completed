package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chiffon_Order {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement Order_Confirm;
	
	public Chiffon_Order(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrder_Confirm() {
		return Order_Confirm;
	}

}
