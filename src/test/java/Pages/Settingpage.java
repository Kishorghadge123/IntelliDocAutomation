//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Settingpage {
//    WebDriver driver=null;
//    By settingbtn=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[9]");
//    By themelabel= By.xpath("//span[contains(text(),'Pick Your Theme')]");
//    By close=By.xpath("(//mat-icon[contains(text(),'close')])[1]");
//    By themebox=By.xpath("(//img[@class='img-responsive'])[1]");
//    By cancelbtun=By.xpath("//span[contains(text(),'Cancel')]");
//    By applybtn=By.xpath("//span[contains(text(),'Apply')]");
//
//    public Settingpage(WebDriver driver){
//        this.driver=driver;
//    }
//
//    public void  clickonsettingbtn(){
//        driver.findElement(settingbtn).click();
//    }
//    public  By getlabel(){
//        return  this.themelabel;
//    }
//    public  By getApplybtn(){
//        return  this.applybtn;
//    }
//
//    public By getCancelbtn(){
//        return  this.cancelbtun;
//    }
//
//    public By getclosebtn(){
//        return  this.close;
//
//    }
//
//    public By getThemebox(){
//        return  this.themebox;
//
//    }
//
//}
