package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import pageobject.AmazonHomePage;
import pageobject.SearchPage;
import reusable.BaseCode;
import reusable.ReadExcel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static pageobject.AmazonHomePage.dropdownCategory;

public class AmazonStep extends BaseCode{

    @Given("User navigate to Amazon")
    public void loginPage() throws IOException {

        AmazonHomePage.launchBrowser();

    }

    @When("User enter the {string} and click on search button")
    public void userShouldEntersTextAndClickOnSearch(String product) throws IOException {
        AmazonHomePage.enterProductName(ReadExcel.getDataFromExcel("logindetails",3,0));
        AmazonHomePage.clickSearchIcon();
    }

    @Then("validate the Title of page")
    public void validateTheTitleOfPage() {

     //   Assert.assertEquals("Amazon.in : iphone",SearchPage.getTitleOfPage());

        /* Simple if else statement
        if (SearchPage.getTitleOfPage().equals("Amazon.in : iphone")) {
            System.out.print("Match");
        } else {
            System.out.print("Not Match");
        }
         */


          if (SearchPage.getTitleOfPage().equals("Amazon.in : iphone")) {
           Assert.assertTrue(true);
        } else {
              Assert.assertTrue(false);
        }

    }

    @Given("User extract the value from dropdown category")
    public void userExtractTheValueFromDropdownCategory() {

        for (int i = 0; i < AmazonHomePage.getCategoryDropdownCount(); i++) {

          String value = AmazonHomePage.getDropdownValues(i);
            System.out.println(value);
        }
    }

    @Given("User select the value from category dropdown")
    public void userSelectTheValueFromCategoryDropdown() {

AmazonHomePage.selectStaticDropdownElementByUsingIndex(4);
AmazonHomePage.selectStaticDropdownElementByUsingValue("search-alias=mobile-apps");
AmazonHomePage.selectStaticDropdownElementByUsingVisibleText("Baby");

    }

    @Given("User clicks on baby wishlist")
    public void userClicksOnBabyWishlist() throws AWTException {
        Actions clickAction = new Actions(driver);
        Robot r = new Robot();
        WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        clickAction.moveToElement(signIn).build().perform();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
        String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Baby Wishlist')]"));
        clickAction.moveToElement(button).build().perform();
        r.keyPress(KeyEvent.VK_CONTROL);
        button.click();
       // driver.findElement(By.xpath("//span[contains(text(),'Baby Wishlist')]")).click();

     //  clickAction.clickAndHold(signIn).build().perform();
      // driver.findElement(By.linkText("Baby Wishlist")).click(); (open in same page)
     //  Keys.chord() whenever user need to do composite actions that time user need to perfrom keys.chord() action
// control and enter button is used if user wants to open window in new tab

    }

    @Given("User drag and drop the box")
    public void userDragAndDropTheBox() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
driver.switchTo().frame(frameElement);

        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent();
    }

    @Given("user handles the table")
    public void userHandlesTheTable() {
      WebElement ey =  driver.findElement(By.xpath("//table[@class='infobox vcard']"));
      //if you want data in label and value then you can refere commented code
/*
      List <WebElement> columnOne = driver.findElements(By.tagName("tr"));
        List <String> columnOneValues = new ArrayList<String>();
      for (WebElement k:columnOne){
          columnOneValues.add(k.getText());
      }
      System.out.println(columnOneValues);

 */
        List <String> columnOneValues = new ArrayList<String>();
        for (int i=1; i<ey.findElements(By.tagName("th")).size(); i++){
            columnOneValues.add(ey.findElements(By.tagName("th")).get(i).getText());
        }
        System.out.println(columnOneValues);

        List <String> columnTwoValues = new ArrayList<String>();
        for (int i=1; i<ey.findElements(By.tagName("td")).size(); i++){
          columnTwoValues.add(ey.findElements(By.tagName("td")).get(i).getText());
        }
        System.out.println(columnTwoValues);
    }

    @Given("user handles the new table structure")
    public void userHandlesTheNewTableStructure() {

        WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

        List <WebElement> tableData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr[2]//td[4]"));
        for (WebElement k:tableData){
            System.out.println(k.getText());
        }
    }
    @Then("we are taking the screenshots")
    public void screenshot() throws IOException {
        File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./target/test-output/screenshot/img1.jpg");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot has been successfully tooked");
    }

    @Given("User enter the {string} in username field")
    public void userEnterTheInUsernameField(String username) {
AmazonHomePage.loginId(username);
    }

    @When("User enter the {string} in password field")
    public void userEnterTheInPasswordField(String password) {
        AmazonHomePage.passwordCredentials(password);
    }

    @And("To check the working of submit button")
    public void toCheckTheWorkingOfSubmitButton() {
        AmazonHomePage.submitButton();
    }
}

