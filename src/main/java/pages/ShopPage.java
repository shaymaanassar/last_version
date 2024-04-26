package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class ShopPage extends HomePage{
    public ShopPage(WebDriver driver){
        super(driver);
    }
    public void selectAProduct ()throws InterruptedException{
        int timeOut = 5000;
        String selectedItemLocator = "//ul[@data-hook=\"product-list-wrapper\"]/li[4]//a[@data-hook=\"product-item-product-details-link\"]";
        WebElement link = driver.findElement(By.xpath(selectedItemLocator));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView( {behavior: 'auto', block: 'center', inline: 'nearest'} );",link);
        Thread.sleep(timeOut);
        link.click();
    }
}
