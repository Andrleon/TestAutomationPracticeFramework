package pages.page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class FooterPageElement extends BasePage {

    @FindBy(id = "footer")
    private WebElement footer;

    public FooterPageElement(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayed(){
        return footer.isDisplayed();
    }
}
