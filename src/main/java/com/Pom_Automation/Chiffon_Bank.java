package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chiffon_Bank {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement Bank_Option;
	
	public Chiffon_Bank(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getBank_Option() {
		return Bank_Option;
	}
}