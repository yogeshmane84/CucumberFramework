package LearnJunit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionExample {

    @Test
    public void verifyTitleTC01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        String exp = "google";
        String act = "google";

        Assert.assertEquals(exp,act);
        /*
        if (exp.equals(act))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }

         */
        driver.quit();

        }
}
