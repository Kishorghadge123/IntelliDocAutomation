package Tests;


import Pages.Project_Module;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ProjectModuleTest extends BaseTest {
    Project_Module project;
    SoftAssert softAssert;

    @BeforeClass
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - Search Created Project")
    @Description("verify_user_able_to_Search_Created_Project")
    @Test(priority = 1, groups = "smoke", description = "verify_user_able_to_Search_Created_Project")
    public void Search_Created_Project() throws Exception {

        softAssert = new SoftAssert();
        project = new Project_Module(driver);
        waitForloadSpinner();
        Assert.assertTrue(project.createbtnproject.isDisplayed());
        project.searchCreatedProject("QA-Automation-FreeForm ");
        softAssert.assertTrue(project.searchedproject.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - Update Created Project")
    @Description("verify_user_able_to_Update_Created_Project")
    @Test(priority = 2, groups = "smoke", description = "verify_user_able_to_Update_Created_Project")
    public void Update_Created_Project() throws Exception {
        softAssert = new SoftAssert();
        Thread.sleep(5000);
        Assert.assertTrue(project.updatebtn.isDisplayed());
        Assert.assertTrue(project.nextbtn.isDisplayed());
        Assert.assertTrue(project.cancelbtn.isDisplayed());
        Thread.sleep(4000);
        project.verifyProjectIsUpdated("pratiksha.bagal@neutrinotechlabs.com");
        project.selectDateRange("2022", "OCT", "20", "1");
        project.selectDateRange("2022", "OCT", "23", "2");
        project.clickstatustogglebutton();
        project.clickondocumentautoassignmentogglebtn();
        project.clickauditenabletogglebtn();
        project.clickStraightThroughProcesstogglebtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,80000)", "");
        Thread.sleep(3000);
        project.clickattributelabel();
        softAssert.assertEquals(project.fieldname.getText(), "Field Name");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,80000)", "");
        project.clickaddfieldbtn();
        project.clickaddattribute();
        project.clickdeleteattribute();
        js.executeScript("window.scrollBy(0,30000)", "");
        Thread.sleep(3000);
        project.clickonrolelabel();
        softAssert.assertTrue(project.roletab.isDisplayed());
        project.clickonnextbutton();
        waitForloadSpinner();
        project.clickondatasetlabel();
        softAssert.assertTrue(project.datasetmsg.isDisplayed());
        project.clickonadddatasetbtn();
        project.clickondataset();
        project.selectdataset();
        project.deletedataset();
        project.clickonvariablelabel();
        softAssert.assertTrue(project.variablemsg.isDisplayed());
        project.addvariable();
        Thread.sleep(2000);
        project.enterVariableName("Address");
        Thread.sleep(2000);
        project.clickvalidationtypelabel();
        project.selectvalidationtype();
        project.canceldataset();
        Thread.sleep(3000);
        project.clickOnNextButton();
        softAssert.assertTrue(project.rulemsg.isDisplayed());
        softAssert.assertTrue(project.backbtn.isDisplayed());
        project.clickOnRuleModel();
        project.clickOnAttributDropdown();
        project.selectatrribute();
        project.selectoperatodropdown();
        project.selectoperator();
        project.clickUpdate1();
        Thread.sleep(3000);
//        softAssert.assertAll();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - Update Created Project")
    @Description("verify user able to Update Created Project")
    @Test(priority = 3, groups = "smoke", description = "verify user able to Update Created Project")
    public void Create_Project_With_Valid_Data() throws Exception {
        softAssert = new SoftAssert();
        project = new Project_Module(driver);
        Thread.sleep(3000);
        project.clickOnCreateProjectButton();
        Thread.sleep(4000);
        project.ClickOnTemplateNameNew("QA-Automation");
        project.ClickOnLeadBtn();
        project.selectLead();
        project.selectDateRange("2022", "OCT", "20", "1");
        project.selectDateRange("2022", "OCT", "23", "2");
        Thread.sleep(2000);
        project.selectDocumentStructure();
        Thread.sleep(2000);
        project.selectProjectType();
        project.selectprocessengindropdown();
        Thread.sleep(1000);
        project.selectprocessingengine();
        project.clickstatustogglebutton();
        project.clickondocumentautoassignmentogglebtn();
        project.clickauditenabletogglebtn();
        project.clickStraightThroughProcesstogglebtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50000)", "");
        Thread.sleep(3000);
        softAssert.assertTrue(project.templatemsg.isDisplayed());
        project.clickAddTemplateButton();
        Thread.sleep(2000);
        project.selectTemplate();
        project.clickonrolelabel();
        softAssert.assertTrue(project.roletab.isDisplayed());
        project.clickOnAddRoleButton();
        project.selectRole();
        project.clickonroleplusbutton();
        project.selectUser();
        project.clickOutside();
        Thread.sleep(2000);
        project.clickOnDocumentlabel();
        Thread.sleep(3000);
        project.selectchanneldropdown();
        Thread.sleep(2000);
        project.selectchannel();
        project.clickonnextbutton();
        Thread.sleep(3000);
        project.clickondatasetlabel();
        softAssert.assertEquals(project.datasetmsg.getText(), "Please Add Dataset ...");
        project.clickonadddatasetbtn();
        project.clickondataset();
        project.selectdataset();
        project.clickonvariablelabel();
        softAssert.assertEquals(project.variablemsg.getText(), " Please Add Variables ...");
        project.addvariable();
        Thread.sleep(3000);
        project.enterVariableName("Address");
        Thread.sleep(2000);
        project.clickvalidationtypelabel();
        project.selectvalidationtype();
        project.canceldataset();
        Thread.sleep(3000);
        project.clickOnNextButton();
        softAssert.assertEquals(project.rulemsg.getText(), "Rules");
        softAssert.assertEquals(project.backbtn.getText(), "Back");
        project.clickOnRuleBtn();
        project.clickoncreaterolebutton();
        project.clickaddrule();
        softAssert.assertTrue(project.namemsg.isDisplayed());
        Thread.sleep(3000);
        project.enterName("rule");
        project.clickOnCondition();
        project.clickOnAttributDropdown1();
        project.selectatrribute();
        project.selectoperatodropdown();
        project.selectoperator();
        project.enterValue("10");
        project.clickonSaveButton();
        Thread.sleep(2000);
        project.clickOnTrureBox();
//        Thread.sleep(2000);
//        project.clickOnTrureBox();
//        project.enterName("ruletrur");
//        project.clickOnAddAction();
//        project.selectatrributedropdown();
//        project.selectattribute1();
//        project.variabledropdown();
//        project.selectvariable();
//        project.entervariablevalue();
//        project.clickOnTrureBox1();
//        project.enterName("rulefalse");
//        project.clickOnAddAction();
//        project.selectatrributedropdown();
//        project.selectattribute1();
//        project.variabledropdown();
//        project.selectvariable();
//        project.entervariablevalue();
//        softAssert.assertTrue(project.targetchannelmsg.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - Create Project With Blank Data")
    @Description("verify_user_able_to_Create_Project_With_Blank_Data")
    @Test(priority = 3, groups = "smoke", description = "verify_user_able_to_Create_Project_With_Blank_Data")
    public void Create_Project_With_Blank_Data() throws Exception {
        softAssert = new SoftAssert();
        project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        waitForloadSpinner();
        project.clickOnCreateButton();
        softAssert.assertTrue(project.projectnamerrmsg.isDisplayed());
        softAssert.assertTrue(project.leaderrormsg.isDisplayed());
        softAssert.assertTrue(project.startdateerrmsg.isDisplayed());
        softAssert.assertTrue(project.enddateerrmsg.isDisplayed());
        softAssert.assertTrue(project.documentstructureerrmsg.isDisplayed());
        Thread.sleep(3000);
        project.clickOnCreateButton();
        softAssert.assertTrue(project.projectcreateerrmsg.isDisplayed());
        project.clickOnCancelButton();
        waitForloadSpinner();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004 - Create Project Without Selecting Processing Engine and Templates")
    @Description("verify_that_user_able_to_Create_Project_Without_Selecting_Processing_Engine_and_Templates")
    @Test(priority = 4, groups = "smoke", description = "verify_that_user_able_to_Create_Project_Without_Selecting_Processing_Engine_and_Templates")
    public void Create_Project_Without_Selecting_Processing_Engine_And_Template() throws Exception {
        softAssert = new SoftAssert();
        project = new Project_Module(driver);
        project.clickOnCreateProjectButton();
        waitForloadSpinner();
        project.ClickOnTemplateNameNew("QA-Automation");
        project.ClickOnLeadBtn();
        project.selectLead();
        project.selectDateRange("2022", "OCT", "20", "1");
        project.selectDateRange("2022", "OCT", "23", "2");
        Thread.sleep(2000);
        project.selectDocumentStructure();
        Thread.sleep(2000);
        project.selectProjectType();
        project.clickOnCreateButton();
        softAssert.assertTrue(project.processengineerrmsg.isDisplayed());
        softAssert.assertTrue(project.templatecreateerrmsg.isDisplayed());
        project.clickOnCancelButton();
        waitForloadSpinner();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - Create Project Without Role and user")
    @Description("verify_that_user_able_to_Create_Project_without_Role_and_user")
    @Test(priority = 5, groups = "smoke", description = "verify_that_user_able_to_Create_Project_without_Role_and_user")
    public void Create_Project_Without_Without_Role_And_User() throws Exception {
        softAssert = new SoftAssert();
        project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        waitForloadSpinner();
        project.ClickOnTemplateNameNew("QA-Automation");
        project.ClickOnLeadBtn();
        project.selectLead();
        project.selectDateRange("2022", "OCT", "20", "1");
        project.selectDateRange("2022", "OCT", "23", "2");
        Thread.sleep(2000);
        project.selectDocumentStructure();
        Thread.sleep(2000);
        project.selectProjectType();
        project.selectprocessengindropdown();
        project.selectprocessingengine();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50000)", "");
        Thread.sleep(3000);
        softAssert.assertTrue(project.templatemsg.isDisplayed());
        project.clickAddTemplateButton();
        Thread.sleep(2000);
        project.selectTemplate();
        project.clickOnCreateButton();
        softAssert.assertTrue(project.rolecreateerrmsg.isDisplayed());
        project.clickOnCancelButton();
        waitForloadSpinner();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006 - Create Project Without  and user")
    @Description("verify_that_user_able_to_Create_Project_without_and_user")
    @Test(priority = 6, groups = "smoke", description = "verify_that_user_able_to_Create_Project_without_and_user")
    public void Create_Project_Without_Without_User() throws Exception {
        softAssert = new SoftAssert();
        project = new Project_Module(driver);

        project.clickOnCreateProjectButton();
        waitForloadSpinner();
        project.ClickOnTemplateNameNew("QA-Automation");
        project.ClickOnLeadBtn();
        project.selectLead();
        project.selectDateRange("2022", "OCT", "20", "1");
        project.selectDateRange("2022", "OCT", "23", "2");
        Thread.sleep(2000);
        project.selectDocumentStructure();
        Thread.sleep(2000);
        project.selectProjectType();
        project.selectprocessengindropdown();
        project.selectprocessingengine();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50000)", "");
        Thread.sleep(3000);
        softAssert.assertTrue(project.templatemsg.isDisplayed());
        project.clickAddTemplateButton();
        Thread.sleep(2000);
        project.selectTemplate();
        project.clickonrolelabel();
        project.clickOnAddRoleButton();
        project.selectRole();
        project.clickOnCreateButton();
        softAssert.assertTrue(project.usercreaterrmsg.isDisplayed());

    }

}
