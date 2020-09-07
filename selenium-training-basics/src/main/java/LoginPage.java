import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By userNameTxtBox = By.name("userName");
    By passwordTxtBox = By.name("password");
    By login = By.name("login");
    private final PageDriver page;

    public LoginPage(WebDriver driver){
        page = new PageDriver(driver);
    }


    public void enterUserName(String userName){
        page.enterText(userNameTxtBox, userName);
    }

    public void enterPassword(String password){
        page.enterText(passwordTxtBox, password);
    }

    public void submitLogin(){
        page.submit(login);
    }

    public void loginWith(String userName, String password){
        enterUserName(userName);
        enterPassword(password);
        submitLogin();
    }
}
