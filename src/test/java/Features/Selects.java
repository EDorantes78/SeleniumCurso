package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import jdk.jshell.execution.Util;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.print.attribute.ResolutionSyntax;

public class Selects extends BaseTest

{
    //INSTANCIAS
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void listaConClicks () throws Exception
    {
        //SE VALIDA LA PRESENCIA DEL ELEMENTO
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //SE DA CLIC EN ELEMENTO
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver, 3000);

        //SE VALIDA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //SE DA CLIC EN EL ELEMENTO OPCION TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 2000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //SELECCIONAR OPCIONES DE UNA LISTA CON CLIC
        //ESTA OPCION POR BUENAS PRACTICAS NO SE UTILIZA

        //SE VALIDA LA PRESENCIA DEL ELEMENTO LISTA SORT
        Utils.waitElement(driver, elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA SORT
        Utils.ClickButton(elementsSelects.SelectSort(driver));
        //Utils.loading(driver, 2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option [text()='%s']", opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.loading(driver, 3000);

    }

    @Test

    public void listaConSendkeys() throws Exception
    {

        //1 SE VALIDA LA PRESENCIA DEL ELEMENTO TAP WOMAN
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 SE DA CLIC EN ELEMENTO TAP WOMAN
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver, 3000);

        //3 SE VALIDA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 SE DA CLIC EN EL ELEMENTO OPCION TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 2000);

        //5 SE VALIDA LA PRESENCIA DEL ELEMENTO T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //********** MANEJO DE LISTAS CON SENDKEYS *********
        //ESTA OPCION ES ACEPTABLE

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.loading(driver, 2000);

        String opcionEsperada = "Product Name: A to Z";
        elementsSelects.SelectSort(driver).sendKeys(opcionEsperada);
        Utils.loading(driver, 3000);

    }

    @Test
    public void listaUsandoClaseSelect () throws Exception
    {
        //1 SE VALIDA LA PRESENCIA DEL ELEMENTO TAP WOMAN
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 SE DA CLIC EN ELEMENTO TAP WOMAN
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver, 3000);

        //3 SE VALIDA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 SE DA CLIC EN EL ELEMENTO OPCION TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 2000);

        //5 SE VALIDA LA PRESENCIA DEL ELEMENTO T SHIRTS
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //********* MANEJO DE LISTAS CON CLASE SELECT ********
        //OPCION RECOMENDADA

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript( "window.scrollBy (0,350)");
        Utils.loading(driver, 1000);

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.loading(driver, 1000);
        String opcionEsperada = "In stock";
        elementsSelects.SelectSort(driver);
        Select selectLista = new Select(elementsSelects.SelectSort(driver));
        selectLista.selectByVisibleText(opcionEsperada);
        Utils.loading(driver, 2000);

    }

}
