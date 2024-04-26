package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserActions;

public class CheckOutPage extends HomePage{
    public CheckOutPage(WebDriver driver){
        super(driver);
    }
    By totalCost = By.xpath("//dd[@data-hook=\"Total.formattedValue\"]");
    public String checkTotal(){
        return BrowserActions.getText(totalCost,driver);
    }

}
