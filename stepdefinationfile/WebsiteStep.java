package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobject.AmazonHomePage;
import pageobject.WebsiteObject;
import reusable.BaseCode;

import java.util.List;

import static reusable.BaseCode.driver;

public class WebsiteStep extends BaseCode {

    private WebElement e1;

    @Given("To validate the dropdown functionality")
    public void toValidateTheDropdownFunctionality() {
        WebElement e1= driver.findElement(By.id("continents"));
        Select s1 = new Select(e1);
       s1.selectByVisibleText("Europe");
        s1.selectByIndex(2);
    }

    @Given("User should enters the username {string} and password {string} and test signing button")
    public void userShouldEntersTheUsernameAndPasswordAndTestSigningButton(String arg0, String arg1) throws InterruptedException {
      /*  Actions act = new Actions(driver);
        driver.findElement(By.name("userName")).sendKeys("Shubham");
        act.click(driver.findElement(By.name("userName")));
        act.keyDown(org.openqa.selenium.Keys.CONTROL);
        act.sendKeys("a");
        act.sendKeys("c");
        act.keyUp(org.openqa.selenium.Keys.CONTROL);
        Thread.sleep(10000);
        act.click(driver.findElement(By.name("password")));
        act.keyDown(org.openqa.selenium.Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(org.openqa.selenium.Keys.CONTROL);
        act.build().perform();
        driver.close();
       */
        WebsiteObject.enterUsername("Shubham");
        WebsiteObject.enterPassword("abc");
    }

    @When("User should click on submit button")
    public void userShouldClickOnSubmitButton() {
WebsiteObject.clickOnSubmitButton();
    }

    @Then("Validate the error message")
    public void validateTheErrorMessage() {
        if(WebsiteObject.errorMessage().equals("Enter your userName and password correct")){
            System.out.println("Message matched");
        }
        else{
            System.out.println("Message is different");
        }
    }

    @Given("To validate the mouse actions")
    public void toValidateTheMouseActions() {

    }

    @Given("Table functionality validation by user")
    public void tableFunctionalityValidationByUser() {
        WebElement web = driver.findElement(By.xpath("//table[@class='table table table-striped table-hover table-bordered tr-styled-table']"));
        List <WebElement> tabValue = driver.findElements(By.tagName("tr"));
        for (WebElement k:tabValue){
            System.out.println(k.getText());
       }
    }
}

