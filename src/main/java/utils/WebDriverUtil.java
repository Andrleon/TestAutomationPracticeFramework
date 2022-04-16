package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverUtil {
    private static Logger log = LoggerFactory.getLogger(WebDriverUtil.class);
    private WebDriverUtil() {
    }

    public static WebDriver getDriver(Browsers browser) {
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case IE:
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                String errorMessage = String.format("The browser name '%s' is not recognized", browser);
                log.error(errorMessage);
                throw new IllegalArgumentException(errorMessage);
        }
    }
}
