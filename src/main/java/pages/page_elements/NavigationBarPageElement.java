package pages.page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;

public class NavigationBarPageElement extends BasePage {

    @FindAll(
            @FindBy(xpath = "//header//nav/*")
    )
    private List<WebElement> navigationBarElements;

    @FindBy(xpath = "//header//nav/span[@class='shop-phone']")
    private WebElement shopPhone;

    @FindBy(id = "contact-link")
    private WebElement contactUsButton;

    @FindBy(xpath = "//header//nav/div[@class='header_user_info']")
    private WebElement signInButton;

    public NavigationBarPageElement(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getShopPhone() {
        return shopPhone;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public int getCountOfElements(){
        return navigationBarElements.size();
    }

    public boolean isAllElementsAreDisplayed(){
        return navigationBarElements.stream().allMatch(WebElement::isDisplayed);
    }
}
