//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.*;
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
//@Feature("Project Flow Semi Structure Test")
//@Listeners(Utilities.TestListeners.class)
//
//public class ProjectFlowSemiStructureTest extends TestBase {
//    ProjectPage ProjectPageObj;
//    DocumentPage DocPageObj;
//    ProjectBREStructureChartDocumentPage ProjectBREStructureChartDocumentPageobj;
//    AnalyticsPage AnalyticsPageObj;
//     WebDriver driver;
//    AssertionsFunction assertions;
//
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - check_all_the_functions_on_project_page")
//    @Description("verify user able to check_all_the_functions_on_project_page")
//    @Test(priority = 1, groups = "smoke", description = "verify check_all_the_functions_on_project_page")
//
//    public void check_all_the_functions_on_project_page() throws Exception {
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREStructureChartDocumentPageobj=new ProjectBREStructureChartDocumentPage(driver);
//
//        assertions = new AssertionsFunction(driver);
//        ProjectPageObj = new ProjectPage(driver);
//        DocPageObj = new DocumentPage(driver);
//        Robot r = new Robot();
//
//        //TC 17.1 Checking all the functionalities on the Project Page.
//        //IN 808 For the semi structure documents, need to change how we are handling the rejected document,earlier we were showing only the list of the attributes, now we have select the model, on basis of that list of attributes will be displayedF
//        ProjectPageObj.ClickOnProjectBtn();
//        Custome_Wait.wait(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("SemiStructuredProjectName1"));
//        ProjectPageObj.ClickOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        Custome_Wait.wait(driver, driver.findElement(ProjectPageObj.SelectSemiStructure));
//        ProjectPageObj.SelectOnSemiStructure();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        assertions.isPresent(ProjectPageObj.DocumentScore);
//Thread.sleep(4000);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002  - check_delete_attribute")
//    @Description("verify user able to check_delete_attribute")
//    @Test(priority = 2, groups = "smoke", description = "verify check_delete_attribute")
//
//    public void check_delete_attribute() throws Exception {
//        //TC 17.2 Checking Delete Attribute.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(6000);
//        ProjectPageObj.ClickOnDeleteAttributeFieldName();
//        Thread.sleep(1000);
//       // assertions.verifyDeletedElementText("Invoice No", ProjectPageObj.DeletedInvoiceAttribute);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003  - create_project_without_role")
//    @Description("verify user able to create_project_without_role")
//    @Test(priority = 3, groups = "smoke", description = "verify create_project_without_role")
//
//    public void create_project_without_role() throws Exception {
//        //TC 17.3 Verify Create Project without Role.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-9000)", "");
//        Thread.sleep(6000);
//
//        ProjectPageObj.ClickOnStatusBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//
//        Thread.sleep(2000);
//
////        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//
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
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004  - navigate_to_data_page_and_Rules_page")
//    @Description("verify user able to navigate_to_data_page_and_Rules_page")
//    @Test(priority = 4, groups = "smoke", description = "verify navigate_to_data_page_and_Rules_page")
//
//    public void navigate_to_data_page_and_Rules_page() throws Exception {
//        //17.4 Navigate Next to Data Page and Rules Page and Back also.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickRulesPage();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickBackRulePage();
//        Thread.sleep(2000);
//        ProjectPageObj.CLickBackDataPage();
//        assertions.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005  - verify_create_project")
//    @Description("verify user able to create_project")
//    @Test(priority = 5, groups = "smoke", description = "verify_create_project")
//
//    public void verify_create_project() throws Exception {
//        //TC 17.5 Verify Create Project.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnCreate();
//     Thread.sleep(4000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-15000)", "");
//        Thread.sleep(4000);
//        ProjectPageObj.TableStructure();
//        Thread.sleep(4000);
////        ProjectPageObj.verifyProjectCreated("SemiStructuredProject");
////        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 006  - check_data_extracted_from_Pharmalink_Inmar_document")
//    @Description("verify user able to check_data_extracted_from_Pharmalink_Inmar_document")
//    @Test(priority = 6, groups = "smoke", description = "check_data_extracted_from_Pharmalink_Inmar_document")
//
//    public void check_data_extracted_from_Pharmalink_Inmar_document() throws Exception {
//        //IN807 Pharmalink Inmar document processing
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DocumentPage DocPageObj = new DocumentPage(driver);
//        TemplatePage TemplatePageObj = new TemplatePage(driver);
//
//        Thread.sleep(2000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(1000);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(1000);
////Search Medical Chart Project.
//
//        DocPageObj.selectsemiproject();
//        Thread.sleep(1000);
//        DocPageObj.clickonReadyDocument();
//        Thread.sleep(1000);
//        DocPageObj.clickonchartdata();
//        Thread.sleep(1000);
//        DocPageObj.clickSaveDraft();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,9000)", "");
//
//        DocPageObj.clickonfilter();
//        Thread.sleep(1000);
//        DocPageObj.selecdropdown();
//        Thread.sleep(1000);
//        DocPageObj.selectrejected();
//        Thread.sleep(4000);
//        DocPageObj.clickOutside();
//        Thread.sleep(1000);
//        DocPageObj.clickapplybtn();
//        Thread.sleep(1000);
//
//        DocPageObj.clickonrejectdoc();
//        Thread.sleep(1000);
//        DocPageObj.clickonchartdata();
//        Thread.sleep(1000);
//        DocPageObj.clickonattributedropdown();
//        Thread.sleep(1000);
//        DocPageObj.addfirstattribute();
//        Thread.sleep(1000);
//        DocPageObj.addsecondattribute();
//        Thread.sleep(1000);
//      DocPageObj.clickOutside();
//      Thread.sleep(2000);
//        DocPageObj.clickSaveDraft();
//
//
//    }
//
//}