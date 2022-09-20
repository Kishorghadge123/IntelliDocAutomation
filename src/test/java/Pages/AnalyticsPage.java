package Pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

///pages classs
public class AnalyticsPage {
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;

    //xpath change by suwarna
    public static String AnalyticsPageURL = "https://alpha.neutrino-ai.com/#/home/analytics";
    public static By AnalyticsBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[9]");
    By OrganizationStatistics = By.xpath("//span[text()='Project Statistics']");
    public static By StatisticsHidden = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By StatisticsVisible = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By TotalUser = By.xpath("//div[text()=' Users ']");
    public static By Document = By.xpath("//div[text()=' Users ']//following::div[5]");
    public static By Processed = By.xpath("//div[text()=' Users ']//following::div[22]");

    public static By ReadyToProcess = By.xpath("//div[text()=' Users ']//following::div[32]");
    public static By Rejected = By.xpath("//div[text()=' Users ']//following::div[40]");
    public static By ValidationTime = By.xpath("//div[text()=' Validation Time ']");
    public static By SProcessedBar = By.xpath("//div[text()=' Structured ']//following::div[2]");
    By SReadyBar = By.xpath("//div[text()=' Structured ']//following::div[3]");
    By SRejectedBar = By.xpath("//div[text()=' Structured ']//following::div[4]");
    public static By SSProcessedBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[1]");
    By SSReadyBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[3]");
    By SSRejectedBar = By.xpath("//div[text()=' Semi-Structured ']//following::div[4]");
    public static By FFProcessedBar = By.xpath("//div[text()=' Free-Form ']//following::div[2]");
    By FFReadyBar = By.xpath("//div[text()=' Free-Form ']//following::div[3]");
    By FFRejectedBar = By.xpath("//div[text()=' Free-Form ']//following::div[4]");
    By MCProcessedBar = By.xpath("//div[text()=' Medical Chart ']//following::div[2]");
    By MCReadyBar = By.xpath("//div[text()=' Medical Chart ']//following::div[3]");
    By MCRejectedBar = By.xpath("//div[text()=' Medical Chart ']//following::div[4]");
    public static By ProjectDownArrow = By.xpath("//mat-icon[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::i");
    public static By ProjectSelected = By.xpath("//span[@class='mat-tooltip-trigger projectname']");
    By SearchProject = By.xpath("//input[@placeholder='Search']");
    public static By SelectProject = By.xpath("//input[@placeholder='Search']//following::span[1]");
    public By SelectNewProject = By.xpath("//span[contains(text(),'gd test 3 ')]");
    public static By SelectDropDown = By.xpath("//mat-icon[@class='mat-icon notranslate docStIconPos material-icons mat-icon-no-color']//following::div[7]");
    public String loginurl = "https://alpha.neutrino-ai.com/#/login";
    public String analyticurl = "https://alpha.neutrino-ai.com/#/home/analytics";
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    public By SelectOverall = By.xpath("//mat-option[@id='mat-option-3']");
    By SortByDocuments = By.xpath("//div[text()=' Received ']//preceding::div[1]");
    By SortByReceived = By.xpath("//div[contains(text(),'Received')]");
    By OperatorPerformanceSection = By.xpath("//div[text()=' Operator Performance']");
    public static By AnalyticsPageDisplay = By.xpath("//div[@class='row ng-star-inserted']");
    public static By ProjectStatistics = By.xpath("//span[text()='Project Statistics']");

    //    ############################################################################################################
    By projectListDropDownArrow = By.xpath("//div[@class='col-sm-8 project_list']//span[@class='mat-button-wrapper']");
    By projectname=By.xpath("(//div[@class='mat-tooltip-trigger ng-star-inserted'])[1]");
    public double Verify_progress_bar_Count_and_Total_Count_Of_Documents_for_all_Project(String DocumentType, String status) {
        String style = switch (status) {
            case "ready" ->
                    driver.findElement(By.xpath("//div[text()=' " + DocumentType + " ']/following::div[@role='progressbar' and contains(@class,'bg_" + status + "')][1]")).getAttribute("style");
            case "processed" ->
                    driver.findElement(By.xpath("//div[text()=' " + DocumentType + " ']/following::div[@role='progressbar' and contains(@class,'bg_" + status + "')][1]")).getAttribute("style");
            case "rejected" ->
                    driver.findElement(By.xpath("//div[text()=' " + DocumentType + " ']/following::div[@role='progressbar' and contains(@class,'bg_" + status + "')][1]")).getAttribute("style");
            default -> null;};
        assert style != null;
        style = style.split("width: ")[1].split("%")[0];
        System.out.println("count: " + style);
        return Double.parseDouble(style);}
    public double getCountFromProgresBar(String projectType, double satusPercent) {
        String totalCount_of_Statistics = driver.findElement(By.xpath("//div[text()=' " + projectType + " ']/span[contains(text(),'Total')][1]")).getText().split("Total: ")[1];
        double totalCount_of_Statistics1 = Double.parseDouble(totalCount_of_Statistics);
        return (totalCount_of_Statistics1 / 100.000) * satusPercent;}
    public void verfy_TotalCountofDocuments_in_Organization_Statistics() {
        String ProssesCount = (driver.findElement(By.xpath("(//div[@class='bold font-16'])[3]")).getText());
        String Rejected = (driver.findElement(By.xpath("(//div[@class='bold font-16'])[4]")).getText());
        String Ready_to_Process = (driver.findElement(By.xpath("(//div[@class='bold font-16'])[5]")).getText());
        String ActualtotalCount = (driver.findElement(By.xpath("(//div[@class='bold font-16'])[2]")).getText());
        String proccesCount = ProssesCount.replace(",", "");
        String rejected = Rejected.replace(",", "");
        String ready_to_Process = Ready_to_Process.replace(",", "");
        String actualtotalCount = ActualtotalCount.replace(",", "");
        int actualDocumentcount = Integer.parseInt(actualtotalCount);
        int expactedDocumentCount = Integer.parseInt(proccesCount) + Integer.parseInt(ready_to_Process) + Integer.parseInt(rejected);
        Assert.assertEquals(actualDocumentcount, expactedDocumentCount);}
    public void verfiy_TotalPercentageCount_Of_Organization_Statistics() {
        List<WebElement> list = driver.findElements(By.cssSelector("tspan[class='ng-star-inserted']:nth-child(1)"));
        double i;
        double j = 0;
        for (WebElement s : list) {
            i = Double.parseDouble(s.getText());
            j = j + i;
        }
        Assert.assertEquals((j - 100.0), 100.0);
    }
    public int verfiyThatTotalCountOfProjectDocisequleToTotalCountOfProccessReadyRejectDoc() throws InterruptedException {
     Thread.sleep(2000);
        driver.findElement(projectListDropDownArrow).click();
        Thread.sleep(2000);
        driver.findElement(SelectProject).click();
        String processedCount = driver.findElement(By.xpath("(//div[@class='row'] //div[@class='col-md-2 mb-3 px-2']//h5)[2]")).getText();
        String ReadytoProcessCount = driver.findElement(By.xpath("(//div[@class='row'] //div[@class='col-md-2 mb-3 px-2']//h5)[3]")).getText();
        String RejectedCount = driver.findElement(By.xpath("(//div[@class='row'] //div[@class='col-md-2 mb-3 px-2']//h5)[4]")).getText();
        return Integer.parseInt(processedCount) + Integer.parseInt(ReadytoProcessCount) + Integer.parseInt(RejectedCount);}
    public String verfyWhenuserClickondaiyButtonAccordingThatResultisDiaplayinDocProccessing(String text){
        driver.findElement(By.xpath("//span[contains(text(),'"+text+"')]")).click();
        return driver.findElement(By.xpath("//span[contains(text(),'"+text+"')]")).getText();}
    public int verifyTotalcountOfreadyToProccessDocisequalToTotalcountofDocinTable() throws InterruptedException {
        Thread.sleep(200);
        List<WebElement> allelement = driver.findElements(By.xpath("//div[@class='example-container readyTable h-100']//table/tbody/tr/td[1]"));
        return allelement.size();}
    @Step("Click Analytics Button")
    public void ClickAnalyticsBtn() throws Exception {
        driver.findElement(AnalyticsBtn).click();}
    //#######################################################################################################################

//    @Step("Click OnSort By Received")
//    public void ClickOnSortByReceived() throws Exception {
//        Custome_Wait.wait(driver, SortByReceived);
//        driver.findElement(SortByReceived).click();
//    }
//    @Step("Click OnSort By Documents")
//    public void ClickOnSortByDocuments() throws Exception {
//        By documentArrow = By.xpath("//span[@class='rejected']//following::div[8]");
//        Custome_Wait.wait(driver, documentArrow);
//        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//span[@class=' ']//following::div[8]"))).build().perform();
//        act.click(driver.findElement(By.xpath("//span[@class='rejected']//following::div[9]")));
//    }
//    @Step("Click Organization Arrow")
//    public void ClickOrganizationArrow() throws Exception {
//        Custome_Wait.wait(driver, OrganizationStatistics);
//        Thread.sleep(2000);
//        driver.findElement(OrganizationStatistics).click();
//    }
//    @Step("clickProject Statistic sarrow")
//    public void clickProjectStatisticsarrow() throws Exception {
//        Custome_Wait.wait(driver, ProjectStatistics);
//        driver.findElement(ProjectStatistics).click();
//    }
//
//    @Step("Hover Total User")
//    public void HoverTotalUser() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(TotalUser);
//        action.moveToElement(element).build().perform();
//        System.out.println("Mouse hover");
//    }
//
//    @Step("Hover Documents")
//    public void HoverDocuments() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(Document);
//        action.moveToElement(element).build().perform();
//        System.out.println("Mouse hover");
//    }
//
//    @Step("Hover Processed")
//    public void HoverProcessed() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(Processed);
//        action.moveToElement(element).build().perform();
//
//    }
//
//    @Step("Hover Ready To Process")
//    public void HoverReadyToProcess() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(ReadyToProcess);
//        action.moveToElement(element).build().perform();
//    }
//
//    @Step("Hover Rejected")
//    public void HoverRejected() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(Rejected);
//        action.moveToElement(element).build().perform();
//    }
//
//    @Step("Hover Validation Time")
//    public void HoverValidationTime() {
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(ValidationTime);
//        action.moveToElement(element).build().perform();
//    }
//
//    @Step("Hover Structured Bar")
//    public void HoverStructuredBar() throws InterruptedException {
//        Actions action = new Actions(driver);
//        WebElement element1 = driver.findElement(SProcessedBar);
//        action.moveToElement(element1).build().perform();
//        String text = driver.findElement(SProcessedBar).getText();
//        System.out.println(text);
//        Thread.sleep(2000);
//        WebElement element2 = driver.findElement(SReadyBar);
//        action.moveToElement(element2).build().perform();
//        Thread.sleep(2000);
//        WebElement element3 = driver.findElement(SRejectedBar);
//        action.moveToElement(element3).build().perform();
//        Thread.sleep(2000);
//    }
//
//    @Step("Hover Semi Structured")
//    public void HoverSemiStructured() {
//        Actions action = new Actions(driver);
//        WebElement element1 = driver.findElement(SSProcessedBar);
//        action.moveToElement(element1).build().perform();
//
//        WebElement element2 = driver.findElement(SSReadyBar);
//        action.moveToElement(element2).build().perform();
//
//        WebElement element3 = driver.findElement(SSRejectedBar);
//        action.moveToElement(element3).build().perform();
//    }
//
//    @Step("Hover Free Form")
//    public void HoverFreeForm() {
//        Actions action = new Actions(driver);
//        WebElement element1 = driver.findElement(FFProcessedBar);
//        action.moveToElement(element1).build().perform();
//
//        WebElement element2 = driver.findElement(FFReadyBar);
//        action.moveToElement(element2).build().perform();
//
//        WebElement element3 = driver.findElement(FFRejectedBar);
//        action.moveToElement(element3).build().perform();
//    }
//
//    @Step("Hover Medical Chart")
//    public void HoverMedicalChart() {
//        Actions action = new Actions(driver);
//        WebElement element1 = driver.findElement(MCProcessedBar);
//        action.moveToElement(element1).build().perform();
//
//        WebElement element2 = driver.findElement(MCReadyBar);
//        action.moveToElement(element2).build().perform();
//
//        WebElement element3 = driver.findElement(MCRejectedBar);
//        action.moveToElement(element3).build().perform();
//    }
//
//    @Step("ClickProject DownArrow")
//    public void ClickProjectDownArrow() {
//        driver.findElement(ProjectDownArrow).click();
//    }
//
//    @Step("Click Search Project")
//    public void ClickSearchProject() {
//        driver.findElement(SearchProject).click();
//    }
//
//    @Step("Click Select Project")
//    public void ClickSelectProject() {
//        Custome_Wait.wait(driver, SelectProject);
//        driver.findElement(SelectProject).click();
//    }
//
//    @Step("Click Select DropDown")
//    public void ClickSelectDropDown() throws Exception {
//        Thread.sleep(3000);
//        driver.findElement(SelectDropDown).click();
//    }
//    @Step("Click Select Monthly")
//    public void ClickSelectMonthly() {
//        driver.findElement(SelectMonthly).click();
//    }
//    @Step("Click Select Weekly")
//    public void ClickSelectWeekly() {
//        driver.findElement(SelectWeekly).click();
//    }
//    @Step("Click Select Daily")
//    public void ClickSelectDaily() {
//        driver.findElement(SelectDaily).click();
//    }
//    @Step("Click Select overall")
//    public void ClickSelectOverall() {
//        driver.findElement(SelectOverall).click();
//    }
//    @Step("Verify Operator Performance")
//    public void VerifyOperatorPerformance() {
//        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator Performance']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Operator ']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation count ']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time ']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Validation time avg ']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//canvas[@id='bar-chart-horizontal']")).isDisplayed());
//    }
}