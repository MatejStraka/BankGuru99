package bankguru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ManagerHomPage {

    private static final String BANK_GURU99_URL = "http://demo.guru99.com/v4/index.php";
    private final WebDriver driver;

    //user id mngr360280
    //password esEvuta

    @FindBy(how = How.CSS, using = ".heading3>td")
    private WebElement managerID;

    @FindBy(how = How.CSS, using = ".menusubnav a")
    private List<WebElement> menu;

    @FindBy(how = How.CLASS_NAME, using = "heading3")
    private WebElement successfullRegistration;

    public ManagerHomPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getManagerID(){
        return managerID.getText();
    }

    public void SelectItemFromMenu(String item){
        switch (item){
            case "New Customer":
                menu.get(1).click();
                break;
            case "Logout":
                menu.get(14).click();
                break;
            default:
                System.out.println("Item name not found");
        }
    }
    public String getNewCustomerRegistrationText(){
        return successfullRegistration.getText();
    }
}
