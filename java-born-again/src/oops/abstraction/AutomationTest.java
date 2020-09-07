package oops.abstraction;

public class AutomationTest {

    public static void main(String[] args) {
//        oops.abstraction.FirefoxDriver firefoxDriver = new oops.abstraction.FirefoxDriver();
//        firefoxDriver.get("http://www.google.com");
//
//        oops.abstraction.ChromeDriver chromeDriver = new oops.abstraction.ChromeDriver();
//        chromeDriver.get("http://www.google.com");

        WebDriver driver;
        String choice = "chrome";
        if(choice.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else {
            driver = new ChromeDriver();
        }
        driver.get("http://www.google.com");
        driver.close();

//        oops.abstraction.WebDriver driver1 = new oops.abstraction.WebDriver();
//        oops.abstraction.WebDriverInterface webDriverInterface = new oops.abstraction.WebDriverInterface() ;

    }
}
