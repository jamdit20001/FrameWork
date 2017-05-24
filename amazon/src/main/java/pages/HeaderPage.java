package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class HeaderPage {


    @FindBy(xpath = "//div[@id='nav-xshop']//a[text()='Help']")
    public WebElement helpLink;

    @FindBy(id = "nav-cart")
    public WebElement cartLink;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[text()=\"Today's Deals\"]")
    public WebElement todaysDealLink;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[text()='Gift Cards & Registry']")
    public WebElement giftRegistryLink;
}
