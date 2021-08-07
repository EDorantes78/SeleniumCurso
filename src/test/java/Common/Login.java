package Common;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
    //INSTANCIAS
    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils utils = new SeleniumUtils();
    private WebDriver driver;

    public void miLogin (WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);

        //SE DA CLIC EN EL BOTON SINGIN
        utils.ClickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

        //SE REALIZA DESPLAZAMIENTO DE LA PARTE INFERIOR
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL USUARIO
        utils.ClickButton(elementsLogin.InputUser(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL PASSWORD
        utils.ClickButton(elementsLogin.InputPassword(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputPassword(driver), Config.password);
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(2000);
    }
    public void cerrarSesion (WebDriver driver)
    {
        //NOTA DE ESTUDIO
        /*
        EN CADA CLASE DE FEATURES PODEMOS COLOCAR MULTIPLES FUNCIONALIDADES
        ES INDISPENSABLE CONTAR PRIMERO CON LOS ELEMENTOS WEB
        POR EJEMPLO: DENTRO DE ESTE METODO PODEMOS DESARROLLAR EL PASO A PASO DE CERRAR SESION
         */

    }
    public void olvideCOntrasena (WebDriver driver)
    {

    }

    public void loginIncorrecto (WebDriver driver)
    {

    }
}
