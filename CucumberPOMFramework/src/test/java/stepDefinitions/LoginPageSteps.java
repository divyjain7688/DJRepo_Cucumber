package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getWebDriver());
	private static String title;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getWebDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_login_page() {

		title = loginPage.getLoginPageTitle();

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		
		System.out.println("Login page title is "+ title);
		Assert.assertTrue(title.contains(expectedTitle));

	}

	@Then("forgot your poassword link should be displayed")
	public void forgot_your_poassword_link_should_be_displayed() {
		
		Assert.assertTrue(loginPage.isForgotPasswordLinkPresent());

	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		loginPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

}
