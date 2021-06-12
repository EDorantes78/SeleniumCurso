package TareaI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea

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
        driver.get("http://automationpractice.com/index.php");
    }
   @Test
    public void logIn () throws InterruptedException
    {
        Thread.sleep(3000);
        WebElement buttonLogin = driver.findElement(By.className("login"));
        buttonLogin.click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(3000);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("test.0@test.com");
        WebElement inputPassword = driver.findElement(By.id("passwd"));
        inputPassword.sendKeys("test1234");
        WebElement buttonSignIn = driver. findElement(By.name("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(3000);

    }

    @After
    public void tearDown()
    {

        //CIERA EL NAVEGADOR
        driver.quit();
    }

}
