package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(value = "@Smoke" , order=1)
//	@Before(order=1)
//	@Before("@Smoke")
	public void setup_browser(Scenario sc)
	{
		System.out.println(sc.getName());
		System.out.println("Launch the browser");
	}
	
	@Before(order=2)
	public void setup_url()
	{
		System.out.println("Launch the application");
	}


	@After(value = "@Smoke",order=1)
	public void tearDown_logout()
	{
		System.out.println("logout from application");
	}
	
	@After(order=2)
	public void tearDown_close()
	{
		System.out.println("Close the browser");
	}
	
	@BeforeStep()
	public void takeScreenshot()
	{
		System.out.println("take screenshot");
		
	}
	
	@AfterStep()
	public void refresh()
	{
		System.out.println("Refresh the page");
	}
}
