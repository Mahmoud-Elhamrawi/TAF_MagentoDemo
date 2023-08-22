package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P04_SearchPage extends PageBase{
    public P04_SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search")
    public WebElement searchInput ;


    @FindBy(css = "li[title=\"mobile phone\"]")
    public List <WebElement> autocompelteliOptin;



    @FindBy(css = "li[class=\"search\"]")
    public  WebElement assertvalue ;





    public void  searchItem(String key) throws InterruptedException {
        searchInput.sendKeys(key);
        Thread.sleep(2000);
         autocompelteliOptin.get(0).click();


    }

}
