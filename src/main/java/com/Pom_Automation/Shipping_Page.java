package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement agree_Button;

	public WebElement getagree_Button() {
		return agree_Button;
	}
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed_Shipping;
	
	public Shipping_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getproceed_Shipping() {
		return proceed_Shipping;
	}
}
