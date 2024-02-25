package tests;

import org.junit.Test;

import pages.FunLogIn;
import pages.FunLogOut;

public class LogOutScenario extends BaseTest {
    @Test

    public void logOutTest (){

        FunLogIn.validLogIn(driver,wait);
        FunLogOut.logOut(driver,wait);



    }


}
