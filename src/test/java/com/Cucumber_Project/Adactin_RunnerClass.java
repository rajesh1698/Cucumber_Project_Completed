package com.Cucumber_Project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_BaseClass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Project_Features\\Adactin.feature",
   glue = "com.Step_Definition",
   monochrome = true,
   dryRun = false,
   publish = true,
   plugin = {
		   "html:HTML_Report/Adactin_html.html",
		   "pretty",
		   "json:JSON_Report/Adactin.json",
		   "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/ExtentReport.html"})
public class Adactin_RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Base_Class.getBrowser("Chrome");
	}

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
