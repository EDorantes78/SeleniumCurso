package Common;

import Elements.ElementsLogin;
import Features.Login;
import Utils.SeleniumUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest
{
    //***********INSTANCIAS************
    public static WebDriver driver = null;
    Login login = new Login();

    @Before
    public void Login (WebDriver driver) throws Exception

    {
        //Crear driver
        driver = Config.navegadorChrome();

        //MAXIMIZA VENTANA
        driver.manage().window().maximize();

        //LA FUNCION "driver.get", NOS SIRVA PARA MANDAR LA URL AL NAVEGADOR
        driver.get(Config.URL_QA);

        //POR MEDIO DEL OBJECT "login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESION
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
        //LA FUNCION "driver.quit" NOS SIRVE PARA CERRAR EL NAVEGADOR
        driver.quit();
    }

}
