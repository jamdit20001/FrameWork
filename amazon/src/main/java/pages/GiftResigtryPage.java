package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**

 */
public class GiftResigtryPage {

    @FindBy(css = "a[title='send a gift card by mail']")
    public WebElement sendGiftByMailButton;

    public WebElement getSendGiftByMailButton() {
        return sendGiftByMailButton;
    }

    public String getSendGiftByMailButtonText() {
        return getSendGiftByMailButton().getText();
    }

}
