package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@class='product-name'])[4]")
	private WebElement Printed_Dress;
	
	public Casual_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPrinted_Dress() {
		return Printed_Dress;
	}

}
