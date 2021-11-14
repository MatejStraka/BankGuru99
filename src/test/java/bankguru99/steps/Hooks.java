package bankguru99.steps;

import bankguru99.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks  extends DriverFactory{

    @Before
    public void beforeScenario(Scenario scenario) {
        startBrowser();
    }

    @After
    public void afterScenario(Scenario scenario) {
        destroyDriver();
    }
}
