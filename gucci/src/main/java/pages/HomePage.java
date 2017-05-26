package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/21/17.
 */
public class HomePage {

    @FindBy(xpath = "//div[@class='header-nav-section-title']//a[text()='Runway']")
    public WebElement runwayLink;

    @FindBy(xpath = "//div[@class='header-nav-section-title']//a[text()='Women']")
    public WebElement womenLink;

    @FindBy(xpath = "//div[@class='header-nav-section-title']//a[text()='Men']")
    public WebElement menLink;

    @FindBy(id = "header-nav-search-input")
    public WebElement searchBox;

    @FindBy(id = "header-nav-signin")
    public WebElement signInLink;

    public WebElement getRunwayLink() {
        return runwayLink;
    }

    public WebElement getWomenLink() {
        return womenLink;
    }

    public WebElement getMenLink() {
        return menLink;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public void clickRunwayLink() {
        getRunwayLink().click();
    }

    public void clickWomenLink() {
        getWomenLink().click();
    }

    public void clickMenLink() {
        getMenLink().click();
    }

    public void searchProduct(String product) {
        getSearchBox().sendKeys(product);
        getSearchBox().submit();
    }

    public void clickSignIn() {
        getSignInLink().click();
    }
}
