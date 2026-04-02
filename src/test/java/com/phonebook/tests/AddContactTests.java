package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User("kristitomash001@gmail.com", "Aa12345!"));
        clickOnLoginButton();
    }
    @Test
    public void addContactPositiveTest(){
          
        clickOnAddLink();
        fillContactForm("Oliver", "Koen", "1234567890", "test@gmail.com", "TelAviv", "QA");
        clickOnSaveButton();
        Assert.assertTrue(isContactCreatedByText("Oliver"));

    }

    @AfterMethod
    public void postConditions(){
        removeContact();
    }

}
