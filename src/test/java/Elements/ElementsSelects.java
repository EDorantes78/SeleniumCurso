package Elements;

import Common.BaseTest;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsSelects
{
    //ELEMENT TAP WOMEN
    public By byTapWoman = By.xpath("//a[@title='Women']");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    //ELEMENT BOTON MAS TOPS
    public By bybottonMasTops = By.xpath("//div/ul/li[1]/span[@class='grower CLOSE'] ");
    public WebElement BottonMasTops (WebDriver driver)
    {
        WebElement bottonMasTops = driver.findElement(bybottonMasTops);
        return bottonMasTops;
    }

    //ELEMENT BOTON T-SHIRTS
    public By bybottonTSshirts = By.xpath("//div/ul/li[1]/ul/li[1]/a[contains(text(), 'T-shirts')]");
    public WebElement BottonTSshirts (WebDriver driver)
    {
        WebElement bottonTSshirts = driver.findElement(bybottonTSshirts);
        return bottonTSshirts;
    }

    //ELEMENT LISTA DESPLEGABLE
    public By bySelectSort = By.id("selectProductSort");
    public WebElement SelectSort (WebDriver driver)
    {
        WebElement selectSort = driver.findElement(bySelectSort);
        return selectSort;
    }





}
