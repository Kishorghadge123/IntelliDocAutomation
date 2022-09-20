//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.CreateRolePage;
//import Pages.DocumentPage;
//import io.qameta.allure.*;
//import Pages.ProjectBREMedicalChartDocumentPage;
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
//@Feature("Doc Process Medical Chart Test")
//@Listeners(Utilities.TestListeners.class)
//
//public class DocProcessMedicalChartTest extends TestBase {
//    DocumentPage DocPageObj;
//    AssertionsFunction assertions;
//WebDriver driver;
//    CreateRolePage  CreateRolePageObj;
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001  - search_project")
//    @Description("verify user able to search_project")
//    @Test(priority = 1, groups = "smoke", description = "verify search_project")
//    public void search_project() throws Exception {
//        Robot r = new Robot();
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj=new CreateRolePage(driver);
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        Thread.sleep(3000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(3000);
//        //TC 8.1 Search Project.
//        DocPageObj = new DocumentPage(driver);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(1000);
//        DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectName"));
//        Thread.sleep(1000);
//        DocPageObj.ClickSelectMedicalChartProject();
//        //  Thread.sleep(3000);
//        assertions.verifyElementText(ReadProps.readAttr("MedicalChartProjectName"), DocPageObj.SelectMedicalChartProject);
//        Thread.sleep(2000);
//        DocPageObj.ClickStatusFilter();
//        Thread.sleep(2000);
//        DocPageObj.ClickCheckProcessed();
//        Thread.sleep(2000);
//
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002  -searchbox_document")
//    @Description("verify user able to searchbox_document")
//    @Test(priority = 2, groups = "smoke", description = "verify searchbox_document")
//
//    public void searchbox_document() throws Exception {
//        //TC 8.2 SearchBox Document.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        DocPageObj.ClickSearchBox("Processed");
//        Thread.sleep(2000);
//        assertions.isPresent(DocPageObj.SearchBox);
//        Thread.sleep(2000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003 - update_document_cancel_and_check_Chart_level_flags")
//    @Description("verify user able to update_document_cancel_and_check_Chart_level_flags")
//    @Test(priority = 3, groups = "smoke", description = "verify update_document_cancel_and_check_Chart_level_flags")
//
//    public void update_document_cancel_and_check_Chart_level_flags() throws Exception {
//        //TC 8.3 Update Document and Cancel it.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickViewDocIcon5();
//        Thread.sleep(3000);
//        //   Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[@class='col-md-6 pr-4 ng-tns-c278-31']")));
//        DocPageObj.ClickOnChartLevelFlagsBtn();
//        // Thread.sleep(2000);
//
//        DocPageObj.selectNONHCCBtn();
//        // Thread.sleep(2000);
//        DocPageObj.ClickOnChartLevelFlagsBtn();
//        // Thread.sleep(2000);
//        DocPageObj.selectInvalidRecordBtn();
//        //  Thread.sleep(2000);
//        DocPageObj.ClickOnChartLevelFlagsBtn();
//        // Thread.sleep(2000);
//
//        DocPageObj.selectPatientNameMismatchBtn();
//        // Thread.sleep(2000);
//        DocPageObj.ClickExpansionPanel();
//        // Thread.sleep(2000);
//        DocPageObj.ClickCancelDoc2();
//        Thread.sleep(3000);
//        DocPageObj.ClickRefreshDocument();
//        Thread.sleep(3000);
//        assertions.verifyTargetPageURL(DocPageObj.DocumentPageURL);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  -hide_unhide_analytics")
//    @Description("verify user able to searchbox_document")
//    @Test(priority = 4, groups = "smoke", description = "hide_unhide_analytics")
//
//    public void hide_unhide_analytics() throws Exception {
//        //TC 8.4 Hide and UnHide Analytics.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickHideAnalytics();
//        Thread.sleep(2000);
//        DocPageObj.ClickUnHideAnalytics();
//        Thread.sleep(2000);
//        assertions.isPresent(DocPageObj.UnHideAnalytics);
//        Thread.sleep(2000);
//    }
//
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007 -verify items_per_page")
//    @Description("verify user able to verify items_per_page")
//    @Test(priority = 7, groups = "smoke", description = "verify items_per_page")
//
//    public void items_page() throws Exception {
//        //TC 8.7 Items Per Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickItemsPerPage();
//        Thread.sleep(2000);
//        DocPageObj.SelectItemsPerPage();
//        Thread.sleep(2000);
//        assertions.verifyElementText("10", DocPageObj.ItemSelectedNumber);
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008 -verify next_page_previous_page_first_page_last_page")
//    @Description("verify user able to verify next_page_previous_page_first_page_last_page")
//    @Test(priority = 8, groups = "smoke", description = "verify items_per_page")
//
//    public void next_page_previous_page_first_page_last_page() throws Exception {
//        //TC 8.8 Next Page, Previous Page, Last Page and First Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(3000);
//        DocPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickPreviousPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickLastPage();
//        Thread.sleep(2000);
//        DocPageObj.ClickFirstPage();
//        Thread.sleep(3000);
//    }
//
//
//}