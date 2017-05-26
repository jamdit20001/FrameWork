package framework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.*;

/**
 * Created by shazeda on 5/25/17.
 */
public class AetnaCommonAPI extends CommonAPI {

    protected HomePage homePage;
    protected ProducersPage producersPage;
    protected CareersPage careersPage;
    protected HealthCareProfPage healthCareProfPage;
    protected IndividualsFamPage individualsFamPage;

    @BeforeMethod
    public void setUpPageObject() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        producersPage = PageFactory.initElements(driver, ProducersPage.class);
        careersPage = PageFactory.initElements(driver, CareersPage.class);
        healthCareProfPage = PageFactory.initElements(driver, HealthCareProfPage.class);
        individualsFamPage = PageFactory.initElements(driver, IndividualsFamPage.class);
    }
}
