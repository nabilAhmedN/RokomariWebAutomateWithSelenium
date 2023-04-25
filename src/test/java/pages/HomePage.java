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

public class HomePage extends CommonMethods {

    ExtentTest test;
    public HomePage(ExtentTest test){

        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindAll({ @FindBy(xpath = "//a[contains(text(),'Sign in')]") })
    WebElement signIn;


    @FindAll({
            @FindBy(xpath = "//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[2]") })
    WebElement Google;

    public void ClickOnSignIn() throws IOException {
        test.info("Click on sign-in Button");
        try {
            if (signIn.isDisplayed()) {
                signIn.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Sign-in Button Clicked.</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignInPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignInPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }
        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Sign-in location not avialble.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignInFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignInFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(signIn.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void ClickOnGmailButton() throws IOException {
        test.info("Gmail Button Click");
        try {
            if (Google.isDisplayed()) {
                Google.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Gmail Button Clicked.</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnGmailPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnGmailPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Gmail not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnGmailFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnGmailFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(Google.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }


}
