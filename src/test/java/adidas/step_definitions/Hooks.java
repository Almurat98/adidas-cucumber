package adidas.step_definitions;

import adidas.utilities.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void waitBeforeEachAction(){
        BrowserUtils.sleep(2);
    }
    @After
    public void another2Second(){
        BrowserUtils.sleep(2);
    }
}
