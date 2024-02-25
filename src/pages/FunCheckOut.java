package pages;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunCheckOut {
    public static void checkOut (WebDriver driver, WebDriverWait wait) throws InterruptedException {

        WhatsNewPLP plp = new WhatsNewPLP();

        driver.findElement(HomePageObjects.whatsNew).click();
        driver.findElement(plp.whatsNewHeder);
        String whatsNewHeader = "What's New";
        Assert.assertEquals(whatsNewHeader, "What's New");
        driver.findElement(plp.productOne).click();
        driver.findElement(PDPZipperSweatshirt.productTitle);
        String productTitle = "Phoebe Zipper Sweatshirt";
        Assert.assertEquals(productTitle,"Phoebe Zipper Sweatshirt");
        driver.findElement(PDPZipperSweatshirt.productPrice);
        String productPrice = "$59.00";
        Assert.assertEquals(productPrice,"$59.00");
        driver.findElement(PDPZipperSweatshirt.productSizeM).click();
        driver.findElement(PDPZipperSweatshirt.productColourTwo).click();
        driver.findElement(PDPZipperSweatshirt.addToCartButton).click();
        Thread.sleep(2000);
        driver.findElement(PDPZipperSweatshirt.yourCartButton).click();
        driver.findElement(PDPZipperSweatshirt.checkOutButton).click();
        driver.findElement(CheckOutPageObjects.firstNameField).sendKeys(CreateAccountPageObjects.firstName);
        driver.findElement(CheckOutPageObjects.lastNameField).sendKeys(CreateAccountPageObjects.lastName);
        driver.findElement(CheckOutPageObjects.companyNameField).sendKeys(CheckOutPageObjects.companyName);
        driver.findElement(CheckOutPageObjects.streetAddresField).sendKeys(CheckOutPageObjects.streetAdress);
        driver.findElement(CheckOutPageObjects.cityField).sendKeys(CheckOutPageObjects.cityName);
        driver.findElement(CheckOutPageObjects.postalCodeField).sendKeys(CheckOutPageObjects.postalCode);
        driver.findElement(CheckOutPageObjects.phoneNumberField).sendKeys(CheckOutPageObjects.phoneNumber);
        driver.findElement(CheckOutPageObjects.shippingMetod).click();
        driver.findElement(CheckOutPageObjects.nextButton).click();
        driver.findElement(CheckOutPageObjects.placeOrderButton).click();
        driver.findElement(CheckOutPageObjects.thankYouMessage);
        String thankYouMessage = "Thank you for your purchase!";
        Assert.assertEquals(thankYouMessage,"Thank you for your purchase!");












    }
}


