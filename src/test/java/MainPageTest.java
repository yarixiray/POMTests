//mamy zagwarantowane dziedziczenie po klasie BaseTest

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainPageTest extends BaseTest{

    MainPageObject page;

    @Before
    public void testSetUp(){
        //given
        page = new MainPageObject(driver);
        page.openPage();

    }

    @Test
    public void headerShouldContainInternet(){
        //given is testSetUp (stworzenie zmiennej typu MainPageObject
        //MainPageObject mainPage = new MainPageObject(driver);
        //mainPage.openPage();
        //when
        String actual = page.getHeaderTitle();
        //then (assert)
        assertEquals("Welcome to the-internet", actual);

    }

    @Test
    public void shouldContainAtLeast10Links(){
        List<String> actual = page.getLinkTitles();
        assertTrue("Should contain at least 10 links", actual.size() >= 10);
    }

}
