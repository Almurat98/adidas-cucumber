package adidas.pages;

import adidas.utilities.BrowserUtils;
import adidas.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public  class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//a[@id='nava']")
    public WebElement homeButton;



    @FindBy(linkText = "Add to cart")
    public WebElement addToCart;

         public void addItemToCart(String category,String item){
             Driver.getDriver().findElement(By.linkText(category)).click();
             Driver.getDriver().findElement(By.linkText(item)).click();
             addToCart.click();
             BrowserUtils.sleep(2);
             Alert alert=Driver.getDriver().switchTo().alert();
             alert.accept();
             BrowserUtils.sleep(2);
             homeButton.click();
         }



}
