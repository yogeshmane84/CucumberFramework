package LearnJunit;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitVtiger {
    public static WebDriver driver;

    @Test

    public void createAlead()
    {
        driver.findElement(By.linkText("New Lead")).click();
        driver.findElement(By.name("lastname")).sendKeys("Modi");
        driver.findElement(By.name("company")).sendKeys("India");
        driver.findElement(By.name("button")).click();
        Assert.assertEquals("Modi",driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[1]")).getText());
        Assert.assertEquals("India",driver.findElement(By.xpath("//td[text()='Company:']/following::td[1]")).getText());
    }
    @Test
    public void create_Account()
    {

        driver.findElement(By.linkText("New Account")).click();
        driver.findElement(By.name("accountname")).sendKeys("SwissBank");
        driver.findElement(By.name("button")).click();
        Assert.assertEquals("SwissBank",driver.findElement(By.xpath("//td[text()='Account Name:']/following::td[1]")).getText());


    }
@BeforeClass
    public static void lauanchApp()
    {
        System.out.println("lauanchApp");
        driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        Assert.assertEquals("vtiger CRM - Commercial Open Source CRM",driver.getTitle());
    }
@Before
    public void login()
    {
        System.out.println("Login");
        driver.findElement(By.name("user_name")).clear();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        Assert.assertEquals(true,driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @After
    public void logout()
    {
        System.out.println("logout");
        driver.findElement(By.linkText("Logout")).click();
    }

    @AfterClass
    public static void closeapp()
    {
        System.out.println("closeapp");
        driver.quit();

    }
}
