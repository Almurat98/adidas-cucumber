package adidas.step_definitions;

import adidas.utilities.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @BeforeStep
    public void waitTwoSeconds(){
 BrowserUtils.sleep(2);
    }
    @After
    public void tearDown(){

    }
}
