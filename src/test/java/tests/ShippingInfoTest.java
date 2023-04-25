package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import drivers.BaseDriver;
import drivers.PageDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ShippingInfoPage;
import utilities.ExtentFactory;

import java.io.IOException;

public class ShippingInfoTest extends BaseDriver {
    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @BeforeClass
    public void Parent() {
        report = ExtentFactory.getInstance();
        parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Shipping Information</b></p>")
                .assignAuthor("QA TEAM").assignDevice("Windows");
        PageDriver.getCurrentDriver().manage().window().maximize();
    }

    @Test(priority = 0)
    public void NameGiven() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Name Giving </b></p>");
        ShippingInfoPage NameGiven = new ShippingInfoPage(childTest);
        NameGiven.NameGiven();
    }

    @Test(priority = 1)
    public void PhoneNumberGiven() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Phone Number Giving </b></p>");
        ShippingInfoPage PhoneNumberGiven = new ShippingInfoPage(childTest);
        PhoneNumberGiven.PhoneNumberGiven();
    }

    @Test(priority = 2)
    public void AlterNativePhoneNum() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Alternative Phone Number Giving </b></p>");
        ShippingInfoPage AlterNativePhoneNum = new ShippingInfoPage(childTest);
        AlterNativePhoneNum.AlterNativePhoneNum();
    }

    @Test(priority = 3)
    public void CountryDropDown() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Country DropDown Giving </b></p>");
        ShippingInfoPage CountryDropDown = new ShippingInfoPage(childTest);
        CountryDropDown.CountryDropDown();
    }

    @Test(priority = 4)
    public void CityDropDown() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>City DropDown Giving </b></p>");
        ShippingInfoPage CityDropDown = new ShippingInfoPage(childTest);
        CityDropDown.CityDropDown();
    }


    @Test(priority = 5)
    public void AreaDropDown() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Area DropDown Giving </b></p>");
        ShippingInfoPage AreaDropDown = new ShippingInfoPage(childTest);
        AreaDropDown.AreaDropDown();
    }

    @Test(priority = 6)
    public void ZoneDropDown() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Zone DropDown Giving </b></p>");
        ShippingInfoPage ZoneDropDown = new ShippingInfoPage(childTest);
        ZoneDropDown.ZoneDropDown();
    }

    @Test(priority = 7)
    public void AddressInputField() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Address Is Giving </b></p>");
        ShippingInfoPage AddressInputField = new ShippingInfoPage(childTest);
        AddressInputField.AddressInputField();
    }

    @Test(priority = 8)
    public void BkashCheckBox() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Bkash CheckBox  </b></p>");
        ShippingInfoPage BkashCheckBox = new ShippingInfoPage(childTest);
        BkashCheckBox.BkashCheckBox();
    }

    @Test(priority = 9)
    public void ClickOnTerm() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Term CheckBox</b></p>");
        ShippingInfoPage ClickOnTerm = new ShippingInfoPage(childTest);
        ClickOnTerm.ClickOnTerm();
    }

//    @Test(priority = 7)
//    public void ConfirmOrderButton() throws IOException {
//        childTest = parentTest
//                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Place Order Button  </b></p>");
//        ShippingInfoPage ConfirmOrderButton = new ShippingInfoPage(childTest);
//        ConfirmOrderButton.ConfirmOrderButton();
//    }

    @AfterClass
    public void afterClass() {
        report.flush();
    }
}
