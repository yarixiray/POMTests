import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInPageObject extends BasePageObject{

    @FindBy(id = "flash")
    WebElement flashMessageElement;

    LoggedInPageObject(WebDriver driver) {
        super(driver);
        relativeUrl = "secure";
    }

//przeniesiona z LoginPageObject
    public String getFlashMessageText(){
        return flashMessageElement.getText();
    }
}
