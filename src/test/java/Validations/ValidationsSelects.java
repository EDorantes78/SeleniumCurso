package Validations;

import Elements.ElementsSelects;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ValidationsSelects
{
    ElementsSelects elementsSelects = new ElementsSelects();

    public WebElement ValTapWomen(WebDriver driver)
    {
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        try
        {
            elementsSelects.TapWoman(driver).isDisplayed();
            {
                return fWait.until(ExpectedConditions.presenceOfElementLocated(elementsSelects.byTapWoman));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new NoSuchElementException("NoSuchElementException: Locator Not found" + elementsSelects.TapWoman(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelects.TapWoman(driver));
        }
    }

    public WebElement ValBotonMasTop(WebDriver driver) {
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        try
        {
            elementsSelects.BottonMasTops(driver).isDisplayed();
            {
                return fWait.until(ExpectedConditions.presenceOfElementLocated(elementsSelects.bybottonMasTops));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new NoSuchElementException("NoSuchElementException: Locator Not found" + elementsSelects.BottonMasTops(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelects.BottonMasTops(driver));
        }
    }

    public WebElement BotonMasTShirts(WebDriver driver) {
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        try
        {
            elementsSelects.BottonTSshirts(driver).isDisplayed();
            {
                return fWait.until(ExpectedConditions.presenceOfElementLocated(elementsSelects.bybottonTSshirts));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new NoSuchElementException("NoSuchElementException: Locator Not found" + elementsSelects.BottonTSshirts(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelects.BottonTSshirts(driver));
        }
    }

    public WebElement ValListaDesplegable(WebDriver driver)
    {
        Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        try
        {
            elementsSelects.SelectSort(driver).isDisplayed();
            {
                return fWait.until(ExpectedConditions.presenceOfElementLocated(elementsSelects.bySelectSort));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new NoSuchElementException("NoSuchElementException: Locator Not found" + elementsSelects.SelectSort(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelects.SelectSort(driver));
        }
    }
}