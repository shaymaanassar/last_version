package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {
    public static int timeOutInSeconds = 10;
    public static void sendKeys(By element,WebDriver driver,String text){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(text);
    }
    public static String getText(By element2,WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element2));
        return driver.findElement(element2).getText();
    }
    public static void clickOn(By clickableElement,WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(clickableElement));
        driver.findElement(clickableElement).click();
    }

}
