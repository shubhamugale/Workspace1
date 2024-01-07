package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Selectable {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/selectable");
        driver.manage().window().maximize();

        Actions act11 = new Actions(driver);

        WebElement sele1  = driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]"));
        act11.click(sele1).build().perform();
        //sele1.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(20, 1000)");
        WebElement sele4 = driver.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]"));
        act11.click(sele4).build().perform();
        //sele4.click();
        Thread.sleep(2000);

        System.out.println("Successfully selected...!");

        driver.close();
    }
}