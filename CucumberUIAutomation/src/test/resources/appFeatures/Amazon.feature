Feature: Validating Amazon feature
	@Smoke
	Scenario: Search a product mac
		Given I have a search field in Amazon page
		When I search for a product with name "Apple macbook pro" and price 1000
		Then Product with name "Apple macbook pro" should be displayed
	
	@Regression
	Scenario: Search a product iphone
		Given I have a search field in Amazon page
		When I search for a product with name "iphone 12" and price 2000
		Then Product with name "iphone 12" should be displayed