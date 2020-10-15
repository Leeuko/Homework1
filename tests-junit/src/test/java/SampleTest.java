import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleTest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(SampleTest.class);

    @Before
    public void setUp(){
        driver = WebDriverFactory.getDriver(WebDriverFactory.DriverType.CHROME);
        logger.info ("Driver is up");
    }

    @Test
    public void openPage(){
        driver.get("https://otus.ru/");
        logger.info ("Page is opened");

    }

    @After
    public  void setDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
