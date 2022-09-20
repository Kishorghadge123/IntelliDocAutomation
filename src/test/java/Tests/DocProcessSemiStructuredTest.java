//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.CreateRolePage;
//import Pages.DocumentPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import Utilities.Custome_Wait;
//import org.checkerframework.checker.units.qual.A;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import javax.print.Doc;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("Doc Process Semi Structured Test")
//@Listeners(Utilities.TestListeners.class)
//public class DocProcessSemiStructuredTest extends TestBase {
//    DocumentPage DocPageObj;
//
//WebDriver driver;
//    AssertionsFunction assertions;
//    CreateRolePage CreateRolePageObj;
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001  - search_project")
//    @Description("verify user able to search_project")
//    @Test(priority = 1, groups = "smoke", description = "verify search_project")
//    public void search_project() throws Exception {
//      //  driver = DriverFactory.getInstance().getDriver();
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj=new CreateRolePage(driver);
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        Robot r = new Robot();
//        DocPageObj.ClickDocumentBtn();
//        //TC 9.1 Search Project.
//        Thread.sleep(5000);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(2000);
//        DocPageObj.ClickSearchProject(ReadProps.readAttr("SemiStructuredProjectName"));
//       Thread.sleep(1000);
//        DocPageObj.ClickSelectSemiStructuredProject();
//       Thread.sleep(1000);
////        assertions.verifyElementText(ReadProps.readAttr("SemiStructuredProjectName"), DocPageObj.SelectSemiStructuredProject);
//        Thread.sleep(1000);
//        DocPageObj.ClickStatusFilter();
//        Thread.sleep(1000);
//        DocPageObj.ClickCheckProcessed();
//
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002  -searchbox_document")
//    @Description("verify user able to searchbox_document")
//    @Test(priority = 2, groups = "smoke", description = "verify searchbox_document")
//
//    public void searchbox_document() throws Exception {
//        //TC 9.2 SearchBox Document and status of the document should goes according to Document typw either Processed or Rejected .
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//       Thread.sleep(3000);
//        DocPageObj.ClickSearchBox("form 1040.pdf");
//        Thread.sleep(3000);
//        DocPageObj.ClickSearchDocument();
//        Thread.sleep(3000);
////        assertions.verifyElementText("Processed", DocPageObj.StatusOfDoc);
////        Thread.sleep(1000);
//        DocPageObj.ClickClearSearch();
//        Thread.sleep(1000);
//        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
//        Thread.sleep(1000);
//        DocPageObj.ClickSearchDocument();
////        assertions.verifyElementPresent(DocPageObj.SearchedDocument);
////        assertions.verifyElementText("Processed", DocPageObj.StatusOfDoc);
//        Thread.sleep(2000);
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003  - update_document_cancelt")
//    @Description("verify user able to update_document_cancel")
//    @Test(priority = 3, groups = "smoke", description = "verify update_document_cancel ")
//
//    public void update_document_cancel() throws Exception {
//
//        //TC 9.3 Update document and cancel it.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickViewDocIcon2();
//        Thread.sleep(3000);
//        DocPageObj.ClickCancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DocPageObj.DocumentPageURL);
//        DocPageObj.ClickClearSearch();
//        DocPageObj.ClickRefreshDocument();
//        Thread.sleep(3000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  - hide_unhide_analytics")
//    @Description("verify user able to hide_unhide_analytics")
//    @Test(priority = 4, groups = "smoke", description = "verify hide_unhide_analytics ")
//
//    public void hide_unhide_analytics() throws Exception {
//        //TC 9.4 Hide and UnHide Analytics.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickHideAnalytics();
//       Thread.sleep(1000);
//        assertions.verifyElementPresent(DocPageObj.Analyticshide);
//        DocPageObj.ClickUnHideAnalytics();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(DocPageObj.AnalyticsUnhide);
//
//
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006 - sorting")
//    @Description("verify user able to sorting")
//    @Test(priority = 6, groups = "smoke", description = "verify sorting")
//
//    public void sorting() throws Exception {
//        //TC 9.6 Sorting.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        DocPageObj.ClickDocSort();
//        Thread.sleep(2000);
//        DocPageObj.ClickAssigneeSort();
//        DocPageObj.ClickStatusSort();
//        DocPageObj.ClickTypeSort();
//        DocPageObj.ClickScoreSort();
//        DocPageObj.ClickSizeSort();
//        DocPageObj.ClickUpdateSort();
//        DocPageObj.ClickReceivedSort();
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007 -items_page")
//    @Description("verify user able to find value items_page")
//    @Test(priority = 7, groups = "smoke", description = "verify items_page")
//
//    public void items_page() throws Exception {
//        //TC 9.7 Items Per Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        DocPageObj.ClickItemsPerPage();
//        DocPageObj.SelectItemsPerPage();
//        assertions.verifyElementText("10", DocPageObj.ItemSelectedNumber);
//        Thread.sleep(1000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008 -next_page_previous_page_first_page_last_page")
//    @Description("verify user able to next_page_previous_page_first_page_last_page")
//    @Test(priority = 8, groups = "smoke", description = "verify next_page_previous_page_first_page_last_page")
//
//    public void next_page_previous_page_first_page_last_page() throws Exception {
//        //TC 9.8 Next Page, Previous Page, Last Page and First Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(1000);
//        DocPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickPreviousPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickLastPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickFirstPage();
//        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 009 -anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")
//    @Description("verify user able to anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")
//    @Test(priority = 9, groups = "smoke", description = "verify anticlockwise_clockwise_zoomin_zoomout_navigate_right_left")
//
//    public void anticlockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
//        //TC 9.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(1000);
//        DocPageObj.ClickSearchBox("4.tif");
//        Thread.sleep(2000);
//        DocPageObj.ClickSearchDocument();
//        Thread.sleep(1000);
//        DocPageObj = new DocumentPage(driver);
//        Thread.sleep(1000);
//        DocPageObj.ClickViewDocIcon3();
//        Thread.sleep(3000);
//        assertions.verifyElementPresent(DocPageObj.DocView);
//        Thread.sleep(1000);
//        DocPageObj.ClickClockWiseIcon();
//        assertions.verifyElementPresent(DocPageObj.Clockwise);
//        Thread.sleep(1000);
//        DocPageObj.ClickAntiWiseIcon();
//        assertions.verifyElementPresent(DocPageObj.Anticlockwise);
//        Thread.sleep(2000);
//
//
//        // Zoom In.
//        DocPageObj.ClickZoomIN();
//        assertions.verifyElementPresent(DocPageObj.ZoomInDoc);
//        Thread.sleep(1000);
//
//
//        // ZoomOut.
//        DocPageObj.ClickZoomOut();
//        // Navigate Right.
//        DocPageObj.ClickNvgtRt();
//
//        // Navigate Back.
//        DocPageObj.ClickNvgtLft();
//        Thread.sleep(2000);
//        assertions.verifyElementPresent(DocPageObj.ClickNavigateLeft);
//        DocPageObj.clickSaveDraft();
//        Thread.sleep(3000);
//    }
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 010 documents_filters")
//    @Description("verify user able to documents_filter")
//    @Test(priority = 15, groups = "smoke", description = "verify documents_filter")
//
//    public void documents_filter() throws Exception {
//        //TC 9.5 Documents filter.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//
//        DocPageObj.ClickFilterDoc();
//        assertions.verifyElementPresent(DocPageObj.SearchFilterDoc);
//        DocPageObj.ClickSearchFilterDoc("AN");
//        DocPageObj.ClickFilterSearchIcon();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        DocPageObj.clickondocument();
//        Thread.sleep(2000);
//        DocPageObj.ClickFilterDoc();
//        DocPageObj.ClickCancelFilterSearch();
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//    }
//
//
//
//}
//
//
