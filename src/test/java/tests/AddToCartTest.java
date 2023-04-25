package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import drivers.BaseDriver;
import drivers.PageDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import utilities.ExtentFactory;

import java.io.IOException;

public class AddToCartTest extends BaseDriver {
    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @BeforeClass
    public void Parent() {
        report = ExtentFactory.getInstance();
        parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Add To Cart</b></p>")
                .assignAuthor("QA TEAM").assignDevice("Windows");
        PageDriver.getCurrentDriver().manage().window().maximize();
    }


    @Test(priority = 0)
    public void FirstBookHover() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On First Book</b></p>");
        AddToCartPage FirstBookHover = new AddToCartPage(childTest);
        FirstBookHover.FirstBookHover();
    }

    @Test(priority = 1)
    public void FirstBookInAddToCart() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>First Book To Cart</b></p>");
        AddToCartPage FirstBookInAddToCart = new AddToCartPage(childTest);
        FirstBookInAddToCart.FirstBookInAddToCart();
    }

    @Test(priority = 2)
    public void SecondBookHover() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On Second Book </b></p>");
        AddToCartPage SecondBookHover = new AddToCartPage(childTest);
        SecondBookHover.SecondBookHover();
    }

    @Test(priority = 3)
    public void SecondBookInAddToCart() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Second Book To Cart</b></p>");
        AddToCartPage SecondBookInAddToCart = new AddToCartPage(childTest);
        SecondBookInAddToCart.SecondBookInAddToCart();
    }


    @Test(priority = 4)
    public void ThirdBookHover() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On Third Book </b></p>");
        AddToCartPage ThirdBookHover = new AddToCartPage(childTest);
        ThirdBookHover.ThirdBookHover();
    }


    @Test(priority = 5)
    public void ThirdBookInAddToCart() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Third Book To Cart</b></p>");
        AddToCartPage ThirdBookInAddToCart = new AddToCartPage(childTest);
        ThirdBookInAddToCart.ThirdBookInAddToCart();
    }


    @Test(priority = 7)
    public void ClickOnCartIcon() throws IOException {
        childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Cart Icon</b></p>");
        AddToCartPage ClickOnCartIcon = new AddToCartPage(childTest);
        ClickOnCartIcon.ClickOnCartIcon();
    }

    @Test(priority = 8)
    public void RemoveFirstElement() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Remove First Element</b></p>");
        AddToCartPage RemoveFirstElement = new AddToCartPage(childTest);
        RemoveFirstElement.RemoveFirstElement();
    }

    @Test(priority = 9)
    public void ConfirmRemoveElementByYes() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Remove First Element By Yes</b></p>");
        AddToCartPage ConfirmRemoveElementByYes = new AddToCartPage(childTest);
        ConfirmRemoveElementByYes.ConfirmRemoveElementByYes();
    }

    @Test(priority = 10)
    public void UndoTheRemoveBook() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Undo the remove book</b></p>");
        AddToCartPage UndoTheRemoveBook = new AddToCartPage(childTest);
        UndoTheRemoveBook.UndoTheRemoveBook();
    }

    @Test(priority = 11)
    public void ClickOnPaceOrderButton() throws IOException {
        childTest = parentTest
                .createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Place Order Button</b></p>");
        AddToCartPage ClickOnPaceOrderButton = new AddToCartPage(childTest);
        ClickOnPaceOrderButton.ClickOnPaceOrderButton();
    }

    @AfterClass
    public void afterClass() {
        report.flush();
    }
}
