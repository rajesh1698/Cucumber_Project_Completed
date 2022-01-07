package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chiffon_AddtoCart {
	public WebDriver driver;
	@FindBy(id = "quantity_wanted")
	private WebElement Chiffon_Quantity;
	
	public WebElement getChiffon_Quantity() {
		return Chiffon_Quantity;
	}
	@FindBy(id = "group_1")
	private WebElement Chiffon_Size;
	
	public WebElement getChiffon_Size() {
		return Chiffon_Size;
	}
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement Chiffon_AddtoCart;
	
	public Chiffon_AddtoCart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getChiffon_AddtoCart() {
		return Chiffon_AddtoCart;
	}
}
