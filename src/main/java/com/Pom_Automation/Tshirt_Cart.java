package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Cart {
	public WebDriver driver;
	@FindBy(id = "quantity_wanted")
	private WebElement Tshirt_Quantity;
	
	public WebElement getTshirt_Quantity() {
		return Tshirt_Quantity;
	}
	@FindBy(id = "group_1")
	private WebElement Tshirt_Size;
	
	public WebElement getTshirt_Size() {
		return Tshirt_Size;
	}
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement Tshirt_AddtoCart;
	
	public Tshirt_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTshirt_AddtoCart() {
		return Tshirt_AddtoCart;
	}

}
