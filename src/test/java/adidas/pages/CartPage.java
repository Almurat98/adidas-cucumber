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

    @FindBy (xpath = "//button[.='Place Order']")
    public WebElement placeOrderButton;


}
