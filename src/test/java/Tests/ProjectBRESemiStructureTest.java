//
//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.*;
//
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Utilities.LoginUser;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//
//@Feature("Project BRESemiStructure Test")
//@Listeners(Utilities.TestListeners.class)
//public class ProjectBRESemiStructureTest extends TestBase {
//
//    public  ProjectBRESemiStructurePage ProjectBRESemiStructurePageObj;
//    public DocumentPage DocPageObj;
//
//
//  WebDriver driver;
//    AssertionsFunction assertions;
//
////@AfterClass
////public void init(){}
//
//
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - Add_Attribute_In_SemiStructureProject")
//    @Description("verify user able to Add_Attribute_In_SemiStructureProject")
//    @Test(priority = 1, groups = "smoke", description = "verify Add_Attribute_In_SemiStructureProject")
//
//
//    public void Add_Attribute_In_SemiStructureProject() throws Exception {
//        //IN 481 Manual Intervention for rejected documents for semi structure kind of documents
////        LoginUser.login_users(driver, "pratiksha.bagal@neutrinotechlabs.com", "Pratiksha@12");
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions = new AssertionsFunction(driver);
//        DocPageObj = new DocumentPage(driver);
//        ProjectBRESemiStructurePageObj=new ProjectBRESemiStructurePage(driver);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(3000);
//        //AssertionsFunction.verifyTargetPageURL(DocPageObj.DocTabUrl);
//        ProjectBRESemiStructurePageObj.click_on_search_project();
//        Thread.sleep(2000);
//        ProjectBRESemiStructurePageObj.select_semi_structure_project();
//        Thread.sleep(2000);
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
//        ProjectBRESemiStructurePageObj.clickonRejectedDocument();
//        Thread.sleep(2000);
//        ProjectBRESemiStructurePageObj.clickOnchartData();
//       Thread.sleep(2000);
//        ProjectBRESemiStructurePageObj.clickonAddAttribute();
//        Thread.sleep(2000);
//        ProjectBRESemiStructurePageObj.selectAttribute();
//        Thread.sleep(2000);
//        ProjectBRESemiStructurePageObj.selectAttributeSecond();
//        Thread.sleep(1000);
//        ProjectBRESemiStructurePageObj.clickOutside();
//        Thread.sleep(1000);
//        ProjectBRESemiStructurePageObj.AddButton();
//        Thread.sleep(2000);
//
//        ProjectBRESemiStructurePageObj.clickOnSubmit();
//        Thread.sleep(5000);
//        ProjectBRESemiStructurePageObj.clickOnSecondSubmitBtn();
//
//    }
//}
//
//
