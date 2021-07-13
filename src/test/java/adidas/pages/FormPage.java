package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
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
