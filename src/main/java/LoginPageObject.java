import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends BasePageObject{

    @FindBy(id = "username")
    WebElement userNameElement;

    @FindBy(id = "password")
    WebElement passwordElement;

    @FindBy(tagName = "button")
    WebElement loginButtonElement;

    LoginPageObject(WebDriver driver) {
        super(driver);
        relativeUrl = "login";
    }

    public LoggedInPageObject login(String user, String password){
        userNameElement.sendKeys(user);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
        return new LoggedInPageObject(driver);
    }
}
