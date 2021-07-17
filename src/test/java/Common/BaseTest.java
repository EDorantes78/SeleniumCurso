package Common;

import Elements.ElementsLogin;
import Features.Login;
import Utils.SeleniumUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();

    @Before
    public void Login () throws Exception

    {
        //CREAR DRIVER
        driver = Config.navegadorFirefox();

        //MAXIMIZA VENTANA
        driver.manage().window().maximize();

        //LA FUNCION "driver.get", NOS SIRVA PARA MANDAR LA URL AL NAVEGADOR
        driver.get(Config.URL_QA);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //POR MEDIO DEL OBJECT "login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESION
        login.miLogin(driver);

    }

    @After
    public void tearDown()
    {
        //LA FUNCION "driver.quit" NOS SIRVE PARA CERRAR EL NAVEGADOR
        driver.quit();
    }

}
