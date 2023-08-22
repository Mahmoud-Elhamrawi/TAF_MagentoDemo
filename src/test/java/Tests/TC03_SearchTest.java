package Tests;

import Pages.P04_SearchPage;
import org.testng.annotations.Test;

public class TC03_SearchTest extends TestCaseBase{
    String  searchKey="mobile phone";
    P04_SearchPage searchPage;

    @Test
    public void searchFunction() throws InterruptedException {
       searchPage = new P04_SearchPage(driver);
       searchPage.searchItem(searchKey);

       String actaulUrl ="http://live.techpanda.org/index.php/catalogsearch/result/?q=mobile+phone";
       String expectUrl =driver.getCurrentUrl();
       softAssert.assertEquals(actaulUrl,expectUrl);
        System.out.println(searchPage.assertvalue.getText());
       softAssert.assertTrue(searchPage.assertvalue.getText().contains("MOBILE PHONE"));
       softAssert.assertAll();

   }


}
