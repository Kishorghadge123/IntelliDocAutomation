package Tests;

import Pages.UserPage;
import Utilities.SortingLists;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserTest extends BaseTest {
    UserPage userPage;
    SoftAssert softAssert;
    SortingLists sortingLists;

    @BeforeMethod
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 -Search project name on user page")
    @Description(" verify_that_user_able_to_Search_project_name_on_user_page")
    @Test(priority = 1, groups = "smoke", description = "verify_that_user_able_to_Search_project_name_on_user_page")
    public void verifyProjectnameShouldBeSearchOnUserPage() throws Exception {
        userPage = new UserPage(driver);
        userPage.userclickOnUserTab();
//        userPage.searchProjectInUserPage("QA Automation Project");
//        Assert.assertTrue(driver.findElement(By.xpath("//h5[@class='mat-tooltip-trigger my-0 project-name']")).isDisplayed());
        Thread.sleep(20000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.searchProjectInUserPage("QA Automation Project");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-star-inserted']")).isDisplayed());
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 002 -verify User Able To Click On Cancel Button")
    @Description(" verify_user_able_to_click_on_cancel_button")
    @Test(priority = 2, groups = "smoke", description = "verify_user_able_to_click_on_cancel_button")
    public void verifyUserAbleToClickOnCancelButton() throws Exception {
        userPage = new UserPage(driver);
        userPage.userclickOnUserTab();
        Thread.sleep(2000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.searchProjectInUserPage("QA Automation Project");
        Thread.sleep(2000);
        userPage.clickonActionBtton();
        Thread.sleep(2000);
        userPage.clickonCancelButtonOfEditUser();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 -Create New User and Verify All Text Of Create User")
    @Description(" verify_user_able_to_create_new_user_and_verify_all_text_of_create_user")
    @Test(priority = 3, groups = "smoke", description = "verify_user_able_to_create_new_user_and_verify_all_text_of_create_user")
    public void verifyUserableToCreatNewUserAndVerifyAllTextOfCreatUser() throws Exception {
        softAssert = new SoftAssert();
        userPage = new UserPage(driver);
        //verify the text of user Button
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),' Create User ')]")).getText(), "Create User");
        Thread.sleep(1000);
        userPage.clickOnCreateUserButton();
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Create')]")).getText(), "Create");
        Thread.sleep(1000);
        userPage.clickOnCreateButton();
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Please enter all the details before submitting.')]")).getText(), "Please enter all the details before submitting.");
        softAssert.assertEquals(driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid user name.')]")).getText(), "Please enter a valid user name.");
        softAssert.assertEquals(driver.findElement(By.xpath("//mat-error[contains(text(),'Please enter a valid email id.')]")).getText(), "Please enter a valid email id.");
        softAssert.assertEquals(driver.findElement(By.xpath("//button[@class='mat-focus-indicator float-right ml-2 button-cls mat-stroked-button mat-button-base mat-accent']")).getText(), "Cancel");
        Thread.sleep(1000);
        userPage.clickOncancelButtonOfcreatuser();
        softAssert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 004 -Click On Active Role Toggle Button In UserTab")
    @Description("verify_user_able_to_click_on_active_role_toggle_button_in_user_tab")
    @Test(priority = 4, groups = "smoke", description = "verify_user_able_to_click_on_active_role_toggle_button_in_user_tab")
    public void verifyUserableToClickOnActiveRoleToggalButtonInUserTab() throws Exception {
        userPage = new UserPage(driver);
        //verify the text of user Button
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.searchProjectInUserPage("QA Automation Project");
        Thread.sleep(2000);
        userPage.clickonActionBtton();
        waitForloadSpinner();
        Thread.sleep(3000);
//        if (userPage.isAddRoleButtonEnable() == true) {
//            userPage.setActiveUserToggleButton("on");
//            System.out.println(userPage.isAddRoleButtonEnable());
//            Assert.assertTrue(userPage.isAddRoleButtonEnable());
//            System.out.println("Toggle Button is on ");
//        } else {
//            userPage.setActiveUserToggleButton("off");
//            Assert.assertFalse(userPage.isAddRoleButtonEnable());
//            System.out.println("Toggle Button is off ");
//        }
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 005 -The Total Count Of User in UserTab")
    @Description("verify_the_total_Count_Of_user_in_UserTab")
    @Test(priority = 5, groups = "smoke", description = "verify_the_total_Count_Of_user_in_UserTab")
    public void verifyTheTotalCountOfUserinUserTab() throws Exception {
        userPage = new UserPage(driver);
        //verify the text of user Button
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.clickOnDropDown();
        userPage.selectDropDownValue();
        userPage.userClickOnNextpageTab();
        int exepectedCountOfUserInTable = driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size();
        String ActualCountOfUser = userPage.getUserCountOfatomperPage();
        Assert.assertEquals(exepectedCountOfUserInTable, Integer.parseInt(ActualCountOfUser));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 -All DropDown Arrow In Table")
    @Description("verify_all_dropDown_arrow_in_table")
    @Test(priority = 6, groups = "smoke", description = "verify_all_dropDown_arrow_in_table")
    public void verifyAllDropDownArrowInTable() throws Exception {
        softAssert = new SoftAssert();
        userPage = new UserPage(driver);
        sortingLists = new SortingLists(driver);
        waitForloadSpinner();
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.clickOnTableArrowDropDown("Name ");
        Thread.sleep(10000);
        sortingLists.sortingListInOrder("ascending", 1);
        userPage.clickOnTableArrowDropDown("Name ");
        sortingLists.sortingListInOrder("descending", 1);
        Thread.sleep(1000);
        sortingLists.sortingListInOrder("ascending", 2);
        userPage.clickOnTableArrowDropDown(" Email ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Email ']")).isEnabled());
        sortingLists.sortingListInOrder("descending ", 2);
        userPage.clickOnTableArrowDropDown(" Email ");
        userPage.clickOnTableArrowDropDown(" Assigned Projects ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Assigned Projects ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Assigned Projects ");
        userPage.clickOnTableArrowDropDown(" Updated ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Updated ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Updated ");
        userPage.clickOnTableArrowDropDown(" Created ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Created ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Created ");
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 007 -To Add Or Delete Role")
    @Description("verify_user_able_to_add_or_delete_role")
    @Test(priority = 7, groups = "smoke", description = "verify_user_able_to_add_or_delete_role")
    public void verifyUserAbleToAddOrDeletRole() throws Exception {
        userPage = new UserPage(driver);
        //verify the text of user Button
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        userPage.searchProjectInUserPage("QA Automation Project");
        userPage.clickonActionBtton();
        waitForloadSpinner();
        userPage.clickOnAddUserButton();
        Thread.sleep(1000);
        userPage.searchUserOnAddUser("PratikshaQA");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"col-sm-3 mt-2 white_bg d-flex justify-content-start align-items-center\"]")).isDisplayed());
        userPage.clickOnDeleteButtonIndeleteRoleInEditUser();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 008 -verify User Able To Update Project")
    @Description("verify_user_able_to_update_project")
    @Test(priority = 8, groups = "smoke", description = "verify_user_able_to_update_project")
    public void verifyUserAbleToUpdateProject() throws Exception {
        userPage = new UserPage(driver);
        //verify the text of user Button
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.searchProjectInUserPage("QA Automation Project");
        Thread.sleep(2000);
        userPage.clickonActionBtton();
        Thread.sleep(2000);
        userPage.userSendTextinTextboxofEditUser();
        userPage.searchProjectInUserPage("QA Automation Project");
        Assert.assertTrue(driver.findElement(By.xpath("//h5[@class='mat-tooltip-trigger my-0 project-name']")).isDisplayed());
        Thread.sleep(20000);
    }



    List<WebElement> userTiles = null;
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 009 -verify details on user tiles")
    @Description("verify_details_on_user_tiles")
    @Test(priority = 9, groups = "smoke", description = "verify_details_on_user_tiles")
    public void verifyTileDetailsForAllUsers() throws Exception {
        userPage = new UserPage(driver);
        waitForloadSpinner();
        userPage.userclickOnUserTab();
        waitForloadSpinner();
        userTiles = userPage.getListOfUserTiles();
        System.out.println(userTiles.size());
        /*for (WebElement ele : userTiles){
            try{
                userPage.verifyUserTileDetails(ele);
            }catch(StaleElementReferenceException sere){
                System.out.println("Stale Element Reference Exception");
                sere.printStackTrace();
                PageFactory.initElements(driver,UserPage.class);
                userPage.verifyUserTileDetails(ele);
            }
        }*/
        for(int i = 1; i <= userTiles.size(); i++){
            if(i>5)
                break;
            userPage.verifyUserTileDetails(i);
        }
    }

}






