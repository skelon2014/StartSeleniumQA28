import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class W3schools {
    WebDriver wd;


    @BeforeMethod
    public void enter(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Test
    public void w3schoolTest(){
        List<WebElement> raws = wd.findElements(By.cssSelector("tr"));
        List<WebElement> columns = wd.findElements(By.cssSelector("tr:last-child td"));
        List<WebElement> lastColumn = wd.findElements(By.cssSelector("td:last-child"));
        WebElement findName = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println();
        System.out.println("Number of raws - " + raws.size());
        System.out.println("Number of columns - " + columns.size());
        System.out.println();
        System.out.println("Last column");
        System.out.println("-----------");
        for(WebElement element:lastColumn){
            System.out.println(element.getText());
        }
        System.out.println();
        System.out.println("Finded name is " + findName.getText());
        System.out.println();

    }

    @AfterMethod
    public void exit(){
        wd.quit();
    }
}
