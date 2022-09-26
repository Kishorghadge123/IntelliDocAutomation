package Tests;

import Pages.AuditPage;
import Utilities.SortingLists;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AuditTest extends BaseTest {
    AuditPage auditPage;
    SortingLists sortingLists;

    @BeforeMethod
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001 - verify Drop Downs Of Analytics And Filters In AuditPage")
    @Description("verify Drop Downs Of Analytics And Filters In AuditPage")
    @Test(priority = 1, groups = "smoke", description = "verify Drop Downs Of Analytics And Filters In AuditPage")
    public void verifyDropDownsOfAnalyticsAndFiltersInAuditPage() throws Exception {
        auditPage = new AuditPage(driver);
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.ClickOnDropDownsInAuditPage(1);
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'row user-info-container ng-tns-c')])[1]")).isDisplayed());
        auditPage.ClickOnDropDownsInAuditPage(2);
        Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@class,'row user-info-container ng-tns-c')])[2]")).isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - verifyTotalCountOfAuditedAndAuditPending")
    @Description("verifyTotalCountOfAuditedAndAuditPending")
    @Test(priority = 2, groups = "smoke", description = "verifyTotalCountOfAuditedAndAuditPending")
    public void verifyTotalCountOfAuditedAndAuditPendingDoc() throws Exception {
        auditPage = new AuditPage(driver);
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.selectProject();
        waitForloadSpinner();
        Thread.sleep(2000);
        Assert.assertEquals(Integer.parseInt(auditPage.verifyTheTotalCountOfAuditedAndAuditPendingDoc(2)) + Integer.parseInt(auditPage.verifyTheTotalCountOfAuditedAndAuditPendingDoc(3)),
                Integer.parseInt(auditPage.verifyTheTotalCountOfAuditedAndAuditPendingDoc(1)));
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - verifyTotalCountOfAuditedAndAuditPending")
    @Description("verifyTotalCountOfAuditedAndAuditPending")
    @Test(priority = 2, groups = "smoke", description = "verifyTotalCountOfAuditedAndAuditPending")
    public void verifyAllFiltersOfFilterDropDown() throws Exception {
        auditPage = new AuditPage(driver);
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.ClickOnDropDownsInAuditPage(2);
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'text-right ng-tns-c')]//span[contains(text(),'Apply')]")).getText(), "Apply");
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'text-right ng-tns-c')]//span[contains(text(),'Clear')]")).getText(), "Clear");
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 002 - verifyTotalCountOfAuditedAndAuditPending")
    @Description("verifyTotalCountOfAuditedAndAuditPending")
    @Test(priority = 2, groups = "smoke", description = "verifyTotalCountOfAuditedAndAuditPending")
    public void verifytableDataisSorting() throws Exception {
        auditPage = new AuditPage(driver);
        sortingLists = new SortingLists(driver);
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.selectProject();
        waitForloadSpinner();
        auditPage.ClickOnDropDownsInAuditPage(2);
        auditPage.clickStatusDropDownArrow();
        Thread.sleep(2000);
        auditPage.clickOnPendingStatus();
        auditPage.clickOnAuditedStatus();
        Thread.sleep(2000);
        auditPage.clickOnApplyFilter();
        auditPage.verifySortsortingofTableData(1);
        sortingLists.sortingListInOrder("ascending", 1);
        auditPage.verifySortsortingofTableData(1);
        sortingLists.sortingListInOrder("descending", 2);
        auditPage.verifySortsortingofTableData(2);
        sortingLists.sortingListInOrder("ascending", 2);
        auditPage.verifySortsortingofTableData(2);
        sortingLists.sortingListInOrder("descending", 2);
    }
}
