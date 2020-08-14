package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsWaiter {
    public static <T> void waitUntil(WebDriver driver, ExpectedCondition<T> expectedCondition) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(expectedCondition);
    }
}
