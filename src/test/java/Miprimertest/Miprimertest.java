package Miprimertest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miprimertest
{
    private WebDriver driver;
    @Before
    public void setUp()
    {
        //SE COLOCA LA DIRECCIÓN DEL DRIVER, SEA CHROME, MOZILLA O EDGE
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDrivers/chromedriver.exe");

        //CREA LA INSTANCIA DEL NAVEGADOR
        driver = new ChromeDriver();

        //MAXIMIZA EN NAVEGADOR
        driver.manage().window().maximize();

        //ENVIA LA DIRECCION DEL SISTEMA AL NAVEGADOR
        driver.get("https://www.amazon.com.mx/");
    }
    /*
    @Test
    public void testAmazon () throws InterruptedException
    {

        WebElement inputBusqueda = driver .findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("alexa");
        //inputBusqueda.submit();
        WebElement bottontLupa = driver .findElement(By.id("nav-search-submit-button"));
        bottontLupa.click();
        Thread.sleep(4000);
    }
*/

        @Test
        public void usoXpath () throws InterruptedException
    {
        //ESTE XPATH ES ABSOLUTO, POR BUENAS PRACTICAS NO SE DEBE DE UTILIZAR
        /*WebElement bottonCompras = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[3]/div[2]/span[2]"));
        bottonCompras.click();
        Thread.sleep(5000);*/

        //UTILIZANDO XPATH CON TAG (tag: span, img, button, input, select) Y UN ATRIBUTO
        /*WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        buttonCompras.click();
        Thread.sleep(5000);*/

        //UTILIZANDO XPATH POR CONTAINS USANDO "*", EL ASTERISCO SE PUEDE REEMPLAZAR POR EL TAG O TIPO DE ELEMENTO
        /*WebElement cuentaYListas = driver.findElement(By.xpath("//*[contains(text(), 'Cuenta y Listas')]"));
        cuentaYListas.click();
        Thread.sleep(5000);*/

        //USO DE XPATH CON MULTIPLES ATRIBUTOS
        /*WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();*/

        //USO DE XPATH POR RELATIONSHIP
        WebElement inputBusqueda = driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);


    }

    @After
    public void tearDown()
    {

        //CIERA EL NAVEGADOR
        driver.quit();
    }

}
