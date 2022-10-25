package Pages;

import Tests.BaseTest;
import Utilities.Custome_Wait;
import Utilities.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class UserPage extends BaseTest {
    WebDriver driver;
    Functions functions;
    SoftAssert sa =new SoftAssert();

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='mat-list-item-content']/img[contains(@src,'User')]")
    public WebElement UsersTab;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator font-17 mat-mini-fab mat-button-base']")
    public WebElement grid_icon;

    @FindBy(xpath = "//button[contains(@class,'mat-focus-indicator outline-none foregroundColor mat-mini-fab mat-button-base mat-accent ng-star-inserted')]")
    public WebElement actionButton;

    @FindBy(xpath = "(//input)[4]")
    public WebElement username;

    @FindBy(xpath = "//button[@class='mat-focus-indicator float-right ml-2 button-cls mat-stroked-button mat-button-base mat-accent']")
    public WebElement cancelButtonOfcreatuser;

    @FindBy(xpath = "//button[contains(@class,'mat-focus-indicator float-right ml-2 butt')]")
    public WebElement cancelButtonEditUser;

    @FindBy(xpath = "//span[contains(text(),' Create User ')]")
    public WebElement CreateUserButton;

    @FindBy(xpath = "//span[contains(text(),'Add Role')]/parent::button")
    public WebElement addRoleButton;

    By addRoleXpath = By.xpath("//span[contains(text(),'Add Role')]/parent::button");

    @FindBy(xpath = "//span[contains(text(),'Create')]")
    public WebElement CreateButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement activeuserToggalbutton;

    @FindBy(xpath = "//div[@class='mat-paginator-page-size-label']//following::div[6]")
    public WebElement Items_per_pageDropDown;

    @FindBy(xpath = "//button[@aria-label='Next page']")
    public WebElement nextPagetab;
    By toggleButtonXpath = By.xpath("(//div[contains(@class,'mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin')]//input)[1]");

    @FindBy(xpath = "//input[@class='p-2 theme_color']")
    public WebElement searchOnAddroles;

    @FindBy(xpath = "//button[text()='PratikshaQA']")
    public WebElement selectRoleInAddRole;

    @FindBy(xpath = "//button[@class='mat-focus-indicator pl-3 mat-icon-button mat-button-base']")
    public WebElement deleteRoleInEditUser;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement textBoxinEdituser;

    @FindBy(xpath = "//span[text()='Update']")
    public WebElement updateButton;

    public By userTilesLocator = By.xpath("//div[@class='proj_name']");
    public void userclickOnUserTab() throws Exception {
        functions = new Functions();
        waitForloadSpinner();
        Thread.sleep(10000);
        this.UsersTab.click();
    }

    public void searchProjectInUserPage(String text) throws Exception {
        functions = new Functions();
        waitForloadSpinner();
        this.searchButton.clear();
        this.searchButton.sendKeys(text);
    }

    public void clickonGridIcon() {
        this.grid_icon.click();
    }

    public void clickonActionBtton() {
        this.actionButton.click();
    }

    public void clickonCancelButtonOfEditUser() {
        this.cancelButtonEditUser.click();
    }

    public void clickOnCreateUserButton() {
        this.CreateUserButton.click();
    }

    public void clickOnCreateButton() {
        this.CreateButton.click();
    }

    public void clickOncancelButtonOfcreatuser() {
        this.cancelButtonOfcreatuser.click();
    }

    public void setActiveUserToggleButton(String state) throws InterruptedException {
        Thread.sleep(2000);
        Boolean currentstate = Boolean.valueOf(driver.findElement(toggleButtonXpath).getAttribute("aria-checked"));
        System.out.println("ToggalButton=" + currentstate);
        if (state.equalsIgnoreCase("on")) {
            if (!currentstate) {
                driver.findElement(toggleButtonXpath).click();
                Thread.sleep(3000);
                System.out.println("Active button is set to on state");

            }
        } else {
            if (currentstate) {
                driver.findElement(toggleButtonXpath).click();
                Thread.sleep(3000);
                System.out.println("Active button set to off state");
            }
        }
    }

    public boolean isAddRoleButtonEnable() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(addRoleXpath).isEnabled();
    }

    public void userClickOnNextpageTab() {
        boolean value1 = this.nextPagetab.isDisplayed();
        System.out.println(value1);
        for (int i = 0; i <= 2000; i++) {
            boolean value = this.nextPagetab.isEnabled();
            if (value) {
                this.nextPagetab.click();
            }
        }
    }

    public String getUserCountOfatomperPage() {
        return driver.findElement(By.xpath("//div[@class=\"mat-paginator-range-label\"]")).getText().split("of")[1].strip();
    }

    public void clickOnDropDown() {
        this.Items_per_pageDropDown.click();
    }

    public void selectDropDownValue() {
        driver.findElement(By.xpath("//span[text()=' 200 ']")).click();
    }

    public void clickOnTableArrowDropDown(String text) {
        driver.findElement(By.xpath("//div[text()='" + text + "']")).click();
    }

    public void clickOnAddUserButton() {
        this.addRoleButton.click();
    }

    public void searchUserOnAddUser(String text) {
        this.searchOnAddroles.clear();
        this.searchOnAddroles.sendKeys(text);
        this.selectRoleInAddRole.click();
    }
    public void clickOnDeleteButtonIndeleteRoleInEditUser() {
        this.deleteRoleInEditUser.click();
    }
    public void userSendTextinTextboxofEditUser() {
        this.textBoxinEdituser.clear();
        this.textBoxinEdituser.sendKeys("QA Automation Project");
        this.updateButton.click();
    }
    public List<WebElement> getListOfUserTiles(){
        List<WebElement> userTileList = null;
        try{
            userTileList = driver.findElements(userTilesLocator);
        }catch(StaleElementReferenceException sere){
            System.out.println("Stale Element Reference Exception");
            sere.printStackTrace();
            PageFactory.initElements(driver,this);
            userTileList = driver.findElements(userTilesLocator);
        }

        return userTileList;
    }
    public void verifyUserTileDetails(WebElement ele) throws Exception {
        String userNameOnTile;
        String userEmailOnTile;
        String createdDateOnTile;
        String updateDateOnTile;

        /*try{
           }catch(StaleElementReferenceException sere){
               System.out.println("Stale Element Reference Exception");
               sere.printStackTrace();
               PageFactory.initElements(driver,this);
               userNameOnTile = ele.findElement(By.cssSelector("div>h5.project-name")).getText();
           }
           finally {

           }*/
        //PageFactory.initElements(driver,this);
        updateDateOnTile = ele.findElement(By.xpath("//mat-label[text()='Updated Date ']/following-sibling::div")).getText();
        userNameOnTile = ele.findElement(By.cssSelector("div>h5.project-name")).getText();
        userEmailOnTile = ele.findElement(By.cssSelector("div>span.email.ng-star-inserted")).getText();
        createdDateOnTile = ele.findElement(By.xpath("//mat-label[text()='Created Date ']/following-sibling::div")).getText();
        waitForloadSpinner();
        Custome_Wait.waitUpToelementClickable(driver, ele.findElement(By.xpath("//button[@aria-label='edit user details']")));
        ele.findElement(By.xpath("//button[@aria-label='edit user details']")).click();
            /*Assert.assertEquals(userNameOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='name']")).getAttribute("value"));
           Assert.assertEquals(userEmailOnTile,driver.findElement(By.xpath("//input[@type='email' and @formcontrolname='email']")).getAttribute("value"));
           Assert.assertEquals(updateDateOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='updated']")).getAttribute("value"));
           Assert.assertEquals(createdDateOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='created']")).getAttribute("value"));
           driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Cancel']")).click();
           waitForloadSpinner();*/
    }
    public void verifyUserTileDetails(int index) throws Exception {
        String userNameOnTile;
        String userEmailOnTile;
        String createdDateOnTile;
        String updateDateOnTile;

        //PageFactory.initElements(driver,this);
        updateDateOnTile = driver.findElement(By.xpath("(//mat-label[text()='Updated Date ']/following-sibling::div)["+index+"]")).getText();
        userNameOnTile = driver.findElement(By.xpath("(//div/h5[contains(@class,'project-name')])["+index+"]")).getText();
        userEmailOnTile = driver.findElement(By.xpath("(//div/span[@class = 'email ng-star-inserted'])["+index+"]")).getText();
        createdDateOnTile = driver.findElement(By.xpath("(//mat-label[text()='Created Date ']/following-sibling::div)["+index+"]")).getText();
        waitForloadSpinner();
        System.out.println(userNameOnTile+" | "+userEmailOnTile+" | "+updateDateOnTile+" | "+createdDateOnTile);
        Custome_Wait.waitUpToelementClickable(driver, driver.findElement(By.xpath("(//button[@aria-label='edit user details'])["+index+"]")));
        driver.findElement(By.xpath("(//button[@aria-label='edit user details'])["+index+"]")).click();
        waitForloadSpinner();
        Thread.sleep(2000);
        /*Assert.assertEquals
                (userNameOnTile+":",driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='name']")).getAttribute("value"));*/
        System.out.println(userNameOnTile+"   |   "+driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='name']")).getAttribute("value"));
        sa.assertEquals(userNameOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='name']")).getAttribute("values"));
        sa.assertEquals(userEmailOnTile,driver.findElement(By.xpath("//input[@type='email' and @formcontrolname='email']")).getAttribute("value"));
        sa.assertEquals(updateDateOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='updated']")).getAttribute("value"));
        sa.assertEquals(createdDateOnTile,driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='created']")).getAttribute("value"));
        Custome_Wait.waitUpToelementClickable(driver,driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Cancel']/parent::button")));
        driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Cancel']/parent::button")).click();
        waitForloadSpinner();
    }

}