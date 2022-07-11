package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features = "src/test/resources/appFeatures/Uber.feature",
		glue = {"stepDefinition","myHooks"},
		tags= "@Smoke and not @Regression" ,
	//  tags= "not @Smoke" ,
	//	tags= "@All" ,
		plugin = {"pretty",   // to see proper aligned output in console
				"json:target/MyReports/report.json",	//to generate json report
				"junit:target/MyReports/report.xml"		//this is basically junit report only
				},
	//	publish = true,  maintained cucumber properties so this flag is not required
		stepNotifications = true,
	//	strict = true ,//depricated
		dryRun = false, //its like compile and will give you which step does not have stepDefiniation
		monochrome = true	// all special char like  [90m#  in output is ignored and formatted properly 

	)
public class UberTest {

}
