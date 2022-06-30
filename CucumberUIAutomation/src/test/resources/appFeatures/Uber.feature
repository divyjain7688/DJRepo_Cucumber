@All
Feature: Uber booking Feature

@Regression
Scenario: Booking cab Sedan
Given User wants to select a car type "sedan" from Uber app
When User selects a car "sedan" and pickup point as "bangalore"  and drop location "pune"
Then driver starts the journey
And driver ends the journey
Then User pays 1000 USD

@Smoke
Scenario: Booking cab SUV
Given User wants to select a car type "SUV" from Uber app
When User selects a car "sedan" and pickup point as "bangalore"  and drop location "indore"
Then driver starts the journey
And driver ends the journey
Then User pays 1300 USD

@Regression @Smoke
Scenario: Booking cab Hachtback
Given User wants to select a car type "Hachtback" from Uber app
When User selects a car "sedan" and pickup point as "pune"  and drop location "indore"
Then driver starts the journey
And driver ends the journey
Then User pays 1200 USD
