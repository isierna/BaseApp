package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends BaseTest{
    @Test
    public void firstTest() {
        HomePage homePage = new HomePage();
        homePage.goAnyLogin("1");

    }
}
