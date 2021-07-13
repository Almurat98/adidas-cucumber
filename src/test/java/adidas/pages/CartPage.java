package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//tbody[@id='tbodyid']//tr[2]")
public WebElement delli78gb;
    @FindBy(xpath = "//tbody[@id='tbodyid']//tr[2]//a")
    public WebElement deleteButtonForDell;

    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement placeOrderButton;

    @FindBy(id="name")
   public WebElement inputName;

    @FindBy(id="country")
    public WebElement inputCountry;

    @FindBy(id="city")
    public WebElement inputCity;

    @FindBy(id="card")
    public WebElement inputCreditCard;

    @FindBy(id="month")
    public WebElement inputMonth;

    @FindBy(id="year")
   public WebElement inputYear;

    @FindBy (xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement orderInfo;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
   public WebElement OKButton;
}
