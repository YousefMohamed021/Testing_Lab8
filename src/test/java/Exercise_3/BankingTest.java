package Exercise_3;
import org.testng.annotations.*;

public class BankingTest {

    @BeforeGroups(groups = "Smoke")
    public void BeforeSmoke() {
        System.out.println("\t* Before Smoke *");
    }
    @Test(groups = {"Smoke"})
    public void testHomepageLoads() {
        System.out.println("Loading Home Page");
    }
    @Test(groups = {"Smoke"})
    public void testLoginPageVisible() {
        System.out.println("Checking if Login fields are Visible");
    }
    @Test(groups = {"Smoke"})
    public void testFooterLinks() {
        System.out.println("Checking if footer links are Visible");
    }
    @AfterGroups(groups = "Smoke")
    public void afterSmoke() {
        System.out.println("\t* After Smoke *");
    }

    @BeforeGroups(groups = "Regression")
    public void beforeRegression() {
        System.out.println("\t* Before Regression *");
    }
    @Test(groups = {"Regression"})
    public void testValidLogin() {
        System.out.println("Testing valid login");
    }
    @Test(groups={"Regression"})
    public void testInvalidLogin() {
        System.out.println("Testing invalid login");
    }
    @Test(groups = {"Regression"})
    public void testResetPassword() {
        System.out.println("Testing Reset Password");
    }
    @Test(groups = {"Regression"})
    public void testAccountBalance() {
        System.out.println("Verifying account balance display");
    }
    @AfterGroups(groups = "Regression")
    public void afterRegression() {
        System.out.println("\t* After Regression *");
    }
}