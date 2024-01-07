package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.util.List;

public class SelectMenu {
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
        List<WebElement>list = sel.getOptions();
        for (WebElement k:list){
            System.out.println(k.getText());
        }
        Thread.sleep(1000);
      sel.selectByIndex(list.indexOf(2));
        System.out.println("Select value is: " + sel.getFirstSelectedOption().getText());
            driver.close();
        }
    }