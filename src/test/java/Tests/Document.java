//
//    package Tests;
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//
//import Pages.DocumentPage;
//import Utilities.AssertionsFunction;
//import io.qameta.allure.Description;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//    @Listeners(Utilities.TestListeners.class)
//    public class Document extends BaseTest{
//        DocumentPage Docobj;
//        AssertionsFunction assertionsFunction;
//
//        WebDriver driver;
//
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 01  - verify_expansion_panel")
//        @Description("verify user able to verify_expansion_panel")
//        @Test (priority=1,groups="sanity", description = " verify_expansion_panel")
//        public void verify_expansion_panel() throws Exception {
//            WebDriver driver = DriverFactory.getInstance().getDriver();
//            assertionsFunction=new AssertionsFunction(driver);
//
//            Docobj = new DocumentPage(driver);
//            Docobj.clickondocumentbtn();
//            Thread.sleep(3000);
//            Assert.assertTrue(assertionsFunction.isPresent(Docobj.getExpansionPanel()));
//        }
//
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 02  - verify_status_sort")
//        @Description("verify user able to verify_status_sort")
//        @Test (priority=2,groups="sanity", description = " verify_status_sort")
//
//        public void verify_status_sort() throws Exception {
//            Assert.assertTrue(assertionsFunction.isPresent(Docobj.getStatusSort()));
//        }
//
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 03  - verify_assignee_sort")
//        @Description("verify user able to verify_assignee_sort")
//        @Test (priority=3,groups="sanity", description = " verify_assignee_sort")
//
//        public void verify_assignee_sort() throws Exception {
//
//            Assert.assertTrue(assertionsFunction.isPresent(Docobj.getAssigneeSort()));
//        }
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 04  - verify_type_sort")
//        @Description("verify user able to verify_type_sort")
//        @Test (priority=4,groups="sanity", description = " verify_type_sort")
//
//        public void verify_type_sort() throws Exception {
//            Assert.assertTrue(assertionsFunction.isPresent(Docobj.getTypeSort()));
//        }
//
//
//        @Severity(SeverityLevel.CRITICAL)
//        @Story("story_id: 05  - verify_doc_sort")
//        @Description("verify user able to verify_doc_sort")
//        @Test (priority=5,groups="sanity", description = " verify_doc_sort")
//        public void verify_doc_sort() throws Exception {
//
//            Assert.assertTrue(assertionsFunction.isPresent(Docobj.getDocSort()));
//        }
//
//
//
//
//
//
//
//}
