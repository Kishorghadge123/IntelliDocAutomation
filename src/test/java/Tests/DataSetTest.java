package Tests;

import Pages.DatasetPage;
import Utilities.SortingLists;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

@Feature("Data Set Test")
//@Listeners(Utilities.TestListeners.class)
public class DataSetTest extends BaseTest {
    DatasetPage DatasetPageObj;
    SoftAssert softAssert;
     SortingLists sortingLists;
    @BeforeMethod
    public void setmethod() throws Exception {
        setup();
        loginApplication();
    }

    @AfterMethod
    public void tearDown() {
//        driver.close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - Check Datasets on user page ")
    @Description("verify user able to Check Datasets")
    @Test(priority = 1, groups = "smoke", description = "verify validation_type_as_name_to_create_new_dataset")
    public void verifySearchDatasetsOnUserPage() throws Exception {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        Thread.sleep(3000);
        DatasetPageObj.clickONDatasetPage();
        DatasetPageObj.sendCategoryName();
        DatasetPageObj.clickOnSearchBarIcon();
        Thread.sleep(3000);
        DatasetPageObj.clickOnCategoryName();
        Thread.sleep(3000);
        DatasetPageObj.clickOnTogglebutton();
        Thread.sleep(5000);
        DatasetPageObj.clickOnVisibilityButton();
        DatasetPageObj.searchPatientName();
        DatasetPageObj.clickOnserchBarIcon1();
        Thread.sleep(5000);
        DatasetPageObj.clickOnCancelDatasets();

        //verify the search box is display
        softAssert.assertTrue(DatasetPageObj.clickonCategory.isDisplayed());
        //verify the count of Datasets File
        int exepectedCountOfFileInTable = driver.findElements(By.xpath("//td[contains(text(),'QA Automation')]/following::table/tbody/tr")).size();
        String ActualCountOfFile = driver.findElement(By.xpath("(//table/tbody/tr/td[2])[1]")).getText();
        softAssert.assertEquals(exepectedCountOfFileInTable,Integer.parseInt(ActualCountOfFile));

        softAssert.assertAll();

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - check add new category on dataset page")
    @Description("verify user able to add new category ")
    @Test(priority = 2, groups = "smoke", description = "verify validation_type_as_name_to_Add_new_Category_dataset")
    public void verifyAddNewCategory() throws IOException, InterruptedException {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        Thread.sleep(3000);
        DatasetPageObj.clickONDatasetPage();
        DatasetPageObj.clickOnAddCategory();
        Thread.sleep(3000);
        DatasetPageObj.sendCreateNewCategoryName();
        DatasetPageObj.validateCreateCategoryName();
        DatasetPageObj.clickOnCancelCreateNewDatasetCategory();
        //verify the Text Of Add Category
        softAssert.assertEquals(DatasetPageObj.addCategory.getText(), "Add Category");
        //verify the create new Dataset Category
        softAssert.assertEquals(DatasetPageObj.validateCreateNewDatasetCategory.getText(),"Create New Dataset Category");
        //verify yhe Create Category
        softAssert.assertEquals(DatasetPageObj.validateCreateCategory.getText(),"Create Category");

        softAssert.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - SortListOfDatasets ")
    @Description("verify user able to sort Datasets")
    @Test(priority = 3, groups = "smoke", description = "verify validation_type_as_name_to_sort_dataset")

    public void verifySortingListOfDatasets() throws Exception {
        softAssert = new SoftAssert();
        sortingLists=new SortingLists(driver);
        DatasetPageObj = new DatasetPage(driver);
        waitForloadSpinner();
        DatasetPageObj.clickONDatasetPage();
        Thread.sleep(1000);
        DatasetPageObj.getSortByCategory.click();
        sortingLists.sortingListInOrder("ascending",1);
        Thread.sleep(1000);
        DatasetPageObj.getSortByCategory.click();
        Thread.sleep(1000);
        sortingLists.sortingListInOrder("descending",1);
        //verify the category sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Category ')]")).getText(), "Category");
        //verify the Datasets sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Datasets ')]")).getText(), "Datasets");
        //verify the Updated sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Updated ')]")).getText(), "Updated");
        //verify the created sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Created ')]")).getText(), "Created");
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - clickonActionButton ")
    @Description("verify user able to Click on Action button")
    @Test(priority = 4, groups = "smoke", description = "verify validation_type_as_name_to_Click on Action button")
    public void verifyActionButton() throws IOException, InterruptedException {

        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        Thread.sleep(3000);
        DatasetPageObj.clickONDatasetPage();
        DatasetPageObj.clickOnActionButton();
        Thread.sleep(3000);
        DatasetPageObj.createDatasetFileName();
        Thread.sleep(10000);
        DatasetPageObj.clickOnChooseCSVFile();
        Thread.sleep(3000);
        DatasetPageObj.clickOnCancelNewDataset();
        //verify that create new dataset
        softAssert.assertEquals(DatasetPageObj.createNewDataset.getText(), "Create New Dataset");
        //verify text on action button CSV format with maximum 100,000 entries.
        softAssert.assertEquals(DatasetPageObj.validateCSVformatText.getText(),"Please select CSV format with maximum 100,000 entries.");
        softAssert.assertAll();

    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - TotalCountOfUserinUserTab ")
    @Description("verify user able to check the total count on user tab")
    @Test(priority = 5, groups = "smoke", description = "verify validation_type_as_check_total_count)on_usertab")
    public void verifyTheTotalCountOfUserinUserTab() throws IOException, InterruptedException {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        Thread.sleep(5000);
        DatasetPageObj.clickONDatasetPage();
        DatasetPageObj.clickOnDropDown();
        DatasetPageObj.selectDropDownValue();
        Thread.sleep(5000);
        DatasetPageObj.userClickOnNextPageTab();
        //verify count of user in category on dataset page
        int exepectedCountOfUserInTable = driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size();
        String ActualCountOfUser = DatasetPageObj.getTotalUserCountOfItemPerPage();
        softAssert.assertEquals(exepectedCountOfUserInTable,Integer.parseInt(ActualCountOfUser));

    }
}