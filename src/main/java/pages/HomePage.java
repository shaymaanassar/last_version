package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserActions;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
         this.driver = driver;
    }
    String shopLinkLocator = "//li[@id=\"comp-iy4cwgmq1\"]//a[@data-testid=\"linkElement\"]";
    By shopLink = By.xpath(shopLinkLocator);
    public void clickOnShopLink(){
        BrowserActions.clickOn(shopLink,driver);
    }
}
