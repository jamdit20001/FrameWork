package tests;

import framework.AmazonCommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GiftResigtryPage;

/**
 * Created by shazeda on 5/21/17.
 */
public class HomePageLinksTest extends AmazonCommonAPI {

    @Test
    public void testHelpLink() {

        // open amazon
        // click help
        // verify help page title

        headerPage.clickHelpLink();
        String actualTitle = helpPage.getHelpTitleText();
        String expectedTitle = "Hello. What can we help you with?";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testCartLink() {

        //click the shopping cart
        //verify "Your Shopping Cart is empty."
        headerPage.clickCartLink();
        String actualTitle = cartPage.getEmptyCartMessageText();
        String expectedTitle = "Your Shopping Cart is empty.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testTodaysDealLink() {
        headerPage.clickTodaysDealLink();
        String actualTitle = todaysDealPage.getTodaysDealsMessageText();
        String expectedTitle = "Today's Deals";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testGiftRegistryLink() {
        headerPage.clickGiftRegistryLink();
        waitToBeVisible(giftResigtryPage.sendGiftByMailButton);
        String actual = giftResigtryPage.getSendGiftByMailButtonText();
        String expected = "SEND A GIFT CARD BY MAIL";
        Assert.assertEquals(actual, expected);
    }
}
