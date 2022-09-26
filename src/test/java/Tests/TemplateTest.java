package Tests;
import Pages.TemplatePage;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
public class TemplateTest extends BaseTest{
    TemplatePage TemplatePageObj;
    SoftAssert softAssert;
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
    @Story("story_id: 011  - Check Templates on user page ")
    @Description("verify user able to Check Templates")
    @Test(priority = 1, groups = "smoke", description = "verify validation_type_as_name_on_Templates")
    public void verifySearchTemplatesOnUserPage() throws Exception {
        softAssert = new SoftAssert();
        TemplatePageObj = new TemplatePage(driver);
        Thread.sleep(5000);
        TemplatePageObj.clickOnTemplatesPage();
        Thread.sleep(5000);
        TemplatePageObj.searchTemplatesName();
        Thread.sleep(5000);
        TemplatePageObj.clickOnTemplatesName();
        Thread.sleep(5000);
        //verify training of templates classification
        String expectedTrainingTemplates = driver.findElement(By.xpath("(//button[text()=' Complete '])[2]")).getText();
        String actualTrainingTemplates = driver.findElement(By.xpath("(//button[text()=' Complete '])[3]")).getText();
        softAssert.assertEquals(expectedTrainingTemplates,actualTrainingTemplates);
        Thread.sleep(3000);
        TemplatePageObj.clickOnclassificationName();
        Thread.sleep(5000);
        TemplatePageObj.clickOnToggleButton();
        Thread.sleep(3000);
        TemplatePageObj.clickOnToggleButton();
        Thread.sleep(3000);
        TemplatePageObj.clickOnZoomInButton();
        Thread.sleep(3000);
        TemplatePageObj.clickOnZoomOutButton();
        Thread.sleep(5000);
        TemplatePageObj.clickOnCancelButton();
        //verify list of templates
        softAssert.assertTrue(TemplatePageObj.validateListofTemplates.isDisplayed());

        softAssert.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - SortListOfTemplates ")
    @Description("verify user able to sort Templates")
    @Test(priority = 1, groups = "smoke", description = "verify validation_type_as_name_to_sort_Templates")
    public void verifySortingListOfTemplates() throws IOException, InterruptedException {
        softAssert = new SoftAssert();
        TemplatePageObj = new TemplatePage(driver);
        Thread.sleep(3000);
        TemplatePageObj.clickOnTemplatesPage();
        TemplatePageObj.getSortByTemplates.click();
        TemplatePageObj.sortingListOfTemplatesInOrder("ascending");
        Thread.sleep(3000);
        TemplatePageObj.getSortByTemplates.click();
        TemplatePageObj.sortingListOfTemplatesInOrder("descending");
        Thread.sleep(3000);
        TemplatePageObj.getSortbyPages.click();
        TemplatePageObj.sortingListOfTemplatesInOrder("ascending");
        Thread.sleep(3000);
        TemplatePageObj.getSortbyPages.click();
        TemplatePageObj.sortingListOfTemplatesInOrder("descending");

        //verify the category sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Templates ')]")).getText(), "Templates");
        //verify the Datasets sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Projects ')]")).getText(), "Projects");
        //verify the Updated sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Training ')]")).getText(), "Training");
        //verify the created sort is enabled
        softAssert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),' Pages ')]")).getText(), "Pages");

        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - check add new category on Upload Templates Button")
    @Description("verify user able to click on Upload Templates ")
    @Test(priority = 1, groups = "smoke", description = "verify validation_type_as_name_to_upload_new_telplates")
    public void verifyNewUploadTemplatesButton() throws IOException, InterruptedException {
        softAssert = new SoftAssert();
        TemplatePageObj = new TemplatePage(driver);
        Thread.sleep(3000);
        TemplatePageObj.clickOnTemplatesPage();
        Thread.sleep(3000);
        TemplatePageObj.clickOnUploadTemplatesButton();
        TemplatePageObj.createNewTemplateName();
        Thread.sleep(3000);
        Thread.sleep(3000);
        TemplatePageObj.clickOnCanceltemplatesButton();
        //verify upload_templates button
        softAssert.assertTrue(TemplatePageObj.uploadTemplatesButton.isDisplayed());
        //verify Create New Template
        softAssert.assertTrue(TemplatePageObj.validateCreateNewTemplate.isDisplayed());
//      //verify error message on create new templates
//      softAssert.assertTrue(TemplatePageObj.validateErrorMessage.isDisplayed());

        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Story("story_id: 011  - TotalCountOfTemplatesinUserTab ")
    @Description("verify user able to check the total count on user tab")
    @Test(priority = 1, groups = "smoke", description = "verify validation_type_as_check_total_count_on_usertab")
    public void verifyTheTotalCountOfTemplatesinUserTab() throws IOException, InterruptedException {

        softAssert = new SoftAssert();
        TemplatePageObj = new TemplatePage(driver);
        Thread.sleep(5000);
        TemplatePageObj.clickOnTemplatesPage();
        TemplatePageObj.clickOnDropDown();
        TemplatePageObj.selectDropDownValue();
        Thread.sleep(5000);
        TemplatePageObj.userClickOnNextPageTab();
        //verify count of user in category on dataset page
        int expectedCountOfUserInTable = driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size();
        String actualCountOfUser = TemplatePageObj.getTotalUserCountOfItemPerPage();
        softAssert.assertEquals(expectedCountOfUserInTable,Integer.parseInt(actualCountOfUser));

    }
}
