//package Tests;
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//
//import Pages.EditProfilePage;
//import Pages.LoginPage;
//import Pages.ProjectPage;
//import io.qameta.allure.*;
//import Utilities.Custome_Wait;
//import Utilities.AssertionsFunction;
//import Utilities.ReadProps;
//import org.checkerframework.checker.units.qual.A;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//@Feature("Edit Profile Test")
//@Listeners(Utilities.TestListeners.class)
//public class EditProfileTest extends BaseTest {
//     LoginPage loginPageObjects;
//     EditProfilePage EditProfileObj;
//     ProjectPage ProjectPageObj;
//    AssertionsFunction assertionsFunction;
//
//WebDriver driver;
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001  - visible_password_on")
//    @Description("verify user able to visible_password_on")
//    @Test (priority=1,groups="smoke", description = "verify visible_password_on")
//
//    public void visible_password_on() throws Exception {
////        driver.get(ReadProps.readAttr("URL"));
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//
//        driver.manage().window().maximize();
//
//        assertionsFunction=new AssertionsFunction(driver);
//
//        EditProfileObj = new EditProfilePage(driver);
//        loginPageObjects = new LoginPage(driver);
//        ProjectPageObj = new ProjectPage(driver);
//        //TC 11.1 Visible Password On.
////        ProjectPageObj.EnterUsername(ReadProps.readAttr("UserID"));
////        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
////        EditProfileObj.clickVisible();
////        assertionsFunction.verifyElementPresent(EditProfileObj.Visible);
////        Thread.sleep(1000);
//
//
//    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 002  - visible_password_off")
////    @Description("verify user able to visible_password_off")
////    @Test (priority=2,groups="smoke", description = "verify visible_password_off")
////
////    public void visible_password_off() throws Exception {
////        //TC 11.2 Visible Password Off.
////        EditProfileObj.clickVisible();
////        loginPageObjects.clickLoginButtonForValidInput();
//
////    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003  - profile_icon")
//    @Description("verify user able to profile_icon")
//    @Test (priority=3,groups="smoke", description = "verify profile_icon")
//
//    public void profile_icon() throws Exception {
//        //TC 11.3 Profile Icon
//        EditProfileObj.ProfileButton();
//        EditProfileObj.verify_profile_icon();
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 4  - night_mode_day_mode")
//    @Description("verify user able to do night_mode_day_mode")
//    @Test (priority=4,groups="smoke", description = "verify night_mode_day_mode")
//
//    public void edit_profile() throws Exception {
//        //TC 11.5 Edit Profile.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        EditProfileObj.EditProfileButton();
//        Thread.sleep(2000);
//        EditProfileObj.verify_edit_profile();
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 5  - edit_profile")
//    @Description("verify user able to edit_profile")
//    @Test (priority=5,groups="smoke", description = "verify night_mode_day_mode")
//
//    public void edit_profile_cancel() throws Exception {
//        //TC 11.6 Edit Profile Cancel.
//        EditProfileObj.CancelButton();
//        EditProfileObj.verify_edit_profile_cancel();
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 6  - edit_profile_cancel")
//    @Description("verify user able to edit_profile_cancel")
//    @Test (priority=6,groups="smoke", description = "verify edit_profile_cancel")
//
//    public void edit_profile_save() throws Exception {
//        EditProfileObj.ProfileButton();
//        EditProfileObj.EditProfileButton();
//        EditProfileObj.SaveButton();
//        assertionsFunction.isPresent(EditProfileObj.Save);
//        Thread.sleep(1000);
//
//    }
//
//
//    }
