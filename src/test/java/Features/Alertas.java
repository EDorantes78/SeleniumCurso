package Features;

import Common.BaseTest;
import Utils.SeleniumUtils;
import jdk.jshell.execution.Util;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertas extends BaseTest
{
    //********* INSTANCIAS **********
    WebDriverWait wait;
    SeleniumUtils utils = new SeleniumUtils();

    @Test
    public void alerts ()throws Exception
    {
        // INSTANCIA DE OBJETO JAVASCRIPT
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // ACEPTAR ALERTA
        js.executeScript("alert('UN MENSAJE PARA EL AMIGO RAUL QUE VIENE LLEGANDO');");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        utils.loading(driver, 1000);
        /*driver.switchTo().alert().accept();
        utils.loading(driver, 1000);
*/
        // DISMIS ALERTA --> LO QUE HACE ESTA FUNCION ES CANCELAR LAS ALERTAS, SE CUMPLE CUADO EXISTEN LOS BOTONES CANCELAR, NO, SALIR
        String Alert = driver.switchTo().alert().getText();
        System.out.println("EL TEXTO ES: " + Alert);
        driver.switchTo().alert().dismiss();

    }

}
