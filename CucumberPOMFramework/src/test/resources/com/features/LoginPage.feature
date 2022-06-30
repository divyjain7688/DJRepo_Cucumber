Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

@Smoke
Scenario: Forgot password link
Given user is on login page
Then forgot your poassword link should be displayed

@Smoke, @skip
Scenario: Login with correct credentials
Given user is on login page
When user enters username "divy.0871@gmail.com"
And user enters password "Selenium@12345"
And user clicks on login button
Then user gets the title of the page
And page title should be "My account - My Store"