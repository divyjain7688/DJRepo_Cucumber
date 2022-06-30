package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculateSteps {

	Double tax;
	Double total;
	int billing;

	@Given("Billing amount is {int}")
	public void billing_amount_is(Integer int1) {
		System.out.println("Billing amount is " + int1);
		this.billing = int1;
	}

	/*@When("Tax amount is {int}")
	public void tax_amount_is(Integer int1) {
		System.out.println("Tax amount is " + int1);
	}

	@Then("Final amount is {int}")
	public void final_amount_is(Integer int1) {
		System.out.println("Final amount is " + int1);
	}*/

	@When("Tax amount is {double}")
	public void tax_amount_is(Double double1) {
		System.out.println("Tax amount is " + double1);
		this.tax = double1;
	}

	@Then("Final amount is {double}")
	public void final_amount_is(Double double1) {
		System.out.println("Final amount is " + double1);
		this.total = this.tax + billing;
		System.out.println("total is " + this.total + " and expected total is " + double1);
	}

}
