package adidas.step_definitions;

import adidas.pages.CartPage;
import adidas.pages.FormPage;
import adidas.pages.HomePage;
import adidas.utilities.ConfigurationReader;
import adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Purchase_StepDefinitions {
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();
    FormPage formPage=new FormPage();

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User adds {string} from {string}")
    public void user_adds_from(String item, String category) {
    homePage.addItemToCart(category,item);
    }
    @When("User removes {string} from cart")
    public void user_removes_from_cart(String item) {
     cartPage.removeItem(item);
    }
    @When("User places order and captures and logs purchase ID and Amount")
    public void user_places_order_and_captures_and_logs_purchase_id_and_amount() {
        cartPage.placeOrderButton.click();
        formPage.fillForm();
        formPage.OKButton.click();
        formPage.log_id_and_amount();
    }
    @Then("User verifies purchase amount equals expected")
    public void user_verifies_purchase_amount_equals_expected() {
      int expectedAmount=790;
        Assert.assertEquals(formPage.actualAmount,expectedAmount);

    }
}
