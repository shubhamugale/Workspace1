package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Drag_and_Drop {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new EdgeDriver();
       driver.get("https://jqueryui.com/droppable/");
       driver.manage().window().fullscreen();

        Actions act = new Actions(driver);
       driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(0);
WebElement src = driver.findElement(By.id("draggable"));
WebElement tgt = driver.findElement(By.id("droppable"));
act.dragAndDrop(src,tgt).perform();

if(tgt.getText().contentEquals("Dropped!")){
   System.out.println("Successfully dropped here...!");
}
Thread.sleep(1000);
driver.navigate().refresh(); //refresh the page so can dragged element comes to their starting position
driver.close();

    }
}
