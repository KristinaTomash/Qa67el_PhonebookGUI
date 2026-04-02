package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
       
        clickOnLoginLink();
        fillLoginRegisterForm(new User("kristitomash001@gmail.com", "Aa12345!"));
        clickOnLoginButton();
        Assert.assertTrue(isSignButtonPresent());

        }
        @Test
    public void loginNegativeWithoutEmailTest(){

        clickOnLoginLink();
        fillLoginRegisterForm("Aa12345!");
        clickOnLoginButton();
        Assert.assertTrue(isSignButtonPresent());

        }

}

