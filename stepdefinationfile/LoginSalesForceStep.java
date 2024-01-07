package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.SalesForceLoginPage;
import reusable.BaseCode;
import reusable.ReadExcel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginSalesForceStep extends BaseCode {
    @Given("User navigate to salesforce login page") 
        public void loginPage () throws IOException {
        SalesForceLoginPage.launchBrowser();
        }

    @When("User should enters the username {string} and password {string}") 
        public void userShouldEntersTheUsernameAndPassword (String arg0, String arg1) throws IOException {
        SalesForceLoginPage.enterUserName(ReadExcel.getDataFromExcel("logindetails",0,0));
        SalesForceLoginPage.enterPassword(ReadExcel.getDataFromExcel("logindetails",0,0));
        }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {

        SalesForceLoginPage.clickLoginButton();
    }

    @Then("User should navigate to homepage")
    public void userShouldNavigateToHomepage() {

    }

    @Then("User validate the error message")
    public void userValidateTheErrorMessage() {

     //   Assert.assertEquals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.",SalesForceLoginPage.getErrorMessage());

         /* Simple if else statement
        if(SalesForceLoginPage.getErrorMessage().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator."))
        {
System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
        */


         if(SalesForceLoginPage.getErrorMessage().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator."))
        {
Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }



    }

    @Given("user handles the other table")
    public void userHandlesTheOtherTable() {
        WebElement ey1 = driver.findElement(By.xpath("//table[@class='wikitable']"));
       // List <WebElement> headings = driver.findElements(By.xpath("//table[@class='wikitable']//tr[3]//td"));
        List <WebElement> headings = driver.findElements(By.xpath("//table[@class='wikitable']//tr//td[3]"));
        for(WebElement k:headings){
         System.out.println(k.getText());
        }

    }

    @Given("user should validate the alert ok functionality")
    public void userShouldValidateTheAlertOkFunctionality() {
SalesForceLoginPage.alertOk();
    }

    @Given("user should validate the ok and cancel button")
    public void userShouldValidateTheOkAndCancelButton() {
SalesForceLoginPage.alertOkAndCancelButton();
    }

    @Given("User should validate the alert with textbox")
    public void userShouldValidateTheAlertWithTextbox() {
        SalesForceLoginPage.alertWithSendkeys();
    }

}
    
