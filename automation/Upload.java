package automation;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Upload {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        action.click(driver.findElement(By.id("input-4"))).build().perform();

        StringSelection ss = new StringSelection("C:\\Users\\shubh\\Downloads\\sampleFile.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);

        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

        System.out.println("Success");

        driver.close();
    }
}
