package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends  PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a[data-target-element=\"#header-account\"]")
    public WebElement MyAccountLink ;



    @FindBy(css = "a[href=\"http://live.techpanda.org/index.php/customer/account/create/\"]")
    public  WebElement registerLink ;

    @FindBy(css = "a[href=\"http://live.techpanda.org/index.php/customer/account/login/\"]")
    public  WebElement loginLink;



}
