package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Resizable {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/resizable");
        driver.manage().window().maximize();

        JavascriptExecutor js12 = (JavascriptExecutor)driver;
        js12.executeScript("window.scrollBy(10,1000)");

        Actions act = new Actions(driver);
        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
 act.clickAndHold(resize).moveByOffset(150, 100).perform();
     Thread.sleep(2000);
driver.close();
    }
}