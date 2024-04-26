package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.BrowserActions;

import java.util.Set;

public class CartPage extends HomePage {
    public CartPage(WebDriver driver){
        super(driver);
    }
    public void clickOnViewCart(){
        int frameIndex = 1;
        driver.switchTo().frame(frameIndex);
        String viewCartLocator = "//a[@id=\"widget-view-cart-button\"]";
        By viewCart=By.xpath(viewCartLocator);
        BrowserActions.clickOn(viewCart,driver);
        driver.switchTo().defaultContent();
    }
}
