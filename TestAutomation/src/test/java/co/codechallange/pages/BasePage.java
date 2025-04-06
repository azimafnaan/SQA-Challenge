package co.codechallange.pages;

import co.codechallange.report.ReportTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By selector) {
        WebElement element = null;
        try{
            addInfo("Selenium Web driver going to find a WebElement with "+ selector +" Locator");
            element = driver.findElement(selector);
            addInfo("Selenium Webdriver found a WebElement with "+ selector +" Locator");
        } catch (Exception e) {
            addFailInfo("Selenium Webdriver is not found a WebElement with "+ selector +" Locator");
            System.out.println(selector.toString() + "Not Such Element Found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By selector) {
        List<WebElement> elements = null;
        try{
            addInfo("Selenium Web driver going to find a WebElements with "+ selector +" Locator");
            elements = driver.findElements(selector);
            addInfo("Selenium Webdriver found a WebElements with "+ selector +" Locator");
        } catch (Exception e) {
            addFailInfo("Selenium Webdriver is not found a WebElements with "+ selector +" Locator");
            System.out.println(selector.toString() + "Not Such Element Found");
        }
        return elements;
    }

    @Override
    public void waitElement(By selector) {
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    @Override
    public void clickElement(By selector) {
        wait.until(ExpectedConditions.elementToBeClickable(getWebElement(selector))).click();
    }

    @Override
    public String getElementText(By selector) {
        return getWebElement(selector).getText().trim();
//        return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText().trim();
    }

    public void addInfo(String message){
        if(ReportTestManager.getTest() != null){
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }
    public void addFailInfo(String message){
           if(ReportTestManager.getTest() != null){
               ReportTestManager.getTest().log(Status.FAIL, message);
           }
    }


}
