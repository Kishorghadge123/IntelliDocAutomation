package Tests;

import Pages.ReportPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class ReportTest extends BaseTest {
    ReportPage reportPage;

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
    @Story("story_id: 001 - Total Count Of All Document In Analytics Section in ReportTab")
    @Description("verify_user_able_to_count_all_Documents_in_Analytics_section_in_report_tab")
    @Test(priority = 1, groups = "smoke", description = "verify_user_able_to_count_all_Documents_in_Analytics_section_in_report_tab")
    public void verifyTotalCountOfAllDocInAnalyticsSectionInReportTab() throws Exception {
        waitForloadSpinner();
        reportPage = new ReportPage(driver);
        reportPage.clickOnReportTab();
        Thread.sleep(10000);
        reportPage.clickOnProjectDropdown();
        Thread.sleep(1000);
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            reportPage.selectProjectFromDropDown(i);
            Thread.sleep(3000);
            reportPage.verifyTotalCountOfAllDocInAnalyticsSection();
            reportPage.clickOnProjectDropdown();
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - Verify Report is Downloaded")
    @Description("verify_user_able_to_Download_Report")
    @Test(priority = 2, groups = "smoke", description = "verify_user_able_to_Download_Report", enabled = true)
    public void verifyReportIsDownload() throws Exception {
        waitForloadSpinner();
        reportPage = new ReportPage(driver);
        reportPage.clickOnReportTab();
        Thread.sleep(10000);
        reportPage.verifyUserableDownloadreport();
        Thread.sleep(10000);
        Assert.assertTrue(reportPage.isFileDownloaded("final_report.xlsx"));//final_report
        Thread.sleep(10000);
        reportPage.deleteReportFile("final_report.xlsx");
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 003 - verifyTheDropDownOfReportTab")
    @Description("verifyTheDropDownOfReportTab")
    @Test(priority = 3, groups = "smoke", description = "verifyTheDropDownOfReportTab", enabled = true)
    public void verifyTheDropDownOfReportTab() throws Exception {
        waitForloadSpinner();
        reportPage = new ReportPage(driver);
        reportPage.clickOnReportTab();
        Thread.sleep(2000);
        reportPage.ClickOnDropDownsInReportTab();
        Thread.sleep(2000);
        reportPage.ClickOnDropDownsInReportTab();
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'row user-info-container ng-tns-c')])[1]")).isDisplayed());
        Thread.sleep(2000);
//        reportPage.ClickOnDropDownsInReportTab(6);
//        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'row user-info-container ng-tns-c')])[2]")).isDisplayed());

    }
}


