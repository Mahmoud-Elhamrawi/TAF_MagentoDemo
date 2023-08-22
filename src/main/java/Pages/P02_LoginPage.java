package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P02_LoginPage extends PageBase{
    public P02_LoginPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(id = "email")
    public WebElement emailinput ;

    @FindBy(id = "pass")
     public  WebElement PassInput ;
     @FindBy(css = "button[title=\"Login\"]")
     public  WebElement loginBtn ;

    @FindBy(css = "p[class=\"hello\"]")
    public  WebElement loginsecess;


     public void fillData(String email , String pass)
     {
         emailinput.sendKeys(email);
         PassInput.sendKeys(pass);
         loginBtn.click();
     }

}


