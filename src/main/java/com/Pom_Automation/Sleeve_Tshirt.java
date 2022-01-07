package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sleeve_Tshirt {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement Sleeve_Tshirt;
	
	public Sleeve_Tshirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSleeve_Tshirt() {
		return Sleeve_Tshirt;
	}

}
