package co.codechallange.testcases;
import co.codechallange.pages.DashboardPage;
import co.codechallange.pages.LandingPage;
import co.codechallange.util.AmbelUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {
    @Test
    public void checkLandingPageTitle(){
        LandingPage landingPage =page.getInstance(LandingPage.class);
        Assert.assertEquals(landingPage.getLandingPageTitle(), AmbelUtil.Landing_Title);
    }

    @Test
    public void testSuccessfulLogin() {
        LandingPage landingPage = page.getInstance(LandingPage.class);
        // Perform login
        DashboardPage dashboardPage = landingPage
                .fillUserName(getUsername())
                .fillPassword(getPassword())
                .clickLoginButton();

        // Verify successful login
        Assert.assertTrue(dashboardPage.hasMyAccountText(), "My Account text not found on the Dashboard!");
    }


}
