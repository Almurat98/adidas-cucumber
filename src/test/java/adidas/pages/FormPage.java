package adidas.pages;

import adidas.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement inputName;

    @FindBy(id = "country")
    public WebElement inputCountry;

    @FindBy(id = "city")
    public WebElement inputCity;

    @FindBy(id = "card")
    public WebElement inputCreditCard;

    @FindBy(id = "month")
    public WebElement inputMonth;

    @FindBy(id = "year")
    public WebElement inputYear;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement orderInfo;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement OKButton;

    public void fillForm() {
        Faker faker = new Faker();
        inputName.sendKeys(faker.name().fullName());
        inputCountry.sendKeys(faker.address().country());
        inputCity.sendKeys(faker.address().city());
        inputCreditCard.sendKeys(faker.number().digits(16));
        inputMonth.sendKeys(faker.number().numberBetween(1, 12) + " ");
        inputYear.sendKeys(faker.number().digits(4));
        purchaseButton.click();
    }
         public int actualAmount;
    public void log_id_and_amount() {
        String popUpInfo = orderInfo.getText();
        String[] eachLine = popUpInfo.split("\n");
        for (int i = 0; i < eachLine.length; i++) {
            if (eachLine[i].startsWith("Id") ) {
                System.out.println(eachLine[i]);
            }
                if (eachLine[i].startsWith("Amount")){
                    System.out.println(eachLine[i]);
                    actualAmount=Integer.parseInt(eachLine[i].split(" ")[1]);

                }


        }



    }

}