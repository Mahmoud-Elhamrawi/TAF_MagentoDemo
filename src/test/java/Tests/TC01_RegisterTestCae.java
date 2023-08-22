package Tests;

import Pages.HomePage;
import Pages.P01_RegisterPage;
import org.testng.annotations.Test;

public class TC01_RegisterTestCae extends TestCaseBase {

    P01_RegisterPage registerPage ;
    HomePage homePage;


    @Test
    public void ValidRegister(){
        //navigate from home page  to register page
        homePage = new HomePage(driver);
        homePage.clicking(homePage.MyAccountLink);
        homePage.clicking(homePage.registerLink);
        //fill data in register page
        registerPage = new P01_RegisterPage(driver);
        registerPage.FillData("mahmoud","rashad","elhamrawi","mahmoudelhamrawi5555555@gmail.com","123456","123456");
       String actual="Thank you for registering with Main Website Store.";
       String expect = registerPage.assertMSGsuccess.getText();
       softAssert.assertEquals(actual,expect);
        System.out.println(registerPage.assertMSGsuccess.getText());

        String ActualwelcomeMsg = "WELCOME, MAHMOUD RASHAD ELHAMRAWI!";
        String  expectwelcomeMsg = registerPage.welcomeMsg.getText();
        softAssert.assertEquals(ActualwelcomeMsg,expectwelcomeMsg);
        System.out.println(registerPage.welcomeMsg.getText());



        softAssert.assertAll();


    }








}
