package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTestTres
{
    // ******************INSTANCIAS************************
    public static WebDriver driver = null;

    //*****************************************************

    @BeforeTest
    public void beforeTestMethod() throws Exception
    {
        driver = Config.navegadorChrome();
        driver.manage().window().maximize();
        driver.get(Config.URL_DRAGANDDROP);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void afterMethodMethod()
    {

        driver.quit();
    }

}
