package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	@Given("I have a search field in Amazon page")
	public void seachField() {
		System.out.println("I have a search field in Amazon page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String string, Integer int1) {
		System.out.println(string +" is searched and prize is " + int1);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
		System.out.println(string+" is displayed ");

	}

}
