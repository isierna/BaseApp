package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import utils.Driver;

public abstract class BaseTest {
    public WebDriver driver = Driver.getInstance();

    @AfterTest
    public void quitBrowser() {
        driver.close();
    }
}
