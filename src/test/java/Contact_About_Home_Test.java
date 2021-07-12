import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Contact_About_Home_Test {
    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        // wd = newd.navigate().to("https://contacts-app.
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

    }

    /*  @Test
      public void about_home() throws InterruptedException {
          List<WebElement> list = wd.findElements(By.tagName("a"));
          int last = list.size() - 1;
          System.out.println(list.size());
          WebElement about = list.get(last - 1);
          about.click();
          Thread.sleep(3000);
          WebElement home = list.get(0);
          home.click();
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
          Thread.sleep(1000);

      }*/
    @Test
    public void locatorTest() {
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        elements.get(2).click();
        //By.tagName()
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("button"));


        //By.id
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[id = 'root']"));

        // By.className()
        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("active"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("[class='active']"));

        //By.name
        //wd.findElement(By.name("namename"));Head
      //  wd.findElement(By.cssSelector("[name='namename']"));
       //By.linkText - старая стратегия
        wd.findElement(By.linkText("LOGIN"));//указываем именно так как в F12
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("LOG"));//ищем по части текста
       wd.findElement(By.cssSelector("[href='/home']"));



    }

    @Test
    public void loginTest(){
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> input = wd.findElements(By.tagName("input"));
        WebElement email = input.get(0);
        WebElement password = input.get(1);

        email.click();
        email.clear();
        email.sendKeys("kselon55@bk.ru");

        password.click();
        password.clear();
        password.sendKeys("Qwerty$4");

        List<WebElement> button = wd.findElements(By.tagName("button"));
        button.get(0).click();

    }

    @AfterMethod
    public void postcondition() {
        //wd.quit();
    }
}
