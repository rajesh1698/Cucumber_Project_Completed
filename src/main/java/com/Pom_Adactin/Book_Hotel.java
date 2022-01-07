package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement First_Name;
	
	public WebElement getFirst_Name() {
		return First_Name;
	}
	@FindBy(id = "last_name")
	private WebElement Last_Name;
	
	public WebElement getLast_Name() {
		return Last_Name;
	}
	@FindBy(id = "address")
	private WebElement Address;
	
	public WebElement getAddress() {
		return Address;
	}
	@FindBy(id = "cc_num")
	private WebElement Card_No;
	
	public WebElement getCard_No() {
		return Card_No;
	}
	@FindBy(id = "cc_type")
	private WebElement Card_Type;
	
	public WebElement getCard_Type() {
		return Card_Type;
	}
	@FindBy(id = "cc_exp_month")
	private WebElement Expire_Month;
	
	public WebElement getExpire_Month() {
		return Expire_Month;
	}
	@FindBy(id = "cc_exp_year")
	private WebElement Expire_Year;
	
	public WebElement getExpire_Year() {
		return Expire_Year;
	}
	@FindBy(id = "cc_cvv")
	private WebElement Card_Cvv;
	
	public WebElement getCard_Cvv() {
		return Card_Cvv;
	}
	@FindBy(id = "book_now")
	private WebElement Book_Now;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBook_Now() {
		return Book_Now;
	}
}
