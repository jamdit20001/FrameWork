package framework;

import framework.CommonScript;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.RunwayPage;
import pages.WomensPage;

/**
 * Created by shazeda on 5/21/17.
 */
public class GucciCommonScript extends CommonScript {

    protected HomePage homePage;
    protected RunwayPage runwayPage;
    protected WomensPage womensPage;

    @BeforeMethod
    public void setupPageObjects() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        runwayPage = PageFactory.initElements(driver, RunwayPage.class);
        womensPage = PageFactory.initElements(driver, WomensPage.class);
    }

}
