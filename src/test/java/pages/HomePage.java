package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PropertyReader;

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

    public void at(){
    }
}
