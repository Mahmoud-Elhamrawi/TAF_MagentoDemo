package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P03_changePasswordPage extends PageBase {
    public P03_changePasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Change Password")
    public WebElement ChangePass ;


    @FindBy(id = "current_password")
    public  WebElement currentPassInput;
    @FindBy(id = "password")
    public  WebElement passwordInput;

    @FindBy(id = "confirmation")
    public  WebElement confirmationInput;

    @FindBy(css = " button[title=\"Save\"]")
    public  WebElement BtnSave;


    @FindBy(css = "li[class=\"success-msg\"]")
    public  WebElement successMsg;


    public void changePass(String currPass , String Pass , String confirmPass)
    {
        currentPassInput.sendKeys(currPass);
        passwordInput.sendKeys(Pass);
        confirmationInput.sendKeys(confirmPass);
        BtnSave.click();

    }

}
