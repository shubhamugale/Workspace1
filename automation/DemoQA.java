package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DemoQA {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // driver.get("https://www.amazon.in/");

//Normal dropdown on amazon
/*
        WebElement ele2 = driver.findElement(By.xpath("//button[normalize-space(text())='Dropdown']"));
        ele2.click();
        Select select = new Select(ele2);
        select.selectByIndex(1);
 */

 //It retrieve the selected option text from dropdown
/*
        Select select = new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")));
        WebElement option = select.getFirstSelectedOption();
        String matchingElement = option.getText();
        System.out.println(matchingElement );
 */


//TEXT BOX
        WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        ele1.click();

       WebElement ele2 = driver.findElement(By.id("userName"));
       ele2.click();
       ele2.sendKeys("Tom Hardey");

       driver.findElement(By.id("userEmail")).sendKeys("tomhardey@gmail.com");
       driver.findElement(By.id("currentAddress")).sendKeys("Amravati");

 //Vertical Scroll
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(40,3000)");

 //Horizontal scroll
 /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(5000,30)")
  */

       driver.findElement(By.id("permanentAddress")).sendKeys("Amravati");
       Thread.sleep(1000);
       driver.findElement(By.id("submit")).submit();
        System.out.println("All fields added successfully");
        driver.findElement(By.id("permanentAddress")).sendKeys("Amravati");
        Thread.sleep(1000);
System.out.println("Fields are added into textfields");

//CHECK BOX
        WebElement ele3 = driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
        ele3.click();

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
        Thread.sleep(1000);

        System.out.println("check box clicked successful");
        Thread.sleep(1000);

 //RADIO BUTTONS
        WebElement ele4 = driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]"));
        ele4.click();

        driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
        Thread.sleep(1000);

        System.out.println("Radio button clicked successful");
        Thread.sleep(1000);



//WEB TABLES
        /*
driver.get("https://en.wikipedia.org/wiki/Mahabharata");

        WebElement ele5 = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

        List <WebElement> l1 = driver.findElements(By.tagName("th"));
        List <String> l2 = new ArrayList<String>();
        for (WebElement l3:l1){
            l2.add(l3.getText());
        }
        System.out.println(l2);
        Thread.sleep(1000);


         */

 /*
  WebElement ele5 = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

//As we use <th> then it simply return the table heading

        List <WebElement> l1 = driver.findElements(By.tagName("th"));
        List <String> l2 = new ArrayList<String>();
        for (WebElement l3:l1){
            l2.add(l3.getText());
        }
        System.out.println(l2);
        Thread.sleep(1000);

//As we use <td> then it simply return the table data

        List <WebElement> l4 = driver.findElements(By.tagName("td"));
        List <String> l5 = new ArrayList<String>();
        for (WebElement l6:l4){
            l5.add(l6.getText());
        }
        System.out.println(l5);
        Thread.sleep(1000);

  # Output is same like above <tr> tag because tr tag reflects data is in the form of th and td

  */

        /*
//For specific data present inside the table
        WebElement web = driver.findElement(By.xpath("//table[@class='wikitable']"));
        List <WebElement> list = driver.findElements(By.xpath("//table[@class='wikitable']//child::tr[2]//child::td[4]"));
        for(WebElement k:list){
            System.out.println(k.getText());
        }
         */
 //BUTTONS
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(40,3000)");
        WebElement ele6 = driver.findElement(By.xpath("//span[contains(text(),'Buttons')]"));
        ele6.click();
        Actions action = new Actions(driver);

 //Mouse Click Action
       WebElement ele7 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"));
        ele7.click();
        String str = "You have done a dynamic click";
      if (str==driver.findElement(By.id("dynamicClickMessage")).getText());
      {
          System.out.println("Matching");
      }
        System.out.println("Button click successfully");

//Mouse Right Click Action
        WebElement ele8 = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(ele8).build().perform();
        String str1 = "You have done a right click";
        if (str1==driver.findElement(By.id("rightClickMessage")).getText());
        {
            System.out.println("Matching");
        }
        System.out.println("User right click successfully");

//Mouse Double Click Action
        WebElement ele9 = driver.findElement(By.id("doubleClickBtn"));
        action.doubleClick(ele9).build().perform();
        String str2 = "You have done a double click";
        if (str2==driver.findElement(By.id("doubleClickMessage")).getText());
        {
            System.out.println("Matching");
        }
        System.out.println("User double click successfully");


//LINKS
        /*
        // Home Link
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(20,1000)");

        WebElement ele10 = driver.findElement(By.xpath("//span[contains(text(),'Links')]"));
        ele10.click();

        WebElement ele11 = driver.findElement(By.id("simpleLink"));
        ele11.click();

      //  driver.switchTo().window("https://demoqa.com");

       driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(1000);
        System.out.println("Link click successfully");

        */
/*
        //Dyanmic Link
        WebElement ele12 = driver.findElement(By.xpath("//span[contains(text(),'Links')]"));
        ele12.click();

        WebElement ele13 = driver.findElement(By.id("dynamicLink"));
        ele13.click();

        //  driver.switchTo().window("https://demoqa.com");
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(1000);
        System.out.println("Dyanamic Link click successfully");
 */

 //BROKEN LINKS - IMAGES



 //UPLOAD AND DOWNLOAD
        /*
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(20,1000)");

        WebElement ele12 = driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]"));
        ele12.click();

        driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(1000);

        System.out.println("File download successfully");

        Actions action1 = new Actions(driver);
        action1.click(driver.findElement(By.cssSelector("#uploadFile"))).build().perform();

       Robot r = new Robot();

        StringSelection ss = new StringSelection("C:\\Users\\shubh\\Downloads\\sampleFile.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        String str3 = "C:\\fakepath\\sampleFile.jpeg";
        if(str3=="C:\\fakepath\\sampleFile.jpeg") {
            System.out.println("Done");
        }

        System.out.println("File upload successfully");
         */

        /*
 //DYNAMIC PROPERTIES
        WebElement ele3 = driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
        ele3.click();

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
        Thread.sleep(1000);

        System.out.println("check box clicked successful");
         */

 //Alert

        driver.get("https://demoqa.com/alerts");

        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(30,2000)");

        WebElement ele14 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
        ele14.click();

        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,200)");

        WebElement ele15=driver.findElement(By.id("alertButton"));
        ele15.click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println("First Alert");

        WebElement ele16 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        ele16.click();

        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        System.out.println("Second Alert");
        Thread.sleep(5000);


        WebElement ele17 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        ele17.click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        System.out.println("Third Alert");

        WebElement ele18 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        ele18.click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Shubham");
        driver.switchTo().alert().accept();

        WebElement ele22 =  driver.findElement(By.id("confirmResult"));
        System.out.println(ele22.getText());
        System.out.println("Fourth Alert");



//Frames

        WebElement ele19 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/span[1]"));
        ele19.click();

        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(20,2000)");

       driver.switchTo().frame("frame1");
        WebElement ele20 = driver.findElement(By.id("sampleHeading"));
        ele20.click();
        System.out.println(ele20.getText());
driver.switchTo().defaultContent();
        Thread.sleep(1000);

/*
        driver.switchTo().frame("frame2");
        Thread.sleep(1000);
        WebElement ele21 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
        ele21.click();
        System.out.println(ele21.getText());
 */
//Nested Frame
Actions action1 = new  Actions(driver);
action1.click(driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]"))).build().perform();

        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        js8.executeScript("window.scrollBy(20,2000)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement frame1 = driver.findElement(By.id("frame1"));
        // switch to frame1
        driver.switchTo().frame(frame1);

        // find the frame 3
        WebElement frame2 = driver.findElement(By.xpath("//body/iframe[1]"));
        // switch to frame 3
        driver.switchTo().frame(frame2);
        driver.switchTo().defaultContent();
        System.out.println("OK");

//Modals Dialogs
        WebElement ele23 = driver.findElement(By.xpath("//span[contains(text(),'Modal Dialogs')]"));
        ele23.click();

        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        js9.executeScript("window.scrollBy(20,2000)");

        WebElement ele24 = driver.findElement(By.xpath("//button[@id='showSmallModal']"));
        ele24.click();

        WebElement ele25 = driver.findElement(By.id("closeSmallModal"));
        ele25.click();

        System.out.println("Small model run successfully");

        WebElement ele26 = driver.findElement(By.id("showLargeModal"));
        ele26.click();

        System.out.println(ele26.getText());

        WebElement ele27 = driver.findElement(By.id("closeLargeModal"));
        ele27.click();

        System.out.println("Large model run successfully");
/*
 //Auto Complete
 driver.get("https://demoqa.com/auto-complete");
          Actions act3 = new Actions(driver);
       act3.click(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))).build().perform();
       act3.sendKeys("Red");
       act3.sendKeys(Keys.ARROW_DOWN).build().perform();
       act3.moveToElement(driver.findElement(By.xpath(""))).build().perform();
       act3.click();
 */
 //Slider
        JavascriptExecutor js10 = (JavascriptExecutor) driver;
        js10.executeScript("window.scrollBy(20,2000)");

        driver.get("https://demoqa.com/slider");
        Actions action7 = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
        action7.dragAndDropBy(slider, 200, 0).perform();

//Date Picker
        driver.get("https://demoqa.com/date-picker");

        WebElement ele = driver.findElement(By.id("datePickerMonthYearInput"));
        ele.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_DELETE);
        ele.sendKeys("09/25/2013");
        Thread.sleep(2000);
        System.out.println("First date picker option run successfully");

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.id("dateAndTimePickerInput"))).build().perform();
        actions.sendKeys("December 7, 2023 5:15 AM");
        Thread.sleep(2000);
        System.out.println("Second date picker option run successfully");

//Progress Bar
        driver.get("https://demoqa.com/progress-bar");

        Actions act6 = new Actions(driver);
        act6.click(driver.findElement(By.id("startStopButton"))).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));

        // For stop button
        //  act6.click(driver.findElement(By.id("startStopButton"))).build().perform();

        System.out.println(driver.findElement(By.xpath("//div[@role='progressbar']")).getText());
        Thread.sleep(2000);

        act6.click(driver.findElement(By.id("resetButton"))).build().perform();
        Thread.sleep(2000);
System.out.println("Progress bar automate successfully");

//Menu
        driver.get("https://demoqa.com/menu");
        Actions act8 = new Actions(driver);
        act8.click(driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"))).build().perform();
        act8.click(driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).build().perform();
        act8.click(driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]"))).build().perform();
        System.out.println("Menu option automate successfully");

//Select Operation
        driver.get("https://demoqa.com/select-menu");


        Select select8 = new Select(driver.findElement(By.id("oldSelectMenu")));
        select8.selectByIndex(2);
        System.out.println("First Select program run successfully");

        Select select9 = new Select(driver.findElement(By.id("cars")));
        select9.selectByValue("opel");
        System.out.println("Second Select program run successfully");

//Droppable
        driver.get("https://demoqa.com/droppable");

        Actions act9 = new Actions(driver);

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        act9.dragAndDrop(src,dest).build().perform();
        Thread.sleep(2000);
        System.out.println("Simple drag and drop operation done successfully");

        WebElement ele32 = driver.findElement(By.id("droppableExample-tab-accept"));
        ele32.click();

        WebElement src1 = driver.findElement(By.id("acceptable"));
        WebElement dest1 = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
        act9.dragAndDrop(src1,dest1).build().perform();
        Thread.sleep(2000);

        WebElement src2 = driver.findElement(By.id("notAcceptable"));
        WebElement dest2 = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
        act9.dragAndDrop(src2,dest2).build().perform();
        Thread.sleep(2000);

        System.out.println("Acceptable and non-acceptable operation done successfully");

        WebElement ele33 = driver.findElement(By.id("droppableExample-tab-preventPropogation"));
        ele33.click();

        WebElement src3 = driver.findElement(By.id("dragBox"));
        WebElement dest3 = driver.findElement(By.id("notGreedyInnerDropBox"));
        act9.dragAndDrop(src3,dest3).build().perform();
        Thread.sleep(2000);

        System.out.println("notGreedyInnerDropBox drag and drop operation done successfully");

        JavascriptExecutor js11 = (JavascriptExecutor) driver;
        js11.executeScript("window.scrollBy(20,2000)");

        WebElement src4 = driver.findElement(By.id("dragBox"));
        WebElement dest4 = driver.findElement(By.id("greedyDropBoxInner"));
        act9.dragAndDrop(src4,dest4).build().perform();
        Thread.sleep(2000);
        System.out.println("GreedyInnerDropBox drag and drop operation done successfully");
        driver.navigate().refresh();
        System.out.println("Box redirect to initial position");

        WebElement ele34 = driver.findElement(By.id("droppableExample-tab-revertable"));
        ele34.click();

        WebElement src6 = driver.findElement(By.id("revertable"));
        WebElement dest6 = driver.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
        act9.dragAndDrop(src6,dest6).build().perform();
        Thread.sleep(2000);
        System.out.println("Revertable box");

        WebElement src7 = driver.findElement(By.id("notRevertable"));
        WebElement dest7 = driver.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
        act9.dragAndDrop(src7,dest7).build().perform();
        Thread.sleep(2000);
        System.out.println("Non-Revertable box");

 //Draggable
        driver.get("https://demoqa.com/dragabble");

        Actions act10 = new Actions(driver);
        WebElement drag  = driver.findElement(By.xpath("//div[@id='dragBox']"));
        act10.dragAndDropBy(drag, 300, 150).build().perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped...!");

        WebElement ele35 = driver.findElement(By.id("draggableExample-tab-axisRestriction"));
        ele35.click();

        WebElement dragX  = driver.findElement(By.id("restrictedX"));
        act10.dragAndDropBy(dragX, 100, 0).perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped on X-Axis...!");

        WebElement dragY  = driver.findElement(By.id("restrictedY"));
        act10.dragAndDropBy(dragY, 0, 150).perform();
        Thread.sleep(2000);
        System.out.println("Successfully dropped on Y-Axis...!");

 //Sortable
        driver.get("https://demoqa.com/sortable");

        Actions act11 = new Actions(driver);
        WebElement selectable  = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        WebElement droppable = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]"));
        act11.dragAndDrop(selectable,droppable).build().perform();
        Thread.sleep(4000);
        System.out.println("Successfully sorted...!");

        WebElement ele36  = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        ele36.click();

        JavascriptExecutor js12 = (JavascriptExecutor)driver;
        js12.executeScript("window.scrollBy(10,1000)");

        WebElement selectable1  = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]"));
        WebElement droppable1 = driver.findElement(By.xpath("//div[contains(text(),'Seven')]"));
        act11.dragAndDrop(selectable1,droppable1).build().perform();
        Thread.sleep(4000);
        System.out.println("Successfully Grid sorted...!");

//Selectable
        driver.get("https://demoqa.com/selectable");
        Actions act12 = new Actions(driver);

        WebElement sele1  = driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]"));
        act12.click(sele1).build().perform();
        //sele1.click();
        Thread.sleep(2000);
        JavascriptExecutor js13 = (JavascriptExecutor)driver;
        js13.executeScript("window.scrollBy(20, 1000)");
        WebElement sele4 = driver.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]"));
        act12.click(sele4).build().perform();
        //sele4.click();
        Thread.sleep(2000);

        System.out.println("Successfully selected...!");

/*
//Resizable
        driver.get("https://demoqa.com/resizable");

 */

        driver.close();
    }
}
