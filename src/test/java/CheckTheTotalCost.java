import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.BrowserActions;

public class CheckTheTotalCost extends BaseTest {
    @Test
    public void verifyTheTotalCost(){
        homePage = new HomePage(driver);
        homePage.clickOnShopLink();

        shopPage = new ShopPage(driver);
        try {
            shopPage.selectAProduct();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        productPage = new ProductPage(driver);
        productPage.selectProductColor();
        productPage.hoverOnBox();
        productPage.clickOnUpArrow();
        productPage.clickOnAddToCart();

        cartPage = new CartPage(driver);
        cartPage.clickOnViewCart();

        checkOutPage = new CheckOutPage(driver);

        softAssert = new SoftAssert();
        softAssert.assertEquals(checkOutPage.checkTotal(),"C$75.00");
        softAssert.assertAll();
    }
}
