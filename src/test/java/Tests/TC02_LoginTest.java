package Tests;

import Pages.HomePage;
import Pages.P02_LoginPage;
import org.testng.annotations.Test;

public class TC02_LoginTest extends TestCaseBase{

    HomePage homePage ;
    P02_LoginPage loginPage;
    @Test
    public void ValidLogin(){
        //navigate from home page  to register page
        homePage = new HomePage(driver);
        homePage.clicking(homePage.MyAccountLink);
        homePage.clicking(homePage.loginLink);
        //fill data in login page
        loginPage = new P02_LoginPage(driver);
        loginPage.fillData("mahmoudelhamrawi5@gmail.com","123456");

        softAssert.assertTrue(loginPage.loginsecess.getText().contains("Mahmoud R Elhamrawi"));
        System.out.println(loginPage.loginsecess.getText());
        softAssert.assertAll();

    }
}
