package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage {
    private static final String HOME_URL = "http://automationpractice.com/";

    @FindBy(css = "#home-page-tabs a.blockbestsellers")
    public WebElement bestSellers;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        logger.info(String.format("Opening home page %s", HOME_URL));
        driver.get(HOME_URL);
        return this;
    }
}
