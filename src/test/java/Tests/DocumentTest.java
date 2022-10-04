package Tests;
import Pages.DocumentPage;
import Utilities.SelectDates;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class DocumentTest extends BaseTest{
    DocumentPage docobj;
    SoftAssert softAssert;

    @BeforeMethod
    public void setmethod() throws Exception {

        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
  driver.quit();
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - verify_Data_Extracted_From_Document")
    @Description("verify_Data_Extracted_From_Document")
    @Test(priority = 1, groups = "smoke", description = "verify_Data_Extracted_From_Document")
    public void verify_Data_Extracted_From_Document() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(2000);
        docobj.clickOnSize();
        Thread.sleep(2000);
        docobj.clickOnReadyDocument();
        Thread.sleep(3000);
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        docobj.clickOnSaveDraftButton();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - Verify_Working_Of_Diagnosis_Without_Adding_Encounter_Details")
    @Description("Verify_Working_Of_Diagnosis_Without_Adding_Encounter_Details")
    @Test(priority = 2, groups = "smoke", description = "Verify_Working_Of_Diagnosis_Without_Adding_Encounter_Details")
    public void Verify_Working_Of_Diagnosis_Without_Adding_Encounter_Details() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        waitForloadSpinner();
        docobj.clickOnReadyDocument();
        waitForloadSpinner();
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnAddDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnSave();
        Thread.sleep(2000);
        softAssert.assertTrue(docobj.npierromsg.isDisplayed());
        softAssert.assertTrue(docobj.doctorerrmsg.isDisplayed());
        softAssert.assertTrue(docobj.startdateerrmsg.isDisplayed());
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Description("Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Test(priority = 3, groups = "smoke", description = "Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    public void Verify_Working_Of_Diagnosis_Without_Adding_Date_Encounter_Details() throws Exception {

        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(3000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        Thread.sleep(3000);
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnAddDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnSave();
        Thread.sleep(2000);
        docobj.enterNpiNo("122");
        docobj.enterDoctorName("Sinha");
        docobj.clickOnSave();
        softAssert.assertTrue(docobj.startdateerrmsg.isDisplayed());
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 004 - Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Description("Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Test(priority = 4, groups = "smoke", description = "Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    public void Edit_Encounter_Details() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        waitForloadSpinner();
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnAddDiagnosisTab();
        Thread.sleep(3000);
        docobj.clickOnSave();
        Thread.sleep(2000);
        docobj.enterNpiNo("122");
        docobj.enterDoctorName("Sinha");
        docobj.clickOnCancel();
        Thread.sleep(2000);
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Description("Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Test(priority = 5, groups = "smoke", description = "Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    public void Without_Adding_HCC_Details() throws Exception {

        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        waitForloadSpinner();
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(1000);
        docobj.clickOnAddDiagnosisName();
        Thread.sleep(1000);
        docobj.clickOnAddHccPlusBtn();
        Thread.sleep(1000);
        docobj.clickOnHCCSaveBtn();

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 006 - Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    @Description("Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    @Test(priority = 6, groups = "smoke", description = "Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    public void Verify_Without_Adding_DiagnosisName_In_HCC_Details() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        waitForloadSpinner();
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(1000);
        docobj.clickOnAddDiagnosisName();
        Thread.sleep(1000);
        docobj.clickOnAddHccPlusBtn();
        Thread.sleep(1000);
        docobj.enterPageNumber("1");
        docobj.selectHccDropdown();
        docobj.selectComments();
        docobj.clickOnHCCSaveBtn();


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 007 - Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    @Description("Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    @Test(priority = 7, groups = "smoke", description = "Verify_Without_Adding_DiagnosisName_In_HCC_Details")
    public void Add_HCC_Details() throws Exception {

        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        Thread.sleep(3000);
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(1000);
        docobj.clickOnAddDiagnosisName();
        Thread.sleep(1000);
        docobj.clickOnAddHccPlusBtn();
        Thread.sleep(1000);
        docobj.eneterDiasesname("CUFF");
        Thread.sleep(1000);
        docobj.enterPageNumber("1");
        docobj.selectHccDropdown();
        docobj.selectComments();
        docobj.clickOnAddIcdBtn();
        docobj.enterIcdNo("e11");
        docobj.selectDescriptionType();
        Thread.sleep(1000);
        docobj.clickOnHCCSaveBtn();


    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 008 - Delete_HCC_Details")
    @Description("Delete_HCC_Details")
    @Test(priority = 8, groups = "smoke", description = "Delete_HCC_Details")
    public void Delete_HCC_Details() throws Exception {

        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        Thread.sleep(3000);
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(1000);
        docobj.clickOnAddDiagnosisName();
        Thread.sleep(1000);
        docobj.clickOnAddHccPlusBtn();
        Thread.sleep(1000);
        docobj.eneterDiasesname("CUFF");
        Thread.sleep(1000);
        docobj.enterPageNumber("1");
        docobj.selectHccDropdown();
        docobj.selectComments();
        docobj.clickOnAddIcdBtn();
        docobj.enterIcdNo("e11");
        docobj.selectDescriptionType();
        docobj.clickOnHCCSaveBtn();
        Thread.sleep(2000);
        docobj.deleteDiagnosis();
        Thread.sleep(1000);

    }




    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 010  - verify that user able to Check Document ")
    @Description("verify_that_user_able_to_Check_Document")
    @Test(priority = 10, groups = "smoke", description = "verify_that_user_able_to_Check_Document")
    public void verifyDocumentOnUserPage() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        docobj = new DocumentPage(driver);
        waitForloadSpinner();
        docobj.clickOnDocumentPage();
        Thread.sleep(3000);
        docobj.clickOnSearchDropdown();
        Thread.sleep(2000);
        docobj.clickonsearchProjectName();
        Thread.sleep(2000);
        docobj.clickOnKeyboardArrayDown();
        softAssert.assertTrue(docobj.validateFilter.isDisplayed());
        softAssert.assertTrue(docobj.validateDocumnetName.isDisplayed());
        softAssert.assertTrue(docobj.validateAssignee.isDisplayed());
        Thread.sleep(2000);
        docobj.clickOnAssigneeDropDown();
        Thread.sleep(1000);
        docobj.clickUnassignedCheckBox();
        Thread.sleep(1000);
        docobj.clickOutside();
        Thread.sleep(1000);
        docobj.clickOnStatusDropDown();
        docobj.clickOnReadyCheckBox();
        Thread.sleep(1000);
        docobj.clickOnRejectedCheckBox();
        docobj.clickOutside();
        Thread.sleep(1000);
        docobj.clickOnApplyButton();
        Thread.sleep(2000);
        docobj.clickOnStatusDropDown();
        docobj.clickOnRejectedCheckBox();
        Thread.sleep(1000);
        docobj.clickOnProcessedCheckBox();
        docobj.clickOutside();
        Thread.sleep(1000);
        docobj.clickOnApplyButton();
        softAssert.assertAll();
    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - verify that user able to Check Document ")
    @Description("verify_that_user_able_to_Check_Document")
    @Test(priority = 11, groups = "smoke", description = "verify_that_user_able_to_Check_Document")
    public void verifyTotalCountOfDocumentTab() throws Exception {
        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentPage();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            Thread.sleep(1000);
            docobj.selectProjectFromDropDown(i);
            Thread.sleep(1000);
            docobj.verifyTotalCountOfAllDocInAnalyticsSection();
            Thread.sleep(3000);
            docobj.clickOnDropdown();
        }

    }


    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Description("Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    @Test(priority = 5, groups = "smoke", description = "Verify_Working_Of_Diagnosis_Adding_Encounter_Details")
    public void Edit_Diagnosis_Details() throws Exception {

        docobj = new DocumentPage(driver);
        softAssert = new SoftAssert();
        waitForloadSpinner();
        docobj.clickOnDocumentTab();
        waitForloadSpinner();
        docobj.clickOnDropdown();
        Thread.sleep(2000);
        docobj.selectProject();
        Thread.sleep(1000);
        docobj.clickOnReadyDocument();
        waitForloadSpinner();
        softAssert.assertTrue(docobj.readydocname.isDisplayed());
        softAssert.assertAll();
        docobj.clickOnChartData();
        Thread.sleep(1000);
        docobj.clickOnDiagnosisTab();
        Thread.sleep(1000);
        docobj.clickOnAddDiagnosisName();
        Thread.sleep(1000);
        docobj.clickOnAddHccPlusBtn();
        Thread.sleep(1000);
        docobj.clickOnHCCSaveBtn();

    }


}
