package adidas.step_definitions;

import adidas.pages.CartPage;
import adidas.pages.FormPage;
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
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Purchase_StepDefinitions {
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();
    LaptopPage laptopPage=new LaptopPage();
    FormPage formPage=new FormPage();

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
        formPage.inputName.sendKeys(faker.name().fullName());
        formPage.inputCountry.sendKeys(faker.address().country());
        formPage.inputCity.sendKeys(faker.address().city());
        formPage.inputCreditCard.sendKeys(faker.number().digits(16));
        formPage.inputMonth.sendKeys(faker.number().numberBetween(1,12)+" ");
        formPage.inputYear.sendKeys(faker.number().digits(4));
    }
    @And("customer clicks on 'Purchase'")
    public void customer_clicks_purchase(){
        formPage.purchaseButton.click();
    }
    @And("customer takes screen shot of order id and amount")
    public void customer_logs_orderID_orderAmount(){
     String popUpInfo=formPage.orderInfo.getText();
        String []eachLine=popUpInfo.split("\n");
        for(int i=0;i<eachLine.length;i++){
            if(eachLine[i].startsWith("Id")||eachLine[i].startsWith("Amount")){
                System.out.println(eachLine[i]);
            }
        }
    }
    @And("customer compare expected purchase amount and actual amount")
    public void customer_compare_expectedAmount_and_actualAmount() {
        int expectedAmount = 790;
        int actualAmount = 0;
        String popUpInfo = formPage.orderInfo.getText();
        String[] eachLine = popUpInfo.split("\n");
        for (int i = 0; i < eachLine.length; i++) {
            if (eachLine[i].startsWith("Amount")) {
                actualAmount = Integer.parseInt(eachLine[i].substring(8, 11));
            }
        }
        Assert.assertEquals(actualAmount,expectedAmount);
    }

    @Then("customer clicks on 'Ok'")
    public void customer_clicks_ok(){
        BrowserUtils.sleep(2);
        formPage.OKButton.click();
    }

}
