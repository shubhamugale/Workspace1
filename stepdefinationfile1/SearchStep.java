 package stepdefinationfile1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AmazonHomePage;
import pageobject.SalesForceLoginPage;
import pageobject1.AmazonSearchTab;

import java.io.FileNotFoundException;
import java.io.IOException;

 public class SearchStep {

    @Given("User navigate to amazon")
    public void navigateUrl () throws IOException {

        AmazonHomePage.launchBrowser();
    }
    @When("User enter the {string} and click on search button")
    public void searchtext (String product) {

       AmazonHomePage.enterProductName(product);
       AmazonHomePage.clickSearchIcon();
    }



}
