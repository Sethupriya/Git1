package PractiseProgram;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Flight {
    WebDriver driver = new EdgeDriver();

    @Test
    public void from() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.goibibo.com/");
        Actions actions = new Actions(driver);
        actions.moveByOffset(200, 100).click().build().perform();
        WebElement from = driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"));
        //Boolean from_check = from.isEnabled();
        from.click();
        driver.findElement(By.xpath("//span[text()='From']/following-sibling::input")).sendKeys("MAA"+Keys.ENTER);
       List<WebElement> from_dd=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li/descendant::div[3]/p/span[1]"));
       System.out.println(from_dd.size());
        for (WebElement e:from_dd
             ) {
            System.out.println(e.getText());
        }

    }
}
