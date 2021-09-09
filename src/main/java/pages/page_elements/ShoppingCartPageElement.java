package pages.page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePageObject;

public class ShoppingCartPageElement extends BasePageObject {


    @FindBy(className = "shopping_cart")
    private WebElement shoppingCartField;

    public ShoppingCartPageElement(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayed(){
        return shoppingCartField.isDisplayed();
    }
}
