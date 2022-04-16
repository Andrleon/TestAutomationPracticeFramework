package homePageTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.Browsers;
import utils.PropertyService;
import utils.WebDriverUtil;

public abstract class BaseTest {
    protected static final Browsers browser = Browsers.fromString(PropertyService.getBrowser());

    protected WebDriver webDriver;

    @BeforeEach
    protected void setup() {
        webDriver = WebDriverUtil.getDriver(browser);
      //  webDriver.manage().window().maximize();
    }

    @AfterEach
    protected void tearDown() {
        if (webDriver != null)
            webDriver.quit();
        webDriver = null;
    }
}
