package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
import junit.framework.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.GetScreenShot;

import java.io.IOException;

public class ShippingInfoPage extends CommonMethods {
    ExtentTest test;

    public ShippingInfoPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindBy(xpath = "//div[@class=\"shipping-form-container\"]//input[@name=\"name\"]")
    public WebElement Name;

    @FindBy(xpath = "//input[@name=\"phone\"]")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//input[@class=\"js--alternative-phone\"]")
    public WebElement AlternativePhoneNum;

    @FindBy(xpath = "//select[@id='js--country']")
    public WebElement CountryDropDown;

    @FindBy(xpath = "//select[@id='js--city']")
    public WebElement CityDropDown;

    @FindBy(xpath = "//select[@id='js--area']")
    public WebElement AreaDropDown;

    @FindBy(xpath = "//select[@id='js--zone']")
    public WebElement ZoneDropDown;

    @FindBy(xpath = "//fieldset//textarea[@name=\"address\"]")
    public WebElement Address;

    @FindBy(xpath = "//input[@id='bkash']")
    public WebElement ClickOnBkashCheckBox;

    @FindBy(xpath = "//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]")
    public WebElement ClickOnTerm;

//    @FindBy(xpath = "//button[@id='js--confirm-order']")
//    public WebElement ConFirmOrderButton;

    public void NameGiven() throws IOException {
        test.info("Giving Name");
        try {
            if (Name.isDisplayed()) {
                Name.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
                sendText(Name, "Nabil Ahmed");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Name Giving</b></p>");
                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NameGivingPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NameGivingPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b> Name Input not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NameGivingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NameGivingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(Name.isDisplayed());
        }
    }

    public void PhoneNumberGiven() throws IOException {
        test.info("Giving Phone Number");
        try {
            if (PhoneNumber.isDisplayed()) {
                PhoneNumber.click();
                sendText(PhoneNumber, "018XXXXXXX5");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Phone Number Giving</b></p>");
                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PhoneNumberGivingPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PhoneNumberGivingPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Phone Number Input not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PhoneNumberGivingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PhoneNumberGivingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(PhoneNumber.isDisplayed());
        }
    }

    public void AlterNativePhoneNum() throws IOException {
        test.info("Giving Alternative Phone Number");
        try {
            if (AlternativePhoneNum.isDisplayed()) {
                AlternativePhoneNum.click();
                sendText(AlternativePhoneNum, "017XXXXXXX9");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Alternative Phone Number Giving</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "AlternativePhoneNumberGivingPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\"
                        + "AlternativePhoneNumberGivingPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Alternative Phone Number not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "AlternativePhoneNumberGivingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AlternativePhoneNumberGivingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(AlternativePhoneNum.isDisplayed());
        }
    }

    public void CountryDropDown() throws IOException{
        test.info("Giving Country Drop Down Value");
        try{
            if (CountryDropDown.isDisplayed()){
                CountryDropDown.click();
                selectItemByIndex(CountryDropDown, 0);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Country DropDown Value Giving</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }
        }catch (Exception e){
            test.fail("<p style=\"color:red; font-size:13px\"><b>Country DropDown Value not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(CountryDropDown.isDisplayed());
        }
    }

    public void CityDropDown() throws IOException{
        test.info("Giving City Drop Down Value");
        try{
            if (CityDropDown.isDisplayed()){
                CityDropDown.click();
                selectItemByIndex(CityDropDown, 3);
                test.pass("<p style=\"color:green; font-size:13px\"><b>City DropDown Value Giving</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }
        }catch (Exception e){
            test.fail("<p style=\"color:red; font-size:13px\"><b>City DropDown Value not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(CityDropDown.isDisplayed());
        }
    }

    public void AreaDropDown() throws IOException{
        test.info("Giving Area Drop Down Value");
        try{
            if (AreaDropDown.isDisplayed()){
                AreaDropDown.click();
                selectItemByIndex(AreaDropDown, 6);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Area DropDown Value Giving</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AreaDropDownPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AreaDropDownPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }
        }catch (Exception e){
            test.fail("<p style=\"color:red; font-size:13px\"><b>Country DropDown Value not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AreaDropDownFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AreaDropDownFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(AreaDropDown.isDisplayed());
        }
    }

    public void ZoneDropDown() throws IOException {
        test.info("Giving Zone Drop Down Value");
        try {
            if (ZoneDropDown.isDisplayed()) {
                ZoneDropDown.click();
                selectItemByIndex(ZoneDropDown, 2);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Zone DropDown Value Giving</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ZoneDropDownPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ZoneDropDownPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Country DropDown Value not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ZoneDropDownFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ZoneDropDownFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ZoneDropDown.isDisplayed());
        }
    }

    public void AddressInputField() throws IOException {
        test.info("Giving Address");
        try {
            if (Address.isDisplayed()) {
                Address.click();
                sendText(Address, "15, Bankim Chatterjee St, College Square West, College Street, Kolkata, West Bengal 700073");
                test.pass("<p style=\"color:green; font-size:13px\"><b>Address is Giving</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddressGivingPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AddressGivingPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b> Address not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);

            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddressGivingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AddressGivingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(Address.isDisplayed());
        }
    }

    public void BkashCheckBox() throws IOException {
        test.info("Giving Click On Bkash CheckBox");
        try {
            if (ClickOnBkashCheckBox.isDisplayed()) {
                ClickOnBkashCheckBox.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Bkash CheckBox Clicking Pass</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ClickOnBkashCheckBoxPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnBkashCheckBoxPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b> Bkash CheckBox not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnBkashCheckBoxFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnBkashCheckBoxFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ClickOnBkashCheckBox.isDisplayed());
        }
    }

    public void ClickOnTerm() throws IOException{
        test.info("Click On Term CheckBox");
        try {
            if (ClickOnTerm.isDisplayed()) {
                ClickOnTerm.click();

                test.pass("<p style=\"color:green; font-size:13px\"><b>Term CheckBox Clicking Pass</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ClickOnTermCheckBoxPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnTermCheckBoxPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b> Term CheckBox not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnTermCheckBoxFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnTermCheckBoxFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ClickOnTerm.isDisplayed());
        }
    }

}

//    public void ConfirmOrderButton() throws IOException {
//        test.info("Click On Confirm Order Button");
//        try {
//            if (ConFirmOrderButton.isDisplayed()) {
//                ConFirmOrderButton.click();
//                test.pass("<p style=\"color:green; font-size:13px\"><b>Place Order Button Clicking Pass</b></p>");
//                timeOut(4000);
//                @SuppressWarnings("unused")
//                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ConFirmOrderButtonPass");
//                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConFirmOrderButtonPass.png";
//                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            }
//
//        } catch (Exception e) {
//            test.fail("<p style=\"color:red; font-size:13px\"><b> Place Order Button not locateable.</b></p>");
//            Throwable t = new InterruptedException("Exception");
//            test.fail(t);
//            @SuppressWarnings("unused")
//            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ConFirmOrderButtonFail");
//            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConFirmOrderButtonFail.png";
//            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            Assert.assertTrue(ConFirmOrderButton.isDisplayed());
//        }
//        timeOut(5000);
//    }

