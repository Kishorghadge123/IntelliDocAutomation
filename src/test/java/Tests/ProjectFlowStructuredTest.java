//package Tests;
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.ProjectPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import  Utilities.Custome_Wait;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//@Feature("Project Flow Structured Test")
//@Listeners(Utilities.TestListeners.class)
//
//public class ProjectFlowStructuredTest extends TestBase {
//    static ProjectPage ProjectPageObj;
//    AssertionsFunction assertionsFunction;
//    WebDriver driver;
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - create_project_with_blank_data")
//    @Description("verify user able to create_project_with_blank_data")
//    @Test (priority=1,groups="smoke", description = "verify create_project_with_blank_data")
//
//    public void create_project_with_blank_data() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertionsFunction=new AssertionsFunction(driver);
//
//        Robot r = new Robot();
//        ProjectPageObj = new ProjectPage(driver);
//        //TC 18.1 Create new project with Blank information and also Verify 'Create' button for Platform Admin.
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(1000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(1000);
//        ProjectPageObj.clickoncancel();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002  - next_button_with_blank_info_for_platform_admin")
//    @Description("verify user able to click next_button_with_blank_info_for_platform_admin")
//    @Test (priority=2,groups="smoke", description = "verify next_button_with_blank_info_for_platform_admin")
//
//    public void next_button_with_blank_info_for_platform_admin() throws Exception {
//        //TC 18.2 Verify Next button with Blank information for Platform Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(1000);
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(1000);
//        ProjectPageObj.VerifyAssertForBlank();
//        Thread.sleep(1000);
//        ProjectPageObj.clickoncancel();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(1000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003  - cancel_with_blank_info")
//    @Description("verify user able to cancel_with_blank_info")
//    @Test (priority=3,groups="smoke", description = "verify cancel_with_blank_info")
//
//
//    public void cancel_with_blank_info() throws Exception {
//        //TC 18.3 Verify Cancel button with Blank information for Platform Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(1000);
//        ProjectPageObj.clickoncancel();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(1000);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004  - create_project_with_invalid_name")
//    @Description("verify user able to create_project_with_invalid_name")
//    @Test (priority=4,groups="smoke", description = "verify create_project_with_invalid_name")
//
//    public void create_project_with_invalid_name() throws Exception {
//        //TC 18.4 Create project with Invalid Project Name for Platform Admin , And Verify Disable Role should not be displayed in the Role List when adding Role.
//        //TC
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickRoleManagementBtn();
////        Custome_Wait.waitElement(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//      Thread.sleep(3000);
//        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
//        Thread.sleep(1000);
//        ProjectPageObj.ClickEditRole();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickActiveRole();
//        ProjectPageObj.ClickUpdateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        Thread.sleep(4000);
//        ProjectPageObj.SelectDocumentStructureBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnStatusBtn();
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        Thread.sleep(2000);
//
//        js.executeScript("window.scrollBy(0,5000)", "");
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(2000);
//
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.clickOutside();
//        Thread.sleep(1000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(1000);
//        ProjectPageObj.VerifyAssertForData();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(200);
//        ProjectPageObj.ClickRoleManagementBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("EditRole"));
//        Thread.sleep(1000);
//        ProjectPageObj.ClickEditRole();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickActiveRole();
//        ProjectPageObj.ClickUpdateBtn();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005 - create_project_without_template")
//    @Description("verify user able to create_project_without_template")
//    @Test (priority=5,groups="smoke", description = "verify create_project_without_template")
//
//    public void create_project_without_template() throws Exception {
//        //TC 18.5  Create project with Project information without Template for Platform Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
////        ProjectPageObj.ClickOnProjectBtn();
////        Thread.sleep(1000);
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        Thread.sleep(4000);
//        ProjectPageObj.SelectDocumentStructureBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnStatusBtn();
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(ProjectPageObj.create);
//
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 006 - create_project_without_role")
//    @Description("verify user able to create_project_without_role")
//    @Test (priority=6,groups="smoke", description = "verify create_project_without_role")
//
//
//    public void create_project_without_role() throws Exception {
//        //TC 18.6 Create project without Role for Platform Admin.And not selecting the Process Engine
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(ProjectPageObj.create);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 007 - create_project_without_user_and_with_valid_data")
//    @Description("verify user able to create_project_without_user_and_with_valid_data")
//    @Test (priority=7,groups="smoke", description = "verify create_project_without_user_and_with_valid_data")
//
//    public void create_project_without_user_and_with_valid_data() throws Exception {
//        //TC 18.7 Create Project without User for Platform Admin and
//        //TC 18.8 Create Project with Valid Data.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnRolesBtn();
//        ProjectPageObj.ClickOnAddRoleBtn();
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.clickOutside();
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
//
//
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 008 - create_project_with_disable_status")
//    @Description("verify user able to create_project_with_disable_status")
//    @Test (priority=8,groups="smoke", description = "verify create_project_with_disable_status")
//
//    public void create_project_with_disable_status() throws Exception {
//        //TC 18.9 Create Project with Disable Status for Platform Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameFA"));//change this name in Obj file.
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureBtn();
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        js.executeScript("window.scrollBy(0,5000)", "");
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.clickOutside();
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,10000)", "");
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 009 - create_project_only_with_role_info")
//    @Description("verify user able to create_project_only_with_role_info")
//    @Test (priority=9,groups="smoke", description = "verify create_project_only_with_role_info")
//
//
//    public void create_project_only_with_role_info() throws Exception {
//        //TC 18.10  Create Project only with Role information for Platform Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,2000)", "");
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddUserBtn();
////        Thread.sleep(3000);
////        ProjectPageObj.ClickOnSelectUserBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.clickOutside();
////        Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//        ProjectPageObj.VerifyAssertForBlank();
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncancel();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(2000);
//        ProjectPageObj.ClickLogout();
//        Thread.sleep(5000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 010 - create_project_with_blank_info")
//    @Description("verify user able to create_project_with_blank_info")
//    @Test (priority=10,groups="smoke", description = "verify create_project_with_blank_info")
//
//    public void create_project_with_blank_info() throws Exception {
//        //TC 18.11 Create New Project with Blank information and also verify Create button for Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
//        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
//        ProjectPageObj.ClickLoginButton();
//        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
//        /*ProjectPageObj.VerifyAssertForBlank();
//        Thread.sleep(2000);*/
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 011 - verify_next_button_with_blank_info")
//    @Description("verify user able to verify_next_button_with_blank_info")
//    @Test (priority=11,groups="smoke", description = "verify next_button_with_blank_info")
//
//
//    public void verify_next_button_with_blank_info() throws Exception {
//        //TC 18.12 Verify Next button with Blank information for Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 012 - verify_cancel_with_blank_info")
//    @Description("verify user able to verify_cancel_with_blank_info")
//    @Test (priority=12,groups="smoke", description = "verify _cancel_with_blank_info")
//
//
//    public void verify_cancel_with_blank_info() throws Exception {
//        //TC 18.13 Verify Cancel button with Blank Information for Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncancel();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(1000);
//    }
////
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 013 - create_project_with_invalid_project_name")
//    @Description("verify user able to create_project_with_invalid_project_name")
//    @Test (priority=13,groups="smoke", description = "verify create_project_with_invalid_project_name")
//
//
//    public void create_project_with_invalid_project_name() throws Exception {
//        //TC 18.14 Create Project with Invalid Project Name for Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureBtn();
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnStatusBtn();
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        js.executeScript("window.scrollBy(0,5000)", "");
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//            ProjectPageObj.clickOutside();
//            Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(3000);
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
//    }
//
//
//
//
////    @Severity(SeverityLevel.CRITICAL)
////    @Story("story_id: 016 - create_project_without_user_for_admin")
////    @Description("verify user able to create_project_without_user_for_admin")
////    @Test (priority=16,groups="smoke", description = "verify create_project_without_user_for_admin")
////
////
////    public void create_project_without_user_for_admin() throws Exception {
////        //TC 18.17 Create project without User for Admin.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////Thread.sleep(4000);
////        ProjectPageObj.ClickOnRolesBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnAddRoleBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(2000);
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,10000)", "");
////        ProjectPageObj.clickoncreatebtn();
////        Thread.sleep(3000);
////        assertionsFunction.verifyTargetPageURL(ProjectPageObj.createProjectUrl);
////
////
////    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 017 - create_project_with_disable_status_for_admin")
//    @Description("verify user able to create_project_with_disable_status_for_admin")
//    @Test (priority=17,groups="smoke", description = "verify create_project_with_disable_status_for_admin")
//
//
//    public void create_project_with_disable_status_for_admin() throws Exception {
//        //TC 18.18 Create Project with Disable Status for Admin.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-10000)", "");
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureBtn();
//        ProjectPageObj.ClickOnProcessingEngineBtn();
//        ProjectPageObj.SelectOnProcessingEngineBtn();
//        ProjectPageObj.ClickOnStraightThroughProcessBtn();
//        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,5000)", "");
//        ProjectPageObj.ClickOnAddTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnTemplateBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnRolesBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddRoleBtn();
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnAddUserBtn();
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.clickOutside();
//        Thread.sleep(3000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(3000);
//        assertionsFunction.verifyTargetPageURL(ProjectPageObj.projectTabUrl);
//        Thread.sleep(1000);
//
//    }
//
////    @Severity(SeverityLevel.CRITICAL)
////    @Story("story_id: 018 - create_project_only_with_role_info_for_admin")
////    @Description("verify user able to create_project_only_with_role_info_for_admin")
////    @Test (priority=18,groups="smoke", description = "verify create_project_only_with_role_info_for_admin")
////
////    public void create_project_only_with_role_info_for_admin() throws Exception {
////        //TC 18.19  Create Project only with Role information for Admin.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////
////        ProjectPageObj.ClickOnProjectBtn();
////        Thread.sleep(2000);
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,-10000)", "");
////        ProjectPageObj.ClickOnCreateProjectBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnRolesBtn();
//////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,10000)", "");
////        ProjectPageObj.ClickOnAddRoleBtn();
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddUserBtn();
////        ProjectPageObj.ClickOnSelectUserBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.clickOutside();
////        Thread.sleep(2000);
////        ProjectPageObj.clickoncreatebtn();
////        Thread.sleep(2000);
////       /* ProjectPageObj.VerifyAssertForBlank();
////        Thread.sleep(2000);*/
////        ProjectPageObj.ClickLogout();
////        Thread.sleep(4000);
////        // AssertionsFunction.verifyTargetPageURL(ProjectPageObj.loginurl);
////
////    }
////
////    @Test(priority = 19)
////    public void create_project_with_valid_data() throws Exception {
////        //TC 18.20 Create Project with Disable Status for Admin.//1covered
////        //TC18.25     To verfiy create project using select option Straight through Process = TRUE
////        //TC 18.28 To verfiy create project using select option Straight through Process = True and Document Score = 0-100
////        // TC 18.27To verfiy create project using select option Document Strucuture = Structured
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////
////        ProjectPageObj = new ProjectPage(driver);
////        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
////        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
////        ProjectPageObj.ClickLoginButton();
////        Custome_Wait.wait(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
////        ProjectPageObj.ClickOnProjectBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnCreateProjectBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnLeadBtn();
////        ProjectPageObj.SelectOnLeadBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnStartDateBtn();
////        ProjectPageObj.SelectStartDateBtn();
////        ProjectPageObj.ClickOnEndDate();
////        ProjectPageObj.SelectEndDate();
////        ProjectPageObj.ClickOnDocumentStructureBtn();
////        ProjectPageObj.SelectDocumentStructureBtn();
////        ProjectPageObj.ClickOnProcessingEngineBtn();
////        ProjectPageObj.SelectOnProcessingEngineBtn();
////        ProjectPageObj.ClickOnStraightThroughProcessBtn();
////        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
////        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
////        Thread.sleep(1000);
////        js.executeScript("window.scrollBy(0,5000)", "");
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnAddTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnRolesBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddRoleBtn();
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddUserBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnSelectUserBtn();
////        Thread.sleep(2000);
////       ProjectPageObj.clickOutside();
////        Thread.sleep(2000);
////        ProjectPageObj.clickoncreatebtn();
////        Thread.sleep(2000);
////
////        ProjectPageObj.ClickOnProjectBtn();
////        Thread.sleep(2000);
//////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,-10000)", "");
////        ProjectPageObj.ClickOnCreateProjectBtn();
////        Thread.sleep(3000);
////        ProjectPageObj.ClickOnRolesBtn();
////        ProjectPageObj.ClickOnAddRoleBtn();
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnAddUserBtn();
////        ProjectPageObj.ClickOnSelectUserBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.clickOutside();
////        Thread.sleep(2000);
////        ProjectPageObj.clickoncreatebtn();
////        Thread.sleep(2000);
////       /* ProjectPageObj.VerifyAssertForBlank();
////        Thread.sleep(2000);*/
////        ProjectPageObj.ClickLogout();
////        Thread.sleep(4000);
////    }
////    //
//////
////    @Test(priority = 20)
////    public void create_project_with_disable_straigth_through_process() throws Exception {
////        //TC 18.18 Create Project with Disable Status for Admin.//1covered
////        //TC18.26 To verfiy create project using select option Straight through Process = False
////
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////
////
////
////        Robot r=new Robot();
////
////
////        ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
////        ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
////        ProjectPageObj.ClickLoginButton();
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
////        ProjectPageObj.ClickOnCreateProjectBtn();
////        Thread.sleep(2000);
////        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnLeadBtn();
////        ProjectPageObj.SelectOnLeadBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnStartDateBtn();
////        ProjectPageObj.SelectStartDateBtn();
////        ProjectPageObj.ClickOnEndDate();
////        ProjectPageObj.SelectEndDate();
////        ProjectPageObj.ClickOnDocumentStructureBtn();
////        ProjectPageObj.SelectDocumentStructureBtn();
////        ProjectPageObj.ClickOnProcessingEngineBtn();
////        ProjectPageObj.SelectOnProcessingEngineBtn();
////        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnRolesBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddRoleBtn();
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddUserBtn();
////        ProjectPageObj.ClickOnSelectUserBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.clickOutside();
////        Thread.sleep(3000);
////        ProjectPageObj.clickoncreatebtn();
////        Thread.sleep(3000);
////        assertionsFunction.isPresent(ProjectPageObj.createbtutton);
////
////    }
//
//}