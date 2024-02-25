package pages;

import org.openqa.selenium.*;

public class CheckOutPageObjects {
    
        public static By firstNameField = By.id("QLRDK0E");
        public static By lastNameField = By.id("GFAHY25");
        public static By companyNameField = By.id("YPQGF6M");
        public static By streetAddresField = By.id("QYONWDX");
        public static By cityField = By.id("T5ED4CC");
        public static By postalCodeField = By.id("F15M5BG");
        public static By countryField = By.id("HO8FSVW");
        public static By phoneNumberField = By.id("H96AK17");
        public static By shippingMetod = By.xpath("//tbody/tr[1]/td[1]/input[1]");
        public static By nextButton = By.xpath("//span[contains(text(),'Next')]");
        public static By priceTotal = By.xpath("//tbody/tr[3]/td[1]/strong[1]/span[1]");
        public static By placeOrderButton = By.xpath("//span[contains(text(),'Place Order')]");
        public static By thankYouMessage = By.xpath("//span[contains(text(),'Thank you for your purchase!')]");
        public static String companyName = "CT";
        public static String streetAdress = "Testing 12";
        public static String cityName = "Belgrade";
        public static String postalCode = "11000";
        public static String phoneNumber = "023658555";
    
    
    
    }
    

