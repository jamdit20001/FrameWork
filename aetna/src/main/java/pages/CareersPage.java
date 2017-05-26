package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class CareersPage {

    @FindBy(css = ".heading h1")
    public WebElement careerPageTitle;
}
