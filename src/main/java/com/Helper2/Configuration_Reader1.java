package com.Helper2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader1 {
	
public static Properties p;
	
	public  Configuration_Reader1() throws Throwable {
		File f = new File("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\src\\main\\java\\Configuration.Properties1");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	 
	public String getUrl() {
		String url = p.getProperty("URL");
		return url;
	}
	public String getemailId() {
		String emailId = p.getProperty("EmailId");
		return emailId;
	}
	public String getpassWord() {
		String password = p.getProperty("password");
		return password;
	}
	public String getQuantity() {
		String quantity = p.getProperty("quantity");
		return quantity;
	}
	public String getSize() {
		String size = p.getProperty("size");
		return size;
	}
	public String getQuantity1() {
		String quantity1 = p.getProperty("quantity1");
		return quantity1;
	}
	public String getSize1() {
		String size1 = p.getProperty("size1");
		return size1;
	}
	public String getQuantity2() {
		String quantity2 = p.getProperty("quantity2");
		return quantity2;
	}
	public String getSize2() {
		String size2 = p.getProperty("size2");
		return size2;
	}
	
}
