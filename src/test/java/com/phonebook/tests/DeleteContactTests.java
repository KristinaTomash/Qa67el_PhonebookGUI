package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User("kristitomash001@gmail.com", "Aa12345!"));
        clickOnLoginButton();

        clickOnAddLink();
        fillContactForm("Oliver", "Koen", "1234567890", "test@gmail.com", "TelAviv", "QA");
        clickOnSaveButton();
    }
    @Test
    public void deleteContactTest(){
        int sizeBefore = sizeOfContacts();

        removeContact();
        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);

    }


}
