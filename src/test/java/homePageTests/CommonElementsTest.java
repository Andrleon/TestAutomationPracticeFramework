package homePageTests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CommonPage;
import pages.HomePage;
import pages.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonElementsTest {
    private WebDriver webDriver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void presenceOfCommonElementsOnTheHomePage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.open();

        checkPresenceOfCommonElementsOnThePage(homePage);
    }

    @Test
    public void presenceOfCommonElementsOnTheSearchResultPage() {
        HomePage homePage = new HomePage(webDriver);
        SearchResultsPage searchResultsPage = homePage.open()
                .getSearchBoxPageElement().searchFor("test");

        checkPresenceOfCommonElementsOnThePage(searchResultsPage);
    }


    private void checkPresenceOfCommonElementsOnThePage(CommonPage page) {
        assertAll("Check presence of common elements on the page",
                () -> assertTrue(page.getBanner().isDisplayed(),
                        "Banner is not displayed"),
                () -> assertTrue(page.getNavigationBarPageElement().isAllElementsAreDisplayed(),
                        "Not all elements are displayed on the Navigation Bar"),
                () -> assertEquals(3, page.getNavigationBarPageElement().getCountOfElements(),
                        "Unexpected count of navigationBar elements"),
                () -> assertTrue(page.getLogo().isDisplayed(),
                        "Logo is not displayed"),
                () -> assertTrue(page.getSearchBoxPageElement().isDisplayed(),
                        "SearchBox is n ot displayed"),
                () -> assertTrue(page.getShoppingCartPageElement().isDisplayed(),
                        "ShoppingCart is n ot displayed"),
                () -> assertTrue(page.getTopMenuPageElement().isAllElementsAreDisplayed(),
                        "Not all elements are displayed on the TopMenu"),
                () -> assertEquals(3, page.getTopMenuPageElement().getCountOfElements(),
                        "Unexpected count of TopMenu elements"),
                () -> assertTrue(page.getFooterPageElement().isDisplayed(),
                        "Footer is not displayed"));


        // $("title").shouldHave(text("My Store"));
        //$("title").shouldHave(attribute("text", "My Store"));
        // $("#submit").click();
        // $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
        //$("#username").shouldHave(text("Hello, Johny!"));

    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
        webDriver = null;
    }
}
