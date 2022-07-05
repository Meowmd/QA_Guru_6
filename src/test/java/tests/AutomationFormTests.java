package tests;

import org.junit.jupiter.api.Test;


public class AutomationFormTests extends TestBase {

    @Test
    void successfulTest() {

        registrationFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.phone)
                .setDateOfBirth(testData.month, testData.year, testData.day)
                .setHobbies(testData.hobby)
                .setSubject(testData.subject)
                .uploadFile("src/test/resources/img/1.png")
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .submitForm()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phone)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.picture)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}
