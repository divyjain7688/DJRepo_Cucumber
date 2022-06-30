Feature: Account page feature

Background:
Given User has already logged in to application
| username | password |
| divy.0871@gmail.com | Selenium@12345 |

Scenario: Accounts page title
Given user is on accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

Scenario: Accounts section count
Given user is on accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And acounts section count should be 5