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
      driver.quit();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 001  - verify that user is able to Check search Datasets on user page ")
    @Description("verify_that_user_is_able_to_Check_Datasets_on_user_page")
    @Test(priority = 1, groups = "smoke", description = "verify_that_user_is_able_to_Check_Datasets_on_user_page")
    public void verifySearchDatasetsOnUserPage() throws Exception {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        waitForloadSpinner();
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
    @Story("story_id: 002  - verify that user is able to add new category on dataset page")
    @Description("verify_that_user_is_able_to_add_new_category_on_dataset_page ")
    @Test(priority = 2, groups = "smoke", description = "verify_that_user_is_able_to_add_new_category_on_dataset_page")
    public void verifyAddNewCategory() throws Exception {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        waitForloadSpinner();
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
    @Story("story_id: 003  - verify that user is able to Sort List Of Datasets ")
    @Description("verify_that_user_is_able_to_Sort_List_Of_Datasets")
    @Test(priority = 3, groups = "smoke", description = "verify_that_user_is_able_to_Sort_List_Of_Datasets")
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
    @Story("story_id: 004  - verify that user is able to click on Action Button ")
    @Description("verify_that_user_is_able_to_click_on_Action_Button")
    @Test(priority = 4, groups = "smoke", description = "verify_that_user_is_able_to_click_on_Action_Button")
    public void verifyActionButton() throws Exception {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
        waitForloadSpinner();
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
    @Story("story_id: 005  - verify that user is able to Count total Users in UserTab ")
    @Description("verify_that_user_is_able_to_Count_total_Users_in_UserTab")
    @Test(priority = 5, groups = "smoke", description = "verify_that_user_is_able_to_Count_total_Users_in_UserTab")
    public void verifyTheTotalCountOfUserinUserTab() throws Exception {
        softAssert = new SoftAssert();
        DatasetPageObj = new DatasetPage(driver);
       waitForloadSpinner();
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