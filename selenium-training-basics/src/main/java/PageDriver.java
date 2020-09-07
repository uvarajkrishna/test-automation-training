import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageDriver {

    private final WebDriver driver;


    public PageDriver(WebDriver driver) {
        this.driver = driver;
    }
    public void snapScreen(String fileName) throws IOException {
        TakesScreenshot snapper = (TakesScreenshot) driver;
        File screenshotFile = snapper.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"/target"
            + "/"+fileName+".png"));
    }

    public void enterText(By locator, String text) {
        WebElement userName = driver.findElement(locator);
        userName.sendKeys(text);
    }

    public void click(By locator) {
        WebElement startButton = driver.findElement(locator);
        startButton.click();
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

    public void openApp(String appUrl) {
        driver.get(appUrl);
    }

    public void submit(By formLocator) {
        driver.findElement(formLocator).submit();
    }
}
