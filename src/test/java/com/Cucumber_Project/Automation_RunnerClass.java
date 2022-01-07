package com.Cucumber_Project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_BaseClass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Project_Features\\Automation.feature",
   glue = {"com.Step_Definition.Automation"},
   monochrome = true,
   dryRun = false,
   publish = true,
   plugin = {
		   "html:HTML_Report/Automation_html.html",
		   "pretty",
		   "json:JSON_Report/Automation.json",
		   "com.cucumber.listener.ExtentCucumberFormatter:Extent_Report/ExtentReport1.html"})
  
public class Automation_RunnerClass {
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
