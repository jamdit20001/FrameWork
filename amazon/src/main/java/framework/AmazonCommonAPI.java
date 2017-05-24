package framework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.*;

/**
 * Created by shazeda on 5/21/17.
 */
public class AmazonCommonAPI extends CommonAPI {

    protected FooterPage footerPage;
    protected HeaderPage headerPage;
    protected HelpPage helpPage;
    protected CartPage cartPage;
    protected TodaysDealPage todaysDealPage;
    protected GiftResigtryPage giftResigtryPage;

    @BeforeMethod
    public void setUpPageObject() {
        footerPage = PageFactory.initElements(driver,FooterPage.class);
        headerPage = PageFactory.initElements(driver,HeaderPage.class);
        helpPage = PageFactory.initElements(driver,HelpPage.class);
        cartPage = PageFactory.initElements(driver,CartPage.class);
        todaysDealPage = PageFactory.initElements(driver,TodaysDealPage.class);
        giftResigtryPage = PageFactory.initElements(driver,GiftResigtryPage.class);
    }
}
