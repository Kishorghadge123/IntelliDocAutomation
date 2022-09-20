//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import BrowserDriverFactory.TestBase;
//import Pages.CreateRolePage;
//import Pages.CreateUserPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import  Utilities.Custome_Wait;
//import Utilities.Functions;
//import Utilities.LoginUser;
//import Utilities.ReadProps;
//import com.google.cloud.storage.Acl;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//
//@Feature("Create User Admin Test")
//@Listeners(Utilities.TestListeners.class)
//
//public class CreateUserAdminTest extends TestBase {
//     CreateUserPage UserPageObj;
//CreateRolePage CreateRolePageObj;
//    AssertionsFunction assertionsFunction;
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001 - valid_login_with_admin_credentials")
//    @Description("verify user able to login valid_login_with_admin_credentials")
//    @Test(priority = 1, groups = "smoke", description = "verify login valid_login_with_admin_credentials")
//
//    public void valid_login_with_admin_credentials() throws Exception {
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj=new CreateRolePage(driver);
//        assertionsFunction=new AssertionsFunction(driver);
//
//        driver.manage().window().maximize();
//        UserPageObj = new CreateUserPage(driver);
//
//        Thread.sleep(2000);
//        //TC 4.1 Valid Login with Admin credentials.
//        UserPageObj.ProfileIconClick();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(2000);
//
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002 - create_user_with_blank_data")
//    @Description("verify user able to create_user_with_blank_data")
//    @Test(priority = 2, groups = "smoke", description = "verify create_user_with_blank_data")
//
//    public void create_user_with_blank_data() throws Exception {
//        //TC 4.2 Create User with Blank data.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//       Thread.sleep(2000);
//        UserPageObj.clickOnUserMenu();
//        Thread.sleep(3000);
//        UserPageObj.ClickCreateUserBtn();
//        UserPageObj.ClickCreateBtn();
//        UserPageObj.ClickOnCancelBtn();
//        Thread.sleep(1000);
//        assertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003 - create_user_with_valid_data")
//    @Description("verify user able to create_user_with_valid_data")
//    @Test(priority = 3, groups = "smoke", description = "verify create_user_with_valid_data")
//
//    public void create_user_with_valid_data() throws Exception {
//        //TC 4.3 Create User with Valid data.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        UserPageObj.ClickCreateUserBtn();
//        UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
//        UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.ClickCreateBtn();
//        Thread.sleep(2000);
////        UserPageObj.ClickOnCancelBtn();
////        Thread.sleep(1000);
//
//        //4.8 Verify that created user by admin should display in available user list
//
//    }
//
////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004 -  create_user_with_invalid_data")
//    @Description("verify user able to create_user_with_invalid_data")
//    @Test(priority = 4, groups = "smoke", description = "verify create_user_with_invalid_data")
//
//    public void create_user_with_invalid_data() throws Exception {
//        //TC 4.4 Create user with Invalid data.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        UserPageObj.ClickCreateUserBtn();
//        UserPageObj.EnterNewUserName(ReadProps.readAttr("InvalidUsernameU"));
//        UserPageObj.EnterEmail(ReadProps.readAttr("InvalidEmailU"));
//        UserPageObj.ClickCreateBtn();
//        UserPageObj.ClickOnCancelBtn();
//        Thread.sleep(1000);
//        assertionsFunction.verifyTargetPageURL(UserPageObj.userTabUrl);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005  -  disable_user")
//    @Description("verify user able to disable_user")
//    @Test(priority = 5, groups = "smoke", description = "verify disable_user")
//
//    public void disable_use() throws Exception {
//        //TC 4.5 Disable user.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(2000);
//        UserPageObj.clickonlist();
//        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
//        Thread.sleep(3000);
//        UserPageObj.selectSearchedUser();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.clickOnUpdateUserButton();
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006  - enable_disabled_user")
//    @Description("verify user able to enable_disabled_user")
//    @Test(priority = 6, groups = "smoke", description = "verify enable_disabled_user")
//
//    public void enable_disabled_user() throws Exception {
//        //TC 4.6 Enable the Disabled user.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(2000);
//        UserPageObj.clickonlist();
//        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
//        Thread.sleep(3000);
//        UserPageObj.selectSearchedUser();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        Thread.sleep(2000);
//
//        UserPageObj.ClickOnCancelBtn();
//        assertionsFunction.isPresent(UserPageObj.cancelButton);
//        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007  - create_user_with_valid_data_status_disabled")
//    @Description("verify user able to create_user_with_valid_data_status_disabled")
//    @Test(priority = 7, groups = "smoke", description = "verify create_user_with_valid_data_status_disabled")
//
//    public void create_user_with_valid_data_status_disabled() throws Exception {
//        //4.7 Verify the working of admin role for Create user button when user status is disabled
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        UserPageObj.ClickCreateUserBtn();
//        UserPageObj.EnterNewUserName(ReadProps.readAttr("AdminUsername"));
//        UserPageObj.EnterEmail(ReadProps.readAttr("AdminEmailID"));
//        Thread.sleep(1000);
//        UserPageObj.ClickCreateBtn();
//        Thread.sleep(1000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008  - enable_user")
//    @Description("Verify enable_user")
//    @Test(priority = 8, groups = "smoke", description = "Verify enable_user")
//
//    public void enable_user() throws Exception {
//        //TC 4.6 Enable the Disabled user.
//        //TC4.8 Verify that created user by admin should display in available user list
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//       Thread.sleep(2000);
//        UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUsername"));
//        UserPageObj.selectSearchedUser();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.ClickOnEnableOrDisableUserSelectionToggle();
//        UserPageObj.clickOnUpdateUserButton();
//
//        Thread.sleep(1000);
//    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 01  - enable_user")
////    @Description("Verify enable_user")
////    @Test (priority=1,groups="sanity", description = "Verify enable_user")
////    public void check_grid_view_is_present() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////        assertionsFunction=new  AssertionsFunction(driver);
////        UserPageObj = new CreateUserPage(driver);
////        //TC 4.1 Valid Login with Admin credentials.
////        Thread.sleep(4000);
////        UserPageObj.clickOnUserMenu();
////        Thread.sleep(4000);
////        Assert.assertTrue(assertionsFunction.isPresent(UserPageObj.getgridview()));
////
////    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 02  - enable_user")
////    @Description("Verify enable_user")
////    @Test (priority=2,groups="sanity", description = "Verify enable_user")
////    public void check_list_view_is_present() throws Exception {
////        Assert.assertTrue(assertionsFunction.isPresent(UserPageObj.getlistview()));
////
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 03  - enable_user")
////    @Description("Verify enable_user")
////    @Test (priority=3,groups="sanity", description = "Verify enable_user")
////    public void verify_search_tab_is_present() throws Exception {
////        //TC 4.3 Create User with Valid data.
////        Assert.assertTrue(assertionsFunction.isPresent(UserPageObj.getsearchtab()));
////
////    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 04  - enable_user")
////    @Description("Verify enable_user")
////    @Test (priority=4,groups="sanity", description = "Verify enable_user")
////    public void create_user_with_invalid_dat() throws Exception {
////        //TC 4.4 Create user with Invalid data.
////        Assert.assertTrue(assertionsFunction.isPresent(UserPageObj.getEditbutton()));
////
////
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 05  - enable_user")
////    @Description("Verify enable_user")
////    @Test (priority=5,groups="sanity", description = "Verify enable_user")
////    public void disable_user() throws Exception {
////        //TC 4.5 Disable user.
////        Assert.assertTrue(assertionsFunction.isPresent(UserPageObj.getCreateUserBtn()));
////
////
////
////
////
////    }
//
//
//}
