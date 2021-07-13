package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy (linkText = "Delete")
        WebElement delete;

    @FindBy (xpath = "//button[@class='btn btn-success']")
    WebElement placeOrderButton;

    @FindBy(id="name")
    WebElement inputName;

    @FindBy(id="country")
    WebElement inputCountry;

    @FindBy(id="city")
    WebElement inputCity;

    @FindBy(id="card")
    WebElement inputCreditCard;

    @FindBy(id="month")
    WebElement inputMonth;

    @FindBy(id="year")
    WebElement inputYear;

    @FindBy (xpath = "//button[.='Purchase']")
    WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    WebElement orderInfo;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement OKButton;
}
