package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AutoComplete {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();

        Actions act3 = new Actions(driver);
       act3.click(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))).build().perform();
       act3.sendKeys("Red");
       act3.sendKeys(Keys.ARROW_DOWN).build().perform();
       act3.moveToElement(driver.findElement(By.xpath(""))).build().perform();
       act3.click();

        Thread.sleep(5000);
        System.out.println("Success");
    }
}
