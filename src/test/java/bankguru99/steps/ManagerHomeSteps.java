package bankguru99.steps;

import bankguru99.DriverFactory;
import bankguru99.pages.ManagerHomPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class ManagerHomeSteps extends DriverFactory{

    private final ManagerHomPage managerHomePage = new ManagerHomPage(driver);

    @When("^Manager opens new customer form$")
    public void user_Is_On_BankGuru99_Page() {
        managerHomePage.SelectItemFromMenu("New Customer");
    }

    @Then("Message {string} is displayed")
    public void messageIsDisplayed(String message) {
        assertThat(String.format("Manager id should be %s", message),
                message.equalsIgnoreCase(managerHomePage.getNewCustomerRegistrationText()));
    }
}
