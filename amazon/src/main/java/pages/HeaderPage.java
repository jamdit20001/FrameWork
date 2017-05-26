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

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getGiftRegistryLink() {
        return giftRegistryLink;
    }

    public WebElement getHelpLink() {
        return helpLink;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getTodaysDealLink() {
        return todaysDealLink;
    }

    public void search(String text) {
        getSearchBox().clear();
        getSearchBox().sendKeys(text);
        getSearchBox().submit();
    }

    public void clickHelpLink() {
        getHelpLink().click();
    }

    public void clickCartLink() {
        getCartLink().click();
    }

    public void clickTodaysDealLink() {
        getTodaysDealLink().click();
    }

    public void clickGiftRegistryLink() {
        getGiftRegistryLink().click();
    }
}
