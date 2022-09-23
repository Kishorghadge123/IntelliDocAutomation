package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class CreateRolePage {

    public WebDriver driver;
//TC 6.1 element locators

    public CreateRolePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By rolebtn = By.xpath("//img[contains(@src,'Roles.svg')]");
    public By CreateRoleBtn = By.xpath("//span[contains(text(),' Create Role ')]");
    public By RoleName = By.xpath("//input[@formcontrolname='role']");
    public By AddPermission = By.xpath("//span[contains(text(),' Add permission ')]");
    public By RoleOption = By.xpath("//button[contains(text(),' Role')]");
    public By RoleSubOpn1 = By.xpath("//div[contains(text(),' View Role')]");
    public By RoleSubOpn2 = By.xpath("//div[contains(text(),' Update Role')]");
    public By RoleSubOpn3 = By.xpath("//div[contains(text(),' Create Role')]");
    public By ActiveRole = By.xpath("//mat-slide-toggle[@formcontrolname=\"status\"]");
    public By CreateBtn = By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]");

    public By CancelBtn = By.xpath("(//span[contains(text(),'Cancel')])[2]");


    @FindBy(xpath = "//mat-error[contains(text(),'Only alphabets,digits,parenthesis and hyphens are allowed.')]")
    public WebElement roleNameError;

    @FindBy(xpath = "//mat-error[contains(text(),'Please enter at least 3 characters.')]")
    public WebElement roleNameLmt;


    @Step("Click on role button")
    public void clickRoleBtn() {
        driver.findElement(rolebtn).click();
    }

    @Step("Click on Create button")
    public void clickCreateRoleBtn() {
        driver.findElement(CreateRoleBtn).click();
    }


    @Step("enter New Role Name")
    public void EnterNewRoleName(String roleName) throws Exception {
        Random r = new Random();
        char first_c = (char) (r.nextInt(26) + 'a');
        // char second_c = (char) (r.nextInt(26) + 'a');
        driver.findElement(RoleName).sendKeys(roleName + first_c);
        Thread.sleep(3000);
    }


    public void addPermission() {
        driver.findElement(AddPermission).click();
    }

    @Step("click On AddPermission Role Button")
    public void roleOption() {
        driver.findElement(RoleOption).click();
    }

    @Step("click On AddPermission Sub-role Button")
    public void roleSubOpnBtn1() {
        driver.findElement(RoleSubOpn1).click();
    }

    @Step("click On AddPermission Sub-role Button")
    public void roleSubOpnBtn2() {
        driver.findElement(RoleSubOpn2).click();
    }

    @Step("click On Addpermission sub-role Button")
    public void roleSubOpnBtn3() {
        driver.findElement(RoleSubOpn3).click();
    }

    @Step("click On Activate button")
    public void activateButton() {
        driver.findElement(ActiveRole).click();
    }

    @Step("click On create button")
    public void createButton() {
        driver.findElement(CreateBtn).click();
    }

    @Step("Click on cancel")
    public void cancelButton() {
        driver.findElement(CancelBtn).click();
    }

    public void clickOutside() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }
}
