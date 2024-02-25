package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunLogIn {
    
    public static void  validLogIn (WebDriver driver, WebDriverWait wait) {


        driver.findElement(HomePageObjects.signIn).click();
        driver.findElement(SignInPageObject.emailField).sendKeys(CreateAccountPageObjects.email);
        driver.findElement(SignInPageObject.passworField).sendKeys(CreateAccountPageObjects.password);
        driver.findElement(SignInPageObject.signInButton).click();





    }
}


