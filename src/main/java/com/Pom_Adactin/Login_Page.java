package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement user_Name;
	
	public WebElement getuser_Name() {
		return user_Name;
	}
	@FindBy(id = "password")
	private WebElement passWord;
	
	public WebElement getpassWord() {
		return passWord;
	}
	@FindBy(id = "login")
	private WebElement login_Button;
	
	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getlogin_Button() {
		return login_Button;
	}
}
