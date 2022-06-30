package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features = "src/test/resources/appFeatures",
		glue = {"stepDefinition"},
		plugin = {"pretty"},
	//	stepNotifications = true,
		//strict = true
		monochrome = true

	)
public class TestRunner {

}
