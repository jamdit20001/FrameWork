package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class MensPage {

    @FindBy(css = ".page-CategoryPage-USCA-M-lev1")
    public WebElement mensPageBody;

    @FindBy(css = ".hero-title")
    public WebElement title;

    public WebElement getMensPageBody() {
        return mensPageBody;
    }

    public WebElement getTitle() {
        return title;
    }

    public String getTitleText() {
        return getTitle().getText();
    }

}
