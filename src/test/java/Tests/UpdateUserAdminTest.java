//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.AnalyticsPage;
//import Pages.CreateUserPage;
//import Utilities.*;
//import io.qameta.allure.*;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Step;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//import javax.annotation.Priority;
//
//@Feature("Update User Admin Test")
//
//public class UpdateUserAdminTest extends TestBase {
//    CreateUserPage UserPageObj1;
//
//
//     WebDriver driver;
//    AssertionsFunction assertions;
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001 - Update User Admin Flow")
//    @Description("verify user able to Update User Admin Flow")
//    @Test(priority = 1, groups = "smoke", description = " verify UpdateUserAdminFlow")
//
//    public void UpdateUserAdminFlow() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//
//        assertions = new AssertionsFunction(driver);
//        UserPageObj1 = new CreateUserPage(driver);
//
//
//        driver.manage().window().maximize();
//
//
//        //TC 22.1 Admin Login with Valid Credentials.
////        LoginUser.login_users(driver, "di-admin@neutrinotechsystems.com", "Nts#admin@123");
//        UserPageObj1.clickOnUserMenu();
//        UserPageObj1.clickonlist();
//        Thread.sleep(2000);
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        assertions.isPresent(UserPageObj1.selectSearchedUser);
//        Thread.sleep(1000);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002 - disable_user_update")
//    @Description("verify user able to disable_user_update")
//    @Test(priority = 2, groups = "smoke", description = " verify disable_user_update")
//
//    public void disable_user_update() throws Exception {
//        //TC 22.2 Disable User and Update.
//        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj1.clickOnUpdateUserButton();
//        // UserPageObj1.SearchCreatedUser("Qa User");
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        UserPageObj1.clickOnUpdateUserButton();
//        assertions.isPresent(UserPageObj1.CreateUserBtn);
//        Thread.sleep(1000);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003 - enable_user_update")
//    @Description("verify user able to enable_user_update")
//    @Test(priority = 3, groups = "smoke", description = " verify enable_user_update")
//
//    public void enable_user_update() throws Exception {
//        //TC 22.3 Enable User and Update.
//        //UserPageObj1.SearchCreatedUser("Qa User");
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        UserPageObj1.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj1.clickOnUpdateUserButton();
//        assertions.isPresent(UserPageObj1.CreateUserBtn);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004 - update_with_blank_name")
//    @Description("verify user able to update_with_blank_name")
//    @Test(priority = 4, groups = "smoke", description = " verify update_with_blank_name")
//
//    public void update_with_blank_name() throws Exception {
//        //TC 22.4 Update with Blank Name.
//        UserPageObj1.clickonlist();
//        Thread.sleep(3000);
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        UserPageObj1.clearUserName();
//        UserPageObj1.clickOnUpdateUserButton();
//        UserPageObj1.ClickOnCancelBtn();
//        Thread.sleep(2000);
//        assertions.isPresent(UserPageObj1.CreateUserBtn);
//
//        Thread.sleep(1000);
//
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005 - update_with_invalid_username")
//    @Description("verify user able to update_with_invalid_username")
//    @Test(priority = 5, groups = "smoke", description = " verify update_with_invalid_username")
//
//    public void update_with_invalid_username() throws Exception {
//        //TC 22.5 Update with Invalid UserName.
//       UserPageObj1.clickonlist();
//       Thread.sleep(3000);
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        UserPageObj1.clearUserName();
//        UserPageObj1.EnterNewUserName(ReadProps.readAttr("EnterName"));
//        UserPageObj1.clickOnUpdateUserButton();
//        UserPageObj1.ClickOnCancelBtn();
//        Thread.sleep(2000);
//        assertions.isPresent(UserPageObj1.CreateUserBtn);
//
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 006 - update_with_valid_username")
//    @Description("verify user able to update_with_valid_username")
//    @Test(priority = 6, groups = "smoke", description = " verify update_with_valid_username")
//
//    public void update_with_valid_username() throws Exception {
//        //TC 22.6 Update with Valid Name.
//        UserPageObj1.clickonlist();
//        Thread.sleep(3000);
//        UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username"));
//        UserPageObj1.selectSearchedUser();
//        UserPageObj1.clearUserName();
//        UserPageObj1.EnterNewUserName(ReadProps.readAttr("ValidNameUP")); // change name
//        UserPageObj1.clickOnUpdateUserButton();
//        Thread.sleep(2000);
//        // Created Updated time diff
//
//
//    }
////    @Test(priority = 7)
////    public  void Sorting_User() throws Exception {
////////        // 22.10 Sorting by Name, email,updated,created time
////        UserPageObj1.ClickOnSortUserArrow();
////        LoginUser.logoutUser(driver);
////
////    }
//}