import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Contact_About_Home_Test {
    WebDriver wd;

    @BeforeMethod
    public void recondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

    }

    @Test
    public void about_home() throws InterruptedException {
        List<WebElement> list = wd.findElements(By.tagName("a"));
        int last = list.size() - 1;
        WebElement element = list.get(last - 1);
        element.click();
        Thread.sleep(3000);
        WebElement element1 = list.get(last - list.size() + 1);
        element1.click();
        Thread.sleep(3000);

        WebElement element2 = list.get(last);
        element2.click();
        List<WebElement> list1 = wd.findElements(By.tagName("input"));
        int last1 = list1.size() - 1;
        WebElement login = list1.get(last1 - 1);
        login.sendKeys("skelon+55@bk.ru");
        Thread.sleep(500);
        WebElement password = list1.get(last1);
        password.sendKeys("Qwerty$4");
        Thread.sleep(3000);

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        int button = buttons.size()-1;
        WebElement log_in = buttons.get(button-1);
        log_in.click();


    }

    @AfterMethod
    public void postcondition() {
        //wd.quit();
    }
}
