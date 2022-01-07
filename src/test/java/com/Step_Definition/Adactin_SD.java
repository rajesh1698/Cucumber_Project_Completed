package com.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_BaseClass.Base_Class;
import com.Cucumber_Project.Adactin_RunnerClass;
import com.SDPs.Page_Object_Manager2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_SD extends Base_Class{
	
	public static WebDriver driver = Adactin_RunnerClass.driver;
	
	public static Page_Object_Manager2 pom = new Page_Object_Manager2(driver);
	
	@Given("user Launch The Application")
	public void user_launch_the_application() {
	   url("http://adactinhotelapp.com/");
	}
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String Username) {
		inputValueElement(pom.getInstancelP().getuser_Name(),Username);
	}
	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String Password) {
		inputValueElement(pom.getInstancelP().getpassWord(),Password);
	}
	@Then("user Click On The Login Button And Its Navigates To Search Hotel Page")
	public void user_click_on_the_login_button_and_its_navigates_to_search_hotel_page() {
	    clickOnElement(pom.getInstancelP().getlogin_Button());
	}
	@When("user Select The Hotel Location")
	public void user_select_the_hotel_location() {
	   dropDown("index", pom.getInstancesH().getHotel_Location(), "5");
	}
	@When("user Select The Hotel")
	public void user_select_the_hotel() {
	    dropDown("index",pom.getInstancesH().getHotel_Name(), "2");
	}
	@When("user Select The Room Type")
	public void user_select_the_room_type() {
	    dropDown("text",pom.getInstancesH().getRoom_Type(), "Deluxe");
	}
	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {
	    dropDown("value",pom.getInstancesH().getRoom_No(), "3");
	}
	@When("user Select The Check In Date")
	public void user_select_the_check_in_date() {
	   clear(pom.getInstancesH().getCheckIn());
	   inputValueElement(pom.getInstancesH().getCheckIn(),"25/01/2022");
	}
	@When("user Select The Check Out Date")
	public void user_select_the_check_out_date() {
	   clear(pom.getInstancesH().getCheckOut());
	   inputValueElement(pom.getInstancesH().getCheckOut(), "27/01/2022");
	}
	@When("user Select Adults Per Room")
	public void user_select_adults_per_room() {
	    dropDown("value",pom.getInstancesH().getAdult_No(), "4");
	}
	@When("user Select Children Per Room")
	public void user_select_children_per_room() {
	    dropDown("value",pom.getInstancesH().getChild_No(), "2");
	}
	@Then("user Click The Search Button And Its Navigates To Select Hotel Page")
	public void user_click_the_search_button_and_its_navigates_to_select_hotel_page() {
	    clickOnElement(pom.getInstancesH().getSubmit_Button());
	}
	@When("user Click Radio Button To Select Hotel")
	public void user_click_radio_button_to_select_hotel() {
	    clickOnElement(pom.getInstancehS().getSelect_Hotel());
	}
	@Then("user Click Continue Button And Its Navigates To Book A Hotel Page")
	public void user_click_continue_button_and_its_navigates_to_book_a_hotel_page() {
	    clickOnElement(pom.getInstancehS().getContinue_Button());
	}
	@When("user Enter The First Name In Text Box")
	public void user_enter_the_first_name_in_text_box() {
	    inputValueElement(pom.getInstancebH().getFirst_Name(), "Rajesh");
	}
	@When("user Enter The Last Name In Text Box")
	public void user_enter_the_last_name_in_text_box() {
	    inputValueElement(pom.getInstancebH().getLast_Name(), "V");
	}
	@When("user Enter The Billing Address In Address Text Box")
	public void user_enter_the_billing_address_in_address_text_box() {
	    inputValueElement(pom.getInstancebH().getAddress(), "No:23 KK Street, london main road, London");
	}
	@When("user Enter The Credit Card Number In Text Box")
	public void user_enter_the_credit_card_number_in_text_box() {
	    inputValueElement(pom.getInstancebH().getCard_No(), "5445545353753754");
	}
	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() {
	    dropDown("text",pom.getInstancebH().getCard_Type(), "Master Card");
	}
	@When("user Select The Credit Card Expire Month And Year")
	public void user_select_the_credit_card_expire_month_and_year() {
	    dropDown("index", pom.getInstancebH().getExpire_Month(), "5");
	    dropDown("value",pom.getInstancebH().getExpire_Year(), "2022");
	}
	@When("user Enter The Card CVV Number In Text Box")
	public void user_enter_the_card_cvv_number_in_text_box() {
	   inputValueElement(pom.getInstancebH().getCard_Cvv(), "533");
	}
	@Then("user Click Book Now Button And Its Navigates To Hotel Booking Confirmation Page")
	public void user_click_book_now_button_and_its_navigates_to_hotel_booking_confirmation_page() {
	    clickOnElement(pom.getInstancebH().getBook_Now());
	}

}
