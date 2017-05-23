package tests;

import framework.AmazonCommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shazeda on 5/21/17.
 */
public class HomePageLinksTest extends AmazonCommonAPI {

    @Test
    public void testHelpLink() {

        // open amazon
        // click help
        // verify help page title

        waitToBeClickable(headerPage.helpLink);
        headerPage.helpLink.click();
        String actualTitle = helpPage.helpTitle.getText();
        String expectedTitle = "Hello. What can we help you with?";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testCartLink() {

        //click the shopping cart
        //verify "Your Shopping Cart is empty."
        headerPage.cartLink.click();
        String actualTitle = cartPage.emptyCartMessage.getText();
        String expectedTitle = "Your Shopping Cart is empty.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
