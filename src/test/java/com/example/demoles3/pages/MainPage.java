package com.example.demoles3.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.demoles3.pages.components.CalendarComponent;
import com.example.demoles3.pages.components.ModalComponent;
import java.io.File;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://demoqa.com/automation-practice-form/
public class MainPage {
    CalendarComponent cc = new CalendarComponent();
    ModalComponent mc = new ModalComponent();

    public SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            sexMale = $("#genterWrapper").$(byText("Male")),
            userNumber = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesCheckboxSports = $("#hobbiesWrapper").$(byText("Sports")),
            hobbiesCheckboxReading = $("#hobbiesWrapper").$(byText("Reading")),
            hobbiesCheckboxMusic = $("#hobbiesWrapper").$(byText("Music")),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            selectState = $("#stateCity-wrapper").$(byText("Select State")), //stateCity-wrapper
            selectStateNCR = $(byText("NCR")),
            selectCity = $("#stateCity-wrapper").$(byText("Select City")),
            selectCityDelhi = $(byText("Delhi")),
            submit = $("#submit"),
            modalClose = $("#closeLargeModal");

    public MainPage setFirstName(String fName) {
        firstName.sendKeys(fName);
        return this;
    }

    public MainPage setLastName(String lName) {
        lastName.sendKeys(lName);
        return this;
    }

    public MainPage setEmail(String email) {
        userEmail.setValue(email);
        return this;
    }

    public MainPage setSexMale() {
        sexMale.click();
        return this;
    }

    public MainPage setPhoneNum(String phoneNum) {
        userNumber.setValue(phoneNum);
        return this;
    }

    public MainPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        cc.setDate(day, month, year);
        return this;
    }

    public MainPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public MainPage setAllHobbiesCheckbox() {
        hobbiesCheckboxSports.click();
        hobbiesCheckboxReading.click();
        hobbiesCheckboxMusic.click();

        return this;
    }

    public MainPage uploadFile(String filepath) {
        uploadPicture.uploadFile(new File(filepath));
        return this;
    }

    public MainPage setCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    public MainPage setStateNCR() {
        selectState.click();
        selectStateNCR.click();
        return this;
    }

    public MainPage setCityDelhi() {
        selectCity.click();
        selectCityDelhi.click();
        return this;
    }

    public MainPage sendForm() {
        submit.click();
        return this;
    }

    public MainPage verifyResultsModalAppears() {
        mc.verifyModalAppears();
        return this;
    }

    public MainPage verifyResult(String key, String value) {
        mc.verifyResult(key, value);
        return this;
    }

    public MainPage modalClose() {
        modalClose.click();
        return this;
    }
}
