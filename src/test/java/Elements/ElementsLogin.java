package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //ELEMENTO BOTON SIGNIN
    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSignin);
        return buttonSignin;
    }

    //ELEMENTO INPUT USUARIO
    public By byInputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement InputUser = driver.findElement(byInputUser);
        return InputUser;
    }

    //ELEMENTO INPUT PASSWORD
    public By byInputPassword = By.id("password");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement InputPassword = driver.findElement(byInputPassword);
        return InputPassword;
    }

}
