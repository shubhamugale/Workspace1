package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;

public class IFrame {
    public static void main(String[] args) throws InterruptedException, AWTException {

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
//Nested Frames

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement frame1 = driver.findElement(By.id("frame1"));
        // switch to frame1
        driver.switchTo().frame(frame1);

        // find the frame 3
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        // switch to frame 3
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();

driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
Thread.sleep(1000);

Select select = new Select(driver.findElement(By.id("animals")));
select.selectByVisibleText("Avatar");
System.out.println("Done");
        driver.close();


    }
}
