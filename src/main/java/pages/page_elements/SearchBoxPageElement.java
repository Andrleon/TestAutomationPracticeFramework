package pages.page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.SearchResultsPage;

public class SearchBoxPageElement extends BasePage {

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    public SearchBoxPageElement(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayed(){
        return (searchField.isDisplayed() && searchButton.isDisplayed());
    }

    public SearchResultsPage searchFor(String searchQuery){
        searchField.sendKeys(searchQuery);
        searchButton.click();
        return new SearchResultsPage(driver);
    }

}
