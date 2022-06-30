package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigates to registration page");
	}

	@When("user enters following data")
	public void user_enters_following_data(DataTable dataTable) {
		List<List<String>> userList =dataTable.asLists(String.class);
		System.out.println("printing the lists--------");
		for(List<String> l : userList)
		{
			System.out.println(l);
		}

	}

	
	@When("user enters following data with column")
	public void user_enters_following_data_with_column(DataTable dataTable) {
		List<Map<String,String>> m =  dataTable.asMaps(String.class, String.class);
		System.out.println("list of map is-------- "+ m);

		for(Map<String,String> map : m)
		{
			for(Map.Entry<String, String> mapEntry: map.entrySet())
			{
				System.out.println("key is "+mapEntry.getKey()+" and value is "+ mapEntry.getValue());
			}
		}
	}


	
	
	@Then("user registration should be successfully")
	public void user_registration_should_be_successfully() {
		System.out.println("User registration is successful");
	}

}
