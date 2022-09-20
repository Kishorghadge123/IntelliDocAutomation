//package Tests;
//
//
//import BrowserDriverFactory.DriverFactory;
//
//import Pages.AnalyticsPage;
//import Pages.DatasetPage;
//import Utilities.AssertionsFunction;
//import Utilities.Functions;
//import io.qameta.allure.*;
//import Utilities.ReadProps;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//@Feature("Data Set Test")
//@Listeners(Utilities.TestListeners.class)
//public class DataSetTest extends BaseTest {
//    DatasetPage DatasetPageObj;
//    AssertionsFunction assertions;
//    JavascriptExecutor js;
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 001  - search_user")
//    @Description("verify user able to search_user")
//    @Test(priority = 1, groups = "smoke", description = "verify search_user")
//
//    public void create_category_with_blank_name() throws Exception {
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        assertions = new AssertionsFunction(driver);
//        DatasetPageObj = new DatasetPage(driver);
//        js= (JavascriptExecutor) driver;
//
//        DatasetPageObj.ClickDatasetBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//        Thread.sleep(2000);
//        //TC 6.1 - Create category with blank name.
//        DatasetPageObj.ClickAddCategoryBtn();
//        Thread.sleep(2000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getCreateNewDatasetCategory()));
//
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 002  - create_category_with_invalid_name")
//    @Description("verify user able to create_category_with_invalid_name")
//    @Test (priority=2,groups="smoke", description = "verify create_category_with_invalid_name")
//
//    public void create_category_with_invalid_name() throws Exception {
//        //TC 6.2 - Create Category with Invalid Name.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickCategoryName(ReadProps.readAttr("Invalid_Name"));
//        Thread.sleep(1000);
//        DatasetPageObj.ClickCategoryCancelBtn();
//        Thread.sleep(1000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 003  - create_category_with_valid_name")
//    @Description("verify user able to create_category_with_valid_name")
//    @Test (priority=3,groups="smoke", description = "verify create_category_with_valid_name")
//
//    public void create_category_with_valid_name() throws Exception {
//        //TC 6.3 - Create category with Valid name.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickAddCategoryBtn();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getCreateNewDatasetCategory()));
//        Thread.sleep(1000);
//        DatasetPageObj.ClickCategoryName(ReadProps.readAttr("DName"));//Change Dataset Name before executing
//        Thread.sleep(1000);
//        DatasetPageObj.ClickCreateCategory();
//        Thread.sleep(2000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getcreatedCategory()));
//        DatasetPageObj = new DatasetPage(driver);
//        DatasetPageObj.clickcnacelcategory();
//        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 004  - add_dataset_with_blank_and_no_chosen_file")
//    @Description("verify user able to add_dataset_with_blank_and_no_chosen_file")
//    @Test (priority=4,groups="smoke", description = "verify add_dataset_with_blank_and_no_chosen_file")
//
//    public void add_dataset_with_blank_and_no_chosen_file() throws Exception {
//        //TC 6.4 - Perform action to add dataset with blank name and no chosen file.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickActionBtn();
//        Thread.sleep(2000);
////        Assert.assertTrue(Functions.isElementPresent(DatasetPageObj.getCreateNewDataset()));
//        Thread.sleep(2000);
//        DatasetPageObj.ClickAddDatasetCancelBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 005  - add_dataset_with_blank_and_name_chosen_file")
//    @Description("verify user able to add_dataset_with_blank_and_name_chosen_file")
//    @Test (priority=5,groups="smoke", description = "verify add_dataset_with_blank_and_name_chosen_file")
//
//    public void add_dataset_with_blank_and_name_chosen_file() throws Exception {
//        //TC 6.5 - Perform action to add dataset with name and no chosen file.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickActionBtn();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getCreateNewDataset()));
//        Thread.sleep(1000);
//        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing.
//        Thread.sleep(2000);
//        DatasetPageObj.ClickAddDatasetCancelBtn();
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//    }
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 006  - add_dataset_with_csv_file_validation")
//    @Description("verify user able to add_dataset_with_csv_file_validation")
//    @Test (priority=6,groups="smoke", description = "verify add_dataset_with_csv_file_validation")
//
//    public void add_dataset_with_csv_file_validation() throws Exception {
//        //TC 6.6 - Perform action to add dataset with name, chosen file (.csv) but no validation type.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickActionBtn();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getCreateNewDataset()));
//        Thread.sleep(1000);
//        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing.
//        Thread.sleep(1000);
//        WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//        upload_file.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\sampledata.csv");
//        Thread.sleep(1000);
//        DatasetPageObj.ClickAddDatasetCancelBtn();
//        Thread.sleep(1000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 007  - add_dataset_created_category_name_chosen_file_valid_type")
//    @Description("verify user able to add_dataset_created_category_name_chosen_file_valid_type")
//    @Test (priority=7,groups="smoke", description = "verify add_dataset_created_category_name_chosen_file_valid_type")
//
//    public void add_dataset_created_category_name_chosen_file_valid_type() throws Exception {
//        //TC 6.7 - Perform action to add dataset file in the created category with name, chosen file and validation type.
//        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickActionBtn();
//        Thread.sleep(1000);
//        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getCreateNewDataset()));
//        Thread.sleep(1000);
//        DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName"));//Change before executing
//        Thread.sleep(1000);
//        WebElement upload_file1 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
//        upload_file1.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\sampledata.csv");
//        Thread.sleep(2000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 008  - validation_type_as_name_to_create_new_dataset")
//    @Description("verify user able to validation_type_as_name_to_create_new_dataset")
//    @Test (priority=8,groups="smoke", description = "verify validation_type_as_name_to_create_new_dataset")
//
//    public void validation_type_as_name_to_create_new_dataset() throws Exception {
//        //TC 6.8 - Validation type as "name" for dataset to create a new dataset.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickValidationDropDown();
//        Thread.sleep(2000);
//        DatasetPageObj.ClickValidationName();
//        Thread.sleep(2000);
//    }
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 009  - validation_type_as_phone_role_to_create_new_dataset")
//    @Description("")
//    @Test (priority=9,groups="smoke", description = "validation_type_as_phone_role_to_create_new_dataset")
//
//    public void validation_type_as_phone_role_to_create_new_dataset() throws Exception {
//        //TC 6.9 - Validation type as "phone" for roles to create a new dataset.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickValidationDropDown2();
//        Thread.sleep(2000);
//        DatasetPageObj.ClickValidationName();
//        Thread.sleep(2000);
//        DatasetPageObj.ClickValidationDropDown3();
//        Thread.sleep(2000);
//        DatasetPageObj.ClickValidationRoles();
//        Thread.sleep(2000);
//
//        js.executeScript("window.scrollBy(0,20000)", "");
//        Thread.sleep(4000);
//        DatasetPageObj.ClickValidationDropDown4();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickValidationEmail();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickValidationDropDown5();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickValidationText();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickValidationDropDown6();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickValidationText();
//        Thread.sleep(1000);
//        DatasetPageObj.ClickCreateDataset();
//        Thread.sleep(4000);
//        assertions.verifyTargetPageURL(DatasetPageObj.dataSetTabUrl);
//
//    }
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 010  - search_created_document_and_expand")
//    @Description("verify user able to search_created_document_and_expandt")
//    @Test (priority=10,groups="smoke", description = "verify validation_type_as_name_to_create_new_dataset")
//
//    public void search_created_document_and_expand() throws Exception {
//        //TC 6.10 - Search created category and click to expand it.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        DatasetPageObj.ClickSearchBox(ReadProps.readAttr("DName"));//Change before executing
//        Thread.sleep(2000);
//        DatasetPageObj.ClickExpand1();
//        assertions.isPresent(DatasetPageObj.ExpandDataset1);
//        Thread.sleep(2000);
//    }
//
//
//
//
//    @Severity(SeverityLevel.NORMAL)
//    @Story("story_id: 011  - select_open_file_and_cancel")
//    @Description("verify user able to select_open_file_and_cancel")
//    @Test (priority=11,groups="smoke", description = "verify validation_type_as_name_to_create_new_dataset")
//
//    public void select_open_file_and_cancel() throws Exception {
//        //TC 6.11 - Select file to open it and cancel.
////        WebDriver driver = DriverFactory.getInstance().getDriver();
//
//        Thread.sleep(2000);
//        DatasetPageObj.ClickDatasetFileName();
//        assertions.isPresent(DatasetPageObj.DatasetFile);
//        Thread.sleep(2000);
//
//    }
//
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 01  - verify_searchbox_is_present")
////    @Description("verify user able to verify_searchbox_is_present")
////    @Test(priority = 1, groups = "sanity", description = "verify_searchbox_is_present")
////
////    public void verify_searchbox_is_present() throws Exception {
////        WebDriver driver = DriverFactory.getInstance().getDriver();
////
////        assertions = new AssertionsFunction(driver);
////        DatasetPageObj = new DatasetPage(driver);
////        Thread.sleep(3000);
////        DatasetPageObj.ClickDatasetBtn();
////        Thread.sleep(3000);
////        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getSearchBox()));
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 02  - verify_categorysort_is_present")
////    @Description("verify user able to verify_categorysort_is_present")
////    @Test(priority = 2, groups = "sanity", description = "verify_categorysort_is_present")
////
////    public void verify_categorysort_is_present() throws Exception {
////        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getcategory()));
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 03  - verify_updatedsort_is_present")
////    @Description("verify user able to verify_updatedsort_is_present")
////    @Test(priority = 3, groups = "sanity", description = "verify_updatedsort_is_present")
////
////    public void verify_updatedsort_is_present() throws Exception {
////        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getUpdatesort()));
////    }
////
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 04  - verify_datasetsort_is_present")
////    @Description("verify user able to verify_datasetsort_is_present")
////    @Test(priority = 4, groups = "sanity", description = "verify_datasetsort_is_present")
////
////    public void verify_datasetsort_is_present() throws Exception {
////        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getDatasets()));
////    }
////    @Severity(SeverityLevel.NORMAL)
////    @Story("story_id: 05  - verify_trainingsort_is_present")
////    @Description("verify user able to verify_trainingsort_is_present")
////    @Test(priority = 5, groups = "sanity", description = "verify_trainingsort_is_present")
////
////    public void verify_trainingsort_is_present() throws Exception {
////        Assert.assertTrue(assertions.isPresent(DatasetPageObj.getcreatesort()));
////    }
//
//
//}
