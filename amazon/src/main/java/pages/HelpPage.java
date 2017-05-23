package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class HelpPage {


    @FindBy(css = ".ss-landing-container h1")
    public WebElement helpTitle;
}
