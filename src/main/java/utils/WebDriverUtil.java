package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverUtil {
    private WebDriverUtil() {
    }

    public static void setupWebDriver(Browsers browser) {
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                throw new IllegalArgumentException(String.format("An unknown browser \"%s\"", browser));
        }
    }

    public static WebDriver getDriver(Browsers browser) {
        switch (browser) {
            case CHROME:
                return new ChromeDriver();
            case IE:
                return new InternetExplorerDriver();
            case EDGE:
                return new EdgeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                throw new IllegalArgumentException(String.format("An unknown browser \"%s\"", browser));
        }
    }
}
