package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestCaseBase {
   SoftAssert softAssert =new SoftAssert();
   public static WebDriver driver ;
    @BeforeClass
    public void OpenBrowser(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("http://live.techpanda.org/index.php/");

    }


    @AfterClass
    public void QuitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
