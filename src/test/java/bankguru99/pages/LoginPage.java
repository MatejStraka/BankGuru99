package bankguru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static final String BANK_GURU99_URL = "http://demo.guru99.com/v4/index.php";
    private final WebDriver driver;

    //user id mngr360280
    //password esEvuta

    @FindBy(how = How.NAME, using = "uid")
    private WebElement userID;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement loginButton;

    @FindBy(how = How.NAME, using = "btnReset")
    private WebElement resetButton;

    public LoginPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openBankGuru99Page() {
        driver.get(BANK_GURU99_URL);
    }

    public void Login(String username, String password){
        userID.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public void Reset(String username, String password){
        userID.sendKeys(username);
        this.password.sendKeys(password);
        resetButton.click();
    }

    public String getUserNameText(){
        return userID.getText();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

    public void CloseAlert(){
        driver.switchTo().alert().accept();;
    }

}
