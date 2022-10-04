package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.util.List;

public class ReportPage {
    WebDriver driver;

    public ReportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='mat-list-item-content']/img[contains(@src,'Report')]")
    WebElement reportTab;
    @FindBy(xpath = "//span[@class=\"mat-button-wrapper\"]/i")
    WebElement projectDrowpdown;
    @FindBy(xpath = "//button[contains(@class,'mat-focus-indicator font')]")
    WebElement reportDownloadbutton;

    public void clickOnReportTab() {
        this.reportTab.click();
    }

    public void clickOnProjectDropdown() {
        this.projectDrowpdown.click();
    }

    public void selectProjectFromDropDown(int index) {
        driver.findElement(By.xpath("(//button[@role=\"menuitem\"]/span)[" + index + "]")).click();
    }

    public int getAllProjectsFromDropDown() {
        return driver.findElements(By.xpath("//button[@role='menuitem']")).size();
    }

    public void verifyTotalCountOfAllDocInAnalyticsSection() {
        List<WebElement> allDocs = driver.findElements(By.xpath("//div[@class='bgcolor']//h4"));
        System.out.println(allDocs);
        int count = 0;
        for (int i = 1; i < allDocs.size(); i++) {
            if (i == allDocs.size() - 2 || i == allDocs.size() - 3) {
                continue;
            } else {
                count = count + Integer.parseInt(allDocs.get(i).getText());
            }
        }
        Assert.assertEquals(allDocs.get(0).getText(), String.valueOf(count));
        System.out.println("expected:" + allDocs.get(0).getText());
        System.out.println("actual:" + String.valueOf(count));
    }
    public void verifyUserableDownloadreport() {
        this.reportDownloadbutton.click();
    }

    public boolean isFileDownloaded(String fileName) {
        File dir = new File("C:\\Users\\NTS-AmitKorade\\Downloads");
        System.out.println(dir);
        File[] dir_contents = dir.listFiles();
        if (dir_contents != null) {
            for (File dir_content : dir_contents) {
                if (dir_content.getName().equals(fileName))
                    return true;
            }
        }
        return false;
    }

    public void deleteReportFile(String fileName) {
        File dir = new File("C:\\Users\\NTS-AmitKorade\\Downloads");
        File[] dir_contents = dir.listFiles();
        if (dir_contents != null)
            for (File dir_content : dir_contents) {
                if (dir_content.getName().equals(fileName))
                    dir_content.delete();
            }
    }

    public void ClickOnDropDownsInReportTab() {
        driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_down ')])[1]")).click();
    }
}

