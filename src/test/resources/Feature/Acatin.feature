Feature: Book a Ticket in Book my show end to end
Scenario: login functionality
Given User should have an account
When Enter the user name 
And  enter the password
Then redirect to home page
And user name display in home page

Scenario: Search and select a movie
Given Search box with theatre movie
When Enter the movie name in search box 
And select the movie 
Then redirect to the booking page 
And movie name is displayed in that page

Scenario: Book a ticket
Given ticket booking page
When select the nos of ticket
And payable amount displayed correctly
	Then redirect to payment page