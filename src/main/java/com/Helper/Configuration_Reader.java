package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public  Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\src\\main\\java\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	 
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getLocation() {
		String location = p.getProperty("location");
		return location;
	}
	public String getHotelname() {
		String hotelname = p.getProperty("hotelname");
		return hotelname;
	}
	public String getRoomtype() {
	    String roomtype = p.getProperty("roomtype");
	    return roomtype;
	}
	public String getRoomno() {
		String roomno = p.getProperty("roomno");
		return roomno;
	}
	public String getCheckin() {
		String checkin = p.getProperty("checkin");
		return checkin;
	}
	public String getCheckout() {
		String checkout = p.getProperty("checkout");
		return checkout;
	}
	public String getAdultno() {
		String adultno = p.getProperty("adultno");
		return adultno;
	}
	public String getChildno() {
		String childno = p.getProperty("childno");
		return childno;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCardno() {
		String cardno = p.getProperty("cardno");
		return cardno;
	}
	public String getCardtype() {
		String cardtype = p.getProperty("cardtype");
		return cardtype;
	}
	public String getExpiremonth() {
		String expiremonth = p.getProperty("expiremonth");
		return expiremonth;
	}
	public String getExpireyear() {
		String expireyear = p.getProperty("expireyear");
		return expireyear;
	}
	public String getCardcvv() {
		String cardcvv = p.getProperty("cardcvv");
		return cardcvv;
	}

}
