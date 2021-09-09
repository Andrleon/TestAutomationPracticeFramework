package homePageTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class  BaseTest {
    protected WebDriver webDriver;
    @BeforeAll
    protected static void webDriverSetup() {
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    protected void setup() {
        webDriver = new EdgeDriver();
    }

    @AfterEach
    protected void tearDown() {
        webDriver.quit();
        webDriver = null;
    }
}
