import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(SampleTest.class);


    @Test
    public void Log(){
        logger.info ("This is info");
    }

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
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
