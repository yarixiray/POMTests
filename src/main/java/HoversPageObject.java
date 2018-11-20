import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HoversPageObject extends BasePageObject {

    @FindBy(className = "figure")
    List<WebElement> avatarElements;

    @FindBy(className = "figcaption")
    List<WebElement> captionElements;

    HoversPageObject(WebDriver driver) {
        super(driver);
        relativeUrl = "hovers";
    }

    public void hoverMouseOverAvatar(int index){
        (new Actions(driver)).moveToElement(avatarElements.get(index)).perform();
    }

    public boolean isCaptionDisplayed(int index){
        return captionElements.get(index).isDisplayed();
    }


}
