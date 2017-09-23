package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**

 */
public class HelpPage {


    @FindBy(css = ".ss-landing-container h1")
    public WebElement helpTitle;

    public WebElement getHelpTitle() {
        return helpTitle;
    }

    public String getHelpTitleText() {
        return getHelpTitle().getText();
    }
}
