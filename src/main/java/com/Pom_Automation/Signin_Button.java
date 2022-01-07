package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Button {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId;
	
	public WebElement getemailId() {
		return emailId;
	}
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement passWord;
	
	public WebElement getpassWord() {
		return passWord;
	}
	@FindBy(id = "SubmitLogin")
	private WebElement signIn;
	
	public Signin_Button(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getsignIn() {
		return signIn;
	}
	
	
	
	
	
	
	
	
	
	
}
