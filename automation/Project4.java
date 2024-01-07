package automation;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.flipkart.com/account/login");

        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//header/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
        ele.sendKeys("iPhone 12");
        ele.sendKeys(Keys.ENTER);

        WebElement ele1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']"));
        ele1.click();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40,3000)");

        WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'64 GB')]"));
        ele2.click();

        WebElement ele3 = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
        ele3.click();

       if(ele3.getText().contentEquals("APPLE iPhone 12 (Blue, 64 GB)")){
           System.out.println("Match");
        }
       else {
           System.out.println("Not Match");
       }

        WebElement ele4 = driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
        ele4.click();

        WebElement ele5 = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]"));
        ele5.click();

        WebElement ele6 = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
        ele6.click();
        ele6.sendKeys("Elon Musk");

        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("7878787878");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("666201");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("Rudra Colony");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/textarea[1]")).sendKeys("Sai nagar");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")).sendKeys("Amritsar");
        Select sel = new Select(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/div[2]/select[1]")));
        sel.selectByValue("Punjab");

        WebElement radioButton = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/label[1]/div[1]"));
        radioButton.click();

        WebElement ele7 = driver.findElement(By.xpath("//button[contains(text(),'Save and Deliver Here')]"));
        ele7.click();




        WebElement ele9 = driver.findElement(By.xpath(""));
        ele9.click();

        WebElement ele10 = driver.findElement(By.xpath(""));
        ele10.click();

    }
}
