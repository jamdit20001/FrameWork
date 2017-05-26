package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/23/17.
 */
public class TodaysDealPage {

    @FindBy(css = ".gbh1-bold")
    public WebElement todaysDealsMessage;

    public WebElement getTodaysDealsMessage() {
        return todaysDealsMessage;
    }

    public String getTodaysDealsMessageText() {
        return getTodaysDealsMessage().getText();
    }
}
