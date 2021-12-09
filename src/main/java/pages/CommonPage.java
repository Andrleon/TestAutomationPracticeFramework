package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.page_elements.*;

public class CommonPage extends BasePage {
    protected NavigationBarPageElement navigationBarPageElement = new NavigationBarPageElement(driver);
    protected SearchBoxPageElement searchBoxPageElement = new SearchBoxPageElement(driver);
    protected ShoppingCartPageElement shoppingCartPageElement = new ShoppingCartPageElement(driver);
    protected TopMenuPageElement topMenuPageElement = new TopMenuPageElement(driver);
    protected FooterPageElement footerPageElement = new FooterPageElement(driver);

    @Getter
    @FindBy(css = "#header div.banner")
    private WebElement banner;
    @Getter
    @FindBy(id = "header_logo")
    private WebElement logo;

    protected CommonPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBarPageElement getNavigationBarPageElement() {
        return navigationBarPageElement;
    }

    public SearchBoxPageElement getSearchBoxPageElement() {
        return searchBoxPageElement;
    }

    public ShoppingCartPageElement getShoppingCartPageElement() {
        return shoppingCartPageElement;
    }

    public TopMenuPageElement getTopMenuPageElement() {
        return topMenuPageElement;
    }

    public FooterPageElement getFooterPageElement() {
        return footerPageElement;
    }

    protected void initElements() {
        PageFactory.initElements(driver, this);
        navigationBarPageElement = new NavigationBarPageElement(driver);
        searchBoxPageElement = new SearchBoxPageElement(driver);
    }

    public SearchResultsPage searchFor(String searchQuery){
        return searchBoxPageElement.searchFor(searchQuery);
    }
}
