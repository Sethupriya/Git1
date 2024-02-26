package PractiseProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Flipkart1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        //List<WebElement> d= driver.findElements(By.xpath("//ul[@class='_3YjYK7 ecs1XG']/a"));
        //System.out.println(driver.findElement(By.xpath("//div[@class='_1wE2Px']")).isDisplayed());
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@aria-label='Electronics']")))
                //.pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/div[@class='_16rZTH']/object/a[text()='Audio']")))
                .click()
                //.moveToElement(driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']")))
                .build().perform();
       // driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/div[@class='_16rZTH']/object/a[text()='Audio']")).click();
       /* List<WebElement> d = driver.findElements(By.xpath("//div[@class='_1UgUYI _2eN8ye']/div[@class='_16rZTH']/object/a[text()='Audio']/ancestor::object/a"));
        for (WebElement e:d)
        {
            System.out.println(e.getAttribute("href"));
        }*/
      //  driver.quit();
    }
}


////div[@class='_1UgUYI _2eN8ye']/div[@class='_16rZTH']/object/a[text()='Audio']/ancestor::object/a

// //a[@class='_1BJVlg _11MZbx']