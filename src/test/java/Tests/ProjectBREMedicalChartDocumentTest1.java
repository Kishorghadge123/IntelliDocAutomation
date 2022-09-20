//package Tests;
//import Base.BasePage;
//import BrowserDriverFactory.DriverFactory;
//import BrowserDriverFactory.TestBase;
//import Pages.ProjectBREFreeFormPage;
//import Pages.ProjectBREPage;
//import io.qameta.allure.*;
//import Utilities.AssertionsFunction;
//import Pages.DocumentPage;
//import Pages.ProjectBREMedicalChartDocumentPage;
//import Utilities.ReadProps;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//
//@Feature("Project BREMedical Chart Document Test1")
//@Listeners(Utilities.TestListeners.class)
//public class ProjectBREMedicalChartDocumentTest1 extends TestBase {
//   WebDriver driver;
//   ProjectBREFreeFormPage ProjectBREFreeFormPageobj;
//AssertionsFunction assertionsFunction;
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 001  - verify_rejected_document_no_data_extracted_on_medical_chart")
//    @Description("verify_rejected_document_no_data_extracted_on_medical_chart")
//    @Test (priority=1,groups="smoke", description = "verify_rejected_document_no_data_extracted_on_medical_chart")
//
//    public void verify_rejected_document_no_data_extracted_on_medical_chart() throws Exception { //Object Creation.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertionsFunction=new AssertionsFunction(driver);
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//ProjectBREFreeFormPageobj=new ProjectBREFreeFormPage(driver);
//        //TC 1.1 Open Ready Document and verify the Patient Demographics and Chronic conditions.
//        DocumentPage DocPageObj = new DocumentPage(driver);
//        DocPageObj.ClickDocumentBtn();
//        Thread.sleep(5000);
//        DocPageObj.ClickDropDownBtn();
//        Thread.sleep(2000);
////Search Medical Chart Project.
////        DocPageObj.ClickSearchProject(ReadProps.readAttr("MedicalChartProjectNameICD"));
////        Thread.sleep(1000);
//        DocPageObj.ClickSelectMedicalChartProjectICD();
//        Thread.sleep(5000);
//        DocPageObj.clickonfilter();
//        Thread.sleep(1000);
//        DocPageObj.selecdropdown();
//        Thread.sleep(1000);
//        DocPageObj.selectrejected();
//        Thread.sleep(4000);
//        DocPageObj.clickOutside();
//        Thread.sleep(1000);
//        DocPageObj.clickapplybtn();
//        Thread.sleep(1000);
////Open Rejected document and verify the Chronic conditions and Patient Demographics.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnRejectedDocument();
//        Thread.sleep(2000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnCancelButtonICD();
//        Thread.sleep(1000);
//        assertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.CancelBtnICD);
//        Thread.sleep(1000);
//
//    }
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002  - edit_encounter_detail_and_enter_invalid_npi_physician_on_medical_chart")
//    @Description("verify user able to edit_encounter_detail_and_enter_invalid_npi_physician_on_medical_chart")
//    @Test (priority=2,groups="smoke", description = " verify edit_encounter_detail_and_enter_invalid_npi_physician_on_medical_chart")
//    public void edit_encounter_detail_and_enter_invalid_npi_physician_on_medical_chart() throws Exception {
////Object Creation.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
////TC 1.2 Edit Encounter Details and save with Invalid NPI number and Physicians name.
////Open Ready Document.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocumentICD();
//        Thread.sleep(2000);
////open Chart Data.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
////open Chronic Conditions.
//        Thread.sleep(3000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnDiagnosisTab();
//        Thread.sleep(1000);
////Click on edit encounter details.
////        ProjectBREMedicalChartDocumentPageObj.clickonplusbtn();
////        Thread.sleep(1000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEncounterDetails();
//        Thread.sleep(2000);
////Open edit encounter details.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEditEncounterDetails();
////Clear Physicians Name.
////        ProjectBREMedicalChartDocumentPageObj.ClearDoctorName();
////save chronic conditions.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDiagosisConditionButton();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.SaveBtn);
//        Thread.sleep(1000);
////Error message for NPI and Physician details.
//    }
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 003  - run_rule_for_invalid_physicians_sign_on_medical_chart")
//    @Description("verify user able to run_rule_for_invalid_physicians_sign_on_medical_chart")
//    @Test (priority=3,groups="smoke", description = " verify run_rule_for_invalid_physicians_sign_on_medical_chart")
//
//    public void run_rule_for_invalid_physicians_sign_on_medical_chart() throws Exception
//    {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj =new ProjectBREMedicalChartDocumentPage(driver);
////TC 1.3 Perform Run rule.
////Entering valid NPI number.
//        ProjectBREMedicalChartDocumentPageObj.clickronicCondition();
//        Thread.sleep(2000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterNPI(ReadProps.readAttr("NPINumber"));
////Entering INVALID Doctor name.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEnterPhysicianName(ReadProps.readAttr("DoctorName"));
////Save chronic condition.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnSaveDiagosisConditionButton();
////Click on RUN RULE button
////        ProjectBREMedicalChartDocumentPageObj.ClickOnRunRuleBtn();
////        Thread.sleep(3000);
////Click on cancel button.
//        ProjectBREMedicalChartDocumentPageObj.clickOnCancel();
//        Thread.sleep(2000);
//        assertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.CancelBtnICD);
//        Thread.sleep(2000);
//
//driver.navigate().back();
//Thread.sleep(3000);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 004  - verify_icd_on_medical_chart")
//    @Description("verify user able to verify_icd_on_medical_chart")
//    @Test (priority=4,groups="smoke", description = "  verify_icd_on_medical_chart")
//
//    public void verify_icd_on_medical_chart() throws Exception
//    {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj =new ProjectBREMedicalChartDocumentPage(driver);
////TC 1.4 verify all conditions for ICD Code.
////Open Ready document Thread.sleep(1000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnReadyDocumentICD();
//        Thread.sleep(2000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnChartData();
//        Thread.sleep(1000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnDiagnosisTab();
//        Thread.sleep(2000);
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEncounterDetails();
//        ProjectBREMedicalChartDocumentPageObj.ClickOnEditICDCodeOnEditDiagnosisDetails();
//        assertionsFunction.isPresent(ProjectBREMedicalChartDocumentPageObj.icd);
//        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 005  - save_without_hcc_comments_on_medical_chart")
//    @Description("verify user able to save_without_hcc_comments_on_medical_chart")
//    @Test (priority=5,groups="smoke", description = " verify save_without_hcc_comments_on_medical_chart")
//
//    public void save_without_hcc_comments_on_medical_chart() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj =new ProjectBREMedicalChartDocumentPage(driver);
//        Thread.sleep(1000);
////Save without HCC and Comments.
//        ProjectBREMedicalChartDocumentPageObj.SaveIcd();
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 006  - save_with_hcc_comments_on_medical_chart")
//    @Description("verify user able to save_with_hcc_comments_on_medical_chart")
//    @Test (priority=6,groups="smoke", description = " verify save_with_hcc_comments_on_medical_chart")
//
//    public void save_with_hcc_comments_on_medical_chart() throws Exception
//    {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        ProjectBREMedicalChartDocumentPage ProjectBREMedicalChartDocumentPageObj = new ProjectBREMedicalChartDocumentPage(driver);
//        Thread.sleep(2000);
////Enter valid HCC code.
////ProjectBREMedicalChartDocumentPageObj.ClickOnEnterHCCCodes(ReadProps.readAttr("HCCCodes"));
////        ProjectBREMedicalChartDocumentPageObj.ClickOnAddComment();
////        Thread.sleep(1000);
////Select comment 'ADD' from suggestions.
//        ProjectBREMedicalChartDocumentPageObj.ClickOnSelectCommentAdd();
//Thread.sleep(3000);
//ProjectBREMedicalChartDocumentPageObj.selectICD();
//Thread.sleep(2000);
//        ProjectBREMedicalChartDocumentPageObj.SaveIcd();
//        Thread.sleep(2000);
//         }
//}
//
//
//
//
//
