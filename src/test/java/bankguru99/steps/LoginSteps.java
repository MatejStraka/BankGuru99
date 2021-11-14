package bankguru99.steps;

import bankguru99.pages.LoginPage;
import bankguru99.DriverFactory;
import bankguru99.pages.ManagerHomPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps extends DriverFactory{

    private final LoginPage managerLoginPage = new LoginPage(driver);
    private final ManagerHomPage managerHomePage = new ManagerHomPage(driver);

    @Given("^Manager is on the Guru login page$")
    public void user_Is_On_BankGuru99_Page() {
        managerLoginPage.openBankGuru99Page();
    }

    @When("^Manager enter id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void manager_Enter_ID_and_Password(String id, String password) {
        managerLoginPage.Login(id, password);
    }

    @Then("^Manager can see dashboard with his id \"([^\"]*)\"$")
    public void manager_Can_See_Dashboard_With_His_Id(String id) {
        assertThat(String.format("Manager id should be %s", id),
                managerHomePage.getManagerID().contains(id));
    }

    @Given("^Manager is logged in on the Guru99 bank$")
    public void manager_Is_On_BankGuru99_Page() {
        managerLoginPage.openBankGuru99Page();
        managerLoginPage.Login("mngr360280", "esEvuta");
    }
}
