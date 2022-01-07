package com.Helper2;

public class File_Reader_Manager1 {
	
	private File_Reader_Manager1() {
		
	}
	
	public static File_Reader_Manager1 getInstanceFRM() {
		File_Reader_Manager1 frm = new File_Reader_Manager1();
		return frm;
	}
	
	public Configuration_Reader1 getInstanceCR() throws Throwable {
	Configuration_Reader1 reader = new Configuration_Reader1();
	return reader;
	}

}
