package Tests;

import Pages.ReportPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReportTest extends BaseTest {
    ReportPage reportPage;

    @BeforeClass
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterClass
    public void tearDown() {
//        driver.close();
    }

    @Test(priority = 1)
    public void verifyTotalCountOfAllDocInAnalyticsSectionInReportTab() throws Exception {
        waitForloadSpinner();
        reportPage = new ReportPage(driver);
        reportPage.clickOnReportTab();
        Thread.sleep(10000);
        reportPage.clickOnProjectDropdown();
        Thread.sleep(1000);
        int totalProjects = reportPage.getAllProjectsFromDropDown();
        System.out.println("toal projects: " + totalProjects);
        for (int i = 1; i <= totalProjects; i++) {
            Thread.sleep(1000);
            reportPage.selectProjectFromDropDown(i);
            Thread.sleep(3000);
            reportPage.verifyTotalCountOfAllDocInAnalyticsSection();
            reportPage.clickOnProjectDropdown();
        }
    }
        @Test(priority = 2, enabled = true)
        public void verifyReportIsDownload () throws InterruptedException {
            Thread.sleep(10000);
            reportPage.verifyUserableDownloadreport();
            Thread.sleep(10000);
            Assert.assertTrue(reportPage.isFileDownloaded("final_report.xlsx"));//final_report
            Thread.sleep(10000);
            reportPage.deleteReportFile("final_report.xlsx");
        }

    }
