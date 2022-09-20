//package Tests;
//
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.Settingpage;
//import Utilities.AssertionsFunction;
//import io.qameta.allure.Description;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Setting extends TestBase {
//
//   public static Settingpage  settingpageobj;
//public static   AssertionsFunction assertions;
//
//    WebDriver driver;
////   public static AssertionsFunction
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 01  - verify_theme_label")
//    @Description(" verify_theme_label")
//    @Test(priority = 1, groups = "sanity", description = "verify_theme_label")
//
//    public static void verify_theme_label() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//      settingpageobj=new Settingpage(driver);
//assertions=new AssertionsFunction(driver);
//        settingpageobj.clickonsettingbtn();
//        Assert.assertTrue(assertions.isPresent(settingpageobj.getlabel()));
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 02  - verify_apply_button")
//    @Description(" verify_apply_button")
//    @Test(priority = 2, groups = "sanity", description = "verify_apply_button")
//    public static void verify_apply_button() throws Exception {
//
//        Assert.assertTrue(assertions.isPresent(settingpageobj.getApplybtn()));
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 03  - verify_cancel_button")
//    @Description(" verify_cancel_button")
//    @Test(priority = 3, groups = "sanity", description = "verify_cancel_button")
//    public static void verify_cancel_button() throws Exception {
//        Assert.assertTrue(assertions.isPresent(settingpageobj.getCancelbtn()));
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 04  - verify_theme_box")
//    @Description(" verify_theme_box")
//    @Test(priority = 4, groups = "sanity", description = "verify_theme_box")
//    public static void verify_theme_box() throws Exception {
//        Assert.assertTrue(assertions.isPresent(settingpageobj.getThemebox()));
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 05  - verify_close_button")
//    @Description(" verify_close_button")
//    @Test(priority = 5, groups = "sanity", description = "verify_close_button")
//    public static void verify_close_button() throws Exception {
//
//        Assert.assertTrue(assertions.isPresent(settingpageobj.getclosebtn()));
//    }
//
//
//
//}
