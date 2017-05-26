package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class IndividualsFamPage {

    @FindBy(css = ".titleBar h2")
    public WebElement individualsFamTitle;

    public WebElement getIndividualsFamTitle() {
        return individualsFamTitle;
    }

    public String getIndividualsFamText() {
        return getIndividualsFamTitle().getText();
    }
}
