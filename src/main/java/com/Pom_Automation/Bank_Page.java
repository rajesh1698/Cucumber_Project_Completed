package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement select_Bank;
	
	public Bank_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getselect_Bank() {
		return select_Bank;
	}

}
