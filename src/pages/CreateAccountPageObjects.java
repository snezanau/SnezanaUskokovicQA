package pages;

import org.openqa.selenium.By;

public class CreateAccountPageObjects {
    public static By createAccoutnTittle = By.xpath("//span[contains(text(),'Create New Customer Account')]");
    public static By personalInfoTitle = By.xpath("//span[contains(text(),'Personal Information')]");
    public static By firstNameField = By.id("firstname");
    public static By lastNameField = By.id("lastname");
    public static By emailField = By.id("email_address");
    public static By passwordField = By.id("password");
    public static By confirmPasswordField = By.id("password-confirmation");
    public static By createAccountButton = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
    public static String firstName = "Test";
    public static String lastName = "Test";
    public static String email = "code.test1234@gmail.com";
    public static String password = "CodeTest1234";


}

