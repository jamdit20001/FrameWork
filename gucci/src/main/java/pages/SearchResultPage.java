package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class SearchResultPage {

    @FindBy(css = ".search-terms-title > span")
    public WebElement searchTermTitle;

    public WebElement getSearchTermTitle() {
        return searchTermTitle;
    }

    public String getSearchTermTitleText() {
        return getSearchTermTitle().getText();
    }
}

