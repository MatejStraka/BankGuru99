package bankguru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewCustomer {

    private final WebDriver driver;

    @FindBy(how = How.NAME, using = "name")
    private WebElement name;

    @FindBy(how = How.NAME, using = "rad1")
    private List<WebElement> gender;

    @FindBy(how = How.ID, using = "dob")
    private WebElement birth;

    @FindBy(how = How.NAME, using = "addr")
    private WebElement address;

    @FindBy(how = How.NAME, using = "city")
    private WebElement city;

    @FindBy(how = How.NAME, using = "state")
    private WebElement state;

    @FindBy(how = How.NAME, using = "pinno")
    private WebElement pin;

    @FindBy(how = How.NAME, using = "telephoneno")
    private WebElement phone;

    @FindBy(how = How.NAME, using = "emailid")
    private WebElement email;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "sub")
    private WebElement submitButton;

    @FindBy(how = How.ID, using = "message")
    private WebElement nameValidation;


    public NewCustomer(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeCustomerName(String text){
        name.sendKeys(text);
    }

    public void selectGender(String gender){
        if(gender.equalsIgnoreCase("male")){
            this.gender.get(0).click();
        }
        else{
            this.gender.get(1).click();
        }
    }

    public void typeDateOfBirth(String text){
        birth.sendKeys(text);
    }

    public void typeAddress(String text){
        address.sendKeys(text);
    }

    public void typeCity(String text){
        city.sendKeys(text);
    }

    public void typeState(String text){
        state.sendKeys(text);
    }

    public void typePIN(String text){
        pin.sendKeys(text);
    }

    public void typeMobileNumber(String text){
        phone.sendKeys(text);
    }

    public void typeEmail(String text){
        email.sendKeys(text);
    }

    public void typePassword(String text){
        password.sendKeys(text);
    }

    public String getNameValidationText(){
        return nameValidation.getText();
    }

    public void ClickOnSubmit(){
        submitButton.click();
    }
}
