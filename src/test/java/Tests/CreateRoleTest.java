package Tests;


import Pages.CreateRolePage;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;

@Feature("test to create role")
public class CreateRoleTest extends BaseTest {
    CreateRolePage createRolePage;
    SoftAssert softAssert;

    @BeforeMethod
    public void setupmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1, groups = "smoke", description = "verify invalid data")
    public void verifyCreateNewRoleWithPermisson() throws Exception {
        createRolePage = new CreateRolePage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(4000);
        createRolePage.clickRoleBtn();
        Thread.sleep(3000);
        createRolePage.clickCreateRoleBtn();
        Thread.sleep(3000);
        createRolePage.EnterNewRoleName("Om_");
        createRolePage.activateButton();
        Thread.sleep(2000);
        softAssert.assertTrue(createRolePage.roleNameError.isDisplayed());
        //  softAssert.assertTrue(createRolePage.roleNameLmt.isDisplayed());
        createRolePage.addPermission();
        Thread.sleep(3000);
        createRolePage.roleOption();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn1();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn2();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn3();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        createRolePage.clickOutside();
        createRolePage.createButton();
        // createRolePage.cancelButton();

    }

    @Test(priority = 2, groups = "smoke", description = "verify role with invalid details and cancel")
    public void verifyRolewithInvalidData() throws Exception {
        createRolePage = new CreateRolePage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(4000);
        createRolePage.clickRoleBtn();
        Thread.sleep(3000);
        createRolePage.clickCreateRoleBtn();
        Thread.sleep(3000);
        createRolePage.EnterNewRoleName("O");
        createRolePage.activateButton();
        Thread.sleep(3000);
        //softAssert.assertTrue(createRolePage.roleNameError.isDisplayed());
        softAssert.assertTrue(createRolePage.roleNameLmt.isDisplayed());
        createRolePage.addPermission();
        Thread.sleep(2000);
        createRolePage.roleOption();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn1();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn2();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn3();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        createRolePage.clickOutside();
        //createRolePage.createButton();
        createRolePage.cancelButton();


    }

    @Test(priority = 3, groups = "smoke", description = "verify role with valid details")
    public void verifyRoleWithCreateButton() throws Exception {
        createRolePage = new CreateRolePage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(4000);
        createRolePage.clickRoleBtn();
        waitForloadSpinner();
        // Thread.sleep(3000);
        createRolePage.clickCreateRoleBtn();
        Thread.sleep(3000);
        createRolePage.EnterNewRoleName("Om");
        createRolePage.activateButton();
        Thread.sleep(3000);
        //softAssert.assertTrue(createRolePage.roleNameError.isDisplayed());
        // softAssert.assertTrue(createRolePage.roleNameLmt.isDisplayed());
        createRolePage.addPermission();
        Thread.sleep(2000);
        createRolePage.roleOption();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn1();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn2();
        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn3();
        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        createRolePage.clickOutside();
        createRolePage.createButton();
    }

}


