import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloSeleniumTest {

    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_EXE_RELATIVE_PATH = "src/test/resources/chromedriver.exe";
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String CHROME_DRIVER_EXE_ABSOLUTE_PATH = MessageFormat
        .format("{0}/{1}", USER_DIR, CHROME_DRIVER_EXE_RELATIVE_PATH);
    public static final String APP_URL = "http://newtours.demoaut.com/index.php";
    private PageDriver page;
    private WebDriver driver;
    //    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_EXE_RELATIVE_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page = new PageDriver(driver);

    }

    @Test
    public void testSelenium() throws IOException {
        page.openApp(APP_URL);
        page.enterText(By.name("login"), "test");
//        WebElement dateField = driver
//            .findElement(By.xpath("//form[@name='home']/table/tbody/tr[1]/td/font/b"));
//        String date = dateField.getText();
//        Assert.assertEquals(date, "Dec 10, 2019");

        page.snapScreen("login");
        return;
    }

//    @Test
//    public void testAjax() throws IOException {
//        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        click(By.xpath("//div[@id='start']/button"));
//        snapScreen("during");
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
//        snapScreen("after-loading");
//        WebElement messageElement = driver.findElement(By.xpath("//div[@id='finish']/h4"));
//        Assert.assertEquals(messageElement.getText(), "Hello World!");
//
//    }


    @Test
    public void testLoginPage() {
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.loginWith("test", "test");
    }

    @AfterMethod
    public void tearDown() {

        page.closeDriver();
    }


}
