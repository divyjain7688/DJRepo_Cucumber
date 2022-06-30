Feature: Amazon order page
	In order to check my orders details
	As a registered user
	I want to specify the features of order detail page
	
	Background:
	Given a registered user exists
	Given a user is on amazon login page
	When user enters username
	When user enters password
	And user click on login button
	Then user navigates to order page
	
	Scenario: Check previous order details
		When user click on previous order link
		Then user check the privous rder details
	
	Scenario: Check open order details
		When user click on open order link
		Then user check the open rder details	
		
	