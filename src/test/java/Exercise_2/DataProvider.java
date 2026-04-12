package Exercise_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

public class DataProvider {

    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
         else {
            driver = new EdgeDriver();
        }
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void navigateToLogin() {
        driver.get("https://demo.guru99.com/test/login.html");
    }

    @org.testng.annotations.DataProvider
    public static Object[][] loginData() {
        return new Object[][] {
                { "test@mail.com", "123" },
                { "test@mail.com", "152" }
        };
    }


    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "passwd")
    WebElement Password;

    @FindBy(name = "SubmitLogin")
    WebElement submit_btn;

    @FindBy(xpath = "/html/body/div[2]/div/div/h3")
    WebElement message;

    @Test(dataProvider = "loginData")
    public void testLogin(String email, String pass) {
        Email.sendKeys(email);
        Password.sendKeys(pass);
        submit_btn.click();

        Assert.assertEquals(message.getText(),"Successfully Logged in...");
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}