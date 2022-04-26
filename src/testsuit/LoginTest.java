package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //find admin field and send text
        sendTextToElement(By.id("txtUsername"),"Admin");
        //find password field and send text
        sendTextToElement(By.id("txtPassword"),"admin123");
        //find login button element and click on it
        clickOnElement(By.id("btnLogin"));

        String expectedDisplay = "Welcome";
        String actualDisplay = getTextFromElement(By.xpath("//a[@id='welcome']"));

        String actualSub = actualDisplay.substring(0,7);
        //validate expected and actual message
        Assert.assertEquals("Not Matching", expectedDisplay, actualSub);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
