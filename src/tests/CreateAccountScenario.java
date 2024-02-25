package tests;

import org.junit.Test;

import pages.FunCreateAccount;

public class CreateAccountScenario extends BaseTest {


    @Test

    public void createAccountTest (){

        FunCreateAccount.createAccount(driver,wait);



    }

}
