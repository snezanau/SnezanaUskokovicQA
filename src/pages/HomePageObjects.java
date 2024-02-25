package pages;

import org.openqa.selenium.By;

public class HomePageObjects {
    
    
        public static By homePageLogo = By.xpath("//header/div[2]/a[1]/img[1]");
        public static By searchField = By.id("search");
        public static By yourCart = By.xpath("//header/div[2]/div[1]/a[1]");
        public static By signIn = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
        public static By createAccount = By.xpath("//header/div[1]/div[1]/ul[1]/li[3]/a[1]");
        public static By whatsNew = By.xpath("//span[contains(text(),\"What's New\")]");
        public static By womenMenu = By.xpath("//span[contains(text(),'Women')]");
        public static By menMenu = By.xpath("//span[contains(text(),'Men')]");
        public static By gearMenu = By.xpath("//span[contains(text(),'Gear')]");
        public static By traningMenu = By.xpath("//span[contains(text(),'Training')]");
        public static By saleMenu = By.xpath("//span[contains(text(),'Sale')]");
        public static By hotSellersTitle = By.xpath("//h2[contains(text(),'Hot Sellers')]");
        public static By hotSellersProductOne = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[1]");
        public static By hotSellersProductTwo = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[2]");
        public static By hotSellersProductThree = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[3]");
        public static By hotSelleresProductFour = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[4]");
        public static By hotSelleresProductFive = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[5]");
        public static By hotSelleresProductSix = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[6]");
        public static By accountMenu = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]");
        public static By signOutButton = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]");
        public static By signOutMessage = By.xpath("//span[contains(text(),'You are signed out')]");
    
    
    
    
    
    
    }

