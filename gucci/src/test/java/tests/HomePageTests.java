package tests;

import framework.GucciCommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shazeda on 5/21/17.
 */
public class HomePageTests extends GucciCommonAPI {

    @Test
    public void testRunwayLink() {
        waitToBeClickable(homePage.runwayLink);
        homePage.runwayLink.click();
        homePage.runwayLink.click();

        waitToBeVisible(runwayPage.runwayBody);

        String actual = runwayPage.title.getText();
        String expected = "RUNWAY";
        Assert.assertEquals(actual, expected);

        screenshot();
    }

    @Test(enabled = false)
    public void testWomenLink() {
        homePage.womenLink.click();
        homePage.womenLink.click();

        waitToBeVisible(womensPage.womensPageBody);

        String actual = womensPage.title.getText();
        String expected = "PRE-FALL 2017\nWOMEN'S";
        Assert.assertEquals(actual, expected);
    }
}
