// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class OpenMyMailTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterMethod
    public void tearDown() {
     //   driver.quit();
    }

    @Test
    public void openMyMail() throws InterruptedException {
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        driver.findElement(By.name("login")).sendKeys("skelon");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".domain-select.svelte-1eyrl7y option[value='@bk.ru'] ")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("password")).click();
        Thread.sleep(1000);


    }
}
