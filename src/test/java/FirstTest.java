import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

  WebDriver wd;

  @BeforeMethod
  public void precondition(){
      //login before
    wd = new ChromeDriver();
   // wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home).");
  }

  @Test(enabled = true)//так мы просим не запускать этт тест
  public void startGoogle(){
      //add new contact
   // wd.get("https://www.google.com/");
    wd.navigate().to("https://www.google.com/");
   // wd.navigate().to(); позволяет несколько больше нежели метод get
  }

  @Test
  public void loginTest(){
      //add new contact with all fields

  }
  @AfterMethod
  public void postCondition(){
      //logout
   // wd.quit();-закрывает все окна
    wd.close();//-закрывает только то окно, на котором я нахожусь
  }
}
