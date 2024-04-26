import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.DriverSetUp;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    ShopPage shopPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    SoftAssert softAssert;
    @BeforeMethod
    public void setUpTheDriver(){
        driver = DriverSetUp.setUpDriver("chrome");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
