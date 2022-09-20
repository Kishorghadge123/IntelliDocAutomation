//package Tests;
//
//
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.CreateRolePage;
//import Pages.CreateUserPage;
//import Pages.FunctionalTabPage;
//import Pages.ProjectPage;
//import Utilities.AssertionsFunction;
//import Utilities.Custome_Wait;
//import Utilities.Functions;
//import io.qameta.allure.*;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//
//
//
//@Feature("Create Update Role AdminTest")
//@Listeners(Utilities.TestListeners.class)
//public class CreateUpdateRoleAdminTest extends TestBase {
//    CreateRolePage CreateRolePageObj;
////    CreateUserPage ;
//    FunctionalTabPage FunctionalTabObj;
//    AssertionsFunction assertionsFunction;
//    ProjectPage ProjectPageObj;
//    WebDriver driver;
//    CreateUserPage UserPageObj;
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001 - login with valid details")
//    @Description("verify user able to login with valid details")
//    @Test(priority = 1, groups = "smoke", description = "verify login with valid details")
//
//    public void login_with_valid_details() throws Exception {
//
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//        assertionsFunction=new  AssertionsFunction(driver);
//        ProjectPageObj = new ProjectPage(driver);
//
//        driver.manage().window().maximize();
//        CreateRolePageObj = new CreateRolePage(driver);
////        UserPageObj =new CreateUserPage(driver);
////        FunctionalTabObj = new FunctionalTabPage(driver);
//
//        Thread.sleep(2000);
//        //TC 2.1 Login with Valid Admin details.
//
//        Custome_Wait.wait(driver, driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
//        CreateRolePageObj.ClickRoleManagementBtn();
//        Custome_Wait.wait(driver, driver.findElement(By.xpath("//div[contains(text(),'Roles ')]")));
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//
//        driver.navigate().back();
//        Thread.sleep(2000);
//        //Assert.assertEquals(errormsg,errormsgBlankDataCreateRoleClick);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002 - blank_role_name_permission")
//    @Description("verify user able to blank_role_name_permission")
//    @Test(priority = 2, groups = "smoke", description = "verifyblank_role_name_permission")
//
//    public void blank_role_name_permission() throws Exception {
//        //TC 2.2 Blank RoleName and Permission.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.role_tab_url);
//        Thread.sleep(1000);
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003 - valid role name blank permission")
//    @Description("verify user able to valid role name blank permission")
//    @Test(priority = 3, groups = "smoke", description = "verify valid role name blank permission")
//    public void valid_role_name_blank_permission() throws Exception {
//        //TC 2.3 Valid RoleName and Blank Permission.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
////        Custome_Wait.wait(driver, CreateRolePage.ActiveRole);
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(3000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004 - valid blank role name valid permission")
//    @Description("verify user able to valid role name permission")
//    @Test(priority = 4, groups = "smoke", description = "verify blank valid role name permission")
//    public void blank_role_name_valid_permission() throws Exception {
//        //TC 2.4 Blank RoleName and Valid Permission.
//        ///IN879 Revamping the permissions section
//        //TC2.8  Verify the working of admin for Create role button when user status is enabled
////         WebDriver driver = DriverFactory.getInstance().getDriver();
//        Robot r = new Robot();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        CreateRolePageObj.AddPermissionPlusBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.SelectViewDocumentPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//
//    }
//
//    //
////    //need to change
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005 - valid_role_and_permission")
//    @Description("verify user able to valid_role_and_permission")
//    @Test(priority = 5, groups = "smoke", description = "verify valid role name permission")
//    public void valid_role_and_permission() throws Exception {
//        //TC 2.5 Valid Role and Valid Permission.
//        //610 Handling 'Release' button  via permissions
////           WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(1000);
//        CreateRolePageObj.EnterNewRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u run
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        // Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(1000);
//
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.SelectReleaseDocument();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(1000);
////        String expectedDate = Functions.getCurrentDate();
////        System.out.println("expectedDate=" + expectedDate);
//        //System.out.println("driver.findElement(CreatedTime).getText()="+driver.findElement(CreatedTime).getText());
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006 - create role with existing rolename")
//    @Description("verify user able to create role with existing rolename")
//    @Test(priority = 6, groups = "smoke", description = "verify create role with existing rolename")
//    public void create_role_with_existing_rolename() throws Exception {
//        //TC 2.6 Create Role with Existing Role Name.
////          WebDriver driver = DriverFactory.getInstance().getDriver();
////899   Change the name of the permission 'Update Processed Documents' to 'Audit Documents'
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(1000);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("RoleName"));//Change everytime before u ran
//       Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        // Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.SelectAuditdocumnet();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(1000);
//
//
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007 - search created role")
//    @Description("verify user able to search created role")
//    @Test(priority = 7, groups = "smoke", description = "verify search created rolen")
//
//    public void search_created_role() throws Exception {
//        //TC 2.7 Search the Created Role or not
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));//Change everytime before u ran
//        assertionsFunction.isPresent(CreateRolePageObj.SearchRole);
//        Thread.sleep(2000);
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008 - update role with valid data")
//    @Description("verify user able to update role with valid data")
//    @Test(priority = 8, groups = "smoke", description = "verify update role with valid data")
//
//    public void update_role_with_valid_data() throws Exception {
//        //TC 2.8 Update Role with Valid Data.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        //Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(2000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.SelectViewDocumentPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(3000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 009 - remove all permissions")
//    @Description("verify user able to remove all permissions")
//    @Test(priority = 9, groups = "smoke", description = "verify remove all permissions")
//    public void remove_all_permissions() throws Exception {
//        //TC 2.9 Remove All Permissions and Update.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName1"));//Change everytime before u ran
//        assertionsFunction.isPresent(CreateRolePageObj.SearchRole);
//        Thread.sleep(2000);
//        CreateRolePageObj.clicksearchedrole();
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        //Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(2000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.SelectViewDocumentPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickRemovePermission();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickUpdateBtn();
//        Thread.sleep(3000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 0012 - Creating role invalid data in RoleName Permissions")
//    @Description("verify user able to Creating role invalid data in RoleName Permissions")
//    @Test(priority = 12, groups = "smoke", description = "verify Creating role invalid data in RoleName Permissions")
//    public void Creating_role_invalid_data_in_RoleName_Permissions() throws Exception {
//        //TC-3.2 Verify the working of admin for Creating role by putting invalid data in Role name, blank Permissions
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.create_role_url);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
//        CreateRolePageObj.ClickActiveRole();
//        Thread.sleep(2000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        Thread.sleep(2000);
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//    }
//    //////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 0013 - Creating role invalid data with disabled status")
//    @Description("verify user able to Creating role invalid data with disabled status")
//    @Test(priority = 13, groups = "smoke", description = "verify Creating role invalid data with disabled status")
//    public void Creating_role_invalid_data_with_disabled_status() throws Exception {
//        //TC 3.5 Verify the working of admin for Create role button when user status is disabled
////          WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(2000);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
//        Thread.sleep(1000);
//        CreateRolePageObj.AddPermissionPlusBtn();
//        //Custome_Wait.wait(driver, driver.findElement(By.xpath("//span[contains(text(),' View Role ')]")));
//        Thread.sleep(1000);
//        CreateRolePageObj.clickviewdocumentdropdown();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickProcessDocPermission();
//        Thread.sleep(1000);
//        CreateRolePageObj.clickOutside();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickCreateButton();
//        Thread.sleep(2000);
//        CreateRolePageObj.clickcancel();
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(3000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 0014 - Updating role invalid data Rolename Permissions")
//    @Description("verify user able to Updating role invalid data Rolename Permissions")
//    @Test(priority = 14, groups = "smoke", description = "verify Updating role invalid data Rolename Permissions")
//    public void Updating_role_invalid_data_RolenamePermissions() throws Exception {
//        //TC 4.2  Verify the working of admin for Updating the role by putting invalid data in Role name,Permissions
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.ClickCreateRoleBtn();
//        Thread.sleep(1000);
//        CreateRolePageObj.enterExistingRoleName_OrInvalidRoleName(ReadProps.readAttr("InvalidRoleName"));
//        Thread.sleep(1000);
//        CreateRolePageObj.clickcancel();
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(3000);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 0015 - Sorting role")
//    @Description("verify user able to Sorting role")
//    @Test(priority = 15, groups = "smoke", description = "Sorting role")
//
//    public void Sorting_role() throws InterruptedException {
//        //TC 6.1 Sorting by role, permission,updated,created
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        Thread.sleep(1000);
//        CreateRolePageObj.ClickSortRoleBtn();
//        Thread.sleep(1000);
//
//
//    }
//    //
//////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 0016- sorting_on_role_permission_updated_created")
//    @Description("verify user able to Sorting role")
//    @Test(priority = 16, groups = "smoke", description = "sorting_on_role_permission_updated_created")
//
//    public void sorting_on_role_permission_updated_created() throws Exception {
//        //IN2.16 Sorting by role, permission,updated,created
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//        CreateRolePageObj.rolesorting();
//        CreateRolePageObj.permissionsorting();
//        CreateRolePageObj.updatedsorting();
//        CreateRolePageObj.createdsorting();
//        assertionsFunction.verifyTargetPageURL(CreateRolePageObj.rolepageurl);
//        Thread.sleep(2000);
//
//
//    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 017 sorting_on_role_permission_updated_created")
////    @Description("verify user able to Sorting role")
////    @Test(priority = 17, groups = "smoke", description = "sorting_on_role_permission_updated_created")
////    //IN860Revisit search functionality throughout the application.
////    public void check_search_functionality() throws Exception{
////UserPageObj=new CreateUserPage(driver);
////FunctionalTabObj=new FunctionalTabPage(driver);
////ProjectPageObj=new ProjectPage(driver);
////
////        Thread.sleep(2000);
////
////        UserPageObj.clickOnUserMenu();
////        Thread.sleep(2000);
////
////
////        FunctionalTabObj.ClickVerticalProjects();
////        Thread.sleep(2000);
////
////
////        //Object creation
//////        ProjectBREDataSetPage ProjectBREDataSetPageObj = new ProjectBREDataSetPage(driver);
////        // WebDriver driver = DriverFactory.getInstance().getDriver();
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////        Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));
////
////        Robot r = new Robot();
////        //TC-1.1 BRE Applied to NAME RULE Using DataSet = Fail.
////        ProjectPageObj.ClickOnCreateProjectBtn();
////        //Navigate to Project Page.
////        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
////        Thread.sleep(4000);
////        ProjectPageObj.ClickOnLeadBtn();
////        ProjectPageObj.SelectOnLeadBtn();
////        //Starting Date should be updated in Xpath to Current Date before executing the Script.
////        ProjectPageObj.ClickOnStartDateBtn();
////        ProjectPageObj.SelectStartDateBtn();
////        ProjectPageObj.ClickOnEndDate();
////        ProjectPageObj.SelectEndDate();
////        ProjectPageObj.ClickOnDocumentStructureBtn();
////        ProjectPageObj.SelectDocumentStructureBtn();
////        ProjectPageObj.ClickOnProcessingEngineBtn();
////        ProjectPageObj.SelectOnProcessingEngineBtn();
////        ProjectPageObj.ClickOnStatusBtn();
////        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
////        ProjectPageObj.ClickOnStraightThroughProcessBtn();
////        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
////        ProjectPageObj.ClickOnAddTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnTemplateBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnRolesBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnAddRoleBtn();
////        Thread.sleep(1000);
////        ProjectPageObj.ClickOnSelectRoleBtn();
////        Thread.sleep(1000);
////
////
////
////    }
//@Severity(SeverityLevel.NORMAL)
//@Story("story_id: 01 -  verify_list_of_role_is_present ")
//@Description("verify user able to Creating_role_with_invalid_data")
//@Test(priority = 1, groups = "sanity", description = "verify Creating_role_with_invalid_data ")
//public void verify_list_of_role_is_present () throws Exception {
//    WebDriver driver = DriverFactory.getInstance().getDriver();
//    assertionsFunction=new  AssertionsFunction(driver);
//        CreateRolePageObj=new CreateRolePage(driver);
//    CreateRolePageObj.ClickRoleManagementBtn();
//    CreateRolePageObj.check_list_of_role_label();
//    assertionsFunction.isPresent(CreateRolePageObj.Listlabel);
//}
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 02 - Creating_role_with_invalid_data")
//    @Description("verify user able to Creating_role_with_invalid_data")
//    @Test(priority = 2, groups = "sanity", description = "verify Creating_role_with_invalid_data ")
//
//    public void verify_search_tab_is_present() throws Exception {
//        //TC 4.3 Create User with Valid data.
//        Assert.assertTrue(assertionsFunction.isPresent(CreateRolePageObj.getsearchtab()));
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 03 - Creating_role_with_invalid_data")
//    @Description("verify user able to Creating_role_with_invalid_data")
//    @Test(priority = 3, groups = "sanity", description = "verify Creating_role_with_invalid_data ")
//
//    public  void verify_role_sorting() throws Exception{
//        CreateRolePageObj.rolesorting();
//        assertionsFunction.isPresent(CreateRolePageObj.permissionsort);
//    }
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 04 - Creating_role_with_invalid_data")
//    @Description("verify user able to Creating_role_with_invalid_data")
//    @Test(priority = 4, groups = "sanity", description = "verify Creating_role_with_invalid_data ")
//
//    public  void verify_permission_sorting() throws Exception{
//        CreateRolePageObj.permissionsorting();
//        Thread.sleep(1000);
//        assertionsFunction.isPresent(CreateRolePageObj.permissionsort);
//        Thread.sleep(1000);
//    }
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 05 - Creating_role_with_invalid_data")
//    @Description("verify user able to Creating_role_with_invalid_data")
//    @Test(priority = 5, groups = "sanity", description = "verify Creating_role_with_invalid_data ")
//
//    public  void verify_created_sorting() throws Exception{
//        CreateRolePageObj.createdsorting();
//        assertionsFunction.isPresent(CreateRolePageObj.permissionsort);
//    }
//}