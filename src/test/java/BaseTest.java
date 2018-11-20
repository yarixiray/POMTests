import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    static WebDriver driver;

    @BeforeClass
    //przygotowanie
    public static void setUp(){
        //inicjalizujemy webdrivermanager dla naszego zestawu testów. Sprawdzi czy jest, ściagnie.
        //klasa chromedrivermanager, ściaga z internetu drivera i ustawia zmienne środowiskowe

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        /*EdgeDriverManager.getInstance().setup();
        driver = new EdgeDriver();*/

        /*FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();*/

    }

    @AfterClass
    //posprzątanie
    public static void tearDown(){
        driver.quit();

    }
}
