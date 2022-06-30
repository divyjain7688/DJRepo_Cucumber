Feature: USer registration

Scenario: User registration with different data
Given User is on registration page
When user enters following data
	|divy | jain | divy@gmail.com | 243434 | Indore |
	|divyjain | chajjed | divyjain@gmail.com | 3424235 | Pune |
Then user registration should be successfully

Scenario: User registration with different data with column
Given User is on registration page
When user enters following data with column
	| firstName | lastName | email | ph number | city |
	| tom | peter | tom@gmail.com | 98798 | Banaglore |
	| harry | jacobs | harry@gmail.com | 234 | Mumbai |
Then user registration should be successfully