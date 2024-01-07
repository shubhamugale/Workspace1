package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Download {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(20,2000)");

        Actions action1 = new Actions(driver);

        action1.click(driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))).build().perform();

        WebElement ele1 = driver.findElement(By.id("textbox"));
        ele1.click();
        ele1.sendKeys("Here I am...!");

        action1.click(driver.findElement(By.id("createTxt"))).build().perform();

        action1.click(driver.findElement(By.id("link-to-download"))).build().perform();
        System.out.println("Success");

        driver.close();
    }
}
