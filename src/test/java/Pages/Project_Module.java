//package Pages;
//
//import java.util.List;
//import java.util.Random;
//import io.qameta.allure.Step;
//
//import Utilities.Custome_Wait;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import Utilities.Project_Module_Locators;
//import Utilities.Scroll_Page;
//import Utilities.Verification_Functions;
//
//public class Project_Module
//{
//
//    WebDriver driver;
//
//    //locators
//    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
//    public static By SelectStructure = By.xpath("//span[contains(text(),'Structured')]");
//    By clickfreeform=By.xpath("//span[contains(text(),' Free-Form ')]");
//    By clickmedical=By.xpath("//span[contains(text(),' Medical Chart ')]");
////By
//   public   By totalcount=By.xpath("(//h4[contains(text(),'1')])[1]");
//By projectMenu=By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
//  By searchProject=By.xpath("//input[@placeholder='Search']") ;
//  By editIconForProject=By.xpath("//span[text()=' Create Project ']//following::mat-icon[2]");
//    By create_Project_button=By.xpath("//span[text()=' Create Project ']");
//    By project_Name_Filed=By.xpath("//mat-label[text()='Project Name']//following::input[1]");
//By searchicon=By.xpath("(//mat-icon[@class='mat-icon notranslate mat-primary material-icons'])[3]");
//By assigneesearchicon=By.xpath("//input[@role='combobox']");
//    By medical=By.xpath("//span[contains(text(),' Medical Chart ')]");
//By clearseach=By.xpath("(//mat-icon[@class='mat-icon notranslate mat-primary material-icons'])[4]");
//    By freefrom=By.xpath("//span[contains(text(),' Free-Form ')]");
//    By auditassignee=By.xpath("(//mat-icon[contains(text(),'filter_alt')])[2]");
//    By assigneename=By.xpath("(//span[contains(text(),' supervisor@test.com ')])[2]");
//    By click_on_Lead_filed=By.xpath("//mat-label[text()='Lead']//following::div[2]");
//   By search_Lead=By.xpath("//input[@placeholder='Search']");
//   By statusfilter=By.xpath("(//mat-icon[contains(text(),'filter_alt')])[3]");
//By select_Lead=By.xpath("//mat-label[text()='Lead']//following::mat-option[1]");
//By readystatus=By.xpath("//span[contains(text(),' Audited')]");
//By start_Date=By.xpath("//mat-label[text()='Start Date']//following::input[1]");
//By end_Date=By.xpath("//mat-label[text()='End Date']//following::input[1]");
//   By document_Structure_dropdown=By.xpath("//mat-label[text()=' Document Structure ']//following::div[12]");
//  By select_Structured_Project_Type=By.xpath("//mat-label[text()=' Document Structure ']//following::mat-option[1]");
//By select_Semi_Structured_Project_Type=By.xpath("//mat-label[text()=' Document Structure ']//following::mat-option[2]");
//By select_Free_Form_Project_Type=By.xpath("//mat-label[text()=' Document Structure ']//following::mat-option[3]");
//  By select_Medical_Chart_Project_Type=By.xpath("//span[contains(text(),' Medical Chart ')]");
//By processing_Engine_Dropdown=By.xpath("//mat-label[text()=' Processing Engine ']//following::div[12]");
//By nh_High_ProcessingEngine_For_Structure_project=By.xpath("(//span[@class='mat-option-text'])[1]");
//By nh_Low_ProcessingEngine_For_Structure_project=By.xpath("//mat-label[text()=' Processing Engine ']//following::mat-option[2]");
//By brute_Force_ProcessingEngine_For_Structure_project=By.xpath("//mat-label[text()=' Processing Engine ']//following::mat-option[3]");
//By trade_ProcessingEngine_For_SemiStructure_project=By.xpath("//mat-label[text()=' Processing Engine ']//following::mat-option[1]");
//By returns_ProcessingEngine_For_SemiStructure_project=By.xpath("//mat-label[text()=' Processing Engine ']//following::mat-option[2]");
//By status_select=By.xpath("//mat-label[text()=' Processing Engine ']//following::label[1]");
//By document_auto_assignment_select=By.xpath("//mat-label[text()=' Processing Engine ']//following::label[2]");
//By straight_Through_Process_select=By.xpath("//mat-label[text()=' Processing Engine ']//following::label[3]");
//By document_Score=By.xpath("//mat-label[text()='Document Score (0-100)']//following::input[1]");
//By add_Template_button=By.xpath("//span[text()=' Add Template ']");
//By search_Template=By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[1]");
//By select_Template=By.xpath("//input[@placeholder='Search']//following::button[1]");
//By expand_Role_Details=By.xpath("//span[text()='Roles']/descendant-or-self::span");
//By add_Role_Button=By.xpath("//span[text()=' Add Role ']");
//By search_Role=By.xpath("//div[@id='mat-menu-panel-1']/div/div[1]/input");
// By select_Role=By.xpath("//div[@class='cdk-overlay-pane']//following::button[1]");
//By documentsearch=By.xpath("(//mat-icon[contains(text(),'filter_alt')])[1]");
//By docname=By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control theme_color ')]");
//By expand_Document_Investigation_Channels=By.xpath("//span[contains(text(),' Document Ingestion Channels ')]");
//By channel_Type=By.xpath("//span[contains(text(),' Amazon S3 ')]");
//By selectchannel=By.xpath("(//span[contains(text(),'GCP Bucket (Default)')])[1]");
//By testbtn=By.xpath("//span[contains(text(), 'Test Connection')]");
// By gcp_Bucket_select=By.xpath("//mat-label[text()='Channel Type']//following::img[4]");
// By amazon_s3_select=By.xpath("//mat-label[text()='Channel Type']//following::img[3]");
//By google_Drive_Select=By.xpath("//mat-label[text()='Channel Type']//following::img[2]");
//By expand_API_configuration_details=By.xpath("//span[text()='API Configuration']");
//By api_Access_related_message=By.xpath("//*[text()=' You do not have permissions to add an API.']");
//
//
//
//
//
//By projectname=By.xpath("(//span[contains(text(),' QA-DemoDocument ')])[2]");
//    By add_Field_For_Attribute=By.xpath("//span[text()=' Add Fields ']");
//  By search_Attribute_On_Web=By.xpath("//span[text()=' Add Fields ']//following::input[3]");
//By select_Attribute=By.xpath("//button[contains(text(),'PatientName')]");
//By add_Entity_Button=By.xpath("//span[contains(text(),' Add Entity ')]");
//By auditbtn=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[7]");
//By dropdown=By.xpath("//span[@class='mat-tooltip-trigger projectname']");
////    @FindBy (xpath="//input[@placeholder='Search']")
////    public WebElement search_Entity_On_Web;
//
//    By select_HCC_Condition_Entity=By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[2]");
//   By create_button=By.xpath("//span[text()=' Create']");
//By cancel_Button=By.xpath("//span[text()=' Create']//following::button[1]");
//    By next_Button=By.xpath("//span[text()=' Next']");
//By channel_Name=By.xpath("//mat-label[text()='Channel Name']//following::input[1]");
//By user_Email_for_google_drive=By.xpath("//mat-label[text()='User Email']//following::input[1]");
//
//
//
//By test_conn_success_or_error_msg=By.xpath("//span[text()='ok']//preceding::div[1]");
//
// By ok_button=By.xpath("//span[text()='ok']");
//
// By secret_Key_ID=By.xpath("//mat-label[text()='Secret Key ID']//following::input[1]");
//By access_Key_ID=By.xpath("//mat-label[text()='Access Key ID']//following::input[1]");
// By bucket_Region=By.xpath("//mat-label[text()='Bucket Region']//following::input[1]");
////By =B
//
//
////
////@FindBy (xpath="//span[text()=' Test Connection ']")
////public WebElement test_Connection_button;
//
//
//
//    //verify template details
//By name_of_template=By.xpath("//mat-header-cell[text()=' Action ']//following::mat-row[1]/mat-cell[1]/span[1]");
//By role_Name=By.xpath("//div[text()=' Users ']//following::div[3]");
//By addButton_User_In_Roles_Details=By.xpath("//span[contains(text(),' Add Role ')]");
//
//    //verify roles details
//By test_Connection_button=By.xpath("//span[text()=' Test Connection ']");
// By select_userName_For_Roles_Details=By.xpath("(//button[@role='menuitem'])[1]");
// By delete_userName_From_Roles_Details=By.xpath("//div[@class='mat-chip-ripple']//following::mat-icon[1]");
//By user_Name_On_Roles_Section=By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]");
//By remove_user_from_Roles_section=By.xpath("//mat-icon[contains(text(),'cancel')]");
//
//By error_msg_for_mandatory_attributes=By.xpath("//*[@class='mat-simple-snackbar ng-star-inserted']");
// By error_msg_for_Empty_lead_dropdown=By.xpath("//*[text()='Lead']//following::mat-error[1]");
//
//By error_msg_for_Empty_Project_Name_Filed=By.xpath("//*[text()='Project Name']//following::mat-error[1]");
//    //Error messages
//
//
//
//
//    //label locators
//    public By role=By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[1]");
//    By start_date_label=By.xpath("//mat-label[text()='Start Date']");
//
//
//    //locators for calendar application
//By calendar_app_for_start_date=By.xpath("//mat-label[text()='Start Date']//following::span[2]");
//By calendar_app_for_end_date=By.xpath("//mat-label[text()='End Date']//following::span[2]");
// By select_start_date=By.xpath("//div[text()=' 10 ']");
//By select_end_date=By.xpath("//div[text()=' 17 ']");
//
//By month_year_filed_for_start_date_or_end_date=By.xpath("//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']");
//
//By select_year_or_month_for_start_date=By.xpath("//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[2]");
//By select_year_for_end_date=By.xpath("//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[48]");
//By select_month_for_end_date=By.xpath("//button[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']//following::div[24]");
//By updateButton=By.xpath("//span[text()=' Update']");
//By TableStructure=By.xpath("//*[contains(text(),' list ')]");
//By enabaleOrDisableUserToggleOnProjectPage=By.xpath("//mat-slide-toggle[@class='mat-slide-toggle mat-primary ng-valid ng-dirty ng-touched']");
//
//    public Project_Module(WebDriver driver)   {
//        this.driver = driver;
//    }
//
//
//    public void clickOnProjectMenu() throws  Exception
//    {
//
//        driver.findElement(projectMenu).click();
//        Thread.sleep(3000);
//    }
//
//
//    public void searchProject(String projectName)
//    {
//
//driver.findElement(searchProject).sendKeys(projectName);
//
//    }
//    public  By getcount(){
//       return this.totalcount;
//    }
//    public void enterRole(){
//        driver.findElement(role).click();
//    }
//    public void clickOnEditProjectIcon() throws Exception
//    {
//        driver.findElement(editIconForProject).click();
//
//
//    }
//    @Step("click on search tab")
//    public void clickonserachicon(){
//        driver.findElement(searchicon).click();
//    }
//    @Step("clear search")
//    public  void clickonclearsearch(){
//        driver.findElement(clearseach).click();
//    }
//@Step("click on assigneeserachicon")
//public void clickassigneesearchicon(){
//        driver.findElement(assigneesearchicon).click();
//}
//    @Step("click on assignee")
//    public  void clickonauditor(){
//        driver.findElement(auditassignee).click();
//    }
//@Step("select assignee name")
//public void assigneename(){
//        driver.findElement(assigneename).click();
//}
//
//@Step("click on status filter")
//public void clickonstatusfilter(){
//        driver.findElement(statusfilter).click();
//}
//@Step("click on pending status")
//public void clickonreadystatus(){
//        driver.findElement(readystatus).click();
//}
//    public void clickOutside() {
//        Actions action = new Actions(driver);
//        action.moveByOffset(0, 0).click().build().perform();
//    }
//    @Step("click OnCreateProjectButton")
//    public  void clickOnCreateProjectButton() throws Exception
//    {
//
//        driver.findElement(create_Project_button).click();
//
//    }
//
//    @Step(" click on enterNewProjectName")
//    public  void enterNewProjectName() throws Exception {
//        Random randam_num = new Random();
//        int int_num = randam_num.nextInt(2000);
//        driver.findElement(project_Name_Filed).sendKeys("PRONAME" + int_num);
//
//    }
//
//    @Step(" click on enterExistingProjectName")
//    public void enterExistingProjectName(String projectName)
//    {
//
//        driver.findElement(project_Name_Filed).sendKeys("PRONAME");
//
//    }
//
//    @Step("selectLead")
//    public void selectLead(String emailID)  throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(click_on_Lead_filed).click();
//        Thread.sleep(1000);
//        driver.findElement(select_Lead).sendKeys(emailID);
//        Thread.sleep(1000);
//       driver.findElement(select_Lead).click();
//
//
//    }
//
//    @Step(" enterEmailID")
//    public void enterEmailID()  throws Exception
//    {
//        driver.findElement(search_Lead).sendKeys("qauser@gmail.com");
//
//    }
//
//    @Step("enterStartAndEndDate")
//    public void enterStartAndEndDate()  throws Exception
//    {
//        Custome_Wait.wait(driver,start_Date);
//        driver.findElement(start_Date).sendKeys("4/11/2022");
//        Custome_Wait.wait(driver,end_Date);
//        driver.findElement(start_Date).sendKeys("4/13/2022");
//
//    }
//
//    @Step("select ProjectType")
//    public  void selectProjectType(String projectType) throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(document_Structure_dropdown).click();
//        Thread.sleep(1000);
//
//
//        if(projectType.equalsIgnoreCase("Structure"))
//        {
//driver.findElement(select_Structured_Project_Type).click();
//
//
//        }
//        else if(projectType.equalsIgnoreCase("Semi-Structure"))
//        {
//            driver.findElement(select_Semi_Structured_Project_Type).click();
//
//        }
//        else if(projectType.equalsIgnoreCase("Free-Form"))
//        {
//            driver.findElement(select_Free_Form_Project_Type).click();
//
//        }
//        else if(projectType.equalsIgnoreCase("Medical_Chart"))
//        {
//            driver.findElement(select_Medical_Chart_Project_Type).click();
//
//        }
//
//
//    }
//    @Step("select ProcessingEngine")
//    public  void selectProcessingEngine() throws Exception
//    {
//        Thread.sleep(2000);
//        driver.findElement(processing_Engine_Dropdown).click();
//        Thread.sleep(1000);
//        driver.findElement(nh_High_ProcessingEngine_For_Structure_project).click();
//
//    }
//
//    @Step("select Status")
//    public  void selectStatus(String project_type) throws Exception
//    {
//
//        Thread.sleep(1000);
//        if(project_type.equalsIgnoreCase("Medical_Chart"))
//        {
//            driver.findElement(status_select).click();
//            Thread.sleep(1000);
//            driver.findElement(document_auto_assignment_select).click();
//
//        }
//        else
//        {
//            driver.findElement(status_select).click();
//            Thread.sleep(1000);
//            driver.findElement(document_auto_assignment_select).click();
//            Thread.sleep(1000);
//            driver.findElement(straight_Through_Process_select).click();
//            Custome_Wait.wait(driver,document_Score);
//            driver.findElement(document_Score).sendKeys("90");
//
//        }
//    }
//    @Step("enterTemplateDetails")
//    public  void enterTemplateDetails() throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(add_Template_button).click();
//        Thread.sleep(1000);
//        driver.findElement(search_Template).click();
//        Thread.sleep(1000);
//
//
//
//        Scroll_Page.scroll_down_page(driver);
//    }
//    @Step("enterRolesDetails")
//    public  void enterRolesDetails(String roleName) throws Exception
//    {
//        Scroll_Page.scroll_down_page(driver);
//        driver.findElement(expand_Role_Details).click();
//        Thread.sleep(1000);
//        driver.findElement(add_Role_Button).click();
//        Custome_Wait.wait(driver,search_Role);
//        driver.findElement(search_Role).sendKeys(roleName);
//
//        Custome_Wait.wait(driver,select_Role);
//        driver.findElement(select_Role).click();
//
//    }
//
//
//    @Step(" click on enterUserDetailsInRoleSection")
//    public  void enterUserDetailsInRoleSection() throws Exception
//    {
////        driver.findElement(addButton_User_In_Roles_Details).click();
////
////        Thread.sleep(1000);
////        driver.findElement(select_userName_For_Roles_Details).click();
////        Thread.sleep(2000);
//      driver.findElement(user_Name_On_Roles_Section).click();
//        Thread.sleep(1000);
//        Actions action = new Actions(driver);
//        action.moveByOffset(0, 0).click().build().perform();
//    }
//
//    public void enabaleOrDisableUserToggleOnProjectPage()
//    {
//
//        driver.findElement(enabaleOrDisableUserToggleOnProjectPage).click();
//    }
//
//
//    @Step("click On DocumentInvestigationDropdown")
//    public  void clickOnDocumentInvestigationDropdown() throws Exception
//    {
//
//        driver.findElement(expand_Document_Investigation_Channels).click();
//        Thread.sleep(1000);
////        Custome_Wait.wait(driver,channel_Type);
//        driver.findElement(selectchannel).click();
//        Thread.sleep(1000);
//        driver.findElement(channel_Type).click();
//        Thread.sleep(1000);
//
//    }
//@Step("click document filter")
//public void clickondocfilter(){
//        driver.findElement(documentsearch).click();
//}
//@Step("Enter document name")
//public void Enterdocumentname(String text){
//        driver.findElement(docname).sendKeys(text);
//
//}
//
//
//
//
//
//    @Step("click on connectionbtn")
//    public  void clickonconnectionbtn() throws Exception{
//        driver.findElement(testbtn).click();
//    }
//    public  void selectGCPBucket() throws Exception
//    {
//        Thread.sleep(2000);
//        driver.findElement(gcp_Bucket_select).click();
//
//
//    }
//
//
//    @Step("enterDetailsForGoogleDriveType")
//    public  void enterDetailsForGoogleDriveType(String user_Email) throws Exception
//    {
//        //Thread.sleep(3000);
//        //Custome_Wait.waitElement(driver,google_Drive_Select);
//        driver.findElement(google_Drive_Select).click();
//
//        //stome_Wait.waitElement(driver,channel_Name);
//        driver.findElement(channel_Name).sendKeys(user_Email);
//
//        Custome_Wait.wait(driver,user_Email_for_google_drive);
//        driver.findElement(user_Email_for_google_drive).sendKeys(user_Email);
////
//
////        Custome_Wait.waitElement(driver,upload_Service_Account_File);
////		upload_Service_Account_File.sendKeys("C:\\Users\\NTS-suwarna\\eclipse-workspace\\ChatBot\\Inputs_Files\\intellidocs-304911-16f0f75b8ed4.json");
////		Custome_Wait.waitElement(driver,test_Connection_button);
////		test_Connection_button.click();
//
//    }
//
//
//    @Step("checkConnectionMessagesAndClickOnOkButton")
//    public  void checkConnectionMessagesAndClickOnOkButton() throws Exception
//    {
//        Thread.sleep(3000);
//        if(driver.findElements(By.xpath("//span[text()='ok']//preceding::div[1]")).size()==1)
//        {
//            Custome_Wait.wait(driver,test_conn_success_or_error_msg);
////            System.out.println(test_conn_success_or_error_msg.getText());
//        }
//        else
//        {
//            Custome_Wait.wait(driver,test_conn_success_or_error_msg);
////            System.out.println(test_conn_success_or_error_msg.getText());
//        }
//        driver.findElement(ok_button).click();
//
//
//
//    }
//
//
//    @Step("enterDetailsForAmazonS3Type")
//    public  void enterDetailsForAmazonS3Type(String secret_key,String access_key,String bucket_region) throws Exception
//    {
//
//        Thread.sleep(1000);
//        driver.findElement(channel_Name).sendKeys("2299");
//  driver.findElement(secret_Key_ID).sendKeys(secret_key);
//
//        driver.findElement(access_Key_ID).sendKeys(access_key);
//
//        driver.findElement(bucket_Region).sendKeys(bucket_region);
//        driver.findElement(test_Connection_button).click();
//
//
//
//
//
//    }
//    @Step("enterAPIConfigurationDetails")
//    public  void enterAPIConfigurationDetails() throws Exception
//    {
//        driver.findElement(expand_API_configuration_details).click();
//
//
//        List<WebElement> able_to_access_api_or_not=driver.findElements(By.xpath("//*[text()=' You do not have permissions to add an API.']"));
//
//        if(able_to_access_api_or_not.size()==1)
//        {
//            System.err.println("Able to Access");
//        }
//        else
//        {
//            System.err.println("Access denied....");
//        }
//
//    }
//
//
//    @Step("enterAttributeDetailsForFreeFormProjectType")
//    public  void enterAttributeDetailsForFreeFormProjectType(String search_Attribute) throws Exception
//    {
//        Scroll_Page.scroll_down_page(driver);
//        Thread.sleep(2000);
//        driver.findElement(add_Field_For_Attribute).click();
//        Thread.sleep(2000);
////    driver.findElement(search_Attribute_On_Web).sendKeys(search_Attribute);
////        Thread.sleep(2000);
//        driver.findElement(select_Attribute).click();
//
//
//
//
//    }
//
//    @Step("addEntityDetailsForMedicalChartProject")
//    public  void addEntityDetailsForMedicalChartProject(String search_Entity) throws Exception
//    {
//        Scroll_Page.scroll_down_page(driver);
//        Thread.sleep(2000);
//        driver.findElement(add_Entity_Button).click();
//        Thread.sleep(2000);
////		search_Entity_On_Web.sendKeys(search_Entity);
////		Custome_Wait.waitElement(driver,select_HCC_Condition_Entity);
//        driver.findElement(select_HCC_Condition_Entity).click();
//        Thread.sleep(2000);
//
//
//    }
//    @Step("click on Audit Button")
//    public void clickonauditbtn(){
//driver.findElement(auditbtn).click();
//    }
//
//    @Step("click on dropdown")
//    public void clickondropdown(){
//        driver.findElement(dropdown).click();
//    }
//
//@Step("click on projectname")
//public void selectproject(){
//        driver.findElement(projectname).click();
//}
//
//
//    @Step("project_name_filed_validation")
//    public  void project_name_filed_validation(String projectName) throws Exception
//    {
//        String act_value=null;
//        Thread.sleep(2000);
//        driver.findElement(project_Name_Filed).sendKeys(projectName);
//        Custome_Wait.wait(driver,project_Name_Filed);
//        act_value=driver.findElement(project_Name_Filed).getText();
//        Verification_Functions.actual_text_data_Campare(act_value);
//
//    }
//    @Step("lead_filed_validation")
//    public  void lead_filed_validation(String emailID) throws Exception
//    {
//        String act_value=null;
//        Thread.sleep(2000);
//        driver.findElement(click_on_Lead_filed).click();
//        Custome_Wait.wait(driver,search_Lead);
//        driver.findElement(search_Lead).sendKeys(emailID);
//        Custome_Wait.wait(driver,search_Lead);
//        act_value=driver.findElement(search_Lead).getText();
//        Verification_Functions.actual_text_data_Campare(act_value);
//    }
//
//    @Step("start_date_filed_validation")
//    public  void start_date_filed_validation(String startDate) throws Exception
//    {
//        String act_value=null;
//        Thread.sleep(2000);
//        driver.findElement(project_Name_Filed).sendKeys("TEST");
//        Custome_Wait.wait(driver,start_Date);
//        driver.findElement(start_Date).sendKeys(startDate);
//
//        Custome_Wait.wait(driver,start_Date);
//        act_value=driver.findElement(start_Date).getText();
//        Verification_Functions.actual_text_data_Campare(startDate,act_value);
//
//    }
//    @Step("end_date_filed_validation")
//    public  void end_date_filed_validation(String startDate,String endDate) throws Exception
//    {
//        String act_value=null;
//
//        Thread.sleep(2000);
//       driver.findElement(start_Date).sendKeys(startDate);
//        Custome_Wait.wait(driver,end_Date);
//        driver.findElement(end_Date).sendKeys(endDate);
//        Custome_Wait.wait(driver,end_Date);
//        act_value=driver.findElement(end_Date).getText();
//        Verification_Functions.actual_text_data_Campare(act_value);
//    }
//
//    @Step(" document_Structure_filed_validation")
//    public  void document_Structure_filed_validation() throws Exception
//    {
//        String act_value=null;
//
//        Thread.sleep(2000);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Structured_Project_Type);
//        driver.findElement(select_Structured_Project_Type).click();
//
//        Custome_Wait.wait(driver,project_Name_Filed);
//        act_value=driver.findElement(project_Name_Filed).getText();
//
//        Verification_Functions.actual_text_data_Campare(act_value," Structured ");
//
//        Custome_Wait.wait(driver,document_Structure_dropdown);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Semi_Structured_Project_Type);
//        driver.findElement(select_Semi_Structured_Project_Type).click();
//        Custome_Wait.wait(driver,project_Name_Filed);
//        act_value=driver.findElement(project_Name_Filed).getText();
//        Verification_Functions.actual_text_data_Campare(act_value," Semi-Structured ");
//
//        Custome_Wait.wait(driver,document_Structure_dropdown);
//
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Free_Form_Project_Type);
//        driver.findElement(select_Free_Form_Project_Type).click();
//        Custome_Wait.wait(driver,project_Name_Filed);
//        act_value=driver.findElement(project_Name_Filed).getText();
//
//        Verification_Functions.actual_text_data_Campare(act_value," Free-Form ");
//
//        Custome_Wait.wait(driver,document_Structure_dropdown);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Medical_Chart_Project_Type);
//        driver.findElement(select_Medical_Chart_Project_Type).click();
//
//        act_value=driver.findElement(project_Name_Filed).getText();
//
//        Verification_Functions.actual_text_data_Campare(act_value," Medical Chart ");
//    }
//
//    @Step(" click on processing_Engine_filed_validation_for_Structured_Project")
//    public  void processing_Engine_filed_validation_for_Structured_Project(String projectName) throws Exception
//    {
//
//        String act_value=null;
//        Thread.sleep(2000);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Structured_Project_Type);
//        driver.findElement(select_Structured_Project_Type).click();
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
////        (//span[@class='mat-option-text'])[1]
//
//        driver.findElement(processing_Engine_Dropdown).click();
//        Custome_Wait.wait(driver,nh_High_ProcessingEngine_For_Structure_project);
//       driver.findElement(nh_High_ProcessingEngine_For_Structure_project).click();
//
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
//        driver.findElement(processing_Engine_Dropdown).click();
//        Custome_Wait.wait(driver,nh_Low_ProcessingEngine_For_Structure_project);
//        driver.findElement(nh_Low_ProcessingEngine_For_Structure_project).click();
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
//
//        driver.findElement(processing_Engine_Dropdown).click();
//        Custome_Wait.wait(driver,brute_Force_ProcessingEngine_For_Structure_project);
//        driver.findElement(brute_Force_ProcessingEngine_For_Structure_project).click();
//
//
//
//    }
//    @Step(" click on processing_Engine_filed_validation_for_Semi_Structured_Project")
//    public  void processing_Engine_filed_validation_for_Semi_Structured_Project(String projectName) throws Exception
//    {
//        String act_value=null;
//
//        Thread.sleep(2000);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Semi_Structured_Project_Type);
//        driver.findElement(select_Semi_Structured_Project_Type).click();
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
//
//       driver.findElement(processing_Engine_Dropdown).click();
//        Custome_Wait.wait(driver,trade_ProcessingEngine_For_SemiStructure_project);
//        driver.findElement(trade_ProcessingEngine_For_SemiStructure_project).click();
//
//
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
//        driver.findElement(processing_Engine_Dropdown).click();
//        Custome_Wait.wait(driver,returns_ProcessingEngine_For_SemiStructure_project);
//        driver.findElement(returns_ProcessingEngine_For_SemiStructure_project).click();
//
//
//    }
//
//
//    public  void processing_Engine_For_Free_From_Project(String projectName) throws Exception
//    {
//        Thread.sleep(2000);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Free_Form_Project_Type);
//        driver.findElement(select_Free_Form_Project_Type).click();
//
//
//        try {
//            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(processing_Engine_Dropdown));
//            System.out.println("Element is clickable");
//        }
//        catch(TimeoutException e) {
//            System.out.println("Element isn't clickable......Which means given field working as expected");
//        }
//    }
//    @Step(" click on processing_Engine_For_Medical_Project")
//    public  void processing_Engine_For_Medical_Project(String projectName) throws Exception
//    {
//        Thread.sleep(2000);
//
//        driver.findElement(document_Structure_dropdown).click();
//        Thread.sleep(2000);
//
//        driver.findElement(select_Medical_Chart_Project_Type).click();
//
//
//        try {
//            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(processing_Engine_Dropdown));
//            System.out.println("Element is clickable");
//        }
//        catch(TimeoutException e) {
//            System.out.println("Element isn't clickable......Which means given field working as expected");
//        }
//    }
//
//    @Step(" click on status_filed_validate")
//    public  void status_filed_validate() throws Exception
//    {
//
//
//        Thread.sleep(2000);
//        driver.findElement(status_select).click();
//        Verification_Functions.check_statuses_enable_or_disable(driver, driver.findElement(status_select));
//
//    }
//    @Step(" click on document_auto_Assignment_filed_validate")
//    public  void document_auto_Assignment_filed_validate() throws Exception
//    {
//
//        Custome_Wait.waitElement(driver,driver.findElement(document_auto_assignment_select));
//        Thread.sleep(1000);
//        driver.findElement(document_auto_assignment_select).click();
//        Verification_Functions.check_statuses_enable_or_disable(driver, driver.findElement(document_auto_assignment_select));
//
//    }
//
//    @Step(" click on straight_through_process_and_document_scrore_filed_validate")
//    public  void straight_through_process_and_document_scrore_filed_validate() throws Exception
//    {
//        Thread.sleep(2000);
//        driver.findElement(straight_Through_Process_select).click();
//        Verification_Functions.check_statuses_enable_or_disable(driver, driver.findElement(straight_Through_Process_select));
//        Custome_Wait.waitElement(driver,driver.findElement(document_Score));
//       driver.findElement(document_Score).sendKeys("99");
//        String act_value=driver.findElement(document_Score).getText();
//        Verification_Functions.actual_text_data_Campare(act_value);
//
//    }
//
//
//    public  void template_fields_validation() throws Exception
//    {
//        Thread.sleep(2000);
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Structured_Project_Type);
//        driver.findElement(select_Structured_Project_Type).click();
//        Scroll_Page.scroll_down_page(driver);
//        Custome_Wait.wait(driver,add_Template_button);
//        driver.findElement(add_Template_button).click();
//        Custome_Wait.wait(driver,search_Template);
//        driver.findElement(search_Template).sendKeys("YOURK_TEMPLATE");
//        String expect=driver.findElement(search_Template).getText();
//        Custome_Wait.wait(driver,select_Template);
//        driver.findElement(select_Template).click();
//        Scroll_Page.scroll_down_page(driver);
//        Custome_Wait.wait(driver,name_of_template);
//        String actual=driver.findElement(name_of_template).getText();
//        Verification_Functions.actual_text_data_Campare(actual, expect);
//
//    }
//    @Step(" click on roles_fields_validation")
//    public  void roles_fields_validation() throws Exception
//    {
//
//        Scroll_Page.scroll_down_page(driver);
//
//        Thread.sleep(2000);
//        driver.findElement(expand_Role_Details).click();
//        Custome_Wait.wait(driver,add_Role_Button);
//        driver.findElement(add_Role_Button).click();
//        Custome_Wait.wait(driver,search_Role);
//        driver.findElement(search_Role).sendKeys("BCAtesting");
//        String expected="BCAtesting";
//        driver.findElement(select_Role).click();
//        String actual=driver.findElement(role_Name).getText();
//        Verification_Functions.actual_text_data_Campare(actual, expected);
//    }
//    @Step(" click on create_Button")
//    public  void create_Button() throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(create_button).click();
//
//    }
//    @Step(" click on next_Button")
//    public  void next_Button() throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(next_Button).click();
//
//    }
//
//    public  void error_messages_validation() throws Exception
//    {
//        Scroll_Page.scroll_down_page_till_end(driver);
//
//        if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("Please add the attributes before creating the project."))
//        {
//            System.out.println("Please add the attributes before creating the project.");
//        }
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("Please add the template before creating the project."))
//        {
//            System.out.println("Please add the template before creating the project.");
//        }
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
//        {
//            System.out.println("Please check form data and role(s) cannot be empty");
//        }
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("Please check form data and role(s) cannot be empty"))
//        {
//            System.out.println("Role cannot have empty users");
//        }
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("Role(s) cannot be empty"))
//        {
//            System.out.println("Role(s) cannot be empty");
//        }
//
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().equalsIgnoreCase("check form data"))
//        {
//            System.out.println("check form data");
//        }
//        else if(driver.findElement(error_msg_for_mandatory_attributes).getText().contentEquals("role is Disabled"))
//        {
//            System.out.println(" role is Disabled");
//        }
//
//    }
//    @Step("click On CancelButton")
//    public  void clickOnCancelButton() throws Exception
//    {
//
//        Thread.sleep(1000);
//        driver.findElement(cancel_Button).click();
//
//        Verification_Functions.url_verification("https://alpha.neutrino-ai.com/#/home/project-management", driver.getCurrentUrl());
//    }
//
//    @Step("Click On DocumentStructureBtn")
//    public void ClickOnDocumentStructureBtn() throws Exception{
//
//        driver.findElement(ClickDocumentStructure).click();
//    }
//
//    @Step("SelectDocumentMedicalBtn")
//    public void  SelectDocumentMedicalBtn() throws Exception{
//        driver.findElement(medical).click();
//    }
//    public  void  SelectDocumentFreeFormBtn() throws Exception{
//        driver.findElement(freefrom).click();
//    }
//    @Step("Select DocumentfreeBtn")
//    public void SelectDocumentfreeBtn() throws Exception{
//        driver.findElement(clickfreeform).click();
//    }
//
//    @Step(" click on SelectDocumentStructureBtn")
//    public void SelectDocumentStructureBtn() throws Exception{
//
//        driver.findElement(SelectStructure).click();
//    }
//    public void setClickmedical() throws Exception{
//        driver.findElement(clickmedical).click();
//    }
//
//
//    @Step("error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine")
//    public  void error_messages_for_blank_fileds_project_name_and_Lead_and_processing_engine() throws Exception
//    {
//
//        Thread.sleep(2000);
//        driver.findElement(project_Name_Filed).click();
//        Custome_Wait.wait(driver,project_Name_Filed);
//        driver.findElement(project_Name_Filed).sendKeys(Keys.TAB);
//
//        Verification_Functions.actual_text_data_Campare(driver.findElement(error_msg_for_Empty_Project_Name_Filed).getText(), "Can not be blank");
//        Custome_Wait.wait(driver,click_on_Lead_filed);
//        driver.findElement(click_on_Lead_filed).click();
//
//        Actions act=new Actions(driver);
//        act.moveToElement(driver.findElement(start_date_label)).click().build().perform();
//        Verification_Functions.actual_text_data_Campare(driver.findElement(error_msg_for_Empty_lead_dropdown).getText(), "Can not be blank");
//        Custome_Wait.waitElement(driver,driver.findElement(document_Structure_dropdown));
//        driver.findElement(document_Structure_dropdown).click();
//        Custome_Wait.wait(driver,select_Structured_Project_Type);
//        driver.findElement(select_Structured_Project_Type).click();
//        Custome_Wait.wait(driver,processing_Engine_Dropdown);
//        driver.findElement(processing_Engine_Dropdown).click();
//
//        act.moveToElement(driver.findElement(start_date_label)).click().build().perform();
//
//        Verification_Functions.actual_text_data_Campare(driver.findElement(error_msg_for_Empty_lead_dropdown).getText(), "Can not be blank");
//
//
//
//    }
//    @Step("select_start_date_and_end_date_from_calendar_application")
//    public  void select_start_date_and_end_date_from_calendar_application() throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(calendar_app_for_start_date).click();
//        Custome_Wait.wait(driver,select_start_date);
//        driver.findElement(select_start_date).click();
//
//        Custome_Wait.wait(driver,calendar_app_for_end_date);
//        driver.findElement(calendar_app_for_end_date).click();
//        Custome_Wait.wait(driver,select_end_date);
//        driver.findElement(select_end_date).click();
//
//    }
//    @Step("change_year_and_month_from_calendar_application")
//    public  void change_year_and_month_from_calendar_application() throws Exception
//    {
//        Thread.sleep(1000);
//        driver.findElement(calendar_app_for_start_date).click();
//        Custome_Wait.wait(driver,month_year_filed_for_start_date_or_end_date);
//        driver.findElement(month_year_filed_for_start_date_or_end_date).click();
//        Custome_Wait.wait(driver,select_year_or_month_for_start_date);
//        driver.findElement(select_year_or_month_for_start_date).click();  //select year
//        Custome_Wait.wait(driver,select_year_or_month_for_start_date);
//        driver.findElement(select_year_or_month_for_start_date).click();        //select month
//        Custome_Wait.wait(driver,select_start_date);
//        driver.findElement(select_start_date).click();
//        Custome_Wait.wait(driver,calendar_app_for_end_date);
//        driver.findElement(calendar_app_for_end_date).click();
//        Custome_Wait.wait(driver,month_year_filed_for_start_date_or_end_date);
//       driver.findElement(month_year_filed_for_start_date_or_end_date).click();
//        Custome_Wait.wait(driver,select_year_for_end_date);
//        driver.findElement(select_year_for_end_date).click();
//        Custome_Wait.wait(driver,select_month_for_end_date);
//        driver.findElement(select_month_for_end_date).click();
//        Custome_Wait.wait(driver,select_end_date);
//        driver.findElement(select_end_date).click();
//    }
//    @Step("delete_user_from_role_section")
//    public  void delete_user_from_role_section() throws Exception
//    {
//        Thread.sleep(1000);
//       driver.findElement(remove_user_from_Roles_section).click();
//
//    }
//
//    public void clickOnUpdateButton() throws Exception
//    {
//        driver.findElement(updateButton).click();
//        Thread.sleep(7000);
//    }
//    public void TableStructure() throws Exception{
//
//        driver.findElement(TableStructure).click();
//    }
//
//
//
//}
