package com.Pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement women_Button;
	
	public Women_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomen_Button() {
		return women_Button;
	}
	
	
	
	
	
	
	
	

}
