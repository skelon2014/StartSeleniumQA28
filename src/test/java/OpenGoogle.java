import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogle {

    WebDriver wd;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 1);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);//waiting elements

        wd.get("https://www.google.com/");
    }

    @Test
    public void searchWebDriver() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q"))).click();
        // wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
        // WebElement search = wd.findElement(By.name("q"));
        // wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);


        // search.sendKeys("WebDriver" + Keys.ENTER);
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        wd.quit();

    }


}
