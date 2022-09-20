//package Tests;
//
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.CreateRolePage;
//import Pages.CreateUserPage;
//import Pages.FunctionalTabPage;
//import Utilities.Custome_Wait;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import io.qameta.allure.*;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//
//
//import static Pages.CreateRolePage.*;
//import static Pages.CreateRolePage.errormsgBlankDataCreateRoleClick;
//
//@Feature("Create Update Role Platform AdminTest")
//@Listeners(Utilities.TestListeners.class)
//public class CreateUpdateRolePlatformAdminTest extends TestBase {
//    CreateRolePage CreateRolePageObj;
////    WebDriver driver;
//    AssertionsFunction assertions;
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001 - create role with blank rolename permission")
//    @Description("verify user able to create role with blank rolename permission")
//    @Test(priority = 1, groups = "smoke", description = "verify create role with blank rolename permission")
//    public void create_role_with_blank_rolename_permission() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj = new CreateRolePage(driver);
//        assertions=new AssertionsFunction(driver);
//        Thread.sleep(3000);
//        CreateRolePageObj.ClickRoleManagementBtn();
//        Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        //TC 3.1 Create Role with Blank RoleName and Permission.
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        assertions.isPresent(CreateRolePageObj.ClickCreate);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002 - create role with_valid_rolename_blank_permission")
//    @Description("verify user able to create role with blank rolename permission")
//    @Test(priority = 2, groups = "smoke", description = "verify create role with blank rolename permission")
//
//    public void create_role_with_valid_rolename_blank_permission() throws Exception {
//        //TC 3.2 Create Role with Valid RoleName and Blank Permission.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        assertions.isPresent(CreateRolePageObj.ClickCreate);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003 - create_role_with_blank_rolename_valid permission")
//    @Description("verify user able to create_role_with_blank_rolename_valid_permission")
//    @Test(priority = 3, groups = "smoke", description = "verify create_role_with_blank_rolename_valid_permission")
//    public void create_role_with_blank_rolename_valid_permission() throws Exception {
//        //TC 3.3 Create Role with Blank RoleName and Valid Permission.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(100);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        assertions.isPresent(CreateRolePageObj.ClickCreate);
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        assertions.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(1000);
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004 - create_role_with_valid_rolename_permission")
//    @Description("verify user able to create_role_with_valid_rolename_permission")
//    @Test(priority = 4, groups = "smoke", description = "verify create_role_with_valid_rolename_permission")
//    public void create_role_with_valid_rolename_permission() throws Exception {
//        //TC 3.4 Create Role with Valid Role Name and Permission.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//
//        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePA"));//Change everytime before u ran
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
////        CreateRolePageObj = new CreateRolePage(driver);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//    }
////
//////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005 - create_role_with_existing_name")
//    @Description("verify user able to create_role_with_existing_name")
//    @Test(priority = 5, groups = "smoke", description = "verify create_role_with_existing_name")
//    public void create_role_with_existing_name() throws Exception {
//        //TC 3.5 Create Role with Existing Name.
////        Thread.sleep(3000);
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        Thread.sleep(2000);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleNamePA"));
//
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//    }
////
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006 - search_created_role")
//    @Description("verify user able to search_created_role")
//    @Test(priority = 6, groups = "smoke", description = "verify search_created_role ")
//    public void search_created_role() throws Exception {
//        //TC 3.6 Search the Created Role.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
////        Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
//       Thread.sleep(2000);
//        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleNamePA"));
//        Thread.sleep(2000);
//        Assert.assertTrue(assertions.isPresent(CreateRolePageObj.getSearch_created_role_element()));
//    }
//
//    // added
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007 - ClickOnCancelBtnOn_RoleUpdation")
//    @Description("verify user able to ClickOnCancelBtnOn_RoleUpdation")
//    @Test(priority = 7, groups = "smoke", description = "verify ClickOnCancelBtnOn_RoleUpdation")
//
//    public void ClickOnCancelBtnOn_RoleUpdation() throws Exception {
//        //3.15 Verify functionality of Cancel button on Role Updation Page.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickEditRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008 - update_role_with_valid_data")
//    @Description("verify user able to update_role_with_valid_data")
//    @Test(priority = 8, groups = "smoke", description = "verify update_role_with_valid_data ")
//    public void update_role_with_valid_data() throws Exception {
//        //TC 3.7 Update Role with Valid Data.
//        //Tc 3.15Verify functionality of Cancel button on Role Updation Page.
////        Thread.sleep(2000);
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickEditRole();
//        Thread.sleep(2000);
//
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickonauditdocument();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//
//        CreateRolePageObj.ClickRemovePermission();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickUpdateBtn();
//        Thread.sleep(2000);
//
////        assertions.verifyTargetPageURL(CreateRolePageObj.);
//    }
//
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 010 - adding_new_permission")
////    @Description("verify user able to adding_new_permission")
////    @Test(priority = 10, groups = "smoke", description = "verify adding_new_permission ")
////
////    public void adding_new_permission() throws Exception {
////
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////        CreateRolePageObj.ClickCreateRoleBtn();
////        Thread.sleep(2000);
////        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
////        Thread.sleep(2000);
////        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleNameP"));
////        Thread.sleep(1000);
////        CreateRolePageObj.AddPermissionPlusBtn();
////        Thread.sleep(2000);
////        CreateRolePageObj.clickviewdocumentdropdown();
////        Thread.sleep(1000);
////        CreateRolePageObj.ClickProcessDocPermission();
////        Thread.sleep(1000);
////        CreateRolePageObj.clickOutside();
////        Thread.sleep(1000);
////        CreateRolePageObj.ClickCreateButton();
////        Thread.sleep(2000);
////        CreateRolePageObj.clickcancel();
////        Thread.sleep(2000);
////        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
////
//////        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
////    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 011 - disable_status_role_update")
//    @Description("verify user able to disable_status_role_update")
//    @Test(priority = 11, groups = "smoke", description = "verify disable_status_role_update ")
//
//    public void disable_status_role_update() throws Exception {
//        //TC 3.9 Disable Status of Role and Update.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickEditRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickUpdateBtn();
//        Thread.sleep(2000);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 012 - enable_status_role_update")
//    @Description("verify user able to enable_status_role_update")
//    @Test(priority = 12, groups = "smoke", description = "verify enable_status_role_update ")
//
//    public void enable_status_role_update() throws Exception {
//        //TC 3.10 Enable the Status of Role and Update.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickEditRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.ClickUpdateBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 013 - CreateRole_with_Valid_Rolename_Valid_Permission_with_Active")
//    @Description("verify user able to CreateRole_with_Valid_Role-name_Valid_Permission_with_Active")
//    @Test(priority = 13, groups = "smoke", description = "verify CreateRole_with_Valid_Rolename_Valid_Permission_with_Active ")
//
//    public void CreateRole_with_Valid_Rolename_Valid_Permission_with_Active() throws Exception {
//        //TC 3.2 Verify the Roles functionality of the Platform Admin to Create Role with  Valid Rolename and Valid Permission with Active.
//        //IN - 879 Revamping the permissions section
////        Thread.sleep(4000);
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleNamePAA"));//Change everytime before u ran
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        assertions.isPresent(CreateRolePageObj.Cancel);
//        Thread.sleep(2000);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 014 - ClickOn_Cancel_button_on_Role_Creation_Page")
//    @Description("verify user able to ClickOn_Cancel_button_on_Role_Creation_Pagee")
//    @Test(priority = 14, groups = "smoke", description = "verify ClickOn_Cancel_button_on_Role_Creation_Page ")
//
//    public void ClickOn_Cancel_button_on_Role_Creation_Page() throws Exception {
//        //TC 3.7  Verify functionality of Cancel button on Role Creation Page.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        CreateRolePageObj.clickcancel();
//        assertions.isPresent(CreateRolePageObj.Cancel);
//        Thread.sleep(2000);
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 015 - validation_Role_Name_New_Role_creation_Page")
//    @Description("verify user able to validation_Role_Name_New_Role_creation_Page")
//    @Test(priority = 15, groups = "smoke", description = "verify validation_Role_Name_New_Role_creation_Page ")
//    public void validation_Role_Name_New_Role_creation_Page() throws Exception {
//        //TC 3.8 Verify the validation of Role Name textbox on New Role creation Page.
////        Thread.sleep(10000);
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(1000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        assertions.isPresent(CreateRolePageObj.Cancel);
//        Thread.sleep(1000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 016 - valid blank role name valid permission")
//    @Description("verify user able to valid role name permission")
//    @Test (priority=16,groups="smoke", description = "verify blank valid role name permission")
//    public void checkreleasedocument() throws Exception {
//
//        //IN610 Handling 'Release' button  via permissions
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickRoleManagementBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        CreateRolePageObj.clickonreleasedocument();
//        Thread.sleep(1000);
//        //Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' Create Template ' )]")));
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//    }
////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 017- valid blank role name valid permission")
//    @Description("verify user able to valid role name permission")
//    @Test (priority=17,groups="smoke", description = "verify blank valid role name permission")
//    public void CheckAuditdocuments() throws Exception {
////IN899 Change the name of the permission 'Update Processed Documents' to 'Audit Documents'
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.AddPermissionPlusBtn();
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickonauditdocument();
//        Thread.sleep(1000);
//        //Custome_Wait.wait(driver,driver.findElement(By.xpath("//span[contains(text(),' Create Template ' )]")));
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 018 - Creating_role_with_invalid_data")
//    @Description("verify user able to Creating_role_with_invalid_data")
//    @Test(priority = 18, groups = "smoke", description = "verify Creating_role_with_invalid_data ")
//    public void Creating_role_with_invalid_data() throws Exception {
//        //3.14 Verify the working of platform admin for Creating role by putting invalid data.
////        Thread.sleep(10000);
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//        CreateRolePageObj.ClickLogout();
//        Thread.sleep(3000);
//        assertions.verifyTargetPageURL(CreateRolePageObj.loginPage_url);
//    }
//
//
//
//}