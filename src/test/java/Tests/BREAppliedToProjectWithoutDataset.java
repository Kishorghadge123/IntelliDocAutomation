//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.ProjectBREPage;
//import Pages.ProjectPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import org.openqa.selenium.JavascriptExecutor;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Feature("BREApplied To Project Without Dataset")
//@Listeners(Utilities.TestListeners.class)
//public class BREAppliedToProjectWithoutDataset extends TestBase {
//    public ProjectPage ProjectPageObj;
//    AssertionsFunction assertionsFunction;
//    public ProjectBREPage ProjectBREPageObj;
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001 - enter Projec Paget Data")
//    @Description("verify user able to enter Projec Paget Data")
//    @Test( priority = 1,groups="smoke", description = "verify enter Projec Paget Data")
//    public void enterProjecPagetData() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Robot r = new Robot();
//        ProjectPageObj = new ProjectPage(driver);
//        ProjectBREPageObj=new ProjectBREPage(driver);
//        assertionsFunction=new AssertionsFunction(driver);
//        //Object Creation.
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        //Navigate to Project Page.
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
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
//        ProjectPageObj.ClickOnRolesBtn();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("//div[contains(text(),' Roles ')]")));
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[1]")));
//        ProjectPageObj.ClickOnSelectUserBtn();
//        r.keyPress(KeyEvent.VK_ESCAPE);
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        Thread.sleep(2000);
//        //Navigate to Data Page. Adding Variables for Name, Address, State.
//        ProjectPageObj.ClickNextPage();
//        assertionsFunction.isPresent(ProjectPageObj.NextPage);
//
//
//
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002 - enter Variable")
//    @Description("verify user able to enter Variable")
//    @Test (priority=2,groups="smoke", description = "verify enter Variable")
//    public void enterVariable  ()  throws Exception
//    {
//
//        Thread.sleep(5000);
//        ProjectBREPageObj.ClickOnExpandVariables();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.AddVariablesButton);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddVariables();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddWindow);
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName1"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnName();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue1"));
//        ProjectBREPageObj.ClickOnAddButton();
//        //Adding Second Variable for Name.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName2"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnName();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Third Variable for Address.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName3"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnAddress();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue2"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Fourth Variable for Address.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName4"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnAddress();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Fifth Variable for State.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName5"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnState();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue3"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Sixth Variable for State.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName6"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnState();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Seventh Variable for City.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName7"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnCity();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue4"));
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Eight Variable for City.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName8"));
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnCity();
//
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddButton();
//
//
//        //Adding Ninth Variable for ZIP.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName9"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnZIP();
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue5"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddButton();
//
//////
//////                //Adding Tenth Variable for ZIP.
//        ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName10"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnValidationType();
//        ProjectBREPageObj.ClickOnZIP();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
//        ProjectBREPageObj.ClickOnAddButton();
//        ProjectBREPageObj.ClickOnCancelButton();
//
//        assertionsFunction.verifyTargetPageURL(ProjectBREPageObj.ProjectPageURL);
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.VariableAddedTable);
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003 - add And Delete Rules Button")
//    @Description("verify user able to add And Delete Rules Button")
//    @Test (priority = 3,groups="smoke", description = "verify add And Delete Rules Button")
//
//    public void addAndDeleteRulesButton() throws Exception
//    {
//
//        //Navigate to Rules Page.
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnNextPageButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnThreeDotsButton();
//        Thread.sleep(2000);
//        ProjectBREPageObj.ClickOnProjectData();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnProjectData();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnDataSets();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariables();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnThreeDotsButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnDeleteRulesButton();
//
//
//        //Adding First Rule for Name.
//        //TC-1 BRE Applied to NAME-Pass.
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnExpandFirstRule();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnContractRuleButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVisibility();
//        Thread.sleep(2000);
//        ProjectBREPageObj.DoubleClickOnRule1();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnRule();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnClearRule();
//        ProjectBREPageObj.DoubleClickOnRule1Second();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnRule();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterRuleName("SampleRule1");
//
//        Thread.sleep(1000);
//
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("Name");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddCondition();
//        ProjectBREPageObj.ClickOnAttributeValue();
//
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.AttributeList);
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectNameAttribute();
//        ProjectBREPageObj.ClickOnOperator();
//        ProjectBREPageObj.SelectOperatorValueEqualTo();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFirstDecisionBox();
//        Thread.sleep(1000);
////
////
////                //Add Action.
//        ProjectBREPageObj.DoubleClickOnTrue1();
//        ProjectBREPageObj.ClickOnFirstTrueBoxButton();
//        ProjectBREPageObj.EnterActionValue("Name Exists");
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariableDropdown();//unable to write dynamic xpath
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectVariable1();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        assertionsFunction.isPresent(ProjectBREPageObj.Save);
//        Thread.sleep(2000);
//
//    }
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004 - bre applied to name fail")
//    @Description("verify user able to bre applied to name fail")
//    @Test(priority =4,groups="smoke", description = "verify bre applied to name fail")
//
//    public void bre_applied_to_name_fail() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        //TC-2 BRE Applied to NAME-Fail.
//        Thread.sleep(2000);
//        ProjectBREPageObj=new ProjectBREPage(driver);
//        Thread.sleep(1000);
//        ProjectBREPageObj.DoubleClickOnFalse();
//        ProjectBREPageObj.ClickOnFalseBoxButton1();
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.FalseConditionBox);
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        ProjectBREPageObj.SelectVariable2();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        assertionsFunction.verifyElementPresent(ProjectBREPageObj.ConditionSaved);
//        ProjectBREPageObj.ClickOnFalseBoxButton1();
//        assertionsFunction.isPresent(ProjectBREPageObj.FalseBox);
//        Thread.sleep(1000);
//
//    }
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005 - brev applied to address pass")
//    @Description("verify user able to brev applied to address pass")
//    @Test(priority =5,groups="smoke", description = "verify brev applied to address pass")
//    public void bre_applied_to_address_pass() throws Exception {
////                WebDriver driver = DriverFactory.getInstance().getDriver();
//        //Adding Second Rule for Address.
////////                //TC-3 BRE Applied to Address = Pass.
//
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnExpandSecondRule();
////////
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("Address");
//        ProjectBREPageObj.ClickOnAddCondition();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAttributeValue();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectAddressAttribute();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnOperator();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectOperatorValueEqualTo();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFirstDecisionBox();
//        Thread.sleep(1000);
//        //Add Action.
//        ProjectBREPageObj.DoubleClickOnTrue2();
//        Thread.sleep(1000);
//        ProjectBREPageObj.clicksecondbox();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterActionValue("Address Exists");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectVariable3();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSecondTrueBoxButton();
//        assertionsFunction.isPresent(ProjectBREPageObj.TrueBox2);
//        Thread.sleep(2000);
//
//    }
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 006 - bre applied to address fail")
//    @Description("verify user able to bre applied to address fail")
//    @Test(priority =6,groups="smoke", description = "verify bre applied to address fail")
//    public void bre_applied_to_address_fail() throws Exception {
////                WebDriver driver = DriverFactory.getInstance().getDriver();
//        //TC-4 BRE Applied to Address-Fail.
//      Thread.sleep(3000);
//      ProjectBREPageObj.DoubleClickOnFalse2();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFalseBoxButton2();
//        ProjectBREPageObj.EnterActionValue("Address Doesn't Exists");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectVariable4();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFalseBoxButton2();
//        assertionsFunction.isPresent(ProjectBREPageObj.FalseBox2);
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 007 - bre applied to state pass")
//    @Description("verify user able to bre applied to state pass")
//    @Test(priority =7,groups="smoke", description = "verify bre applied to state pass")
//    public void bre_applied_to_state_pass() throws Exception {
////                WebDriver driver = DriverFactory.getInstance().getDriver();
//        //Adding Third Rule for State.
//        //TC-5 BRE Applied to State = Pass.
//        ProjectBREPageObj.ClickOnAddRulesButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnExpandThirdRule();
//        Thread.sleep(1000);
//        //Add Condition.
//        ProjectBREPageObj.EnterAddNameOfCondition("State");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddCondition();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAttributeValue();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectStateAttribute();
//        Thread.sleep(1000);
//
//        ProjectBREPageObj.ClickOnOperator();
//        Thread.sleep(1000);
//
//        ProjectBREPageObj.SelectOperatorValueEqualTo();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFirstDecisionBox();
//        Thread.sleep(1000);
//        //Add Action.
//        ProjectBREPageObj.DoubleClickOnTrue3();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnThirdTrueBoxButton();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterActionValue("State Exists");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectVariable5();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnThirdTrueBoxButton();
//        assertionsFunction.isPresent(ProjectBREPageObj.TrueBox3);
//        Thread.sleep(2000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 008 - bre applied to state fail")
//    @Description("verify user able to bre applied to state fail")
//    @Test(priority =8,groups="smoke", description = "verify bre applied to state fail")
//    public void bre_applied_to_state_fail() throws Exception {
////                WebDriver driver = DriverFactory.getInstance().getDriver();
//        //TC-6 BRE Applied to State-Fail.
//        Thread.sleep(1000);
//        ProjectBREPageObj.DoubleClickOnFalse3();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFalseBoxButton3();
//        Thread.sleep(1000);
//        ProjectBREPageObj.EnterActionValue("State Doesn't Exists");
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnAddAction();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnVariableDropdown();
//        Thread.sleep(1000);
//        ProjectBREPageObj.SelectVariable6();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnSave();
//        Thread.sleep(1000);
//        ProjectBREPageObj.ClickOnFalseBoxButton3();
//        Thread.sleep(1000);
//        assertionsFunction.isPresent(ProjectBREPageObj.FalseBox3);
//        Thread.sleep(2000);
//
////    }
//        }
//}