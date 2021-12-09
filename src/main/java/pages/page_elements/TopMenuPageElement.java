package pages.page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;

public class TopMenuPageElement extends BasePage {

    @FindAll(
            @FindBy(xpath = "//div[@id='block_top_menu']/ul/*")
    )
    private List<WebElement> topMenuElements;

    private WebElement womenTopMenuItem;
    private WebElement dressesTopMenuItem;
    private WebElement tShortsTopMenuItem;

    public TopMenuPageElement(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int getCountOfElements(){
        return topMenuElements.size();
    }

    public boolean isAllElementsAreDisplayed(){
        return topMenuElements.stream().allMatch(WebElement::isDisplayed);
    }
}
