package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/23/17.
 */
public class GiftResigtryPage {

    @FindBy(css = "a[title='send a gift card by mail']")
    public WebElement sendGiftByMailButton;

}
