package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.*;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Random;

public class CreateRolePage {

    WebDriver driver = null;
    //TC 6.1 element locators
    By cancel1 = By.xpath("(//button[@tabindex='0'])[1]");
    public static By RoleManagementBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
    public static By CreateRoleBtn = By.xpath("//span[contains(text(),' Create Role ')]");
    public static By project = By.xpath("//span[contains(text(),' Create Project ')]");
    public By ClickCreate = By.xpath("//span[contains(text(), 'Create ')]");
    public By RoleName = By.xpath("//input[@formcontrolname='role']");
    public static By ActiveRole = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    public By aduitdocument = By.xpath("(//div[@role='menuitem'])[3]");
    public By searchedrole = By.xpath("//mat-icon[contains(text(),'create')]");
    By AddPermission = By.xpath("//span[contains(text(),' Add permission ')]");
    By viewdocumentdropdown = By.xpath("//button[contains(text(),' Document ')]");
    By ViewDocumentPermission = By.xpath("(//div[@role='menuitem'])[2]");
    By ReleaseDocumentPermission = By.xpath("(//div[@role='menuitem'])[5]");

    By AuditDocumentPermission = By.xpath("(//div[@role='menuitem'])[3]");
    By validationMsg = By.xpath("//*[text()='Only alphabets,digits,parenthesis and hyphens are allowed while giving a role name.']");
    public By Cancel = By.xpath("(//span[contains(text(),'Cancel')])[2]");
    public By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    By createrole = By.xpath("//span[contains(text(),' AutoAdminPA2304 ')]");
    By EditRole = By.xpath("//span[contains(text(),' PratikshaQA ')]"); //edit by suwarna  and work for all role selection
    By ProcessDocumentPermission = By.xpath("(//div[@role='menuitem'])[1]");
    By ViewApiConfig = By.xpath("//span[text()=' View API Config ']");
    By relasedocument = By.xpath("(//div[@role='menuitem'])[5]");
    By searchbar = By.xpath("//input[@data-placeholder='Search']");
    By CreateUserPermission = By.xpath("//span[contains(text(),'Create User')]");
    By CreateProject = By.xpath("//span[contains(text(),'Create Project')]");
    By ViewUser = By.xpath("//span[contains(text(),'View User')]");
    By ViewRole = By.xpath("//span[contains(text(),'View Role')]");
    By UpdateProject = By.xpath("//span[contains(text(),'Update Project')]");
    By UpdateUser = By.xpath("//span[contains(text(),'Update User')]");
    By CreateTemplate = By.xpath("//span[contains(text(),'Create Template')]");
    public static By CreateRole = By.xpath("//span[contains(text(),'Create Role')]");
    By ViewAnalytics = By.xpath("//span[contains(text(),'View Analytics')]");
    By RemoveProcessDocPermission = By.xpath("//mat-icon[contains(text(),'cancel')]");
    By UpdateRole = By.xpath("//span[contains(text(),'Update Role')]");
    public static By ClickUpdateBtn = By.xpath("//span[contains(text(),'Update' )]");
    public By rolesort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[1]");
    public By permissionsort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[2]");
    public By updatedsort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[3]");
    public By createdsort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[4]");

    By RemovePermission = By.xpath("//mat-icon[contains(text(),'cancel')]");
    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");
    By search_created_role_element = By.xpath("//*[@mattooltipposition='below']");
    By searchUser = By.xpath("//input[@placeholder='Search']");
    public static By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    public static By CreatedTime = By.xpath("//span[contains(text(),'AutoAdmin640hn ')]//preceding::tr[1]/td[4]");
    //
    public static By RoleCreatedTime = By.xpath("//input[@formcontrolname='created']");
    public static By RoleUpdatedTime = By.xpath("//input[@formcontrolname='updated']");
    By sortRole = By.xpath("//div[text()='Roles ']");
    public By Listlabel = By.xpath("//h6[contains(text(),'List of Roles')]");
    public static By errormsgBlankDataCreateRoleClick = By.xpath("//mat-error[contains(text(),'Please enter a valid user name.')]");
    public static String loginPage_url = "https://alpha.neutrino-ai.com/#/login";
    public static String homepage_url = "https://alpha.neutrino-ai.com/#/home/project-management";
    public static String role_tab_url = "https://alpha.neutrino-ai.com/#/home/role-management";
    public static String create_role_url = "https://alpha.neutrino-ai.com/#/home/role-management/create-role";
    public static String rolepageurl = "https://alpha.neutrino-ai.com/#/home/role-management";
    public static String edit_role_url = "https://alpha.neutrino-ai.com/#/home/role-management/edit-role/61b8747950fd017465189427";
    public static String errormsg = "Please enter all the details before submitting.";
    public static String role_exist_error_msg = "Role exist with name AutoAdminPA41";
    public By errormsg_roleExist_CreateRoleClick = By.xpath("//*[@class='mat-simple-snackbar ng-star-inserted']");

    //public static String errormsg="Please enter all the details before submitting.";
    public By getsearchtab() {
        return this.searchUser;
    }

    public By getCreateUserPermission() {
        return this.CreateUserPermission;
    }

    public By getvalidationMsg() {
        return this.validationMsg;
    }

    public By getroleExist_errormsg() {
        return this.errormsg_roleExist_CreateRoleClick;
    }

    public By getProcessDocumentPermission() {
        return this.ProcessDocumentPermission;
    }

    public By getViewApiConfig() {
        return this.ViewApiConfig;
    }

    public By getViewDocumentPermission() {
        return this.ViewDocumentPermission;
    }

    public By getSearch_created_role_element() {
        return this.search_created_role_element;
    }

    public CreateRolePage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    @Step("click On Sort Button")
    public void ClickSortRoleBtn() {
        driver.findElement(sortRole).click();
    }

    @Step("click On Role Menu")
    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();

    }

    @Step("check  ist of role label")
    public void check_list_of_role_label() {
        driver.findElement(Listlabel).click();

    }


    @Step("click On Create Role Button")
    public void ClickCreateRoleBtn() {
        driver.findElement(CreateRoleBtn).click();


    }

    @Step("enter New Role Name")
    public void EnterNewRoleName(String roleName) throws InterruptedException {
        Random r = new Random();
        char first_c = (char) (r.nextInt(26) + 'a');
        char second_c = (char) (r.nextInt(26) + 'a');
        driver.findElement(RoleName).sendKeys(roleName + first_c + second_c);
        Thread.sleep(3000);
    }


    @Step("enter Existing Role Name O rInvalid Role Name")

    public void enterExistingRoleName_OrInvalidRoleName(String roleName) {
        driver.findElement(RoleName).sendKeys(roleName);

    }

    @Step("click On AddPermission Button")
    public void AddPermissionPlusBtn() {
        driver.findElement(AddPermission).click();


    }

    @Step("click view document dropdown")
    public void clickviewdocumentdropdown() {
        driver.findElement(viewdocumentdropdown).click();
    }

    @Step("click On AddPermission Button")
    public void rolesorting() {
        driver.findElement(rolesort).click();
    }

    @Step("click On AddPermission Button")
    public void permissionsorting() {
        driver.findElement(permissionsort).click();
    }

    @Step("click On AddPermission Button")
    public void updatedsorting() {
        driver.findElement(updatedsort).click();
    }

    @Step("click On AddPermission Button")
    public void createdsorting() {
        driver.findElement(createdsort).click();
    }


    @Step("click On AddPermission Button")
    public void clickcancel() {

        driver.findElement(Cancel).click();

    }

    @Step("Select ViewDocument Permission")
    public void SelectViewDocumentPermission() {
        driver.findElement(ViewDocumentPermission).click();


    }

    @Step("Select ReleaseDocument Permission")
    public void SelectReleaseDocument() {
        driver.findElement(ReleaseDocumentPermission).click();


    }

    @Step("Select Audit Document Permission")
    public void SelectAuditdocumnet() {
        driver.findElement(AuditDocumentPermission).click();


    }

    public void clickOutside() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    @Step("clickcancel")
    public void clickcancel1() {
        driver.findElement(cancel1).click();
    }


    @Step("Select Create release Permission")
    public void clickonreleasedocument() {
        driver.findElement(relasedocument).click();
    }

    @Step("check search bar")
    public By getSearchbar() {
        return this.searchbar;
    }

    public void SelectCreateProject() {
        driver.findElement(CreateProject).click();
    }

    public void SelectViewUser() {
        driver.findElement(ViewUser).click();
    }

    public void SelectUpdateRole() {
        driver.findElement(UpdateRole).click();
    }

    public void SelectViewRole() {
        driver.findElement(ViewRole).click();
    }

    public void SelectUpdateProject() {
        driver.findElement(UpdateProject).click();
    }

    public void SelectUpdateUser() {
        driver.findElement(UpdateUser).click();
    }

    public void SelectCreateTemplate() {
        driver.findElement(CreateTemplate).click();
    }

    public void SelectCreateRole() {
        driver.findElement(CreateRole).click();
    }

    public void SelectViewAnalytics() {
        driver.findElement(ViewAnalytics).click();
    }

    @Step("Click ActiveRole")
    public void ClickActiveRole() {
        driver.findElement(ActiveRole).click();

    }

    @Step("Click audit document")
    public void clickonauditdocument() {
        driver.findElement(aduitdocument).click();
    }

    @Step("click on searched role")
    public void clicksearchedrole() {
        driver.findElement(searchedrole).click();
    }

    @Step("ClickCreateButton")
    public void ClickCreateButton() throws Exception {
        driver.findElement(ClickCreate).click();


    }

    @Step("click SearchCreatedRole")
    public void SearchCreatedRole(String text) {
        driver.findElement(SearchRole).sendKeys(text);
//        Custome_Wait.wait(driver,CreateRole);
    }

    @Step("click On created role")
    public void clickOncreatedrole() {
        driver.findElement(createrole).click();
    }
    @Step("Click EditRole")
    public void ClickEditRole() {
        driver.findElement(EditRole).click();
    }
    @Step("ClickProcessDocPermission")
    public void ClickProcessDocPermission() {
        driver.findElement(ProcessDocumentPermission).click();
    }
    @Step("ClickViewApiConfig")
    public void ClickViewApiConfig() {
        driver.findElement(ViewApiConfig).click();
    }

    @Step("click RemoveProcessPermission ")
    public void RemoveProcessPermission() {
        driver.findElement(RemoveProcessDocPermission).click();
    }

    @Step("ClickUpdateBtn")
    public void ClickUpdateBtn() {
        driver.findElement(ClickUpdateBtn).click();
    }

    @Step("ClickRemovePermission")
    public void ClickRemovePermission() {
        driver.findElement(RemovePermission).click();
//        Custome_Wait.wait(driver,ClickUpdateBtn);
    }

    @Step("ClickLogout")
    public void ClickLogout() {
        driver.findElement(Logout).click();
    }

    @Step("EnterUsername")
    public void EnterUsername(String text) {
        driver.findElement(Username).sendKeys(text);
    }

    @Step("EnterPassword")
    public void EnterPassword(String text) {
        driver.findElement(Password).sendKeys(text);
    }

    @Step("Click LoginButton")
    public void ClickLoginButton() {
        driver.findElement(LoginBtn).click();

    }


}