package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.GetScreenShot;

import java.io.IOException;

public class GooglePage extends CommonMethods {
    ExtentTest test;

    public GooglePage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindAll({ @FindBy(xpath = "//input[@id=\"identifierId\"]") })
    WebElement UserEmail;

    @FindAll({ @FindBy(xpath = "//div[@class=\"zQJV3\"]//div[@class=\"FliLIb DL0QTb\"]") })
    WebElement NextButton;

    @FindAll({
            @FindBy(xpath = "//div[@class=\"Txuhic\"]//div[@class=\"aXBtI Wic03c\"]//div[@class=\"Xb9hP\"]//input") })
    WebElement Password;

    @FindAll({ @FindBy(xpath = "//div[@class=\"FliLIb DL0QTb\"]") })
    WebElement ClickAfterPasswordButton;

    public void TypeEmailAddress() throws IOException {
        test.info("Provide Your Email Address");
        try {
            if (UserEmail.isDisplayed()) {
                sendText(UserEmail, "emailchange@gmail.com");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Email Enter</b></p>");
                timeOut(2000);
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserEmailPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserEmailPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Email Address not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserEmailFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserEmailFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(UserEmail.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        timeOut(5000);
    }

    public void ClickOnEmailNextButton() throws IOException {
        test.info("Click On Next Button");
        try {
            if (NextButton.isDisplayed()) {
                NextButton.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Next Button</b></p>");
                timeOut(2000);
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ClickOnNextButtonPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNextButtonPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>UserName Next Button not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "ClickOnNextButtonFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNextButtonFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(NextButton.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        timeOut();
    }

    public void EmailPassword() throws IOException {
        test.info("Provide Email Password");
        try {
            if (Password.isDisplayed()) {
                Password.click();
                sendText(Password, "passwordChange");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Password Enter</b></p>");
                timeOut(2000);
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Password not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(Password.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        timeOut(2000);
    }

    public void ClickOnPasswordNextButton() throws IOException {
        test.info("Click On Password Next Button");
        try {
            if (ClickAfterPasswordButton.isDisplayed()) {
                ClickAfterPasswordButton.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Next Button</b></p>");
                timeOut(2000);
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ClickOnPasswordNextButtonPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPasswordNextButtonPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Next Button not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "ClickOnPasswordNextButtonPass");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPasswordNextButtonPass.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ClickAfterPasswordButton.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        timeOut(5000);
    }
}
