package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.naming.ldap.Control;

public class Keys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
Actions act = new Actions(driver);
        driver.findElement(By.name("userName")).sendKeys("Shubham");
        act.click(driver.findElement(By.name("userName")));
        act.keyDown(org.openqa.selenium.Keys.CONTROL);
        act.sendKeys("a");
        act.sendKeys("c");
        act.keyUp(org.openqa.selenium.Keys.CONTROL);
        Thread.sleep(1000);
        act.click(driver.findElement(By.name("password")));
        act.keyDown(org.openqa.selenium.Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(org.openqa.selenium.Keys.CONTROL);
        act.build().perform();
        driver.close();
    }
}

