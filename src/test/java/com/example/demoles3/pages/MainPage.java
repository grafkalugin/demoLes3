package com.example.demoles3.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.demoles3.pages.components.CalendarComponent;
import com.example.demoles3.pages.components.ModalComponent;
import java.io.File;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://demoqa.com/automation-practice-form/
public class MainPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ModalComponent modalComponent = new ModalComponent();

    public SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
            sexButton = $("#genterWrapper"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesCheckbox = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            selectState = $("#stateCity-wrapper").$(byText("Select State")),
            selectCity = $("#stateCity-wrapper").$(byText("Select City")),
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

    public MainPage setSex(String sex) {
        sexButton.$(byText(sex)).click();
        return this;
    }

    public MainPage setPhoneNum(String phoneNum) {
        userNumber.setValue(phoneNum);
        return this;
    }

    public MainPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public MainPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public MainPage setHobbyCheckbox(String hobby) {
        hobbiesCheckbox.$(byText(hobby)).click();
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

    public MainPage setState(String state) {
        selectState.click();
        $(byText(state)).click();
        return this;
    }

    public MainPage setCity(String city) {
        selectCity.click();
        $(byText(city)).click();
        return this;
    }

    public MainPage sendForm() {
        submit.click();
        return this;
    }

    public MainPage verifyResultsModalAppears() {
        modalComponent.verifyModalAppears();
        return this;
    }

    public MainPage verifyResult(String key, String value) {
        modalComponent.verifyResult(key, value);
        return this;
    }

    public MainPage modalClose() {
        modalClose.click();
        return this;
    }
}
