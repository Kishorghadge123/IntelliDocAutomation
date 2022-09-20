//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.*;
//
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.LoginUser;
//import Utilities.ReadProps;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("Project BREStructure Chart Document Test")
//
//@Listeners(Utilities.TestListeners.class)
//
//public class ProjectBREStructureChartDocumentTest extends TestBase {
//    public  ProjectBREStructureChartDocumentPage ProjectBREStructureChartDocumentPageobj;
//    DocumentPage DocPageObj;
//   WebDriver driver;
//    AssertionsFunction assertions;
//
//
//
//
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - verifyUI")
//    @Description("verify user able to verifyUI")
//    @Test(priority = 1, groups = "smoke", description = "verify verifyUI")
//
//
//    public void verifyUI() throws Exception {
//
//        //IN 510 Revamp of the screen for the documents of the status 'Rejected'.
//        //  LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        ProjectBREStructureChartDocumentPageobj = new ProjectBREStructureChartDocumentPage(driver);
//
//        Thread.sleep(4000);
//
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(2000);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.select_structure_project();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
//        Thread.sleep(2000);
//        //Search Medical Chart Project
//        driver.navigate().back();
//        Thread.sleep(3000);
//        assertions.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002  - Verify_Button_Are_Available")
//    @Description("verify user able to Verify_Button_Are_Available")
//    @Test(priority = 2, groups = "smoke", description = "verify  Button_Are_Available")
//
//    public void Verify_Button_Are_Available() throws Exception {
////IN 581 Creation of permission to edit the 'Processed Document'
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
//        Thread.sleep(2000);
//
//        ProjectBREStructureChartDocumentPageobj.getCancelButton();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getCancelButton())));
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.getReleaseButton();
//        Thread.sleep(1000);
////        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getReleaseButton())));
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
////        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
//        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
//        Thread.sleep(1000);
//        ///IN 559 Once the document has been processed, for semi structured, free form, the values should be in read only mode
//        ProjectBREStructureChartDocumentPageobj.getEmail();
//        Thread.sleep(2000);
//        Assert.assertFalse(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
//        //Assert.assertFalse(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
//
//        driver.navigate().back();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003  - verify_data_extracted_from_Each_page")
//    @Description("verify user able to verify_data_extracted_from_Each_page")
//    @Test(priority = 3, groups = "smoke", description = "verify_data_extracted_from_Each_page")
//
//
//    public void verify_data_extracted_from_Each_page() throws Exception {
/////471 AIML Engine multithreading bug fix
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
//        Assert.assertFalse(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
//        ProjectBREStructureChartDocumentPageobj.ClickNvgtRt();
//
//        driver.navigate().back();
//        Thread.sleep(1000);
//        assertions.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.docurl);
//        Thread.sleep(1000);
//
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004  - Verify_data_and_buttons_available_on_page")
//    @Description("verify user able to Verify_data_and_buttons_available_on_page")
//    @Test(priority = 4, groups = "smoke", description = "Verify_data_and_buttons_available_on_page")
//
//    public void Verify_data_and_buttons_available_on_page() throws Exception {
////IN 682  Once the document is in processed state, buttons like edit, add should not be available, the page should contain only the processed data and on the top right corner, 'Cancel' button should be made available
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.clickOnstructurePdf();
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.getCancelButton();
//        Assert.assertTrue(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getCancelButton())));
//        ProjectBREStructureChartDocumentPageobj.getReleaseButton();
////        Assert.assertTrue(AssertionsFunction.isPresent((ProjectBREStructureChartDocumentPageobj.getReleaseButton())));
//        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
//        Assert.assertTrue(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
//        ProjectBREStructureChartDocumentPageobj.getsubmitButton();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getRunRuleButton())));
//        //459 Matching non matched key using fuzzy wuzzy in structured document
//        ProjectBREStructureChartDocumentPageobj.clickOnStructureChartData();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.getEmail();
//        Thread.sleep(1000);
//        Assert.assertFalse(assertions.isPresent((ProjectBREStructureChartDocumentPageobj.getEmail())));
//        driver.navigate().back();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickLogoutBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(ProjectBREStructureChartDocumentPageobj.loginurl);
//
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005  - Observe_tooltip_for_text_overflow")
//    @Description("verify user able to Observe_tooltip_for_text_overflow")
//    @Test(priority = 5, groups = "smoke", description = "verify Observe_tooltip_for_text_overflow")
//
//
//    public void Observe_tooltip_for_text_overflow() throws Exception {
//        //In 736 Tooltip consistency in Document Navigator and Document Viewer
//        //838 Revamp of the screen, when, no projects/templates/roles are available, ie, when the screen is blank in the respective sections
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Robot r = new Robot();
//        LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
//        Thread.sleep(2000);
//
//        ProjectBREStructureChartDocumentPageobj.ClickOnCreateProjectBtn();
//        Thread.sleep(400);
//        ProjectBREStructureChartDocumentPageobj.clickOnNameField();
//
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.clickOnLead();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnStartDateBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.SelectStartDateBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnEndDate();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.SelectEndDate();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentStructureBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.SelectDocumentStructureBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnProcessingEngineBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.SelectOnProcessingEngineBtn();
//        Thread.sleep(1000);
//
//        ProjectBREStructureChartDocumentPageobj.ClickOnStatusBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentAutoAssignBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnStraightThroughProcessBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnDocumentScoreButton();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,15000)", "");
//        Thread.sleep(5000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnAddUserBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.clickOutside();
//        Thread.sleep(1000);
////        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        Thread.sleep(5000);
//        ProjectBREStructureChartDocumentPageobj.ClickOnCreate();
//        Thread.sleep(3000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        Thread.sleep(2000);
//        ProjectBREStructureChartDocumentPageobj.click_on_search_project();
//        Thread.sleep(1000);
//        ProjectBREStructureChartDocumentPageobj.overOnProjectName();
//        Thread.sleep(1000);
//    }
//}
//
//
