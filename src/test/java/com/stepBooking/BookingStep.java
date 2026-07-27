package com.stepBooking;

import org.openqa.selenium.WebElement;

import HotelBooking.BaseClassss;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingStep extends BaseClassss {


	@Given("User launches the browser")
	public void user_launches_the_browser() {
		browserLaunch();
		maximizeWindow();
	    implicitWait();

	}
	
	@Given("User navigates to {string}")
		public void user_navigates_to(String url) {
		    enterApplicationUrl(url);		
	}
	
	@Given("User logs in with username {string} and password {string}")
	public void user_logs_in_with_username_and_password(String string, String string2) {
		// Login Credentials
				WebElement username = findLocatorById("email");
				sendKeysElement(username, "kishorekk2511@gmail.com");

				WebElement password = findLocatorById("pass");
				sendKeysElement(password, "Kishore@123");

				WebElement loginbtn = findLocatorByXpath("//button[@type='submit']");
				clickElement(loginbtn);
	}
	
	@Then("User should see the welcome message")
	public void user_should_see_the_welcome_message() {
	}

	@Then("User should see the {string} page")
	public void user_should_see_the_page(String string) {
	}
	
	@When("User selects state as {string}")
	public void user_selects_state_as(String string) {
		
	}
	
	@When("User selects city as {string}")
	public void user_selects_city_as(String string) {
	}
	
	@When("User selects room type as {string}")
	public void user_selects_room_type_as(String string) {
	}
	
	@When("User selects check-in date as {string}")
	public void user_selects_check_in_date_as(String string) {
	}
	
	@When("User selects check-out date as {string}")
	public void user_selects_check_out_date_as(String string) {
	}
	
	@When("User selects number of rooms as {string}")
	public void user_selects_number_of_rooms_as(String string) {
	}
	
	@When("User selects number of adults as {string}")
	public void user_selects_number_of_adults_as(String string) {
	}
	
	@When("User enters number of children as {string}")
	public void user_enters_number_of_children_as(String string) {
	}
	
	@When("User switches to the search frame")
	public void user_switches_to_the_search_frame() {
	}
	
	@When("User clicks the Search button")
	public void user_clicks_the_search_button() {
	}
	
	@Then("User should be navigated to the Select Hotel page")
	public void user_should_be_navigated_to_the_select_hotel_page() {
	}
	
	@Then("User prints all available hotel names")
	public void user_prints_all_available_hotel_names() {
	}
	
	@Then("User prints all hotel prices")
	public void user_prints_all_hotel_prices() {
	}
	
	@When("User selects the hotel {string}")
	public void user_selects_the_hotel(String string) {
	}
	
	@When("User accepts the alert")
	public void user_accepts_the_alert() {
	}
	
	@Then("User should see the selected hotel details")
	public void user_should_see_the_selected_hotel_details() {
	}
	
	@When("User selects booking for {string}")
	public void user_selects_booking_for(String string) {
	}
	
	@When("User selects title as {string}")
	public void user_selects_title_as(String string) {
	}
	
	@When("User enters first name as {string}")
	public void user_enters_first_name_as(String string) {
	}
	
	@When("User enters last name as {string}")
	public void user_enters_last_name_as(String string) {
	}
	
	@When("User enters mobile number as {string}")
	public void user_enters_mobile_number_as(String string) {
	}
	
	@When("User enters email as {string}")
	public void user_enters_email_as(String string) {
	}
	
	@When("User enables GST")
	public void user_enables_gst() {
	}
	
	@When("User enters GST number as {string}")
	public void user_enters_gst_number_as(String string) {
	}
	
	@When("User enters company name as {string}")
	public void user_enters_company_name_as(String string) {
	}
	
	@When("User enters company address as {string}")
	public void user_enters_company_address_as(String string) {
	}
	
	@When("User clicks Next")
	public void user_clicks_next() {
	}
	
	@When("User selects bed preference")
	public void user_selects_bed_preference() {
	}
	
	@When("User enters special request as {string}")
	public void user_enters_special_request_as(String string) {
	}
	
	@When("User selects payment method as {string}")
	public void user_selects_payment_method_as(String string) {
	}
	
	@When("User selects card type as {string}")
	public void user_selects_card_type_as(String string) {
	}
	
	@When("User enters card number as {string}")
	public void user_enters_card_number_as(String string) {
	}
	
	@When("User enters card holder name as {string}")
	public void user_enters_card_holder_name_as(String string) {
	}
	
	@When("User selects expiry month as {string}")
	public void user_selects_expiry_month_as(String string) {
	}
	
	@When("User selects expiry year as {string}")
	public void user_selects_expiry_year_as(String string) {
	}
	
	@When("User enters CVV as {string}")
	public void user_enters_cvv_as(String string) {
	}
	
	@When("User clicks Submit")
	public void user_clicks_submit() {
	}
	
	@Then("User should see the booking confirmation message")
	public void user_should_see_the_booking_confirmation_message() {
	}
	
	@Then("User should see the booking ID")
	public void user_should_see_the_booking_id() {
	}
	
	@Then("User should see the booked hotel name as {string}")
	public void user_should_see_the_booked_hotel_name_as(String string) {
	}



	
}
