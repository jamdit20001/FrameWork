package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shazeda on 5/25/17.
 */
public class HomePage {

    @FindBy(css = "li a[title='Producers']")
    public WebElement producersLink;

    @FindBy(xpath = "//li/a[text()='Careers']")
    public WebElement careersLink;

    @FindBy(css = "li a[title='Health Care Professionals']")
    public WebElement healthcareLink;

    @FindBy(css = "li a[title='Individuals & Families']")
    public WebElement individualsFamLink;

    public WebElement getIndividualsFamLink() {
        return individualsFamLink;
    }

    public WebElement getHealthcareLink() {
        return healthcareLink;
    }

    public WebElement getCareersLink() {
        return careersLink;
    }

    public WebElement getProducersLink() {
        return producersLink;
    }

    public void clickProducersLink() {
        getProducersLink().click();
    }

    public void clickCareersLink() {
        getCareersLink().click();
    }

    public void clickHealthCareLink() {
        getHealthcareLink().click();
    }

    public void clickIndividualsFamLink() {
        getIndividualsFamLink().click();
    }
}
