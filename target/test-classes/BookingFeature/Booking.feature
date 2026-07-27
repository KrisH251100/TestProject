Feature: Hotel Booking

  As a registered user
  I want to book a hotel in OMR Branch
  So that I can receive a booking confirmation

  Background:
    Given User launches the browser
    And User navigates to "https://www.omrbranch.com/"
    And User logs in with username "kishorekk2511@gmail.com" and password "Kishore@123"

  @HotelBooking
  Scenario: Verify user can successfully book a hotel

    Then User should see the welcome message
    And User should see the "Explore Hotels" page

    When User selects state as "Tamil Nadu"
    And User selects city as "Chennai"
    And User selects room type as "Studio"
    And User selects check-in date as "30"
    And User selects check-out date as "31"
    And User selects number of rooms as "5-Five"
    And User selects number of adults as "2-Two"
    And User enters number of children as "5"
    And User switches to the search frame
    And User clicks the Search button

    Then User should be navigated to the Select Hotel page
    And User prints all available hotel names
    And User prints all hotel prices

    When User selects the hotel "Hyatt Regency Chennai Standard"
    And User accepts the alert

    Then User should see the selected hotel details

    When User selects booking for "Myself"
    And User selects title as "Mr."
    And User enters first name as "Krishna"
    And User enters last name as "Kishore"
    And User enters mobile number as "7358551086"
    And User enters email as "kishore@gmail.com"
    And User enables GST
    And User enters GST number as "9043592058"
    And User enters company name as "Greens Tech OMR Branch"
    And User enters company address as "Thoraipakkam"
    And User clicks Next

    And User selects bed preference
    And User enters special request as "Clean the rooms before checkin"
    And User clicks Next

    And User selects payment method as "Debit Card"
    And User selects card type as "Visa"
    And User enters card number as "5555555555552222"
    And User enters card holder name as "Kishore"
    And User selects expiry month as "November"
    And User selects expiry year as "2030"
    And User enters CVV as "259"
    And User clicks Submit

    Then User should see the booking confirmation message
    And User should see the booking ID
    And User should see the booked hotel name as "Hyatt Regency Chennai"