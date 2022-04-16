package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected WebDriverWait wait;
    private static final Duration TIMEOUT = Duration.ofSeconds(10);



    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    public WebElement waitForElement(WebElement element){
        var el = wait.until(ExpectedConditions.visibilityOf(element));
        if (el.isDisplayed()) {
            logger.info(String.format("Element %s is found", el.getText()));
        } else {
            logger.info(String.format("Element %s is not found", el.getText()));
        }

        return el;

    }
}
