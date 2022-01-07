package com.SDPs;

import org.openqa.selenium.WebDriver;

import com.Pom_Adactin.Book_Hotel;
import com.Pom_Adactin.Hotel_Select;
import com.Pom_Adactin.Login_Page;
import com.Pom_Adactin.Search_Hotels;


public class Page_Object_Manager2 {
	public WebDriver driver;
	private Login_Page lP;
	private Search_Hotels sH;
	private Hotel_Select hS;
	private Book_Hotel bH;
		
	public Page_Object_Manager2(WebDriver driver2) {
			this.driver = driver2;
			}
	public Login_Page getInstancelP() {
		if (lP==null) {
			lP=new Login_Page(driver);
		}
		return lP;
	}
	public Search_Hotels getInstancesH() {
		if (sH==null) {
			sH=new Search_Hotels(driver);
		}
		return sH;
	}
	public Hotel_Select getInstancehS() {
		if (hS==null) {
			hS=new Hotel_Select(driver);
		}
		return hS;
	}
	public Book_Hotel getInstancebH() {
		if (bH==null) {
			bH=new Book_Hotel(driver);
		}
		return bH;
	}
	
}
