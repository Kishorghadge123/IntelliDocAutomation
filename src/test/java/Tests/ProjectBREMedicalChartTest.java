//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.*;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.Functions;
//import Utilities.ReadProps;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("Project BREMedical Chart Test")
//@Listeners(Utilities.TestListeners.class)
//
//public class ProjectBREMedicalChartTest extends TestBase {
//    static
//    ProjectBREPage ProjectBREPageObj;
//    static ProjectPage ProjectPageObj;
//    static ProjectBREDataSetPage ProjectBREDataSetPageObj;
//    public ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
//    public DocumentPage DocPageObj;
//    AssertionsFunction assertions;
//WebDriver driver;
//
//
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - check_all_functions_on_project_page")
//    @Description("verify user able to check_all_functions_on_project_page")
//    @Test(priority = 1, groups = "smoke", description = "verify check_all_functions_on_project_page")
//
//    public void check_all_functions_on_project_page() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Robot r = new Robot();
//        //Initializing Object for Project Page.
//
//        //TC 1 Check all the Functionalities on the Project Page.
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        ProjectPageObj = new ProjectPage(driver);
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//ProjectBREPageObj=new ProjectBREPage(driver);
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(3000);
//        assertions.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREMedicalChartProjectName"));
//        ProjectPageObj.ClickOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureMedicalBtn();
//        ProjectPageObj.ClickOnStatusBtn();
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        //Adding Entities.
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)", "");
//        Thread.sleep(9000);
//        ProjectPageObj.ClickOnAddEntity();
//        Thread.sleep(1000);
//        ProjectPageObj.SelectPatientGraphics();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddEntity();
//        Thread.sleep(1000);
//        ProjectPageObj.SelectPatientGraphics1();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnRolesBtn();
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//ProjectPageObj.clickOutside();
//Thread.sleep(1000);
//        //Navigate to Data Page.
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
//        ProjectBREDataSetPageObj.ClickOnDataSets();
//        Thread.sleep(1000);
//        assertions.isPresent(ProjectBREDataSetPageObj.DataSets);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002  - add_dataset")
//    @Description("verify user able to add_dataset")
//    @Test(priority = 2, groups = "smoke", description = "verify add_dataset")
//
//    public void add_dataset() throws Exception {
//        //TC 2 Adding DataSet.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.ClickOnAddDataSets();
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.ClickOnBREChooseDataSet();
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.SelectBREDataSet();
//        //  Assert.assertTrue(Functions.isElementPresent(ProjectBREDataSetPageObj.getBRESelectDataSet()));
//        // Navigate to Rules Page.
//        ProjectBREPageObj = new ProjectBREPage(driver);
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(2000);
//
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//        ProjectBREPageObj.DoubleClickOnRule1();
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.ClickOnClearRule();
//        ProjectBREPageObj.DoubleClickOnRule1Second();
//Thread.sleep(3000);
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.EnterRuleName("SampleRule1");
//        Thread.sleep(1000);
//        //   AssertionsFunction.isPresent(ProjectBREPageObj.RuleName);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003  - add_condition")
//    @Description("verify user able to add_condition")
//    @Test(priority = 3, groups = "smoke", description = "verify add_condition")
//
//    public void add_condition() throws Exception {
//        //TC 3 Add Condition.
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterAddNameOfCondition("PName and DOB Check");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddCondition();
//        Thread.sleep(1000);
//        ProjectBREPageObj.clickonentity();
//        Thread.sleep(1000);
//        ProjectBREPageObj.clickonpatientdemography();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntity();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntityPD();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnAttributeValue();
//        Thread.sleep(2000);
//        ProjectBREPageObj.SelectBRENameAttribute();
//        ProjectBREPageObj.ClickOnOperator();
//        Thread.sleep(2000);
//        ProjectBREPageObj.SelectOperatorValueExistsIn();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSelectBREDataSet();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnChooseBREDataSet();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnBREDataHeader();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectBREDataHeaderDXCode();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnPNameCheck();
//        Thread.sleep(2000);
//        /// AssertionsFunction.isPresent(ProjectBREPageObj.PNameCheck);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  - add_action")
//    @Description("verify user able to add_action")
//    @Test(priority = 4, groups = "smoke", description = "verify add_action")
//
//    public void add_action() throws Exception {
//        //TC 4 Add Action.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        ProjectBREPageObj.DoubleClickOnTrue1();
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//
//        ProjectBREPageObj.EnterActionValue("Document Pass");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnActionType();
//        Thread.sleep(2000);
//        // AssertionsFunction.isPresent(ProjectBREPageObj.ActionType);
//        Thread.sleep(1000);
//        Thread.sleep(3000);
//        ProjectBREPageObj.ClickOnSetDocumentStatus();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnSave();
//
//        Thread.sleep(2000);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005  - set_document_status_ready")
//    @Description("verify user able to set_document_status_ready")
//    @Test(priority = 5, groups = "smoke", description = "verify set_document_status_ready")
//
//    public void set_document_status_ready() throws Exception {
//        //TC 5 Set Document Status = Ready.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOndropdown();
//        Thread.sleep(2000);
//        ProjectBREPageObj.clickonreadystatus();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006  - set_document_status_rejected")
//    @Description("verify user able to set_document_status_rejected")
//    @Test(priority = 6, groups = "smoke", description = "verify set_document_status_rejected")
//
//    public void set_document_status_rejected() throws Exception {
//        //TC 6 Document Status = Rejected.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOndropdown();
//        Thread.sleep(2000);
//        ProjectBREPageObj.clickonrejected();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007  - set_document_status_rejected")
//    @Description("verify user able to set_document_status_rejected")
//    @Test(priority = 7 ,groups = "smoke", description = "verify set_document_status_rejected")
//
//    public void set_document_status_processed()throws Exception {
//        //TC 6 Document Status = Rejected.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOndropdown();
//        Thread.sleep(2000);
//        ProjectBREPageObj.clickonprocessed();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//
//        Thread.sleep(2000);
//
//
//    }
//
//}