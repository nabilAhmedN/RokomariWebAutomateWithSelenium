package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.GetScreenShot;

import java.io.IOException;

public class AddToCartPage extends CommonMethods {

    ExtentTest test;

    public AddToCartPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindBy(xpath = "//button[@product-id=\"42908\"]")
    public WebElement FirstBookToCart;

    @FindBy(xpath = "//div[@title=\"শঙ্কু সমগ্র সত্যজিৎ রায়\"]")
    public WebElement FirstBookHover;

    @FindBy(xpath = "//button[@product-id=\"51368\"]")
    public WebElement SecondBookToCart;

    @FindBy(xpath = "//div[@title=\"মরুরহস্য : শঙ্কু ও আদিম মানুষ সত্যজিৎ রায়\"]")
    public WebElement SecondBookHover;

//    @FindBy(xpath = "//button[@class=\"close js--btn-close-feature-popup\"]//span[contains(text(),'×')]")
//    public WebElement ClickOnCrossButton;

    @FindBy(xpath = "//button[@product-id=\"29724\"]")
    public WebElement ThirdBookAddToCart;

    @FindBy(xpath = "//div[@title=\"তারিণীখুড়োর অভিযান সত্যজিৎ রায়\"]")
    public WebElement ThirdBookHover;

    @FindBy(xpath = "//a[@id='js-cart-menu']")
    public WebElement ClickOnCartIcon;

    @FindBy(xpath = "//a[@productid=\"29724\"]//img[@src=\"/static/200/images/icon_trash.png\"]")
    public WebElement RemoveFirstElement;

    @FindBy(xpath = "//button[contains(text(),'হ্যাঁ')]")
    public WebElement ConfirmRemoveElementByYes;

    @FindBy(xpath = "//div//p[@class='text-right text-secondary mb-2']")
    public WebElement GoThroughTheOrderButton;

    @FindBy(xpath = "//b[contains(text(),'Undo')]")
    public WebElement UndoTheRemoveBook;

    @FindBy(xpath = "//span[contains(text(),'Place Order')]")
    public WebElement ClickOnPaceOrderButton;


    public void FirstBookHover() throws IOException {
        test.info("First Book Hover");
        try {
            if (FirstBookHover.isDisplayed()) {
                hover(FirstBookHover);

                test.pass("<p style=\"color:green; font-size:13px\"><b>First Book Hovering</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookHoverPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Book Hovering not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookHoverFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(FirstBookHover.isDisplayed());
        }
    }


    public void FirstBookInAddToCart() throws IOException {
        test.info("Ordering First Book");
        try {
            if (FirstBookToCart.isDisplayed()) {
                FirstBookToCart.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Order First Book Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookOrderPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookOrderPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Book not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookOrderFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookOrderFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(FirstBookToCart.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void SecondBookHover() throws IOException {
        test.info("Second Book Hover");
        try {
            if (SecondBookHover.isDisplayed()) {
                hover(SecondBookHover);

                test.pass("<p style=\"color:green; font-size:13px\"><b>Second Book Hovering</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SeondBookHoverPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Second Book Hovering not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookHoverFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(SecondBookHover.isDisplayed());
        }
    }

    public void SecondBookInAddToCart() throws IOException {
        test.info("Second Book To Cart");
        try {
            if (SecondBookToCart.isDisplayed()) {
                SecondBookToCart.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Order First Book Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Book not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(SecondBookToCart.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void ThirdBookHover() throws IOException {
        test.info("Second Book Hover");
        try {
            if (ThirdBookHover.isDisplayed()) {
                hover(ThirdBookHover);

                test.pass("<p style=\"color:green; font-size:13px\"><b>Second Book Hovering</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SeondBookHoverPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Second Book Hovering not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookHoverFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(SecondBookHover.isDisplayed());
        }
    }

    public void ThirdBookInAddToCart() throws IOException {
        test.info("Second Book To Cart");
        try {
            if (ThirdBookAddToCart.isDisplayed()) {
                ThirdBookAddToCart.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Order First Book Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Book not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ThirdBookAddToCart.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void ClickOnCartIcon() throws IOException {
        test.info("Click on Cart Icon");
        try {
            if (ClickOnCartIcon.isDisplayed()) {
                ClickOnCartIcon.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Click Cart Icon Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCartIconPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCartIconPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Cart Icon not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCartIconFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCartIconFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ClickOnCartIcon.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void RemoveFirstElement() throws IOException {
        test.info("Remove on First Product");
        try {
            if (RemoveFirstElement.isDisplayed()) {
                RemoveFirstElement.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Remove First Element Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RemoveFirstElementPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RemoveFirstElementPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Product Remove not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "ClickFirstProductGivenQuantityFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RemoveFirstElementFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(RemoveFirstElement.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void ConfirmRemoveElementByYes() throws IOException {
        test.info("Confirm By Yes");
        try {
            if (ConfirmRemoveElementByYes.isDisplayed()) {
                ConfirmRemoveElementByYes.click();
//                scrollPageDown();
//                scrollToElement(GoThroughTheOrderButton);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Confirm Remove Element Success</b></p>");
                timeOut(5000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ConfirmRemoveElementByYesPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConfirmRemoveElementByYesPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Confirm Remove Element not locateable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "ConfirmRemoveElementByYesFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConfirmRemoveElementByYesFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ConfirmRemoveElementByYes.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void UndoTheRemoveBook() throws IOException {
        test.info("Confirm By Yes");
        try {
            if (UndoTheRemoveBook.isDisplayed()) {
                UndoTheRemoveBook.click();
                scrollPageDown();
//                scrollToElement(GoThroughTheOrderButton);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Confirm Undo book Element Success</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "UndoTheRemoveBookPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UndoTheRemoveBookPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Undo button not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                    "UndoTheRemoveBookFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UndoTheRemoveBookFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(UndoTheRemoveBook.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void ClickOnPaceOrderButton() throws IOException {
        test.info("Click on Place Order Button And Switch Shipping Window");
        try {
            if (ClickOnPaceOrderButton.isDisplayed()) {
                ClickOnPaceOrderButton.click();
                timeOut(5000);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Place Order Success</b></p>");
                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ClickOnPaceOrderButtonPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPaceOrderButtonPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

                windowHandling();
                PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
                test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping Page Switch Success</b></p>");
                timeOut(5000);
                @SuppressWarnings("unused")
                String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ShippingPageSwitchPass");
                String Dest = System.getProperty("user.dir") + "\\screenshots\\" + "ShippingPageSwitchPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Cart Icon not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnPaceOrderButtonFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPaceOrderButtonFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(ClickOnPaceOrderButton.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
//        timeOut(5000);
    }
}
