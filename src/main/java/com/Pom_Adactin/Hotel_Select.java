package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Select {
	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement Select_Hotel;
	
	public WebElement getSelect_Hotel() {
		return Select_Hotel;
	}
	@FindBy(id = "continue")
	private WebElement Continue_Button;
	
	public Hotel_Select(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContinue_Button() {
		return Continue_Button;
	}
}
