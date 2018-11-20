import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPageObject extends BasePageObject {

    //lokalizator elementu na stronie
    @FindBy(tagName = "h1")
    WebElement headerTitleElement;

    @FindBy(css = "li a")
    List<WebElement> linkElements;

    //konstruktor
    MainPageObject(WebDriver driver) {
        super(driver);
    }

    //metoda pobierająca tekst z nagłówka
    public String getHeaderTitle(){
        return headerTitleElement.getText();
    }

    public List<String> getLinkTitles(){
        List<String> result = new ArrayList<String>();
        for (WebElement linkElement:linkElements){
            result.add(linkElement.getText());
        }
        return result;
    }

}
