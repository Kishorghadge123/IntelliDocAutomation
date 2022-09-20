package Tests;


import Pages.AnalyticsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.text.ParseException;


//@Listeners(Utilities.TestListeners.class)
public class AnalyticsTest extends BaseTest {
    AnalyticsPage AnalyticsPageObj;

    SoftAssert softAssert;
    @BeforeClass
    public void setmethod() throws Exception {
        setup();
        Thread.sleep(2000);
        loginApplication();
    }
    @AfterClass
    public void tearDown() {
        driver.close();
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - test organization arrows on analytics page")
    @Description("verify user able to click organization arrows on analytics page")
    @Test(priority = 1, groups = "smoke", description = "verify test organization arrows on analytics page")
    public void test_organization_arrows_on_analytics_page_and_Doc() throws Exception {
        AnalyticsPageObj = new AnalyticsPage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(20000);
        AnalyticsPageObj.ClickAnalyticsBtn();
        Thread.sleep(2000);
        double Percentage_Of_ready_MedicalChart = AnalyticsPageObj.Verify_progress_bar_Count_and_Total_Count_Of_Documents_for_all_Project("Medical Chart", "ready");
        double Percentage_Of_ProcessedMedicalChart = AnalyticsPageObj.Verify_progress_bar_Count_and_Total_Count_Of_Documents_for_all_Project("Medical Chart", "processed");
        double Percentage_Of_rejectedMedicalChart = AnalyticsPageObj.Verify_progress_bar_Count_and_Total_Count_Of_Documents_for_all_Project("Medical Chart", "rejected");
        double count_Of_readyMedicalChart = AnalyticsPageObj.getCountFromProgresBar("Medical Chart", Percentage_Of_ready_MedicalChart);
        double count_Of_ProcessedMedicalChart = AnalyticsPageObj.getCountFromProgresBar("Medical Chart", Percentage_Of_ProcessedMedicalChart);
        double count_Of_rejectedMedicalChart = AnalyticsPageObj.getCountFromProgresBar("Medical Chart", Percentage_Of_rejectedMedicalChart);
        double Count_Of_MedicalChart_progressbar = ((count_Of_readyMedicalChart + count_Of_ProcessedMedicalChart + count_Of_rejectedMedicalChart) + 0.10);
        System.out.println(Count_Of_MedicalChart_progressbar);
        int actualCount_Of_MedicalChart_progressbar = (int) Count_Of_MedicalChart_progressbar;
        System.out.println("TotalCount:-" + actualCount_Of_MedicalChart_progressbar);
        String totalCount_of_MedicalChart = driver.findElement(By.xpath("//div[text()=' Medical Chart ']/span[contains(text(),'Total')][1]")).getText().split("Total: ")[1];
        int expectedTotalCount_of_MedicalChartdocument = Integer.parseInt(totalCount_of_MedicalChart);
        System.out.println("TotalCount:-" + expectedTotalCount_of_MedicalChartdocument);
        softAssert.assertEquals(actualCount_Of_MedicalChart_progressbar, expectedTotalCount_of_MedicalChartdocument);
        System.out.println("Test Pass");
//        Thread.sleep(2000);
//        AnalyticsPageObj.ClickOrganizationArrow();
//        assertionsFunction.verifyElementPresent(AnalyticsPage.StatisticsHidden);
//        AnalyticsPageObj.clickProjectStatisticsarrow();
//        AnalyticsPageObj.ClickOrganizationArrow();
//        AnalyticsPageObj.clickProjectStatisticsarrow();
//        assertionsFunction.verifyElementPresent(AnalyticsPage.ProjectStatistics);
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
        softAssert.assertAll();

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 001 - verify_Total_Document_Count")
    @Description(" verify_Total_Document_Count")
    @Test(priority = 2, groups = "smoke", description = "verify_Total_Document_Count")
    public void verify_Total_Document_Count() throws ParseException, InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(2000);
        AnalyticsPageObj.verfy_TotalCountofDocuments_in_Organization_Statistics();
        AnalyticsPageObj.verfiy_TotalPercentageCount_Of_Organization_Statistics();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - verify_Total_Document_Count")
    @Description(" verify_Total_Document_Count")
    @Test(priority = 3, groups = "smoke", description = "verify_Total_Document_Count")
    public void verify_Total_Document_CountInProjectStatistics() throws ParseException, InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(20000);
        int actualCountOfProjectDoc = AnalyticsPageObj.verfiyThatTotalCountOfProjectDocisequleToTotalCountOfProccessReadyRejectDoc();
        String expectedCountOfProjectDoc = driver.findElement(By.xpath("(//div[@class='row'] //div[@class='col-md-2 mb-3 px-2']//h5)[1]")).getText();
        int expectedCountOfProjectDocs = Integer.parseInt(expectedCountOfProjectDoc);
        Assert.assertEquals(actualCountOfProjectDoc, expectedCountOfProjectDocs);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - verifyThatuserableToseetrendsAccordingToSelections")
    @Description(" verifyThatuserableToseetrendsAccordingToSelections")
    @Test(priority = 4, groups = "smoke", description = "verifyThatuserableToseetrendsAccordingToSelections")
    public void verifyThatuserableToseetrendsAccordingToSelections() throws InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(20000);
        String actualtextofdailybutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Daily ");
        String expectedtextDaily = driver.findElement(By.xpath(" //span[contains(text(),'Daily trends')] ")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofdailybutton,expectedtextDaily);
        System.out.println("Dialy Test Pass");
        String actualtextofWeeklybutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Weekly ");
        String expectedtextWeekly = driver.findElement(By.xpath("//span[contains(text(),' Weekly trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofWeeklybutton,expectedtextWeekly);
        System.out.println("Wekly Test Pass");
        String actualtextofMonthlybutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Monthly ");
        String expectedtextMonthly  = driver.findElement(By.xpath("//span[contains(text(),' Monthly trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofMonthlybutton,expectedtextMonthly);
        System.out.println("Monthly Test Pass");
        String actualtextofOverallbutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Overall ");
        String expectedtextOverall   = driver.findElement(By.xpath("//span[contains(text(),' Overall trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofOverallbutton,expectedtextOverall);
        System.out.println("Overall Test Pass");
    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - verifyThatuserableToseetrendsAccordingToSelections")
    @Description(" verifyThatuserableToseetrendsAccordingToSelections")
    @Test(priority = 5, groups = "smoke", description = "verifyThatuserableToseetrendsAccordingToSelections")
    public void verifyTotalcountOfreadyToProccessDocisequalToTotalcountofDocinTable() throws InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
       int actualcountOfdoc =AnalyticsPageObj.verifyTotalcountOfreadyToProccessDocisequalToTotalcountofDocinTable();
        String expectedCountOfDocument = driver.findElement(By.xpath("//span[@class='bgcolor2 customBadge rounded_5px ml-3 ng-star-inserted']")).getText();
        int expectedCountOfDocuments = Integer.parseInt(expectedCountOfDocument);
        System.out.println(expectedCountOfDocuments);
        Assert.assertEquals(actualcountOfdoc,expectedCountOfDocuments);
    }
    @Test(priority = 7)
    public void verifyThatuserClickOnNtsplatformAdminbuttonandAdminPopupisDispaly() throws InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger mat-m')]")).click();
        boolean element = driver.findElement(By.xpath("//div[@class='mat-menu-content ng-tns-c108-0']")).isDisplayed();
        Assert.assertTrue(element);
        driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-item ng-tns-c108-0')]")).click();
        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")).click();
        boolean element1 = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger mat-m')]")).isDisplayed();
        Assert.assertTrue(element1);
    }
    @Test(priority = 8)
    public void verifyThatUserableToEditAdminProfile() throws InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger mat-m')]")).click();

    }

//########################################################################################################################################################
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 002 - hover total users on Analytics page")
//    @Description("verify user able to hover mouse on total users on Analytics page")
//    @Test(priority = 9, groups = "smoke", description = "verify hover the mouse on total users on Analytics page")
//    public void hover_total_users_on_Analytics_page() throws Exception {
//        // 1.2 Hover on Total Users.
//        AnalyticsPageObj.HoverTotalUser();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.TotalUser));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//    }
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003  hover total documents on Analytics page")
//    @Description("verify user able to hover a mouse on total documents on Analytics page")
//    @Test(priority = 10, groups = "smoke", description = "verify hover the mouse on total documents on Analytics page")
//
//    public void hover_total_documents_on_Analytics_page() throws Exception {
//        AnalyticsPageObj.HoverDocuments();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.Document));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  hover processed documents on Analytics page")
//    @Description("verify user able to hover a mouse on processed documents on Analytics page")
//    @Test(priority = 11, groups = "smoke", description = "verify hover the mouse on processed documents on Analytics page")
//    public void hover_processed_documents_on_Analytics_page() throws Exception {
//        // 1.4 Hover on Processed Documents.
//        AnalyticsPageObj.HoverProcessed();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.Processed));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005  hover ready to process on Analytics page")
//    @Description("verify user able to hover a mouse on ready to process on Analytics page")
//    @Test(priority = 12, groups = "smoke", description = "verify hover the mouse on ready to process on Analytics page")
//    public void hover_ready_to_process_on_Analytics_page() throws Exception {
//        // 1.5 Hover on Ready to Process Documents.
//        AnalyticsPageObj.HoverReadyToProcess();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.ReadyToProcess));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006  hover on ready to rejected documents on Analytics page")
//    @Description("verify user able to hover a mouse on ready to rejected documents on Analytics page")
//    @Test(priority = 13, groups = "smoke", description = "verify hover the mouse on ready to rejected documents on Analytics page")
//    public void hover_ready_to_rejected_documents_on_Analytics_page() throws Exception {
//        // 1.6 Hover on Ready to Rejected Documents.
//        AnalyticsPageObj.HoverRejected();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.Rejected));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007  hover on validation time on Analytics page")
//    @Description("verify user able to hover a mouse on validation time on Analytics page")
//    @Test(priority = 14, groups = "smoke", description = "verify hover the mouse on validation time on Analytics page")
//
//    public void hover_validation_time_on_Analytics_page() throws Exception {
//        // 1.7 Hover on Validation Time.
//        AnalyticsPageObj.HoverValidationTime();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.ValidationTime));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008  hover on structured on Analytics page")
//    @Description("verify user able to hover a mouse on structured on Analytics page")
//    @Test(priority = 15, groups = "smoke", description = "verify hover the mouse on structured on Analytics page")
//    public void hover_on_structured_on_Analytics_page() throws Exception {
//        // 1.8 Hover on Structured.
//        AnalyticsPageObj.HoverStructuredBar();
//        assertionsFunction.verifyColor(AnalyticsPageObj.SProcessedBar, "#86db46");
//
//    }
//
////
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 009  hover on semistructured on Analytics page")
//    @Description("verify user able to hover a mouse on semistructured on Analytics page")
//    @Test(priority = 16, groups = "smoke", description = "verify hover the mouse on semistructured on Analytics page")
//
//
//    public void hover_on_semistructured_on_Analytics_page() throws Exception {
//        // 1.9 Hover on Semi-Structured.
//        AnalyticsPageObj.HoverSemiStructured();
//        assertionsFunction.verifyColor(AnalyticsPageObj.SSProcessedBar, "#e9ecef");
//
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 010  hover on freeform on Analytics page")
//    @Description("verify user able to hover a mouse on freeform on Analytics page")
//    @Test(priority = 17, groups = "smoke", description = "verify hover the mouse on freeform on Analytics page")
//
//    public void hover_on_freeform_on_Analytics_page() throws Exception {
//        // 1.10 Hover on Free-Form.
//        AnalyticsPageObj.HoverFreeForm();
//        assertionsFunction.verifyColor(AnalyticsPageObj.FFProcessedBar, "#86db46");
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 011 hover on medicalchart on Analytics page")
//    @Description("verify user able to hover a mouse on medicalchart on Analytics page")
//    @Test(priority = 18, groups = "smoke", description = "verify hover the mouse on medicalchart on Analytics page")
//
//
//    public void hover_on_medicalchart_on_Analytics_page() {
//        AnalyticsPageObj.HoverMedicalChart();
//        //Project Statistics.
//        AnalyticsPageObj.ClickProjectDownArrow();
//        assertionsFunction.verifyElementPresent(AnalyticsPage.ProjectDownArrow);
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 012 search project on Analytics page")
//    @Description("verify user able to search project on Analytics page")
//    @Test(priority = 19, groups = "smoke", description = "verify search project on Analytics page")
//
//    public void search_project_on_Analytics_page() throws Exception {
//        //1.12 Search Project.
//        AnalyticsPageObj.ClickSearchProject();
//        Thread.sleep(2000);
//        AnalyticsPageObj.ClickSelectProject();
//        Thread.sleep(2000);
//
//    }
//
//
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 013 select monthly data on analytics age")
//    @Description("verify user able to select monthly data on Analytics page")
//    @Test(priority = 20, groups = "smoke", description = "verify select monthly data on Analytics page")
//    public void select_monthly_data_on_Analytics_page() throws Exception {
//        //1.14 Monthly Data.
//
//        AnalyticsPageObj.ClickSelectMonthly();
//        AnalyticsPageObj.ClickSelectDropDown();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.SelectDropDown));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//    }
//
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 0015 select weekly data on Analytics page")
//    @Description("verify user able to select weekly data on Analytics page")
//    @Test(priority = 21, groups = "smoke", description = "verify select weekly data on Analytics page")
//    public void select_weekly_data_on_Analytics_page() throws Exception {
//        AnalyticsPageObj.ClickSelectWeekly();
//        AnalyticsPageObj.ClickSelectDropDown();
//        Assert.assertTrue(assertionsFunction.isPresent(AnalyticsPage.SelectDropDown));
//        assertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);
//    }
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("story_id: 0016 select daily data on Analytics page")
//    @Description("verify user able to select daily data on Analytics page")
//    @Test(priority = 22, groups = "smoke", description = "verify select daily data on Analytics page")
//    public void select_daily_data_on_Analytics_page() throws Exception {
//        AnalyticsPageObj.ClickSelectDaily();
//        Thread.sleep(2000);
//        AnalyticsPageObj.ClickOnSortByReceived();
//        AnalyticsPageObj.ClickOnSortByDocuments();
//    }
}
