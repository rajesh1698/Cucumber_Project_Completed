package com.Automation_StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_BaseClass.Base_Class;
import com.Cucumber_Project.Automation_RunnerClass;
import com.SDPs.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation_SD extends Base_Class{
public static WebDriver driver = Automation_RunnerClass.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("user Launch The Application")
	public void user_launch_the_application() {
	    url("http://automationpractice.com/index.php");
	}
	@When("user Click Signin Button And Its Navigates To LogIn Page")
	public void user_click_signin_button_and_its_navigates_to_log_in_page() {
	    clickOnElement(pom.getInstancehp().getsignIn_Button());
	}
	@When("user Enter The EmailId In The Text Box")
	public void user_enter_the_email_id_in_the_text_box() {
	    inputValueElement(pom.getInstancesB().getemailId(), "rajuautomail16@gmail.com");
	}
	@When("user Enter The Password In The Text Box")
	public void user_enter_the_password_in_the_text_box() {
	   inputValueElement(pom.getInstancesB().getpassWord(), "Rajesh@5421");
	}
	@Then("user Click SignIn Button And Its Navigates To My Account Page")
	public void user_click_sign_in_button_and_its_navigates_to_my_account_page() {
	    clickOnElement(pom.getInstancesB().getsignIn());
	}
	@When("user Click Women Button And Its Navigates To Women Page")
	public void user_click_women_button_and_its_navigates_to_women_page() {
	    clickOnElement(pom.getInstancewD().getwomen_Button());
	}
	@When("user Click Printed Dress And Navigates To Printed Dress Page")
	public void user_click_printed_dress_and_navigates_to_printed_dress_page() {
		clickOnElement(pom.getInstancecd().getPrinted_Dress());
	}
	@When("user Enter Quantity And Size In Text Box")
	public void user_enter_quantity_and_size_in_text_box() throws Throwable {
		clear(pom.getInstancepd().getquantity());
	    inputValueElement(pom.getInstancepd().getquantity(), "10");
	    sleep(1000);
	    dropDown("index",pom.getInstancepd().getdress_Size(), "1");
	}
	@When("user Click Add To Cart Button And Navigates To Shopping Cart Frame")
	public void user_click_add_to_cart_button_and_navigates_to_shopping_cart_frame() throws Throwable {
	   clickOnElement(pom.getInstancepd().getaddCart());
	   sleep(3000);
	}
	@When("user Click Proceed To Checkout Button And Navigates To Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_order_page() {
	    clickOnElement(pom.getInstancepa().getproduct_Add());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Address Verify Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_address_verify_order_page() {
	    clickOnElement(pom.getInstanceco().getcheck_Out());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Shipping Verify Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_shipping_verify_order_page() {
	    clickOnElement(pom.getInstancepc().getproceed_Checkout());
	}
	@When("user Click Terms Agree Button")
	public void user_click_terms_agree_button() {
	    clickOnElement(pom.getInstancesp().getagree_Button());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Payment Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_payment_order_page() {
	    clickOnElement(pom.getInstancesp().getproceed_Shipping());
	}
	@When("user Click Pay By Bank Button And Navigate To Payment Verify Page")
	public void user_click_pay_by_bank_button_and_navigate_to_payment_verify_page() {
	    clickOnElement(pom.getInstancebp().getselect_Bank());
	}
	@When("user Click Confirm My Order Button And Navigate to Order Confirmation Page")
	public void user_click_confirm_my_order_button_and_navigate_to_order_confirmation_page() {
	    clickOnElement(pom.getInstancecO().getconfirm_Order());
	}
	@Then("user Click SignOut Button And Navigate To Login Page")
	public void user_click_sign_out_button_and_navigate_to_login_page() {
	    clickOnElement(pom.getInstancelP().getLogout_Button());
	}
	@When("user Enter The EmailId In The EmailId Field")
	public void user_enter_the_email_id_in_the_email_id_field() {
	   inputValueElement(pom.getInstancesB().getemailId(), "rajuautomail16@gmail.com");
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
	    inputValueElement(pom.getInstancesB().getpassWord(), "Rajesh@5421");
	}
	@Then("user Click SignIn Button And Its Navigate To My Account Page")
	public void user_click_sign_in_button_and_its_navigate_to_my_account_page() {
	    clickOnElement(pom.getInstancesB().getsignIn());
	}
	@When("user Click Dresses Button And Its Navigates To Dresses Page")
	public void user_click_dresses_button_and_its_navigates_to_dresses_page() throws Throwable {
	    clickOnElement(pom.getInstancedP().getDresses_Button());
	}
	@When("user Click Chiffon Dress And Navigates To Chiffon Dress Page")
	public void user_click_chiffon_dress_and_navigates_to_chiffon_dress_page() throws Throwable {
		sleep(2000);
	    clickOnElement(pom.getInstancecD().getChiffon_Dress());
	}
	@When("user Enter Quantity And Size In Text Box For Dresses")
	public void user_enter_quantity_and_size_in_text_box_for_dresses() throws Throwable {
		clear(pom.getInstancecA().getChiffon_Quantity());
	    inputValueElement(pom.getInstancecA().getChiffon_Quantity(), "5");
	    sleep(1000);
	    dropDown("index",pom.getInstancecA().getChiffon_Size(), "1");
	}
	@When("user Click Add To Cart Button And Navigates To Shopping Cart Dresses Frame")
	public void user_click_add_to_cart_button_and_navigates_to_shopping_cart_dresses_frame() throws Throwable {
	    clickOnElement(pom.getInstancecA().getChiffon_AddtoCart());
	    explictwait(3000, "visibleofelement", pom.getInstancepC().getCheckout1());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Dresses Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_dresses_order_page() {
	    clickOnElement(pom.getInstancepC().getCheckout1());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Address Verify Dresses Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_address_verify_dresses_page() {
	    clickOnElement(pom.getInstancecc().getCheckout2());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Shipping Verify Dresses Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_shipping_verify_dresses_page() {
	    clickOnElement(pom.getInstanceaC().getCheckout3());
	}
	@When("user Click Terms Agree Button In Dresses Page")
	public void user_click_terms_agree_button_in_dresses_page() {
	    clickOnElement(pom.getInstancesC().getTerms_Agree());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Payment  Dresses Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_payment_dresses_order_page() {
	    clickOnElement(pom.getInstancesC().getCheckout4());
	}
	@When("user Click Pay By Bank Button And Navigate To Payment Verify Dresses Page")
	public void user_click_pay_by_bank_button_and_navigate_to_payment_verify_dresses_page() {
	    clickOnElement(pom.getInstancecB().getBank_Option());
	}
	@When("user Click Confirm My Order Button And Navigate To Order Confirmation Dresses Page")
	public void user_click_confirm_my_order_button_and_navigate_to_order_confirmation_dresses_page() {
	    clickOnElement(pom.getInstanceCo().getOrder_Confirm());
	}
	@Then("user Click SignOut Button From Dresses And Navigate To Login Page")
	public void user_click_sign_out_button_from_dresses_and_navigate_to_login_page() {
	    clickOnElement(pom.getInstancelP().getLogout_Button());
	}
	@When("user Enter The EmailId")
	public void user_enter_the_email_id() {
	    inputValueElement(pom.getInstancesB().getemailId(), "rajuautomail16@gmail.com");
	}
	@When("user Enter The Password")
	public void user_enter_the_password() {
	    inputValueElement(pom.getInstancesB().getpassWord(), "Rajesh@5421");
	}
	@Then("user Click SignIn Button And Navigates To My Account Page")
	public void user_click_sign_in_button_and_navigates_to_my_account_page() {
	    clickOnElement(pom.getInstancesB().getsignIn());
	}
	@When("user Click Tshirts Button And Its Navigates To Tshirts Page")
	public void user_click_tshirts_button_and_its_navigates_to_tshirts_page() {
	    clickOnElement(pom.getInstancetP().getTshirt());
	}
	@When("user Click Faded Short Sleeve Tshirts And Navigates To Faded Short Sleeve Tshirts Page")
	public void user_click_faded_short_sleeve_tshirts_and_navigates_to_faded_short_sleeve_tshirts_page() {
		clickOnElement(pom.getInstancest().getSleeve_Tshirt());
	}
	@When("user Enter Quantity And Size In Text Box For Tshirts")
	public void user_enter_quantity_and_size_in_text_box_for_tshirts() throws Throwable {
		clear(pom.getInstancetC().getTshirt_Quantity());
	    inputValueElement(pom.getInstancetC().getTshirt_Quantity(), "7");
	    sleep(1000);
	    dropDown("index", pom.getInstancetC().getTshirt_Size(), "1");
	}
	@When("user Click Add To Cart Button And Navigates To Shopping Cart Tshirts Frame")
	public void user_click_add_to_cart_button_and_navigates_to_shopping_cart_tshirts_frame() throws Throwable {
	    clickOnElement(pom.getInstancetC().getTshirt_AddtoCart());
	    explictwait(3000, "visibleofelement", pom.getInstanceSc().getSleeve_Checkout());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Tshirts Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_tshirts_order_page() {
	    clickOnElement(pom.getInstanceSc().getSleeve_Checkout());
	}
	@When("user Click Proceed To Checkout Button And Navigate Address Verify Tshirts Order Page")
	public void user_click_proceed_to_checkout_button_and_navigate_address_verify_tshirts_order_page() {
	    clickOnElement(pom.getInstanceTc().getTshirt_Checkout());
	}
	@When("user Click Proceed To Checkout Button And Navigate Shipping Verify Tshirts Order Page")
	public void user_click_proceed_to_checkout_button_and_navigate_shipping_verify_tshirts_order_page() {
	    clickOnElement(pom.getInstanceTa().getAddress_Checkout());
	}
	@When("user Click Terms Agree Button In Tshirts Page")
	public void user_click_terms_agree_button_in_tshirts_page() {
	    clickOnElement(pom.getInstanceTs().getTerms_Agree());
	}
	@When("user Click Proceed To Checkout Button And Navigates To Payment Tshirts Order Page")
	public void user_click_proceed_to_checkout_button_and_navigates_to_payment_tshirts_order_page() {
	    clickOnElement(pom.getInstanceTs().getShipping_Checkout());
	}
	@When("user Click Pay By Bank Button And Navigate To Payment Verify Tshirts Page")
	public void user_click_pay_by_bank_button_and_navigate_to_payment_verify_tshirts_page() {
	    clickOnElement(pom.getInstanceTp().getTshirt_Payment());
	}
	@When("user Click Confirm My Order Button And Navigate to Order Confirmation Tshirts Page")
	public void user_click_confirm_my_order_button_and_navigate_to_order_confirmation_tshirts_page() {
	    clickOnElement(pom.getInstanceTo().getOrder_Confirm());
	}
	@Then("user Click SignOut Button From Tshirts And Navigate To Login Page")
	public void user_click_sign_out_button_from_tshirts_and_navigate_to_login_page() {
	    clickOnElement(pom.getInstancelP().getLogout_Button());
	}

}
