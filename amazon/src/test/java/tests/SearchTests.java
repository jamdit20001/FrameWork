package tests;

import framework.AmazonCommonAPI;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by shazeda on 5/23/17.
 */
public class SearchTests extends AmazonCommonAPI {

    @Test
    public void searchCamera() {
        headerPage.search("Camera");

        String actual = searchResultPage.getSearchKeywordText();
        String expected = "\"Camera\"";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchFromExcelData() throws IOException {

        // read the data form excel into an array
        // go through each data and perform search
        // verify the search keyword in search result page

        String[] keywords = dataReader.fileReader("src/test/resources/search-data.xls");

        for (String keyword : keywords) {

            headerPage.search(keyword);

            String actual = searchResultPage.getSearchKeywordText();
            String expected = "\"" + keyword + "\"";
            Assert.assertEquals(actual, expected);

            navigateBack();
        }

    }

    @Test
    public void searchFromMysqlDatabase() throws Exception {

        // read the data form mysql into an array
        // go through each data and perform search
        // verify the search keyword in search result page

        List<String> keywords = connectDB.readDataBase("pnt.Amazon", "Keyword");

        for (String keyword : keywords) {

            headerPage.search(keyword);

            String actual = searchResultPage.getSearchKeywordText();
            String expected = "\"" + keyword + "\"";
            Assert.assertEquals(actual, expected);

            navigateBack();
        }

    }
}
