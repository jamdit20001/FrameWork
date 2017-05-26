package tests;

import framework.GucciCommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shazeda on 5/21/17.
 */
public class HomePageTests extends GucciCommonAPI {

    @Test
    public void searchBags() {
        homePage.searchProduct("GG Marmont quilted leather backpack");
        String actual = searchResultPage.getSearchTermTitleText();
        String expected = "\"GG Marmont quilted leather backpack".toUpperCase();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void wrongUsernamePassword() {
        homePage.clickSignIn();
        signInPage.login("invalid@gmail.com", "whatever");
        String actual = signInPage.getErrorMessageText();
        String expected = "Invalid email and/or password. Try again or click on \"Forgot your password?\" link.";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRunwayLink() {
        homePage.clickRunwayLink();
        homePage.clickRunwayLink();
        waitToBeVisible(runwayPage.getRunwayBody());
        String actual = runwayPage.getTitleText();
        String expected = "RUNWAY";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWomenLink() {
        homePage.clickWomenLink();
        homePage.clickWomenLink();
        waitToBeVisible(womensPage.getWomensPageBody());
        String actual = womensPage.getTitleText();
        String expected = "PRE-FALL 2017\nWOMEN'S";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMenLink() {
        homePage.clickMenLink();
        homePage.clickMenLink();
        waitToBeVisible(mensPage.getMensPageBody());
        String actual = mensPage.getTitleText();
        String expected = "PRE-FALL 2017\nMEN'S";
        Assert.assertEquals(actual, expected);
    }

}