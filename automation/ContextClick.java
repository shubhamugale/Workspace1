package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
    public static void main(String[] args){

        //Now System.setProperty is not compulsory because the changes in selenium.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\Desktop\\Automation\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement signin = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
        act.contextClick(signin).build().perform();
    }
}
