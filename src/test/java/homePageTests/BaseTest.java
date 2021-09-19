package homePageTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.Browsers;
import utils.WebDriverUtil;

public abstract class  BaseTest {
    protected static final Browsers browser = Browsers.fromString("phantomjs");

    protected WebDriver webDriver;
    @BeforeAll
    protected static void webDriverSetup() {
        WebDriverUtil.setupWebDriver(browser);
    }

    @BeforeEach
    protected void setup() {
        webDriver = WebDriverUtil.getDriver(browser);
    }

    @AfterEach
    protected void tearDown() {
        webDriver.quit();
        webDriver = null;
    }
}
