package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class VerifyTextOfTable {
    WebDriver driver;
    public VerifyTextOfTable(WebDriver driver) {
        this.driver = driver;
    }
    public void verfiyDisplayStatusOfDoc(String status) {
        List<WebElement> listOfWebElements = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        List<Object> list = new ArrayList<>();
        for (WebElement e : listOfWebElements) {
            System.out.println(list.add(e.getText()));
        }
        list.stream().forEach(s -> Assert.assertEquals(s, status));
    }
}
