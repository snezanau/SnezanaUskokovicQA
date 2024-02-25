package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunCreateAccount {
    public static void createAccount (WebDriver driver, WebDriverWait wait){


        driver.findElement(HomePageObjects.createAccount).click();
        String createAccoutMessage = driver.findElement(CreateAccountPageObjects.createAccoutnTittle).getText();
        Assert.assertEquals(createAccoutMessage,"Create New Customer Account");
        driver.findElement(CreateAccountPageObjects.firstNameField).sendKeys(CreateAccountPageObjects.firstName);
        driver.findElement(CreateAccountPageObjects.lastNameField).sendKeys(CreateAccountPageObjects.lastName);
        driver.findElement(CreateAccountPageObjects.emailField).sendKeys(CreateAccountPageObjects.email);
        driver.findElement(CreateAccountPageObjects.passwordField).sendKeys(CreateAccountPageObjects.password);
        driver.findElement(CreateAccountPageObjects.confirmPasswordField).sendKeys(CreateAccountPageObjects.password);
        driver.findElement(CreateAccountPageObjects.createAccountButton).click();



    }
}
