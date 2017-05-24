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
}
