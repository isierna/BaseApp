package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementsWaiter;
import utils.PropertyReader;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "")
    public WebElement element;

    public void go(){
        driver.get(PropertyReader.getProperty("appURL"));
        at();
    }

    public void goAnyLogin(String id) {
        driver.get(PropertyReader.getProperty("appURL"));
        ElementsWaiter.waitUntil(driver,elementToBeClickable(By.xpath("//div[@id='any_login']")));
        driver.findElement(By.xpath("//div[@id='any_login']")).click();
        ElementsWaiter.waitUntil(driver,presenceOfElementLocated(By.xpath("//input[@id='any_login_id_input']")));
        WebElement lg = driver.findElement(By.xpath("//input[@id='any_login_id_input']"));
        lg.sendKeys(id);
        lg.sendKeys(Keys.ENTER);
        ElementsWaiter.waitUntil(driver,presenceOfElementLocated(By.xpath("//span[@id='current_user_information']/span")));

        System.out.println("You are logged in as:  ");
        System.out.println(driver.findElement(By.xpath("//span[@id='current_user_information']/span")).getAttribute("innerText"));
        at();
    }

    public void at(){
    }
}
