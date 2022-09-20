//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.ProjectBREDataSetPage;
//import Pages.ProjectBREPage;
//import io.qameta.allure.*;
//import Pages.ProjectPage;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//import org.openqa.selenium.JavascriptExecutor;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("BREApplied To Project With Dataset")
//@Listeners(Utilities.TestListeners.class)
//public class BREAppliedToProjectWithDataset extends BaseTest {
//    ProjectPage ProjectPageObj;
//    AssertionsFunction assertionsFunction;
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001 - bre applied to name using dataset fail")
//    @Description("verify user able to bre applied to name using dataset fail")
//    @Test(priority = 1,groups="smoke", description = "verify test bre applied to name using dataset fail")
//    public void bre_applied_to_name_using_dataset_fail() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj = new ProjectPage(driver);
//      assertionsFunction=new AssertionsFunction(driver);
//        //Object creation
//        ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//
//        Robot r = new Robot();
//        //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        //Navigate to Project Page.
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
//        Thread.sleep(4000);
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
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
//
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnTemplateBtn();
//
//        ProjectPageObj.ClickOnRolesBtn();
//
//        ProjectPageObj.ClickOnAddRoleBtn();
//
//        ProjectPageObj.ClickOnSelectRoleBtn();
//
//        ProjectPageObj.ClickOnAddUserBtn();
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[1]")));
//        ProjectPageObj.ClickOnSelectUserBtn();
//
//       ProjectPageObj.clickOutside();
//       Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,1000)", "");
//        ProjectPageObj.ClickNextPage();
//       Custome_Wait.wait1();
//        //Navigate to Data Page.
//        ProjectBREDataSetPageObj.ClickOnDataSets();
//        assertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.AddDataSet);
//        ProjectBREDataSetPageObj.ClickOnAddDataSets();
//        assertionsFunction.verifyElementPresent(ProjectBREDataSetPageObj.DatasetNameList);
//        ProjectBREDataSetPageObj.ClickOnChooseDataSet();
//        Thread.sleep(2000);
//        ProjectBREDataSetPageObj.SelectDataSet();
//        Thread.sleep(2000);
//
//        ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
//        //Navigate to Rules Page.
//        ProjectBREPageObj.ClickOnNextPageButton();
//       Custome_Wait.wait1();
//        ProjectBREPageObj.ClickOnThreeDotsButton();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Project DATA')]")));
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ExpandPanelOnRulePage);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnProjectData();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//div[@class='py-1 pl-2'])[1]")));
//        ProjectBREPageObj.ClickOnProjectData();
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//div[@class='py-1 pl-2'])[1]")));
//Thread.sleep(2000);
//        // AssertionsFunction.verifyElementPresent(ProjectBREPageObj.ScaleDownPanelOnRulePage);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]")));
//        //   ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
//        ProjectBREPageObj.ClickOnDeleteRulesButton();
//        //ProjectBREPageObj.verifyElementPresent(ProjectBREPageObj.RuleBoxDisplay);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),'Rule-1')]")));
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//
//        Custome_Wait.wait(driver,ProjectBREPage.ContractFirstRule);
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionBoxDisplay);
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionPanelDisplay);
//        ProjectBREPageObj.ClickOnContractRuleButton();
//        Custome_Wait.wait(driver,ProjectBREPage.Visibility);
//        ProjectBREPageObj.ClickOnVisibility();
//        Thread.sleep(2000);
//        ProjectBREPageObj.DoubleClickOnRule1();
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.ClickOnClearRule();
//        ProjectBREPageObj.DoubleClickOnRule1Second();
//        ProjectBREPageObj.ClickOnRule();
//        ProjectBREPageObj.EnterRuleName("Sample Rule");
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
//        ProjectBREDataSetPageObj.SelectDataSetHeader();
//        ProjectBREPageObj.ClickOnSave();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
//        ProjectBREDataSetPageObj.ClickOnFirstDataSetBox();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.FirstDecisionBox);
//        //Document should be uploaded from backend to check the output.
//
//    }
//}
