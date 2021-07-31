package Common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestTres
{
    // ******************INSTANCIAS************************
    public static WebDriver driver = null;

    //*****************************************************

    @Before
    public void beforeTestMethod() throws Exception
    {
        driver = Config.navegadorChrome();
        driver.manage().window().maximize();
        driver.get(Config.URL_DRAGANDDROP);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

        @After
        public void afterMethodMethod()
        {

            driver.quit();
        }

}
