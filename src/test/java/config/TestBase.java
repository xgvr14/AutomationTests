package config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void createDriver() {
     //  System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
         WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10L);
    }

  /*  @AfterEach
    public void destroyDriver() {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("Driver is null!");
        }

        driver = null;
        wait = null;
    } */
}
