package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    IE("ie"),
    OPERA("opera");

    private String browserShortName;
    private static Logger log = LoggerFactory.getLogger(Browsers.class);

    Browsers(String browserShortName) {
        this.browserShortName = browserShortName;
    }

    public String getBrowserShortName() {
        return browserShortName;
    }

    public static Browsers fromString(String browser) {
        for (Browsers b : Browsers.values()) {
            if (b.browserShortName.equalsIgnoreCase(browser)) {
                return b;
            }
        }
        String errorMessage = "Unknown browser " + browser;
        log.error(errorMessage);
        throw new IllegalArgumentException(errorMessage);
    }
}
