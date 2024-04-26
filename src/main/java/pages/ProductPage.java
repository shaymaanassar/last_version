package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class ProductPage extends HomePage{
    public ProductPage(WebDriver driver){
        super(driver);
    }
    By productColor = By.xpath("(//div[@class=\"sjptQsf\"])[1]");
    By upArrow = By.xpath("//span[@data-hook=\"number-input-spinner-up-arrow\"]");
    String cartLocator = "//button[@data-hook=\"add-to-cart\"]";
    By addToCart = By.xpath(cartLocator);
    public void selectProductColor(){
        BrowserActions.clickOn(productColor,driver);
    }
    public void hoverOnBox(){
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,BrowserActions.timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"NXasVK\"]")));
        driver.findElement(By.xpath("//div[@class=\"NXasVK\"]"));
        actions.moveToElement(driver.findElement(By.xpath("//div[@class=\"NXasVK\"]"))).perform();
    }
    public void clickOnUpArrow(){
        int iterations = 2;
        for(int i=0; i < iterations; i++){
            BrowserActions.clickOn(upArrow,driver);
        }
    }
    public void clickOnAddToCart(){
        BrowserActions.clickOn(addToCart,driver);
    }
}
