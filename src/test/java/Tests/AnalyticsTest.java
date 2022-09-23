package Tests;


import Pages.AnalyticsPage;

import Pages.UserPage;
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
    UserPage userPage;
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
        Assert.assertEquals(actualtextofdailybutton, expectedtextDaily);
        System.out.println("Dialy Test Pass");
        String actualtextofWeeklybutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Weekly ");
        String expectedtextWeekly = driver.findElement(By.xpath("//span[contains(text(),' Weekly trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofWeeklybutton, expectedtextWeekly);
        System.out.println("Wekly Test Pass");
        String actualtextofMonthlybutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Monthly ");
        String expectedtextMonthly = driver.findElement(By.xpath("//span[contains(text(),' Monthly trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofMonthlybutton, expectedtextMonthly);
        System.out.println("Monthly Test Pass");
        String actualtextofOverallbutton = AnalyticsPageObj.verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(" Overall ");
        String expectedtextOverall = driver.findElement(By.xpath("//span[contains(text(),' Overall trends ')]")).getText().split(" trends")[0];
        Assert.assertEquals(actualtextofOverallbutton, expectedtextOverall);
        System.out.println("Overall Test Pass");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 003 - verifyThatuserableToseetrendsAccordingToSelections")
    @Description(" verifyThatuserableToseetrendsAccordingToSelections")
    @Test(priority = 5, groups = "smoke", description = "verifyThatuserableToseetrendsAccordingToSelections")
    public void verifyTotalcountOfreadyToProccessDocisequalToTotalcountofDocinTable() throws InterruptedException {
        AnalyticsPageObj = new AnalyticsPage(driver);
        int actualcountOfdoc = AnalyticsPageObj.verifyTotalcountOfreadyToProccessDocisequalToTotalcountofDocinTable();
        String expectedCountOfDocument = driver.findElement(By.xpath("//span[@class='bgcolor2 customBadge rounded_5px ml-3 ng-star-inserted']")).getText();
        int expectedCountOfDocuments = Integer.parseInt(expectedCountOfDocument);
        System.out.println(expectedCountOfDocuments);
        Assert.assertEquals(actualcountOfdoc, expectedCountOfDocuments);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
    @Description(" verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
    @Test(priority = 6, groups = "smoke", description = "verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
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
    @Severity(SeverityLevel.CRITICAL)
    @Story("story_id: 006 - verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
    @Description(" verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
    @Test(priority = 6, groups = "smoke", description = "verify That user Click On NtsplatformAdmin button and Admin Popup isDispaly")
    public void validateTheCountOfTotalUserInAnalyticsPage() throws Exception {
        AnalyticsPageObj = new AnalyticsPage(driver);
        Thread.sleep(20000);
        String actualcount = AnalyticsPageObj.getUserCounts();
        System.out.println(actualcount);
        userPage = new UserPage(driver);
        userPage.userclickOnUserTab();
        waitForloadSpinner();
        userPage.clickonGridIcon();
        String expectedCount=userPage.getUserCountOfatomperPage();
        Assert.assertEquals(actualcount,expectedCount);
    }
//    public void VerifyScrollUpDownInAnalyticsPage(){
//
//    }
@Severity(SeverityLevel.CRITICAL)
@Story("story_id: 007 - Verify That user click Drop Down Of Analytics Page")
@Description(" Verify That user click Drop Down Of Analytics Page")
@Test(priority = 7, groups = "smoke", description = "Verify That user click Drop Down Of Analytics Page")
    public void verifyDropDownOfAnalyticsPage() throws Exception {
        AnalyticsPageObj = new AnalyticsPage(driver);
        softAssert = new SoftAssert();
        Thread.sleep(20000);
        AnalyticsPageObj.ClickAnalyticsBtn();
        Thread.sleep(2000);
        AnalyticsPageObj.clickOnDropDowns(1);
        AnalyticsPageObj.clickOnDropDowns(1);
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'mat-expansion-panel-body ng-tns-c')]//div[contains(@class,'row mt-3 ng-tns-c')])[1]")).isDisplayed());
        AnalyticsPageObj.clickOnDropDowns(2);
        AnalyticsPageObj.clickOnDropDowns(2);
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'white_bg rounded_5px box_shadow py-3 h-100 d-flex-center flex-column')])[1]")).isDisplayed());

    }
}
