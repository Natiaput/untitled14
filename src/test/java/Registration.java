import StepObject.RegistrationStep;
import Utils.BrowserAction;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationData.*;

public class Registration extends BrowserAction {

    @Test
    public void RegistrationWithCorrectData() {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(correctpasswordData);
        step1.password1FieldActions(correctpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        String generatedOTP = openBrowser();
        step1.enterOTPFieldActions(generatedOTP);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        // softAssert.assertAllgit();
    }

    @Test
    public void RegistrationWithinCorrectData() throws InterruptedException {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(incorrectpasswordData);
        step1.password1FieldActions(correctpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშNული ველები!");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშNული ველები!");

        softAssert.assertAll();
    }

    private boolean isErrorMessageDisplayed() {

        return true;
    }

    private boolean isRegistrationButtonEnabled() {

        return true;
    }

    @Test
    public void RegistrationWithinCorrectpassword1() throws InterruptedException {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(correctpasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithinCorrectid() throws InterruptedException {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(correctpasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(incorrectidNumber);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithinCorrectphone() {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(correctpasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(incorrectphoneNUmber);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithinemptyData() throws InterruptedException {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(emptyuserData);
        step1.passwordFieldActions(emptypasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        Thread.sleep(2000);  SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithemptyData() throws InterruptedException {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(correctuserData);
        step1.passwordFieldActions(correctpasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(emptyphoneNmberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithemptyDataa() {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(emptypasswordData);
        step1.passwordFieldActions(emptypasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(correctphoneNumberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }

    @Test
    public void RegistrationWithempty() {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(emptypasswordData);
        step1.passwordFieldActions(emptypasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(correctidNumberData);
        step1.phoneNumberFieldActions(emptyphoneNmberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

        if (isRegistrationSuccessful()) {

            System.out.println("Registration successful!");

        } else {

            System.out.println("Registration failed!");

        }
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები.");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები.");

        softAssert.assertAll();
    }
    private boolean isRegistrationSuccessful() {

        boolean b = false;
        return b;
    }

    @Test
    public void RegistrationwithincorrectData() {
        RegistrationStep step1 = new RegistrationStep(driver);
        step1.userFieldAction(emptypasswordData);
        step1.passwordFieldActions(emptypasswordData);
        step1.password1FieldActions(incorecrtpassword1Data);
        step1.idNumberFieldActions(incorrectidNumber);
        step1.phoneNumberFieldActions(emptyphoneNmberData);
        step1.emailFieldActions(correctemailData);
        step1.registrationButtonFieldActions();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isErrorMessageDisplayed(), "შეამოწმეთ წითლად მონიშნული ველები!");
        softAssert.assertTrue(isRegistrationButtonEnabled(), "შეამოწმეთ წითლად მონიშნული ველები!");


        softAssert.assertAll();
    }

}


