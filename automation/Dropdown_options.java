package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_options {
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("http://output.jsbin.com/osebed/2");
     driver.manage().window().maximize();

     Select fruits = new Select (driver.findElement(By.id("fruits")));
     fruits.selectByVisibleText("Grape");
        Thread.sleep(500);
     fruits.selectByIndex(2);

        Thread.sleep(1000);

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select country = new Select (driver.findElement(By.name("country")));
        country.selectByVisibleText("NORWAY");

        driver.close();
    }
}
