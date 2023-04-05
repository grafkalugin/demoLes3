package com.example.demoles3.tests;

import com.example.demoles3.pages.MainPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.*;
import static com.example.demoles3.tests.TestData.*;
import static com.example.demoles3.utils.RandomUtils.*;
public class MainPageTest extends TestMain {

    MainPage mainPage = new MainPage();
    Faker faker = new Faker();

    @Test
    public void positiveRegistrationTest() {

        String userFirstNameFaker = faker.name().firstName();
        String userLastNameFaker = faker.name().lastName();
        String userEmailFaker = faker.internet().emailAddress();
        String userPhoneNumber = "8" + faker.phoneNumber().subscriberNumber(9);
        String userCurrentAddressFaker = faker.address().fullAddress();
        String userSex = faker.demographic().sex();
        String userBirthYear = String.valueOf(faker.number().numberBetween(1960, 2005));
        String userBirthMonth = getRandomValue(months);
        String userBirthDay = String.format("%02d", faker.number().numberBetween(1, 28));
        String userSubjects = getRandomValue(subjects);
        String userHobby = getRandomValue(hobby);
        String userState = getRandomValue(state);
        String userCity = getRandomCity(userState);

        mainPage.setFirstName(userFirstNameFaker)
                .setLastName(userLastNameFaker)
                .setEmail(userEmailFaker)
                .setSex(userSex)
                .setPhoneNum(userPhoneNumber)
                .setBirthDate(userBirthDay, userBirthMonth, userBirthYear)
                .setSubjects(userSubjects)
                .setHobbyCheckbox(userHobby)
                .uploadFile(userFilePath)
                .setCurrentAddress(userCurrentAddressFaker)
                .setState(userState)
                .setCity(userCity)
                .sendForm();

        mainPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userFirstNameFaker + " " + userLastNameFaker)
                .verifyResult("Student Email", userEmailFaker)
                .verifyResult("Gender", userSex)
                .verifyResult("Mobile", userPhoneNumber)
                .verifyResult("Date of Birth", userBirthDay + " "+ userBirthMonth + "," + userBirthYear)
                .verifyResult("Hobbies", userHobby)
                .verifyResult("Subjects", userSubjects)
                .verifyResult("Address", userCurrentAddressFaker)
                .verifyResult("Picture", userFileName)
                .verifyResult("State and City", userState + " " + userCity);
        mainPage.modalClose();
    }

    @Tag("simple")
    @Test
    public void simpleTest(){
        Assertions.assertTrue(true);
    }

}