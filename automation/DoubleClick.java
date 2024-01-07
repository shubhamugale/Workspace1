package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);

WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(click).build().perform();

String txt = driver.switchTo().alert().getText();
System.out.println(txt);

if (txt.contentEquals("You double clicked me.. Thank You..")){
    driver.switchTo().alert().accept();
    Thread.sleep(1000);
    System.out.println("Correct alert appeared");
}else{
    System.out.println("Correct alert not appeared");
}
driver.close();
    }
}
