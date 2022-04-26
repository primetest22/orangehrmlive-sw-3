package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //find forgot password link and click
        clickOnElement(By.linkText("Forgot your password?"));
        String expectedDisplay = "Forgot Your Password?";
        String actualDisplay = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        //validate expected and actual display message
        Assert.assertEquals("Not Matching", expectedDisplay, actualDisplay);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
