import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class LoginPageTest extends BaseTest{

    LoginPageObject page;

    @Before
    public void testSetUp(){
        //given
        page = new LoginPageObject(driver);
        page.openPage();

    }

    String loginAndReadMessage(String user, String password){
        return page.login(user, password).getFlashMessageText();
    }

    @Test
    public void afterValidLoginShouldDisplaySuccess(){
       String actual = loginAndReadMessage("tomsmith", "SuperSecretPassword!");
        assertTrue(actual.contains("You logged into a secure area!"));
    }

    @Test
    public void afterInvalidPasswordShouldDisplayError(){
        String actual = loginAndReadMessage("tomsmith", "WrongPassword!");
        assertTrue(actual.contains("Your password is invalid!"));
    }

    @Test
    public void afterInvalidLoginShouldDisplayError(){
        String actual = loginAndReadMessage("tomsmith!", "SuperSecretPassword!");
        assertTrue(actual.contains("Your username is invalid!"));
    }

}
