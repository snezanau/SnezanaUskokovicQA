package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunLogOut {
    public static void logOut (WebDriver driver, WebDriverWait wait){

        driver.findElement(HomePageObjects.accountMenu).click();
        driver.findElement(HomePageObjects.signOutButton).click();
        driver.findElement(HomePageObjects.signOutMessage).isDisplayed();
        String signOutMessage = driver.findElement(HomePageObjects.signOutMessage).getText();
        Assert.assertEquals(signOutMessage,"You are signed out");




    }
}
