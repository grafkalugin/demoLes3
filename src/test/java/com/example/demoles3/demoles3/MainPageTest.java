package com.example.demoles3.demoles3;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {

        open("/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
    }

    @Test
    public void inputAllData() {
        mainPage.firstName.sendKeys("Sasha");
        mainPage.lastName.sendKeys("Kalugin");
        mainPage.userEmail.setValue("name@mail.com");
        mainPage.sexMale.click();
        mainPage.userNumber.setValue("1234567890");
        mainPage.dateOfBirthInput.click();
        mainPage.dateOfBirthYearSelect.click();
        mainPage.dateOfBirthYear1990.click();
        mainPage.dateOfBirthMonthSelect.click();
        mainPage.dateOfBirthMonthNovember.click();
        mainPage.dateOfBirthDay11.click();
        mainPage.subjectsInput.setValue("Maths").pressEnter();
        mainPage.hobbiesCheckboxSports.click();
        mainPage.hobbiesCheckboxReading.click();
        mainPage.hobbiesCheckboxMusic.click();
        mainPage.uploadPicture.uploadFile(new File("/Users/sunlab/Pictures/Monosnap/2023-02-25-14-10-52-h00g7.jpg"));
        mainPage.currentAddress.setValue("currentAddressText");
        //actions().moveToElement().click();
        mainPage.selectState.click();
        mainPage.selectStateNCR.click();
        mainPage.selectCity.click();
        mainPage.selectCityDelhi.click();
        mainPage.submit.click();
        mainPage.modal.shouldHave(text("Sasha"))
                .shouldHave(text("Kalugin"))
                .shouldHave(text("name@mail.com"))
                .shouldHave(text("Male"))
                .shouldHave(text("1234567890"))
                .shouldHave(text("11 November,1990"))
                .shouldHave(text("Sports"))
                .shouldHave(text("Reading"))
                .shouldHave(text("Music"))
                .shouldHave(text("Maths"))
                .shouldHave(text("currentAddressText"));
        mainPage.modalClose.click();
    }
}