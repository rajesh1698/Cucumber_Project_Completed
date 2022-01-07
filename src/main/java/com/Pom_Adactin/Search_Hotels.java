package com.Pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotels {
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement Hotel_Location;
	
	public WebElement getHotel_Location() {
		return Hotel_Location;
	}
	@FindBy(id = "hotels")
	private WebElement Hotel_Name;
	
	public WebElement getHotel_Name() {
		return Hotel_Name;
	}
	@FindBy(id = "room_type")
	private WebElement Room_Type;
	
	public WebElement getRoom_Type() {
		return Room_Type;
	}
	@FindBy(id = "room_nos")
	private WebElement Room_No;
	
	public WebElement getRoom_No() {
		return Room_No;
	}
	@FindBy(id = "datepick_in")
	private WebElement CheckIn;
	
	public WebElement getCheckIn() {
		return CheckIn;
	}
	@FindBy(id = "datepick_out")
	private WebElement CheckOut;
	
	public WebElement getCheckOut() {
		return CheckOut;
	}
	@FindBy(id = "adult_room")
	private WebElement Adult_No;
	
	public WebElement getAdult_No() {
		return Adult_No;
	}
	@FindBy(id = "child_room")
	private WebElement Child_No;
	
	public WebElement getChild_No() {
		return Child_No;
	}
	@FindBy(id = "Submit")
	private WebElement Submit_Button;
	
	public Search_Hotels(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubmit_Button() {
		return Submit_Button;
	}
	
}
