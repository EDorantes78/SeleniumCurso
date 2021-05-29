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
    @After
    public void tearDown()
    {

        //CIERA EL NAVEGADOR
        driver.quit();
    }

}
