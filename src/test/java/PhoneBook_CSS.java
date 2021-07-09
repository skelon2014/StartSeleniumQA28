import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhoneBook_CSS {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void login() throws InterruptedException {
        wd.findElement(By.cssSelector("[href = '/login']")).click();
        WebElement mail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        mail.click();
        mail.clear();
        mail.sendKeys("kselon55@bk.ru");
        Thread.sleep(2000);
        WebElement password = wd.findElement(By.cssSelector("[placeholder='Password']"));
        password.click();
        password.clear();
        password.sendKeys("Qwerty$4");
        Thread.sleep(2000);
        wd.findElement(By.cssSelector("div[class='login_login__3EHKB'] button:nth-child(4)")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void postCondition() {
        wd.quit();
    }
}

