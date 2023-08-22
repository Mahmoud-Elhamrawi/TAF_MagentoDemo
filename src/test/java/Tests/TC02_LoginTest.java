package Tests;

import Pages.HomePage;
import Pages.P02_LoginPage;
import Pages.P03_changePasswordPage;
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
        loginPage.fillData("mahmoudelhamrawi5@gmail.com","101010");

        softAssert.assertTrue(loginPage.loginsecess.getText().contains("Mahmoud R Elhamrawi"));
        System.out.println(loginPage.loginsecess.getText());
        softAssert.assertAll();

    }

    P03_changePasswordPage changePasswordPage ;

    @Test(dependsOnMethods = {"ValidLogin"})
    public void changePassword()
    {
        changePasswordPage = new P03_changePasswordPage(driver);
        changePasswordPage.ChangePass.click();
        softAssert.assertTrue(driver.getCurrentUrl().contains("changepass"));
        changePasswordPage.changePass("101010","999999","999999");
        String actualSave= "The account information has been saved.";
        String expectSave=changePasswordPage.successMsg.getText();
        softAssert.assertEquals(actualSave,expectSave);
        System.out.println(changePasswordPage.successMsg.getText());
        softAssert.assertAll();
    }



}

