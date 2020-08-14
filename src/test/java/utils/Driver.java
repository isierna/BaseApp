package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import java.util.Objects;

public class Driver {
    private static Driver instance;
    public WebDriver driver;

    private Driver() {
        switch (Objects.requireNonNull(PropertyReader.getProperty("browser"))) {
            case "firefox":
                System.out.println("Starting FireFox browser");
                driver = new FirefoxDriver();
                driver.manage().window().setSize(new Dimension(1260,800));
                break;
            case "chrome":
                System.out.println("Starting Chrome browser");
                ChromeOptions handlSSLError = new ChromeOptions();
                handlSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                driver = new ChromeDriver(handlSSLError);
                break;
            default:
                System.out.println("Browser wasn't mentioned therefore starting FireFox");
                driver = new FirefoxDriver();
                break;
        }
    }

    synchronized public static WebDriver getInstance() {
        if(instance==null) {
            instance = new Driver();
        }
        return instance.driver;
    }

}
