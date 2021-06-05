package Common;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    private WebDriver driver = null;
    private WebDriverWait wait = null;

    @Before
    public void Login () throws Exception
    {
        //CREAR DRIVER
        driver = Config.navegadorChrome();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();

        //LOGIN
        driver.get(Config.URL_QA);


    }

}
