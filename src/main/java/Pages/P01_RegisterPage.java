package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_RegisterPage extends PageBase{


    public P01_RegisterPage(WebDriver driver) {
        super(driver);
    }
     @FindBy(id = "firstname")
    public WebElement FInput ;

    @FindBy(id = "middlename")
    public WebElement MInput ;
      @FindBy(id = "lastname")
      public WebElement LInput ;


      @FindBy(id = "email_address")
      public WebElement EmailInput;

      @FindBy(id = "password")
      public WebElement passInput ;

      @FindBy(id = "confirmation")
       public WebElement confirmPas ;

      @FindBy(css = "button[title=\"Register\"]")
       public  WebElement registerBtn ;

    @FindBy(css = "li[class=\"success-msg\"]")
    public  WebElement assertMSGsuccess ;


    @FindBy(css = "p[class=\"welcome-msg\"]")
    public  WebElement welcomeMsg;
      HomePage homePage = new HomePage(driver);

      public void FillData(String Fname , String Mname , String Lname,String email , String Pass , String confirmPass)
      {
          FInput.sendKeys(Fname);
          MInput.sendKeys(Mname);
          LInput.sendKeys(Lname);
          EmailInput.sendKeys(email);
          passInput.sendKeys(Pass);
          confirmPas.sendKeys(confirmPass);
          registerBtn.click();
      }




}
