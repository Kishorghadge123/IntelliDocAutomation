//package Tests;
//
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.*;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.ReadProps;
//import io.qameta.allure.*;
//import org.checkerframework.checker.units.qual.A;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import javax.print.Doc;
//import java.awt.*;
//
//@Feature("BREForReplace With StringRule")
//@Listeners(Utilities.TestListeners.class)
//public class BREForReplaceWithStringRule extends TestBase {
//     ProjectPage ProjectPageObj;
//     ProjectBREPage ProjectBREPageObj;
//     DocumentPage DocPageObj;
//     AnalyticsPage AnalyticsPageObj;
//     ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj;
//    AssertionsFunction assertionsFunction;
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001 - bre applied to patient name")
//    @Description("verify bre applied to patient name")
//    @Test(priority = 1, groups = "smoke", description = "verify bre applied to patient name")
//    public void bre_applied_to_patient_name() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//// In 667Implementation of Document display page after the rules have been run
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertionsFunction=new AssertionsFunction(driver);
//        Robot r = new Robot();
//        //Object Creation.
//        ProjectPageObj = new ProjectPage(driver);
//        ProjectBREPageObj = new ProjectBREPage(driver);
//        AnalyticsPageObj = new AnalyticsPage(driver);
//        DocPageObj = new DocumentPage(driver);
//        ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
//        Thread.sleep(2000);
//        ProjectPageObj.ClickEditProjectBtn();
//        Thread.sleep(2000);
//        //Navigate to Data Page.
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(3000);
//        assertionsFunction.verifyElementPresent(ProjectPage.DataPageDispaly);
//        Thread.sleep(1000);
//
//        //Navigate to Rules Page.
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(1000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBoxDisplay);
//        Thread.sleep(1000);
//
//
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("Patient Name");
//        Thread.sleep(1000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.AddNameOfCondition);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddCondition();
//        Thread.sleep(2000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBox);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntity();
//        Thread.sleep(3000);
////        assertionsFunction.verifyElementPresent(ProjectBREPage.SelectPatientDemographics);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntityPD();
////        assertionsFunction.verifyElementText("PatientDemographics", ProjectBREPage.PDEntitySelected);
//        Thread.sleep(1000);
//
//        ProjectBREPageObj.ClickOnOperator();
//        ProjectBREPageObj.SelectOperatorValueEqualTo();
//        assertionsFunction.verifyElementText("==", ProjectBREPage.OperatorValueEqualTo);
//        ProjectBREPageObj.EnterValue(ReadProps.readAttr("OperatorValue"));
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(3000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionSaved);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFirstDecisionBox();
//
//        //Add Action.
//        ProjectBREPageObj.DoubleClickOnTrue1();
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        ProjectBREPageObj.EnterActionValue("Replace Name");
//        ProjectBREPageObj.ClickOnAddAction();
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        ProjectBREPageObj.ClickOnActionType();
//        ProjectBREPageObj.SelectReplaceStringBtn();
//        Thread.sleep(2000);
//        ProjectBREPageObj.SelectEntityBtn();
//        Thread.sleep(3000);
//        ProjectBREPageObj.SelectPatientGraphicsBtn();
//        Thread.sleep(3000);
//
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        ProjectBREPageObj.ClickOnActionType();
//        Thread.sleep(3000);
//        ProjectBREPageObj.SelectReplaceStringBtn();
//        assertionsFunction.verifyElementText("Replace String", ProjectBREPage.ReplaceString);
//        Thread.sleep(2000);
//        ProjectBREPageObj.SelectEntityBtn();
//        ProjectBREPageObj.SelectPatientGraphicsBtn();
//        assertionsFunction.isPresent(ProjectBREPageObj.PatientDemoGraphics);
//        Thread.sleep(1000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(20000);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(2000);
//////Search Medical Chart Project.
//        DocPageObj.selectproject();
//        Thread.sleep(2000);
//
//        DocPageObj.clickonreadyDocument();
//        Thread.sleep(3000);
//        DocPageObj.clickonchartdata();
//        assertionsFunction.isPresent(DocPageObj.chartdata);
//        Thread.sleep(1000);
//        AnalyticsPageObj.ClickAnalyticsBtn();
//        assertionsFunction.isPresent(AnalyticsPageObj.AnalyticsBtn);
//        Thread.sleep(1000);
//    }
//
//    @Test(priority = 2)
//    public void verify_replace_first() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ///IN752 Ability to set document attributes from actions
//
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
//        Thread.sleep(2000);
//        ProjectPageObj.ClickEditProjectBtn();
//        Thread.sleep(2000);
//        //Navigate to Data Page.
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(5000);
////        assertionsFunction.verifyElementPresent(ProjectPage.DataPageDispaly);
////        Thread.sleep(1000);
//
//        //Navigate to Rules Page.
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(3000);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(2000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBoxDisplay);
//        Thread.sleep(1000);
//
//
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("Patient Name");
//        Thread.sleep(1000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.AddNameOfCondition);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddCondition();
//        Thread.sleep(3000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionBox);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntity();
//        Thread.sleep(3000);
//        assertionsFunction.verifyElementPresent(ProjectBREPage.SelectPatientDemographics);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddBREEntityPD();
////        assertionsFunction.verifyElementText("PatientDemographics", ProjectBREPage.PDEntitySelected);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAttributeValue();
//        ProjectBREPageObj.SelectPatientNameAttribute();
////        assertionsFunction.verifyElementText("Patient Name", ProjectBREPage.AttributeValue);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnOperator();
//        ProjectBREPageObj.SelectOperatorValueEqualTo();
////        assertionsFunction.verifyElementText("==", ProjectBREPage.OperatorValueEqualTo);
//        ProjectBREPageObj.EnterValue(ReadProps.readAttr("OperatorValue"));
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(3000);
////        assertionsFunction.verifyElementPresent(ProjectBREPage.ConditionSaved);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFirstDecisionBox();
//
//        //Add Action.
//        ProjectBREPageObj.DoubleClickOnTrue1();
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        ProjectBREPageObj.EnterActionValue("Replace Name");
//        ProjectBREPageObj.ClickOnAddAction();
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        ProjectBREPageObj.ClickOnActionType();
//        ProjectBREPageObj.SelectReplaceStringBtn();
//        Thread.sleep(2000);
//        ProjectBREPageObj.SelectEntityBtn();
//        Thread.sleep(3000);
//        ProjectBREPageObj.SelectPatientGraphicsBtn();
//        Thread.sleep(3000);
////        assertionsFunction.isPresent(ProjectBREPageObj.PatientDemoGraphics);
//        Thread.sleep(1000);
//
//
//    }
//
//    @Test(priority = 3)
//
//    public void verify_replace_all() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ///IN752 Ability to set document attributes from actions
//        //
//
//       ;
//Thread.sleep(2000);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(4000);
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("ProjectBRE"));
//        Thread.sleep(2000);
//        ProjectPageObj.ClickEditProjectBtn();
//        Thread.sleep(2000);
//        //Navigate to Data Page.
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        //Navigate to Rules Page.
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(ProjectBREPageObj.NextPageOnRulesPage);
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 4)
//    public void delete_created_rule() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(2000);
////        assertionsFunction.verifyElementPresent(ProjectBREPage.RuleBoxDisplay);
//        Thread.sleep(1000);
//        DocPageObj.ClickOnDeleteRule1Condition1();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(DocPageObj.DeleteRule1Condition1);
//
//    }
//
//}