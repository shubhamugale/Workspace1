package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.id("datePickerMonthYearInput"));
        ele.click();
        Robot r = new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_DELETE);
        ele.sendKeys("09/25/2013");
        Thread.sleep(2000);
        System.out.println("First");

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("dateAndTimePickerInput"))).build().perform();
        actions.sendKeys("December 7, 2023 5:15 AM");
        Thread.sleep(2000);
        System.out.println("Second");
    }

}
