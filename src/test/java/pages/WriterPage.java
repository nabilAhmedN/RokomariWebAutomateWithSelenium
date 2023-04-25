package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import drivers.PageDriver;
// import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.GetScreenShot;

import java.io.IOException;

public class WriterPage extends CommonMethods {
    ExtentTest test;
    public WriterPage(ExtentTest test){

        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindBy(xpath = "//a[@id=\"js--authors\"]")
    public WebElement WriterPath;

    @FindBy(xpath = "//a[@href=\"/book/author/2444?ref=mm_p7\"]")
    public WebElement WriterChoice;

    @FindBy(xpath = "//label[contains(text(),'Best Seller')]")
    public WebElement BestSellerCheckBox;

    @FindBy(xpath = "//div[@class='product-sort__content p-0']")
    public WebElement Categories_Ids;

    @FindBy(xpath = "//label[contains(text(),'পশ্চিমবঙ্গের বই: শিশু-কিশোর বই')]")
    public WebElement FilterCheckBox_1;

    @FindBy(xpath = "//label[contains(text(),'শিশু-কিশোর: রহস্য, গোয়েন্দা, ভৌতিক, থ্রিলার ও অ্যা')]")
    public WebElement FilterCheckBox_2;


    @FindBy(xpath = "//a[contains(text(),'Next')]")
    public WebElement satyajitRayNextPage;

    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    public WebElement satyajitRayPreviousPage;

    @FindBy(xpath = "//h1[contains(text(),'সত্যজিৎ রায় এর বই সমূহ')]")
    public WebElement SelectBookDiv;

    public void Writer() throws IOException {
        test.info("Hover on Writer Path");
        try {
            if (WriterPath.isDisplayed()) {
                hover(WriterPath);
                test.pass("<p style=\"color:green; font-size:13px\"><b>Writer List Showing</b></p>");
//                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterListShowPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterListShowPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Writer List not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterListShowFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterListShowFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(WriterPath.isDisplayed());
        }
//        timeOut(2000);
    }

    public void WriterSelected() throws IOException {
        test.info("Writer Select");
        try {
            if (WriterChoice.isDisplayed()) {
                WriterChoice.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Writer Selected</b></p>");
//                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterSelectionPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterSelectionPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Writer Selection not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterSelectionFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterSelectionFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(WriterChoice.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
//        timeOut(2000);
    }

    public void BestSellerFilterClick() throws IOException {
        test.info("Best Seller Filtering");
        try {
            if (BestSellerCheckBox.isDisplayed()) {
                BestSellerCheckBox.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Best Seller Clicked</b></p>");
//                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "BestSellerCheckBoxClickPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BestSellerCheckBoxClickPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Best Seller not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BestSellerCheckBoxClickFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BestSellerCheckBoxClickFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(BestSellerCheckBox.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
//        timeOut(5000);
    }

    public void ScrollDownToCategorySection() throws IOException{
        test.info("Scrolling");
        try {
            if (Categories_Ids.isDisplayed()) {
                scrollToElement(Categories_Ids);
                test.pass("<p style=\"color:green; font-size:13px\"><b>scrolling Success</b></p>");
                timeOut(2000);

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "ScrollingPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ScrollingPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Best Seller not locatable.</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ScrollingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ScrollingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(Categories_Ids.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
//        timeOut(5000);
    }

    public void FirstCategoryCheckBoxClick() throws IOException{
        test.info("Click On First Category Filtering CheckBox");
        try {
            if (FilterCheckBox_1.isDisplayed()) {
                FilterCheckBox_1.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>First Category CheckBox Filtering Pass</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "FirstCategoryCheckBoxClickPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstCategoryCheckBoxClickPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>First Category CheckBox Not Locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstCategoryCheckBoxClickFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstCategoryCheckBoxClickFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(FilterCheckBox_1.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void SecondCategoryCheckBoxClick() throws IOException{
        test.info("Scrolling");
        try {
            if (FilterCheckBox_2.isDisplayed()) {
                FilterCheckBox_2.click();
                test.pass("<p style=\"color:green; font-size:13px\"><b>Second Category CheckBox Filtering Pass</b></p>");

                @SuppressWarnings("unused")
                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
                        "SecondCategoryCheckBoxClickPass");
                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondCategoryCheckBoxClickPass.png";
                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            }

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>Second Category CheckBox Not Locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondCategoryCheckBoxClickFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondCategoryCheckBoxClickFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(FilterCheckBox_2.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }

    public void SelectBookDivScroll() throws IOException {
        test.info("To BookList Div Scrolling");
        try {
            scrollToElement(SelectBookDiv);
            test.pass("<p style=\"color:green; font-size:13px\"><b>BookList scrolling Success</b></p>");
//            timeOut(2000);

            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BookListDivScrollingPass");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BookListDivScrollingPass.png";
            test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

        } catch (Exception e) {
            test.fail("<p style=\"color:red; font-size:13px\"><b>BookList Div not locatable</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BookListDivScrollingFail");
            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BookListDivScrollingFail.png";
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            junit.framework.Assert.assertTrue(SelectBookDiv.isDisplayed());
        }
//        timeOut(2000);
    }

//    public void ClickOnNextPage() throws IOException{
//        test.info("Click On Next Page");
//        try {
//            if (satyajitRayNextPage.isDisplayed()) {
//                satyajitRayNextPage.click();
//                test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Next Button Pass Pass</b></p>");
//                timeOut(2000);
//
//                @SuppressWarnings("unused")
//                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
//                        "ClickOnNextButtonPass");
//                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNextButtonPass.png";
//                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            }
//
//        } catch (Exception e) {
//            test.fail("<p style=\"color:red; font-size:13px\"><b>Second Category CheckBox Not Locatable</b></p>");
//            Throwable t = new InterruptedException("Exception");
//            test.fail(t);
//            @SuppressWarnings("unused")
//            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnNextButtonFail");
//            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNextButtonFail.png";
//            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            junit.framework.Assert.assertTrue(satyajitRayNextPage.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
//        timeOut(5000);
//    }
//
//    public void ClickOnPreviousPage() throws IOException{
//        test.info("Click On Previous Page");
//        try {
//            if (satyajitRayPreviousPage.isDisplayed()) {
//                satyajitRayPreviousPage.click();
//                test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Previous Button Pass Pass</b></p>");
//                timeOut(2000);
//
//                @SuppressWarnings("unused")
//                String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
//                        "ClickOnPreviousButtonPass");
//                String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPreviousButtonPass.png";
//                test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            }
//
//        } catch (Exception e) {
//            test.fail("<p style=\"color:red; font-size:13px\"><b>Previous button Not Locatable</b></p>");
//            Throwable t = new InterruptedException("Exception");
//            test.fail(t);
//            @SuppressWarnings("unused")
//            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnPreviousButtonFail");
//            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPreviousButtonFail.png";
//            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//            junit.framework.Assert.assertTrue(satyajitRayPreviousPage.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
//        timeOut();
//    }
//    public void FirstBookHover() throws IOException{
//    test.info("First Book Hover");
//    try {
//        if (FirstBookHover.isDisplayed()) {
//            hover(FirstBookHover);
//            test.pass("<p style=\"color:green; font-size:13px\"><b>First Book Hovering</b></p>");
//            timeOut(2000);
//
//            @SuppressWarnings("unused")
//            String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
//                    "FirstBookHoverPass");
//            String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverPass.png";
//            test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//        }
//    } catch (Exception e) {
//        test.fail("<p style=\"color:red; font-size:13px\"><b>First Book Hovering not locatable</b></p>");
//        Throwable t = new InterruptedException("Exception");
//        test.fail(t);
//        @SuppressWarnings("unused")
//        String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookHoverFail");
//        String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverFail.png";
//        test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//        junit.framework.Assert.assertTrue(FirstBookHover.isDisplayed());
//        PageDriver.getCurrentDriver().quit();
//    }
//    timeOut(2000);
//}
//
}
