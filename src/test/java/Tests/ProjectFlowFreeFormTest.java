//
//
//
//    package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.DocumentPage;
//import Pages.ProjectPage;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.ReadProps;
//import io.qameta.allure.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//    @Feature("Project Flow Free Form Test")
//    @Listeners(Utilities.TestListeners.class)
//
//    public class ProjectFlowFreeFormTest extends TestBase {
//        static DocumentPage DocPageObj;
//        static ProjectPage ProjectPageObj;
//
//AssertionsFunction assertionsFunction;
//         WebDriver driver;
//        AssertionsFunction assertions;
//
//
//
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 001  - create_project_without_adding_attributes_and_role")
//        @Description("verify user able to create_project_without_adding_attributes_and_role")
//        @Test(priority = 1, groups = "smoke", description = "verify create_project_without_adding_attributes_and_role")
//        //IN 876 When there is no use of the 'processing engine', the field should not be visible, for example in case of 'Free form' and 'Medical charts'
//        public void create_project_without_adding_attributes_and_role() throws Exception {
//            WebDriver driver = DriverFactory.getInstance().getDriver();
//            assertionsFunction=new AssertionsFunction(driver);
//
//            Robot r = new Robot();
//
//            //TC 15.1 Verify Create Project without adding the Attributes and Role.
//
//            assertions = new AssertionsFunction(driver);
//            ProjectPageObj = new ProjectPage(driver);
//            DocPageObj = new DocumentPage(driver);
//
//
//            ProjectPageObj.ClickOnCreateProjectBtn();
//            Thread.sleep(2000);
//            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName1"));
//            ProjectPageObj.ClickOnLeadBtn();
//            ProjectPageObj.SelectOnLeadBtn();
//            Thread.sleep(1000);
//            ProjectPageObj.ClickOnStartDateBtn();
//            ProjectPageObj.SelectStartDateBtn();
//            ProjectPageObj.ClickOnEndDate();
//            ProjectPageObj.SelectEndDate();
//            ProjectPageObj.ClickOnDocumentStructureBtn();
//            ProjectPageObj.SelectOnFreeFormStructure();
//            Thread.sleep(1000);
//            ProjectPageObj.ClickOnStatusBtn();
//            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//            ProjectPageObj.clickoncreatebtn();
//            ProjectPageObj.VerifyAssertForBlank();
//            Thread.sleep(3000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,10000)", "");
//        }
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 002  - create_project_without_adding_user")
//        @Description("verify user able to create_project_without_adding_user")
//        @Test(priority = 2, groups = "smoke", description = "verify create_project_without_adding_user")
//
//        public void create_project_without_adding_role() throws Exception {
//            //TC 15.2 Verify Create Project without adding the Role.
//            ProjectPageObj.ClickOnAddFieldBtn();
//            Thread.sleep(1000);
//            ProjectPageObj.SelectFieldValue();
//            Thread.sleep(1000);
//            ProjectPageObj.selectdropdown();
//            Thread.sleep(2000);
//            ProjectPageObj.clickoncreatebtn();
//
//            Thread.sleep(2000);
//
//        }
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 003  - create_project_with_valid_details")
//        @Description("verify user able to create_project_with_valid_details")
//        @Test(priority = 3, groups = "smoke", description = "verify create_project_with_valid_details")
//
//        public void create_project_without_adding_user() throws Exception {
//            //TC 15.3 Verify Create Project without adding the User.
//            ProjectPageObj.ClickOnRolesBtn();
//            ProjectPageObj.ClickOnAddRoleBtn();
//            ProjectPageObj.ClickOnSelectRoleBtn();
//            Thread.sleep(1000);
//            ProjectPageObj.clickoncreatebtn();
//            Thread.sleep(2000);
////            ProjectPageObj.VerifyAssertForUser();
////            Thread.sleep(2000);
//        }
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 004  - verify_add_user")
//        @Description("verify user able to verify_add_user")
//        @Test(priority = 4, groups = "smoke", description = " verify_add_user")
//
//        public void verify_add_user() throws Exception {
//            //TC 15.4 Verify Add User.
//            ProjectPageObj.ClickOnAddUserBtn();
//            ProjectPageObj.ClickOnSelectUserBtn();
//            Thread.sleep(1000);
//            ProjectPageObj.clickOutside();
//            Thread.sleep(1000);
//
//        }
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 005  - next_to_data")
//        @Description("verify user able to next_to_data")
//        @Test(priority = 5, groups = "smoke", description = "verify next_to_data")
//
//
//        public void next_to_data() throws Exception {
//            //TC 15.5 Navigate Next to Data Page and Rules Page and Back to Project Page.
//            ProjectPageObj.ClickNextPage();
//            Thread.sleep(1000);
//            ProjectPageObj.ClickRulesPage();
//            Thread.sleep(1000);
//            ProjectPageObj.ClickBackRulePage();
//            Thread.sleep(1000);
//            ProjectPageObj.CLickBackDataPage();
//            Thread.sleep(1000);
//        }
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 006  - create_project_with_valid_details")
//        @Description("verify user able to create_project_with_valid_details")
//        @Test(priority = 6, groups = "smoke", description = "verify create_project_with_valid_details")
//
//
//        public void create_project_with_valid_details() throws Exception {
//            //TC 15.6 Verify Create Project with Valid Details.
//            WebDriver driver = DriverFactory.getInstance().getDriver();
//            ProjectPageObj.clickoncreatebtn();
//            Thread.sleep(1000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,-15000)", "");
//            Thread.sleep(5000);
//            ProjectPageObj.TableStructure();
//            Thread.sleep(2000);
//            assertions.isPresent(ProjectPageObj.TableStructure);
//            Thread.sleep(2000);
//        }
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 007 - verify_free_form_project")
//        @Description("verify user able to verify_free_form_project")
//        @Test(priority = 7, groups = "smoke", description = "verify_free_form_project")
//
//        public void verify_free_form_project() throws Exception {
//            //IN558 Introduction of mandatory fields for the attributes
//
//            WebDriver driver = DriverFactory.getInstance().getDriver();
//            DocPageObj.ClickDocumentBtn();
//            Thread.sleep(200);
//            DocPageObj.ClickDropDownBtn();
//            Thread.sleep(200);
////Search Medical Chart Project.
//            ;
//            DocPageObj.selectfreeformproject();
//            Thread.sleep(200);
//            DocPageObj.clickonfreereadyDocument();
//            Thread.sleep(2000);
//            DocPageObj.clickonchartdata();
//            assertions.isPresent(DocPageObj.chartdata);
//            Thread.sleep(100);
//
//
//
//    }
//
//
//
//}
