package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegisterPositiveTest() {

        clickOnLoginLink();
        fillLoginRegisterForm(new User("kristitomash001@gmail.com", "Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignButtonPresent());

    }

    @Test
    public void existedUserRegisterNegativeTest() {

        clickOnLoginLink();
        fillLoginRegisterForm(new User("kristitomash001@gmail.com", "Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());
    }

}




