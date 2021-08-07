package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();

    @BeforeTest
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

    @AfterTest
    public void tearDown()
    {
        //LA FUNCION "driver.quit" NOS SIRVE PARA CERRAR EL NAVEGADOR
        driver.quit();
    }

}
