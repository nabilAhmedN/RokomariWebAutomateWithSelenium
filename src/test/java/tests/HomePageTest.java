package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import drivers.BaseDriver;
import drivers.PageDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ExtentFactory;

import java.io.IOException;

public class HomePageTest extends BaseDriver {

    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @BeforeClass
    public void startUrl(){
        report = ExtentFactory.getInstance();
        parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Create An Account</b></p>")
                .assignAuthor("QA TEAM").assignDevice("Windows");
        PageDriver.getCurrentDriver().get(baseURL);
        PageDriver.getCurrentDriver().manage().window().maximize();
    }

    @Test(priority = 0)
    public void ClickOnSignIn() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On SignIn Button</b></p>");
        HomePage homePage = new HomePage(childTest);
        homePage.ClickOnSignIn();

    }

    @Test(priority = 1)
    public void GmailClick() throws IOException{
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Google Button</b></p>");
        HomePage homePage = new HomePage(childTest);
        homePage.ClickOnGmailButton();
    }
    @AfterClass
    public void afterClass() {
        report.flush();
    }
}
