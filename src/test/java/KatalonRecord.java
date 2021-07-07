import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class KatalonRecord {

        private WebDriver wd;
        private String baseUrl;
        private boolean acceptNextAlert = true;
  //      private StringBuffer verificationErrors = new StringBuffer();

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            wd = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitledTestCase() throws Exception {
            wd.get("https://www.google.com/");
            wd.findElement(By.name("q")).click();
            wd.findElement(By.name("q")).clear();
            wd.findElement(By.name("q")).sendKeys("WebDriver");
            wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
        }

        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            wd.quit();

        }

        private boolean isElementPresent(By by) {
            try {
                wd.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                wd.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = wd.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }


