package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Website {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium-apps.doselect.in/change-text/");
        driver.manage().window().maximize();

        driver.findElement(By.id("bigger")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("smaller")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("reset")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@onclick='smaller()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@onclick='reset()']")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
