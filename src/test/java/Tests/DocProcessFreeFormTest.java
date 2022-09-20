//
//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import Pages.AnalyticsPage;
//import Pages.CreateRolePage;
//import Pages.DocumentPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("Doc Process Free Form Test")
//@Listeners(Utilities.TestListeners.class)
//public class DocProcessFreeFormTest extends BaseTest {
//    DocumentPage DocPageObj;
//    public WebDriver driver;
//    AssertionsFunction assertions;
//    JavascriptExecutor js;
//    CreateRolePage CreateRolePageObj;
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001  - search_project")
//    @Description("verify user able to search_project")
//    @Test(priority = 1, groups = "smoke", description = "verify search_project")
//
//    public void search_project() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        CreateRolePageObj=new CreateRolePage(driver);
//        Robot r = new Robot();
//        Thread.sleep(2000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(2000);
//        //TC 7.1 Search Project.
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(1000);
//
//        DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
//        Thread.sleep(1000);
//        DocPageObj.ClickSelectFreeFormProject();
//        Thread.sleep(1000);
//        assertions.verifyElementText(ReadProps.readAttr("FreeFormProjectName"), DocPageObj.SelectFreeFormProject);
//        Thread.sleep(2000);
//        DocPageObj.ClickStatusFilter();
//        Thread.sleep(2000);
//        DocPageObj.ClickCheckProcessed();
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002  - search_document")
//    @Description("verify user able to search_document")
//    @Test(priority = 2, groups = "smoke", description = "verify search_document")
//
//    public void search_document() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        //TC 7.2 SearchBox Document.
//        DocPageObj.ClickSearchBox("Pfizer");
//        Thread.sleep(3000);
//        DocPageObj.ClickSearchDocument();
//        Thread.sleep(2000);
//        DocPageObj.ClickClearSearch();
//        Thread.sleep(2000);
//        DocPageObj.ClickSearchBox("AN - OOLU2604599081.pdf");
//        Thread.sleep(1000);
//        DocPageObj.ClickSearchDocument();
//        Thread.sleep(1000);
//        // AssertionsFunction.verifyElementPresent(DocPageObj.SearchedDocument);
////        assertions.verifyElementText("Rejected", DocPageObj.StatusOfDoc);
//        Thread.sleep(2000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003  - update_document_cancel_it")
//    @Description("verify user able to update_document_cancel_it")
//    @Test(priority = 3, groups = "smoke", description = "verify update_document_cancel_it")
//
//    public void update_document_cancel_it() throws Exception {
//        //TC 7.3 Update document and cancel it.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickViewDocIcon2();
//        Thread.sleep(2000);
//        DocPageObj.ClickCancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DocPageObj.DocumentPageURL);
//        Thread.sleep(1000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  - hide_unhide_analytics")
//    @Description("verify user able to hide_unhide_analytics")
//    @Test(priority = 4, groups = "smoke", description = "verify hide_unhide_analytics")
//    public void hide_unhide_analytics() throws Exception {
//        //TC 7.4 Hide and UnHide Analytics.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DocPageObj.ClickHideAnalytics();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(DocPageObj.Analyticshide);
//        DocPageObj.ClickUnHideAnalytics();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(DocPageObj.AnalyticsUnhide);
//        Thread.sleep(1000);
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006  - sorting")
//    @Description("verify user able to sorting")
//    @Test(priority = 6, groups = "smoke", description = "verify sorting")
//
//    public void sorting() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        JavascriptExecutor js=  (JavascriptExecutor) driver;
//        //TC 7.6 Sorting.
//        DocPageObj.ClickDocSort();
//        Thread.sleep(2000);
//        DocPageObj.ClickAssigneeSort();
//        DocPageObj.ClickStatusSort();
//        DocPageObj.ClickTypeSort();
//        DocPageObj.ClickScoreSort();
//        DocPageObj.ClickSizeSort();
//        DocPageObj.ClickUpdateSort();
//        DocPageObj.ClickReceivedSort();
//
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007  - items_per_page")
//    @Description("verify items_per_page")
//    @Test(priority = 7, groups = "smoke", description = "verify items_per_page")
//
//    public void items_per_page() throws Exception {
//        //TC 7.7 Items Per Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(1000);
//        DocPageObj.ClickItemsPerPage();
//        DocPageObj.SelectItemsPerPage();
//        assertions.verifyElementText("10", DocPageObj.ItemSelectedNumber);
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008  - next_page_previous_page_first_page_last_page")
//    @Description("verify items_per_page")
//    @Test(priority = 8, groups = "smoke", description = "verify next_page_previous_page_first_page_last_page")
//
//    public void next_page_previous_page_first_page_last_page() throws Exception {
//        //TC 7.8 Next Page, Previous Page, Last Page and First Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(1000);
//        DocPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickPreviousPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickLastPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickFirstPage();
//        assertions.isPresent(DocPageObj.FirstPage);
//        Thread.sleep(1000);
//        DocPageObj.ClickClearSearch();
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 016  - documents_filter")
//    @Description("verify user able to documents_filter")
//    @Test(priority = 16, groups = "smoke", description = "verify documents_filter")
//
//    public void documents_filter() throws Exception {
//        //TC 7.5 Documents filter.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
////        DocPageObj.ClickDocumentBtn();
////        Thread.sleep(2000);
////        CreateRolePage CreateRolePageObj=new CreateRolePage(driver);
//        DocPageObj.ClickFilterDoc();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(DocPageObj.SearchFilterDoc);
//        DocPageObj.ClickSearchFilterDoc("AN");
//        Thread.sleep(1000);
//        DocPageObj.ClickFilterSearchIcon();
//
//        Thread.sleep(2000);
//        DocPageObj.clickOutside();
//        Thread.sleep(2000);
//    DocPageObj.clickondocument();
//        Thread.sleep(2000);;
//
//        DocPageObj.ClickFilterDoc();
////        Custome_Wait.wait(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[2]")));
//        Thread.sleep(2000);
//        DocPageObj.ClickCancelFilterSearch();
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 015 - anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left")
//    @Description("verify items_per_page")
//    @Test(priority =15 , groups = "smoke", description = "anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left")
//
//    public void anti_clockwise_clockwise_zoomin_zoomout_navigate_right_left() throws Exception {
//        //TC 7.9 Anti-Clock Wise, Clock Wise, Zoom IN, Zoom Out, Navigate Right and Navigate Left.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DocPageObj.ClickProceeseddocument();
//        Thread.sleep(1000);
////        assertions.verifyElementPresent(DocPageObj.Clockwise);
//        DocPageObj.ClickAntiWiseIcon();
////        assertions.verifyElementPresent(DocPageObj.Anticlockwise);
//        DocPageObj.ClickZoomIN();
////        assertions.verifyElementPresent(DocPageObj.ZoomInDoc);
//        DocPageObj.ClickZoomOut();
//
//        Thread.sleep(2000);
//        DocPageObj.clickSaveDraft();
//        Thread.sleep(2000);
//    }
//
//}
