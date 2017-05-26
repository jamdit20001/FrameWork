package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class CartPage {


    @FindBy( css= ".sc-cart-header h1")
    public WebElement emptyCartMessage;

    public WebElement getEmptyCartMessage() {
        return emptyCartMessage;
    }

    public String getEmptyCartMessageText() {
        return getEmptyCartMessage().getText();
    }
}
