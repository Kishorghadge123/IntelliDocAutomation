//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.ProjectFlowStructuredPage1;
//import Utilities.ReadProps;
//import Utilities.Custome_Wait;
//import Utilities.AssertionsFunction;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//import io.qameta.allure.*;
//
//@Feature("Project Flow Structured Test1")
//@Listeners(Utilities.TestListeners.class)
//public class ProjectFlowStructuredTest1 extends TestBase {
//    ProjectFlowStructuredPage1 ProjectPageObj;
//     WebDriver driver;
//    AssertionsFunction assertions;
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001 - disable_active_project_on_Project_page")
//    @Description("verify user able to disable_active_project_on_Project_page")
//    @Test(priority = 1, groups = "smoke", description = "verify disable_active_project_on_Project_page")
//
//    public void disable_active_project_on_Project_page() throws Exception {
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//
//        assertions = new AssertionsFunction(driver);
//        ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
//
//        //TC 1.1 Disable Project.
//        ProjectPageObj.TableStructure();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
//        Thread.sleep(2000);
//        ProjectPageObj.ClickEditProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickDisableProjectBtn();
//        Thread.sleep(1000);
//        ProjectPageObj.ClickUpdateBtn();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
//        ProjectPageObj.ClearSearch();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(ProjectPageObj.projecturl);
//
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002 - verify_disabled_project_on_Project_page")
//    @Description("verify user able to verify_disabled_project_on_Project_page")
//    @Test(priority = 2, groups = "smoke", description = "verify_disabled_project_on_Project_page")
//
//    public void verify_disabled_project_on_Project_page() throws Exception {
//        //TC 1.2 Verify Disable Project in List View.
//        //TC 18.20 Verify the Functionality of Table Structure.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectFlowStructuredPage1 ProjectPageObj = new ProjectFlowStructuredPage1(driver);
//        ProjectPageObj.TableStructure();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        ProjectPageObj.ClickOnSearchBox(ReadProps.readAttr("Project"));
//        ProjectPageObj.ClickEditProjectBtn();
//        Thread.sleep(2000);
//        ProjectPageObj.ClickEnableProjectBtn();
//        ProjectPageObj.ClickUpdateBtn();
//        Custome_Wait.waitElement(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        assertions.verifyTargetPageURL(ProjectPageObj.projecturl);
//    }
//}