package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en.wikipedia.org/wiki/India");
        driver.manage().window().maximize();

        List <WebElement> link = driver.findElements(By.tagName("a"));

       /*
      // It displays names for the links
            for(WebElement k:link){
            System.out.println(k.getText());
        }
        */

        // It displays actual links
        for(WebElement k: link) {
            System.out.println(k.getAttribute("href"));
        }

driver.close();
    }
}
