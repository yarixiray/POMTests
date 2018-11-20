import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


//zdefiniowanie wszystkich elementów wspólnych
public class BasePageObject {

    String baseUrl = "http://the-internet.herokuapp.com/";
    String relativeUrl = "";
    WebDriver driver;

    BasePageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrl(){
        return baseUrl + relativeUrl;
    }

    public void openPage(){
        driver.get(getUrl());
    }
}
