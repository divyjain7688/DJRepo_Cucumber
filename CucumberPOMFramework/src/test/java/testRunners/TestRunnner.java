package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features = "src/test/resources/com/features/",
		glue = {"stepDefinitions","appHooks"},
	//	tags= "@Smoke and not @skip" ,			//commented here and used before hook to skip a scenario
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	//extent report cucumber 6 adapter
				"timeline:test-output-thread/",		//this is for checking thread usage in parallel
				"rerun:target/FailedRerun.txt"	// to generate txt for failed test cases
		},
		stepNotifications = true,
		//strict = true
		publish=true,
		monochrome = true

	)
public class TestRunnner {

}
