package tests;

import framework.AetnaCommonAPI;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProducersPage;

/**
 * Created by shazeda on 5/25/17.
 */
public class HomePageTest extends AetnaCommonAPI {

    @Test
    public void testProducersLink() {
        homePage.clickProducersLink();
        String actual = producersPage.getTitleText();
        String expected = "Building a Healthier You!";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHealthCareLink() {
        homePage.clickHealthCareLink();
        String actual = healthCareProfPage.getHealthCareTitleText();
        String expected = "Popular resources at your fingertips";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIndividualsFamLink() {
        homePage.clickIndividualsFamLink();
        String actual = individualsFamPage.getIndividualsFamText();
        String expected = "Why team up with Aetna?";
        Assert.assertEquals(actual, expected);
    }
}
