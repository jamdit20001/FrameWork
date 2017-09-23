package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**

 */
public class SearchResultPage {

    @FindBy(css = "#editableBreadcrumbContent span.a-color-state")
    public WebElement searchKeyword;

    public WebElement getSearchKeyword() {
        return searchKeyword;
    }

    public String getSearchKeywordText() {
        return getSearchKeyword().getText();
    }
}
