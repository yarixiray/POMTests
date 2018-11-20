import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HoversPageTest extends BaseTest {

    HoversPageObject page;

    @Before
    public void testSetUp(){
        //given
        page = new HoversPageObject(driver);
        page.openPage();
    }

    @Test
    public void afterHoverShouldDisplayCaption(){
        int index = 1;
        page.hoverMouseOverAvatar(index);
        assertTrue(page.isCaptionDisplayed(index));
    }
}
