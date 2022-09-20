package Tests;

import Pages.UserPage;
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

    @BeforeMethod
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
//        driver.close();
    }

    @Test(priority = 1)
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

    @Test(priority = 2)
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

    @Test(priority = 3)
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

    @Test(priority = 4)
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
        if (userPage.isAddRoleButtonEnable() == true) {
            userPage.setActiveUserToggleButton("on");
            System.out.println(userPage.isAddRoleButtonEnable());
            Assert.assertTrue(userPage.isAddRoleButtonEnable());
        } else
            userPage.setActiveUserToggleButton("off");
        Assert.assertFalse(userPage.isAddRoleButtonEnable());
    }

    @Test(priority = 5)
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

    @Test(priority = 6)
    public void verifyAllDropDownArrowInTable() throws Exception {
        softAssert = new SoftAssert();
        userPage = new UserPage(driver);
        waitForloadSpinner();
        userPage.userclickOnUserTab();
        Thread.sleep(10000);
        userPage.clickonGridIcon();
        Thread.sleep(2000);
        userPage.verifySortingorder("ascending");
        userPage.clickOnTableArrowDropDown("Name ");
        Thread.sleep(10000);
        userPage.clickOnTableArrowDropDown("Name ");
        Thread.sleep(1000);
        userPage.verifySortingorder("ascending");
        userPage.clickOnTableArrowDropDown(" Email ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Email ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Email ");
        userPage.verifySortingorder("ascending");
        userPage.clickOnTableArrowDropDown(" Assigned Projects ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Assigned Projects ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Assigned Projects ");
        userPage.verifySortingorder("ascending");
        userPage.clickOnTableArrowDropDown(" Updated ");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Updated ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Updated ");
        userPage.clickOnTableArrowDropDown(" Created ");
        userPage.verifySortingorder("ascending");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[text()=' Created ']")).isEnabled());
        userPage.clickOnTableArrowDropDown(" Created ");
        softAssert.assertAll();
    }

    @Test(priority = 7)
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

    @Test(priority = 8)
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

}




