package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chiffon_Dress {
	public WebDriver driver;
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a")
	private WebElement Chiffon_Dress;
	
	public Chiffon_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getChiffon_Dress() {
		return Chiffon_Dress;
	}
	
	
	
	
	
	
	
	

}
