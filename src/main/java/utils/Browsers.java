package utils;

public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    IE("ie");

    private String browserShortName;

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
        throw new IllegalArgumentException("An unknown browser " + browser);
    }
}
