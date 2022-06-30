package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features = "src/test/resources/com/features/AccountPage.feature",
		glue = {"stepDefinitions","appHooks"},
		plugin = {"pretty"		
		},
		stepNotifications = true,
		//strict = true
		monochrome = true

	)
public class AccountTestRunnner {

}
