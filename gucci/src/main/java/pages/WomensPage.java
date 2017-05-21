package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class WomensPage {

    @FindBy(css = ".page-CategoryPage-USCA-W-lev1")
    public WebElement womensPageBody;

    @FindBy(css = ".hero-title")
    public WebElement title;

}
