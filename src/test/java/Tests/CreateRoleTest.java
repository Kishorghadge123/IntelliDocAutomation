package Tests;
import Pages.CreateRolePage;
import Utilities.ClickOnOutSide;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.awt.*;
import java.awt.event.KeyEvent;

@Feature("test to create role")
public class CreateRoleTest extends BaseTest {
    CreateRolePage createRolePage;
    ClickOnOutSide clickOnOutSide;
    SoftAssert softAssert;

    @BeforeMethod
    public void setupmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - verify that user is able to create new role with permission")
    @Description("verify_that_user_is_able_to_create_new_role_with_permission")
    @Test(priority = 1, groups = "smoke", description = "verify_that_user_is_able_to_create_new_role_with_permission")
    public void verifyCreateNewRoleWithPermisson() throws Exception {
        createRolePage = new CreateRolePage(driver);
        clickOnOutSide=new ClickOnOutSide(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
//        Thread.sleep(4000);
        createRolePage.clickRoleBtn();
//        Thread.sleep(3000);
        createRolePage.clickCreateRoleBtn();
        waitForloadSpinner();
//        Thread.sleep(3000);
        createRolePage.EnterNewRoleName("Om_");
        createRolePage.activateButton();
        waitForloadSpinner();
//        Thread.sleep(2000);
        softAssert.assertTrue(createRolePage.roleNameError.isDisplayed());
        createRolePage.addPermission();
        waitForloadSpinner();
//        Thread.sleep(3000);
        createRolePage.roleOption();
        waitForloadSpinner();
//        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn1();
        waitForloadSpinner();
//        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn2();
        waitForloadSpinner();
//        Thread.sleep(1000);
        createRolePage.roleSubOpnBtn3();
        waitForloadSpinner();
//        Thread.sleep(1000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        clickOnOutSide.clickOutside();
        createRolePage.createButton();
        // createRolePage.cancelButton();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - verify role with invalid data details and cancel")
    @Description("verify_role_with_invalid_data_details_and_cancel")
    @Test(priority = 2, groups = "smoke", description = "verify_role_with_invalid_data_details_and_cancel")
    public void verifyRolewithInvalidData() throws Exception {
        createRolePage = new CreateRolePage(driver);
        clickOnOutSide=new ClickOnOutSide(driver);
        softAssert = new SoftAssert();
        Thread.sleep(4000);
        createRolePage.clickRoleBtn();
        Thread.sleep(3000);
        createRolePage.clickCreateRoleBtn();
        Thread.sleep(3000);
        createRolePage.EnterNewRoleName("O");
        createRolePage.activateButton();
        Thread.sleep(3000);
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
        clickOnOutSide.clickOutside();
        //createRolePage.createButton();
        createRolePage.cancelButton();
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - verify that user is able to create role with valid details")
    @Description("verify_that_user_is_able_to_create_role_with_valid_details")
    @Test(priority = 3, groups = "smoke", description = "verify_that_user_is_able_to_create_role_with_valid_details")
    public void verifyRoleWithCreateButton() throws Exception {
        createRolePage = new CreateRolePage(driver);
        clickOnOutSide=new ClickOnOutSide(driver);
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
        clickOnOutSide.clickOutside();
        createRolePage.createButton();
    }

}


