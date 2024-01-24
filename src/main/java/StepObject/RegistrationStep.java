package StepObject;

import PageObject.RegistrationObject;
import org.openqa.selenium.WebDriver;

   public class RegistrationStep extends RegistrationObject {

    WebDriver driver;

    public RegistrationStep(WebDriver driver1) {

        driver = driver1;
    }

    public void userFieldAction(String user) {
        driver.findElement(userField).sendKeys(user);

    }

    public void passwordFieldActions(String password) {
        driver.findElement(passwordField).sendKeys(password);

    }

    public void password1FieldActions(String password1) {
        driver.findElement(password1Field).sendKeys(password1);
    }

    public void idNumberFieldActions(String idNumber) {
        driver.findElement(idNumberFiled).sendKeys(idNumber);

    }

    public void phoneNumberFieldActions(String phoneNumber) {
        driver.findElement(phoneNumbrField).sendKeys(phoneNumber);
    }

    public void emailFieldActions(String email) {
        driver.findElement(emailField).sendKeys(email);


    }
    public void confirmButtonFieldActins(){
        driver.findElement(confirmButton2Filed);
    }

    public void registrationButtonFieldActions() {
        {
            driver.findElement(registrationButton).click();

        }

    }
}


