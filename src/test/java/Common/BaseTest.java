package Common;

import Elements.ElementsLogin;
import Features.Login;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BaseTest
{
    //***********INSTANCIAS************
    public static WebDriver driver = null;
    Login login = new Login();
    ElementsLogin elementsLogin= new ElementsLogin();

    @Before
    public void Login () throws Exception

    {
        //Crear driver
        driver = Config.navegadorChrome();
        driver.manage().window().maximize();
        driver.get(Config.URL_QA);
        login.miLogin(driver);

        //IMPLICIT WAIT
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //EXPLICIT WAIT
        //EXPLICITS: WebDriverWait y Thread.Sleep();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.byButtonSignin));

        //FLUENT WAIT
        /*Wait <WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement btnSingin = fwait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return driver.findElement(elementsLogin.byButtonSignin);
            }
        });

        Assert.assertTrue(driver.findElement(elementsLogin.byButtonSignin).isDisplayed());
*/

    }

    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }

}
