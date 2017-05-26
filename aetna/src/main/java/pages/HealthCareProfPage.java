package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class HealthCareProfPage {

    @FindBy(css = ".titleBar h2")
    public WebElement healthCareTitle;

    public WebElement getHealthCareTitle() {
        return healthCareTitle;
    }

    public String getHealthCareTitleText() {
        return getHealthCareTitle().getText();
    }
}
