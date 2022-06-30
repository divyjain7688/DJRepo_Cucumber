package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from Uber app")
	public void user_wants_to_select_a_car_type_from_Uber_app(String carType) {
		System.out.println("step 1 "+ carType);
	}

	@When("User selects a car {string} and pickup point as {string}  and drop location {string}")
	public void user_selects_a_car_and_pickup_point_as_and_drop_location(String carType, String pickup, String drop) {
		System.out.println("step 2: "+ carType +" "+ pickup+" "+drop);

	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3");

	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step 4");

	}

	@Then("User pays {int} USD")
	public void user_pays_USD(Integer price) {
		System.out.println("step 5: "+ price);

	}

}
