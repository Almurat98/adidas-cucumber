package adidas.step_definitions;

import adidas.pages.CartPage;
import adidas.pages.HomePage;
import adidas.pages.LaptopPage;
import adidas.utilities.BrowserUtils;
import adidas.utilities.ConfigurationReader;
import adidas.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class Purchase_StepDefinitions {
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();
    LaptopPage laptopPage=new LaptopPage();

    @Given("customer is on the home page")
    public void customer_opens_homePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().manage().window().maximize();
    }

    @When("customer navigates to laptop")
    public void customer_clicks_laptop(){
        homePage.Laptops.click();
    }
    @And("customer clicks 'Sony vaio i5'")
    public void customer_clicks_Sony(){
        laptopPage.SonyVaioI5.click();
    }
    @And("customer clicks on 'Add to cart'")
    public void customer_clicks_addToCart(){
        laptopPage.addToCart.click();
    }
    @Then("customer accept pop up confirmation")
    public void customer_accept_confirmation(){
        BrowserUtils.sleep(2);
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @And("customer clicks 'dell i7 8gb'")
    public void customer_clicks_dell(){
        laptopPage.DellI78gb.click();
    }

    @Given("customer is on cart page")
public void navigate_to_cartPage(){
        homePage.cartButton.click();
    }
    @When("customer see 'dell i7 8gb' is in cart")
    public void dellI78gb_in_cart(){
        cartPage.delli78gb.isDisplayed();
    }
    @Then("click 'delete' on 'dell i7 8gb'")
    public void delete_dell(){
cartPage.deleteButtonForDell.click();
    }

    @When("customer clicks on 'Place Order'")
   public void customer_clicks_placeOrder(){
        cartPage.placeOrderButton.click();
    }
    @And("customer fill in all web form fields")
    public void customer_fills_webForm(){
        Faker faker=new Faker();
        cartPage.inputName.sendKeys(faker.name().fullName());
        cartPage.inputCountry.sendKeys(faker.address().country());
        cartPage.inputCity.sendKeys(faker.address().city());
        cartPage.inputCreditCard.sendKeys(faker.number().digits(16));
        cartPage.inputMonth.sendKeys(faker.number().numberBetween(1,12)+"");
        cartPage.inputYear.sendKeys(faker.number().digits(4));
    }
    @And("customer clicks on 'Purchase'")
    public void customer_clicks_purchase(){
        cartPage.placeOrderButton.click();
    }
    @And("customer takes screen shot of order id and amount")
    public void customer_logs_orderID_orderAmount(){
     String popUpInfo=cartPage.orderInfo.getText();
        System.out.println(popUpInfo);
    }
    @And("customer compare expected purchase amount and actual amount")
    public void customer_compare_expectedAmount_and_actualAmount(){
        int expectedAmount=790;

    }
    @Then("customer clicks on 'Ok'")
    public void customer_clicks_ok(){
        cartPage.OKButton.click();
    }

}
