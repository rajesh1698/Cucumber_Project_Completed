package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Added {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement product_Add;
	
	public Product_Added(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getproduct_Add() {
		return product_Add;
	}

}
