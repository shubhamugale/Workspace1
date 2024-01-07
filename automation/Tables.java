package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en.wikipedia.org/wiki/India");

        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.xpath("//div[@class='ib-country-names']"));

        List <WebElement> list = driver.findElements(By.tagName("tr"));
        List <String> list1 = new ArrayList<String>();
        for(WebElement k:list) {
            list1.add(k.getText());
        }
            System.out.println(list1);

    }
}
