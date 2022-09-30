package Tests;

import Pages.AuditPage;
import Utilities.ClickOnOutSide;
import Utilities.SortingLists;
import Utilities.VerifyTextOfTable;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AuditTest extends BaseTest {
    AuditPage auditPage;
    SortingLists sortingLists;
    ClickOnOutSide clickOnOutSide;
    VerifyTextOfTable verifyTextOfTable;

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
    @Story("story_id: 002 - verify total Count Of Audited and Audit Pending documents")
    @Description("verify_total_Count_of_Audited_and_Audit_Pending_documents")
    @Test(priority = 2, groups = "smoke", description = "verify_total_Count_of_Audited_and_Audit_Pending_documents")
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
    @Story("story_id: 003 - verify All Filters Of Filter DropDown")
    @Description("verify_all_filters_of_filter_DropDown")
    @Test(priority = 3, groups = "smoke", description = "verify_all_filters_of_filter_DropDown")
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
    @Story("story_id: 004 - verify the user able to sort the table from data")
    @Description("verify_the_user_able_to_sort_the_table_from_data")
    @Test(priority = 4, groups = "smoke", description = "verify_the_user_able_to_sort_the_table_from_data")
    public void verifytableDataisSorting() throws Exception {
        auditPage = new AuditPage(driver);
        clickOnOutSide = new ClickOnOutSide(driver);
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
        auditPage.clickOnPendingStatus();
        Thread.sleep(2000);
        clickOnOutSide.clickOutside();
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

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - verfiy Doc Status Is Diaplay In Table As Per Filters")
    @Description("verfiyDocStatusIsDiaplayInTableAsPerFilter")
    @Test(priority = 5, groups = "smoke", description = "verfiyDocStatusIsDiaplayInTableAsPerFilter")
    public void verfiyDocStatusIsDiaplayInTableAsPerFilter() throws Exception {
        auditPage = new AuditPage(driver);
        clickOnOutSide = new ClickOnOutSide(driver);
        verifyTextOfTable = new VerifyTextOfTable(driver);
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.selectProject();
        waitForloadSpinner();
        auditPage.ClickOnDropDownsInAuditPage(2);
        auditPage.clickStatusDropDownArrow();
        Thread.sleep(2000);
        auditPage.clickOnPendingStatus();
        auditPage.clickOnPendingStatus();
        clickOnOutSide.clickOutside();
        Thread.sleep(2000);
        auditPage.clickOnApplyFilter();
        verifyTextOfTable.verfiyDisplayStatusOfDoc("Pending");
        Thread.sleep(2000);
        auditPage.clickStatusDropDownArrow();
        Thread.sleep(2000);
        auditPage.clickOnPendingStatus();
        auditPage.clickOnAuditedStatus();
        clickOnOutSide.clickOutside();
        Thread.sleep(2000);
        auditPage.clickOnApplyFilter();
        Thread.sleep(2000);
        verifyTextOfTable.verfiyDisplayStatusOfDoc("Audited");
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 005 - verify Text Of Audit Tab")
    @Description("verify Text Of Audit Tab")
    @Test(priority = 5, groups = "smoke", description = "verify Text Of Audit Tab")
    public void verifyTextOfAuditTab() throws Exception {
        auditPage = new AuditPage(driver);
        clickOnOutSide = new ClickOnOutSide(driver);
        verifyTextOfTable = new VerifyTextOfTable(driver);
        SoftAssert softAssert=new SoftAssert();
        waitForloadSpinner();
        auditPage.clickOnauditTab();
        waitForloadSpinner();
        auditPage.selectProject();
        waitForloadSpinner();
        auditPage.ClickOnDropDownsInAuditPage(2);
        auditPage.clickStatusDropDownArrow();
        Thread.sleep(2000);
        auditPage.clickOnPendingStatus();
        auditPage.clickOnPendingStatus();
        clickOnOutSide.clickOutside();
        Thread.sleep(2000);
        auditPage.clickOnActionButtoninTable();
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),' Save Draft')]")).getText(),"Save Draft");
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).getText(),"Submit");
        softAssert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Release')]")).getText(),"Release");
        softAssert.assertAll();
    }
}
