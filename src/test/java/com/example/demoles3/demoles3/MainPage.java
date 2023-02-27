package com.example.demoles3.demoles3;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://demoqa.com/automation-practice-form/
public class MainPage {
    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement userEmail = $("#userEmail");
    public SelenideElement sexMale = $("#genterWrapper").$(byText("Male"));
    public SelenideElement userNumber = $("#userNumber");
    public SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    public SelenideElement dateOfBirthYearSelect = $(".react-datepicker__year-select");
    public SelenideElement dateOfBirthYear1990 = $(".react-datepicker__year-select").$(byText("1990"));
    public SelenideElement dateOfBirthMonthSelect = $(".react-datepicker__month-select");
    public SelenideElement dateOfBirthMonthNovember = $(".react-datepicker__month-select").$(byText("November"));
    public SelenideElement dateOfBirthDay11 = $(".react-datepicker__day--011");
    public SelenideElement subjectsInput = $("#subjectsInput");
    public SelenideElement hobbiesCheckboxSports = $("#hobbiesWrapper").$(byText("Sports"));
    public SelenideElement hobbiesCheckboxReading = $("#hobbiesWrapper").$(byText("Reading"));
    public SelenideElement hobbiesCheckboxMusic = $("#hobbiesWrapper").$(byText("Music"));
    public SelenideElement uploadPicture = $("#uploadPicture");
    public SelenideElement currentAddress = $("#currentAddress");
    public SelenideElement selectState = $("#stateCity-wrapper").$(byText("Select State")); //stateCity-wrapper
    public SelenideElement selectStateNCR = $(byText("NCR"));
    public SelenideElement selectCity = $("#stateCity-wrapper").$(byText("Select City"));
    public SelenideElement selectCityDelhi = $(byText("Delhi"));
    public SelenideElement submit = $("#submit");
    public SelenideElement modal = $(".modal-body");
    public SelenideElement modalClose = $("#closeLargeModal");
}
