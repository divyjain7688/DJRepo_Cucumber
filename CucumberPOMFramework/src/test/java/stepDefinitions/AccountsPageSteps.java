package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AccountsPageSteps {

	LoginPage loginPage = new LoginPage(DriverFactory.getWebDriver());
	AccountsPage accountPage;
	
	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		
		List<Map<String,String>> credList =  dataTable.asMaps(String.class, String.class);
		String uname = credList.get(0).get("username");
		String pwd = credList.get(0).get("password");
		
		DriverFactory.getWebDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountPage = loginPage.login(uname, pwd);
	}

	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
		String title = accountPage.getAccountsPagetitle();
		System.out.println("title of account oage is "+ title);
		
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable expectedSection) {
		List<String> expectedSectionList = expectedSection.asList();
		System.out.println("Expected accounts section list is "+ expectedSectionList);
		List<String> actualSectionList  = accountPage.getAccountSectionList();
		System.out.println("Actual accounts section list is "+ actualSectionList);
		Assert.assertEquals(expectedSectionList, actualSectionList);
	}

	@Then("acounts section count should be {int}")
	public void acounts_section_count_should_be(Integer expectedSectionCount) {

		Assert.assertTrue(accountPage.getAccountSectionsCount() == expectedSectionCount);
	}

}
