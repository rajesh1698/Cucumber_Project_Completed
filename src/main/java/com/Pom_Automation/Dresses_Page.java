package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dresses_Page;
	
	public Dresses_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDresses_Button() {
		return Dresses_Page;
	}
	
	

}
