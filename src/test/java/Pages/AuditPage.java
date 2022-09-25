package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AuditPage {
    WebDriver driver;

    public AuditPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='mat-list-item-content']/img[contains(@src,'Audit')]")
    WebElement auditTab;

    @FindBy(xpath = "//span[contains(@class,'mat-tooltip-trigger projectname')]")
    WebElement selectProjectDropDown;

    @FindBy(xpath = "//input[contains(@placeholder,'Search')]")
    WebElement searchProject;

    @FindBy(xpath = "(//div[contains(@class,'mat-tooltip-trigger ng-star-inserted')]//button[contains(@role,'menuitem')])[1]")
    WebElement clickOnproject;



    public void clickOnauditTab() {
        this.auditTab.click();
    }
    public void ClickOnDropDownsInAuditPage(int index) {
        driver.findElement(By.xpath("(//span[contains(@class,'mat-content ng-tns-c')]//mat-panel-title[contains(@class,'mat-expansion-panel-header-title justify-content-start ng-tns-c')])[" + index + "]")).click();
    }
    public String verifyTheTotalCountOfAuditedAndAuditPendingDoc(int index) {
        return driver.findElement(By.xpath("(//div[contains(@class,'mat-exp')]//div[contains(@class,'bgcolor')]//h4)["+index+"]")).getText();
    }
    public void selectProject() throws InterruptedException {
        this.selectProjectDropDown.click();
        Thread.sleep(2000);
        this.searchProject.clear();
        this.searchProject.sendKeys("M-Medical");
        this.clickOnproject.click();
    }
    public void verifySortsortingofTableData(int index){
       driver.findElement(By.xpath("(//table/thead/tr/th)["+index+"]")).click();
//        List<WebElement> allelements = driver.findElements(By.xpath("//table/thead/tr/th"));
//        for (WebElement element:allelements){
//            element.click();
//        }
    }
}

