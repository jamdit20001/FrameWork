package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/23/17.
 */
public class SearchResultPage {

    @FindBy(css = "#editableBreadcrumbContent span.a-color-state")
    public WebElement searchKeyword;

}