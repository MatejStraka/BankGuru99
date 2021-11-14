package bankguru99.steps;

import bankguru99.DriverFactory;
import bankguru99.pages.ManagerHomPage;
import bankguru99.pages.NewCustomer;
import io.cucumber.java.en.And;
import java.util.UUID;

public class NewCustomerSteps extends DriverFactory {

    private final NewCustomer customer = new NewCustomer(driver);

    @And("Enter customer name {string}")
    public void enterCustomerName(String name) {
        customer.typeCustomerName(name);
    }

    @And("Enter customer gender {string}")
    public void enterCustomerGender(String gender) {
        customer.selectGender(gender);
    }

    @And("Enter customer address {string}")
    public void enterCustomerAddress(String address) {
        customer.typeAddress(address);
    }

    @And("Enter customer city {string}")
    public void enterCustomerCity(String city) {
        customer.typeCity(city);
    }

    @And("Enter customer state {string}")
    public void enterCustomerState(String state) {
        customer.typeState(state);
    }

    @And("Enter customer pin {string}")
    public void enterCustomerPin(String pin) {
        customer.typePIN(pin);
    }

    @And("Enter customer mobile number {string}")
    public void enterCustomerMobileNumber(String phone) {
        customer.typeMobileNumber(phone);
    }

    @And("Enter customer email")
    public void enterCustomerEmail() {
        String uuid = UUID.randomUUID().toString();
        customer.typeEmail("test"+uuid.substring(0,7)+"@yopmail.com");
    }

    @And("Enter customer password {string}")
    public void enterCustomerPassword(String password) {
        customer.typePassword(password);
    }

    @And("Click on submit button")
    public void clickOnSubmitButton() {
        customer.ClickOnSubmit();
    }

    @And("Enter customer date of birth {string}")
    public void enterCustomerDateOfBirth(String birth) {
        customer.typeDateOfBirth(birth);
    }
}
