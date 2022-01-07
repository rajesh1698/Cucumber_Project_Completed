Feature: Hotel Booking In Adactin Application

@Ad1
Scenario Outline: Login Page

Given user Launch The Application

When user Enter The "<Username>" In Username Field

And user Enter The "<Password>" In Password Field

Then user Click On The Login Button And Its Navigates To Search Hotel Page

Examples:
       
       |Username|Password|
       |Rajesh1603|Rajesh@5421|

@Ad2
Scenario: Search Hotel

When user Select The Hotel Location

And user Select The Hotel

And user Select The Room Type

And user Select The Number Of Rooms

And user Select The Check In Date

And user Select The Check Out Date

And user Select Adults Per Room

And user Select Children Per Room

Then user Click The Search Button And Its Navigates To Select Hotel Page

@Ad3
Scenario: Select Hotel

When user Click Radio Button To Select Hotel

Then user Click Continue Button And Its Navigates To Book A Hotel Page

@Ad4
Scenario: Book A Hotel

When user Enter The First Name In Text Box

And user Enter The Last Name In Text Box

And user Enter The Billing Address In Address Text Box

And user Enter The Credit Card Number In Text Box

And user Select The Credit Card Type

And user Select The Credit Card Expire Month And Year

And user Enter The Card CVV Number In Text Box

Then user Click Book Now Button And Its Navigates To Hotel Booking Confirmation Page