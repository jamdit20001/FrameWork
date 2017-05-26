package framework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.*;

/**
 * Created by shazeda on 5/21/17.
 */
public class GucciCommonAPI extends CommonAPI {

    protected HomePage homePage;
    protected RunwayPage runwayPage;
    protected WomensPage womensPage;
    protected MensPage mensPage;
    protected SearchResultPage searchResultPage;
    protected SignInPage signInPage;

    @BeforeMethod
    public void setupPageObjects() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        runwayPage = PageFactory.initElements(driver, RunwayPage.class);
        womensPage = PageFactory.initElements(driver, WomensPage.class);
        mensPage = PageFactory.initElements(driver, MensPage.class);
        searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }
}
