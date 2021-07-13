package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage {
    public LaptopPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (linkText = "Sony vaio i5")
    WebElement SonyVaioI5;

    @FindBy(linkText = "Dell i7 8gb")
    WebElement DellI78gb;

    @FindBy(linkText = "Add to cart")
    WebElement addToCart;





}
