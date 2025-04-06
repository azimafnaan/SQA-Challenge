package co.codechallange.pages;

import co.codechallange.util.AmbelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver) {
        super(driver);
    }
    public String getLandingPageTitle(){
        return driver.getTitle();
    }

    public LandingPage fillUserName(String username){
        getWebElement(By.xpath("input[placeholder='Enter Username']")).sendKeys(username);
        return this;
    }

    public LandingPage fillPassword(String password){
        getWebElement(By.xpath("input[placeholder='password']")).sendKeys(password);
        return this;
    }

    public DashboardPage clickLoginButton(){
        clickElement(By.xpath("//button[contains(.,'LOGIN')]"));
        return getInstance(DashboardPage.class);
    }

}
