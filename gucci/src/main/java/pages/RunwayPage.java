package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class RunwayPage {

    @FindBy(css = "body.page-Runway-Pre-Fall-2017")
    public WebElement runwayBody;

    @FindBy(css = ".hero-title")
    public WebElement title;

}
