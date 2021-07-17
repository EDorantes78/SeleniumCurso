package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import jdk.jshell.execution.Util;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        Utils.waitElement(driver, elementsSelects.TapWoman(driver), elementsSelects.byTapWoman);

        //SE DA CLIC EN ELEMENTO
        Utils.ClickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver, 3000);

        //SE VALIDA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        Utils.waitElement(driver, elementsSelects.BottonMasTops(driver), elementsSelects.bybottonMasTops);

        //SE DA CLIC EN EL ELEMENTO OPCION TOPS
        Utils.ClickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 2000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO T SHIRTS
        Utils.waitElement(driver, elementsSelects.BottonTSshirts(driver), elementsSelects.bybottonTSshirts);

        //SE DA CLIC EN EL ELEMENTO T SHIRTS
        Utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //SELECCIONAR OPCIONES DE UNA LISTA CON CLIC
        //ESTA OPCION POR BUENAS PRACTICAS NO SE UTILIZA

        //SE VALIDA LA PRESENCIA DEL ELEMENTO LISTA SORT
        Utils.waitElement(driver, elementsSelects.SelectSort(driver), elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA SORT
        Utils.ClickButton(elementsSelects.SelectSort(driver));
        Utils.loading(driver, 2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option [text()='%s']", opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.loading(driver, 3000);



    }

}
