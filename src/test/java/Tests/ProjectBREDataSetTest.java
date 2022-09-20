//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.ProjectBREDataSetPage;
//import Pages.ProjectBREPage;
//import Pages.ProjectPage;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import io.qameta.allure.*;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import org.openqa.selenium.JavascriptExecutor;
//
//import java.awt.*;
//
//import java.awt.event.KeyEvent;
//
//@Feature("Project BREDataSet Test")
//@Listeners(Utilities.TestListeners.class)
//public class ProjectBREDataSetTest extends TestBase {
//
//
//    AssertionsFunction assertions;
//    ProjectPage ProjectPageObj;
//ProjectPage projectobj;
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - bre_applied_to_name_using_dataset_fail")
//    @Description("verification_bre_applied_to_name_using_dataset_fail")
//    @Test(priority = 1, groups = "smoke", description = "verification_bre_applied_to_name_using_dataset_fail")
//
//    public void bre_applied_to_name_using_dataset_fail() throws Exception {
//
//        //Object creation
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions = new AssertionsFunction(driver);
//        ProjectPageObj = new ProjectPage(driver);
////p
//
//        ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
//        Robot r = new Robot();
//        //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(3000);
//        //Navigate to Project Page.
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        //Starting Date should be updated in Xpath to Current Date before executing the Script.
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureBtn();
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStatusBtn();
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnRolesBtn();
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        r.keyPress(KeyEvent.VK_ESCAPE);
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,1000)", "");
//        Thread.sleep(4000);
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        //Navigate to Data Page.
//        ProjectBREDataSetPageObj.ClickOnDataSets();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(ProjectBREDataSetPageObj.AddDataSet);
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.ClickOnAddDataSets();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(ProjectBREDataSetPageObj.DatasetNameList);
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.ClickOnChooseDataSet();
//        ProjectBREDataSetPageObj.SelectDataSet();
//        Thread.sleep(2000);
////        ProjectBREDataSetPageObj.SelectData();
////        Thread.sleep(2000);
//        ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
//        //Navigate to Rules Page.
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(3000);
//        ProjectBREPageObj.ClickOnThreeDotsButton();
//        assertions.verifyElementPresent(ProjectBREPageObj.ExpandPanelOnRulePage);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnProjectData();
//        ProjectBREPageObj.ClickOnProjectData();
//        ProjectBREPageObj.ClickOnDataSets();
//        ProjectBREPageObj.ClickOnVariables();
//        ProjectBREPageObj.ClickOnThreeDotsButton();
//        assertions.verifyElementPresent(ProjectBREPageObj.ScaleDownPanelOnRulePage);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//
//        //   ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnDeleteRulesButton();
//        //ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(ProjectBREPageObj.ConditionBoxDisplay);
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(ProjectBREPageObj.ConditionPanelDisplay);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnContractRuleButton();
//        ProjectBREPageObj.ClickOnVisibility();
//        ProjectBREPageObj.DoubleClickOnRule1();
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.ClickOnClearRule();
//        ProjectBREPageObj.DoubleClickOnRule1Second();
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.EnterRuleName("Sample Rule");
//
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("Name");
//        ProjectBREPageObj.ClickOnAddCondition();
//        ProjectBREPageObj.ClickOnAttributeValue();
//        ProjectBREPageObj.SelectNameAttribute();
//        ProjectBREPageObj.ClickOnOperator();
//        ProjectBREDataSetPageObj.SelectOperatorValueExistsIn();
//        ProjectBREDataSetPageObj.ClickOnPredefinedDataSet();
//        ProjectBREDataSetPageObj.SelectPredefinedDataSet();
//        ProjectBREDataSetPageObj.ClickOnDataSetHeader();
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.SelectDataSetHeader();
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        assertions.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
//        Thread.sleep(1000);
//        ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
//        Thread.sleep(2000);
//        assertions.isPresent(ProjectBREDataSetPageObj.FirstDecisionBox);
//        Thread.sleep(1000);
//        assertions.verifyTargetPageURL(ProjectBREDataSetPageObj.breurl);
//
//
//        //Document should be uploaded from backend to check the output.
//
//    }
//
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 01  -   verify_create_project_button_is_present")
////    @Description(" verify_create_project_button_is_present")
////    @Test (priority=1,groups="sanity", description = "Verify   verify_create_project_button_is_present")
////
////    public void verify_create_project_button_is_present() throws Exception {
////
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////
////        assertions = new AssertionsFunction(driver);
////        projectobj = new ProjectPage(driver);
////
////        //TC 13.1 Click on N-Icon.
////        projectobj.ClickOnProjectBtn();
////        Assert.assertTrue(assertions.isPresent(projectobj.getcreateproject()));
////
////    }
////
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 02  -   verify_searchbox_is_present")
////    @Description(" verify_searchbox_is_present")
////    @Test (priority=2,groups="sanity", description = "Verify   verify_searchbox_is_present")
////
////    public void verify_searchbox_is_present() throws Exception {
////
////
////        Assert.assertTrue(assertions.isPresent(projectobj.getsearchbox()));
////
////    }
////
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 03 -   verify_table_structure_is_present")
////    @Description(" verify_table_structure_is_present")
////    @Test (priority=3,groups="sanity", description = "Verify   verify_table_structure_is_present")
////
////    public void verify_table_structure_is_present() throws Exception {
////
////
////        Assert.assertTrue(assertions.isPresent(projectobj.getTableStructure()));
////
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 04  -   verify_list_structure_is_present")
////    @Description(" verify_list_structure_is_present")
////    @Test (priority=4,groups="sanity", description = "Verify   verify_list_structure_is_present")
////
////    public void verify_list_structure_is_present() throws Exception {
////
////
////        Assert.assertTrue(assertions.isPresent(projectobj.getliststructure()));
////
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 05  -   verify_edit_button_is_present")
////    @Description(" verify_edit_button_is_present")
////    @Test (priority=5,groups="sanity", description = "Verify   verify_edit_button_is_present")
////
////    public void verify_edit_button_is_present() throws Exception {
////
////
////        Assert.assertTrue(assertions.isPresent(projectobj.getediticon()));
////
////    }
//
//
//
//
//}