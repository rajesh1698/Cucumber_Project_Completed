package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Payment {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement Tshirt_Payment;
	
	public Tshirt_Payment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTshirt_Payment() {
		return Tshirt_Payment;
	}

}
