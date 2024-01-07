package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_and_checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String str = "https://demo.guru99.com/test/radio.html";
        driver.get(str);
        WebElement radio = driver.findElement(By.id("vfb-7-2"));
        radio.click();
        System.out.println("radio button is selected");
        Thread.sleep(1000);
        WebElement option = driver.findElement(By.id("vfb-6-2"));
        option.click();
if(option.isSelected()){
    System.out.println("Checkbox is selected");
}
else{
    System.out.println("Checkbox is not selected");
}
        driver.get("https://demo.guru99.com/test/facebook.html");
WebElement web = driver.findElement(By.id("persist_box"));
for(int i=0;i<2;i++)
{
    web.click();
    Thread.sleep(1000);
    System.out.println("Facebook checkbox is selected - " + web.isSelected());
}
driver.close();
    }
}
