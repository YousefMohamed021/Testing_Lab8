package Exercise_1;

import org.testng.annotations.*;
public class Test_Ordering_Lifecycle {

    @BeforeTest
    public void OpenWebsite() {
        System.out.println("Opening Website");
    }

    @Test(priority = 1)
    public void Signup() {
        System.out.println("Signing you in");
    }

    @Test(priority = 2)
    public void Login() {
        System.out.println("wait to login");
    }

    @Test(priority = 3)
    public void AddtoCart() {
        System.out.println("Adding the product to cart");
    }

    @AfterTest
    public void Logout() {
        System.out.println("Logging out");
    }
}