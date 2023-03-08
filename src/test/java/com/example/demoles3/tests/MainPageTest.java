package com.example.demoles3.tests;

import com.example.demoles3.pages.MainPage;
import org.junit.jupiter.api.*;

public class MainPageTest extends TestMain {
    MainPage mainPage = new MainPage();

    @Test
    public void inputAllData() {
        mainPage.setFirstName("Sasha")
                .setLastName("Kalugin")
                .setEmail("name@mail.com")
                .setSex("Male")
                .setPhoneNum("1234567890")
                .setBirthDate("11", "November", "1990")
                .setSubjects("Maths")
                .setHobbyCheckbox("Sports")
                .uploadFile("src/test/resources/images/Yachting.jpg")
                .setCurrentAddress("currentAddressText")
                .setState("NCR")
                .setCity("Delhi")
                .sendForm();

        mainPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Sasha Kalugin")
                .verifyResult("Student Email", "name@mail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "1234567890")
                .verifyResult("Date of Birth", "11 November,1990")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Subjects", "Maths")
                .verifyResult("Address", "currentAddressText")
                .verifyResult("Picture", "Yachting")
                .verifyResult("State and City", "NCR Delhi");
        mainPage.modalClose();
    }

}