package co.codechallange.pages;

import co.codechallange.util.AmbelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasMyAccountText(){
        AmbelUtil.waitForSee();
        return getWebElements(By.xpath("//h3[contains(.,'Dashboard')]")).size()>0;
    }


}
