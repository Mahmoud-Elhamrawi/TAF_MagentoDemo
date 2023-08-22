package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver ;
    public  PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clicking(WebElement btn)
    {
       btn.click();

    }

    public void enterTxt(WebElement ele , String txt)
    {
        ele.sendKeys(txt);
    }





}
