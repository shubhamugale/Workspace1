package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Draggable {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/dragabble");
            driver.manage().window().maximize();

        Actions act10 = new Actions(driver);
        WebElement drag  = driver.findElement(By.xpath("//div[@id='dragBox']"));
        act10.dragAndDropBy(drag, 300, 150).build().perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped...!");

        WebElement ele35 = driver.findElement(By.id("draggableExample-tab-axisRestriction"));
        ele35.click();

        WebElement dragX  = driver.findElement(By.id("restrictedX"));
        act10.dragAndDropBy(dragX, 100, 0).perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped on X-Axis...!");

        WebElement dragY  = driver.findElement(By.id("restrictedY"));
        act10.dragAndDropBy(dragY, 0, 150).perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped on Y-Axis...!");

        driver.close();
    }
}
