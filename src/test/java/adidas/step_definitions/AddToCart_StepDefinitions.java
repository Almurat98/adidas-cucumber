package adidas.step_definitions;

import adidas.utilities.ConfigurationReader;
import adidas.utilities.Driver;
import io.cucumber.java.en.Given;

public class AddToCart_StepDefinitions {


    @Given("customer is on the home page")
    public void customer_opens_homePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }


}
