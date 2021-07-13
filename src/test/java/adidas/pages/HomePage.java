package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//a[.='Cart']")
   public  WebElement cartButton;

    @FindBy(linkText ="Laptops")
    public WebElement Laptops;


}
