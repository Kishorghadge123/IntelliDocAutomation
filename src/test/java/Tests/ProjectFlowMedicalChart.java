//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Utilities.Custome_Wait;
//import Pages.ProjectPage;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//@Listeners(Utilities.TestListeners.class)
//
//public class ProjectFlowMedicalChart extends TestBase {
//    ProjectPage ProjectPageObj;
//
//
//     WebDriver driver;
//    AssertionsFunction assertions;
//
//
//
//
//
//    @Test(priority = 1)
//    public void check_all_functionalities_on_project_page() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions =new AssertionsFunction(driver);
//ProjectPageObj=new ProjectPage(driver);
//        Robot r = new Robot();
//
//        //TC 16.1 Checking all the functionalities on the Project Page Platform Admin.
//        ProjectPageObj.ClickOnProjectBtn();
//        Thread.sleep(3000);
//        ProjectPageObj.ClickOnCreateProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("MedicalChartProjectName1"));//change this name in Obj file.
//        ProjectPageObj.ClickOnLeadBtn();
//        ProjectPageObj.SelectOnLeadBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnStartDateBtn();
//        ProjectPageObj.SelectStartDateBtn();
//        ProjectPageObj.ClickOnEndDate();
//        ProjectPageObj.SelectEndDate();
//        ProjectPageObj.ClickOnDocumentStructureBtn();
//        ProjectPageObj.SelectDocumentStructureMedicalBtn();
//        Thread.sleep(2000);
//        //assertions.verifyElementSelected(ProjectPageObj.SelectMedical);
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnStatusBtn();
//        Thread.sleep(2000);
//        //assertions.verifyElementSelected(ProjectPageObj.Status);
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
//        Thread.sleep(2000);
//       // assertions.verifyElementSelected(ProjectPageObj.DocumentAutoAssign);
//        Thread.sleep(1000);
//
//
//    }
//
//    @Test(priority = 2)
//    public void create_project_without_entities_and_role() throws Exception {
//        //TC 16.2 Verify Create Project without Entities and Role.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectPageObj.ClickOnCreate();
//        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)", "");
//        Thread.sleep(9000);
//    }
//
//    @Test(priority = 3)
//    public void create_project_with_entities_without_role() throws Exception {
//        //TC 16.3 Verify Create Project with Entities and without Role
//        ;
//        ProjectPageObj.ClickOnAddEntity();
//        Thread.sleep(2000);
//        ProjectPageObj.SelectPatientGraphics();
//        Thread.sleep(2000);
//
//        ProjectPageObj.ClickOnAddEntity();
//        Thread.sleep(1000);
//        ProjectPageObj.SelectPatientGraphics1();
//        Thread.sleep(1000);
//
//        ProjectPageObj.ClickOnCreate();
//        ProjectPageObj.VerifyAssertForRole();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 4)
//    public void create_project_without_user() throws Exception {
//        //TC 16.4 Verify Create Project without User.
//        ProjectPageObj.ClickOnRolesBtn();
//        ProjectPageObj.ClickOnAddRoleBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickOnSelectRoleBtn();
//        Thread.sleep(2000);
//        Thread.sleep(1000);
//        ProjectPageObj.ClickOnCreate();
//        Thread.sleep(1000);
////        ProjectPageObj.VerifyAssertForUser();
////        Thread.sleep(1000);
//    }
//
//    @Test(priority = 5)
//    public void verify_add_user() throws Exception {
//        //TC 16.5 Verify Add User.
//        ProjectPageObj.ClickOnAddUserBtn();
//        ProjectPageObj.ClickOnSelectUserBtn();
//        Thread.sleep(2000);
//      ProjectPageObj.clickOutside();
//        Thread.sleep(2000);
//    }
//
//
//    @Test(priority = 6)
//    public void navigate_next_to_datapage_back_page() throws Exception {
//        //16.6 Navigate Next to Data Page and Rules Page and Back also.
//        ProjectPageObj.ClickNextPage();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickRulesPage();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickBackRulePage();
//        Thread.sleep(2000);
//        ProjectPageObj.CLickBackDataPage();
//        Thread.sleep(2000);
//    }
//
//
//    @Test(priority = 7)
//    public void create_project_with_valid_details() throws Exception {
//        //TC 16.7 Verify Create Project with Valid Details.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000)", "");
//        Thread.sleep(2000);
//        ProjectPageObj.clickoncreatebtn();
//        Thread.sleep(4000);
//        js.executeScript("window.scrollBy(0,-15000)", "");
//        ProjectPageObj.TableStructure();
//
//        Thread.sleep(2000);
//
//    }
//}