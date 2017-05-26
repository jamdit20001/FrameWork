package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class ProducersPage {

    @FindBy(css = ".slide-copy.span6>h2")
    public WebElement title;

    public WebElement getTitle() {
        return title;
    }

    public String getTitleText() {
        return title.getText();
    }
}
