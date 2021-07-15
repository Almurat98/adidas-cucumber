package adidas.pages;

import adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy (xpath="//a[.='Cart']")
    public  WebElement cartButton;


    @FindBy (xpath = "//button[.='Place Order']")
    public WebElement placeOrderButton;

        public void removeItem(String item){
           cartButton.click();
           Driver.getDriver().findElement(By.xpath("//table//tr//td[.='"+item+"']/..//td[.='Delete']/a")).click();

}

}
