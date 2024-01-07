package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Salesforce {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("Shubham");

        driver.findElement(By.name("pw")).sendKeys("Shubham");

        driver.findElement(By.name("Login")).click();
    }

}
