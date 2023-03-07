package com.example.demoles3;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://demoqa.com/automation-practice-form/
public class MainPage {

    private final String FIRST_NAME = "Aleksandr";// константа
    public SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            sexMale = $("#genterWrapper").$(byText("Male")),
            userNumber = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            dateOfBirthYearSelect = $(".react-datepicker__year-select"),
            dateOfBirthYear1990 = $(".react-datepicker__year-select").$(byText("1990")),
            dateOfBirthMonthSelect = $(".react-datepicker__month-select"),
            dateOfBirthMonthNovember = $(".react-datepicker__month-select").$(byText("November")),
            dateOfBirthDay11 = $(".react-datepicker__day--011"),
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
            modal = $(".modal-body"),
            modalClose = $("#closeLargeModal");


}
