package PageObject;

import org.openqa.selenium.By;

public class RegistrationObject {

    protected By

            userField = By.id("txtUserName_inputID"),
            passwordField = By.name("txtPassword_inputName"),
            password1Field = By.id("txtReenterPassword_inputID"),

    idNumberFiled = By.name("txtPersonalID_inputName"),
            phoneNumbrField = By.id("txtPhone_inputID"),
            confirmButton = By.id("confirmPhone"),
            emailField = By.id("txtEmail_inputID"),
            confirmButton1Field = By.id("confirmEmail"),

    confirmButton2Filed = By.id("inCode_inputID"),
            confirmButton3Field = By.id ("inCode_inputID"),
            confirmButton4phoneFieled =By.id("btnConfirm"),
            confirmButton5emailFiled = By.xpath("//*[@id=\"btnConfirm\"]/span"),


    registrationButton = By.xpath("//*[@id=\"pnlRegistrationFields\"]/div[2]/div[2]/input");


    public void enterOTPFieldActions(String generatedOTP) {
    }
}



