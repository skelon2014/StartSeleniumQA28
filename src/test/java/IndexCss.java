import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IndexCss {

    WebDriver wd;

    @BeforeMethod
    public void enter() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        wd.navigate().to("file:///D:/TELRAN/Testing/32/index.html");
    }

    @Test
    public void itemTest() {
        WebElement item1 = wd.findElement(By.cssSelector("#nav ul li:first-child"));
        WebElement item1_1 = wd.findElement(By.xpath("//*[@id='nav']//ul//li[1]"));
        item1_1.click();
        String item1Text = item1_1.getText();

        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        WebElement alert_1 = wd.findElement(By.xpath("//*[@id='alert']"));
        WebElement alert_11 = wd.findElement(By.id("alert"));

        String alertText = alert_11.getText();

//        if (alertText.contains(item1Text)) {
//            System.out.println("Test item1 passed");
//        } else {
//            System.out.println("Test item1 failed");
//        }
        Assert.assertTrue(alertText.contains(item1Text));
    }

    @Test
    public void phormTest() {
        WebElement name = wd.findElement(By.name("name"));
        WebElement name_1 = wd.findElement(By.xpath("//*[@name='name']"));
        WebElement surename = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement surename_1 = wd.findElement(By.xpath("//*[@name='surename']"));
        name_1.click();
        name_1.clear();
        name_1.sendKeys("Hello");
        surename_1.click();
        surename_1.clear();
        surename_1.sendKeys("my darling!");
        WebElement send = wd.findElement(By.cssSelector("#form1 button.btn"));
        WebElement send_1 = wd.findElement(By.xpath("//button[@class='btn']"));
        send_1.click();

        String nameText = name.getText();
        String surenameText = surename.getText();

        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        String alertText = alert.getText();
        Assert.assertTrue(alertText.contains(nameText + surenameText));
        //  Assert.assertTrue(alertText.contains(surenameText));
        Assert.assertFalse(alertText.contains("Trulala"));
    }

    @Test
    public void tableTest() {
        List<WebElement> raws = wd.findElements(By.cssSelector("#country-table tr"));
        List<WebElement> elements = wd.findElements(By.cssSelector("#country-table td"));
        System.out.println("Raws - " + raws.size());
        System.out.println("Elements - " + elements.size());
        List<WebElement> columns = wd.findElements(By.cssSelector("tr:first-child td"));
        System.out.println("Columns - " + columns.size());
        System.out.println();

        String text = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)")).getText();
        Assert.assertEquals(text, "Chine");

        List<WebElement> lastRaw = wd.findElements(By.cssSelector("tr:last-child td"));
        for(WebElement element:lastRaw) {
            System.out.println(element.getText());
        }
            System.out.println();

           List<WebElement>lastColumns = wd.findElements(By.cssSelector("td:last-child"));
            for(WebElement el:lastColumns) {
                System.out.println(el.getText());
            }
        System.out.println();
        List<WebElement>raw = wd.findElements(By.cssSelector("tr:first-child td"));
        for(WebElement el1:raw) {
            System.out.print(el1.getText()+"  ");
        }
        System.out.println();

    }


    @AfterMethod
    public void exit() {
         wd.quit();
    }
}


