package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobject.SpiceJetHomePage;
import reusable.BaseCode;

public class SpiceJetStep extends BaseCode {

    @Given("User selects the value From dropdown option")
    public static void userSelectsTheValueFromDropdownOption(){
        SpiceJetHomePage.clickOnFromOption();
        SpiceJetHomePage.selectDynamicOptionFromGivenDropdown(4,2);
    }

    @When("User selects the value To dropdown option")
    public static void userSelectsTheValueToDropdownOption(){
        SpiceJetHomePage.clickOnTomOption();
        SpiceJetHomePage.selectDynamicOptionFromToDropdown(2,2);
    }

    @Given("use of explicite wait after selecting the element")
    public void useOfExpliciteWaitAfterSelectingTheElement() {
SpiceJetHomePage.useOfExpliciteWait();
    }

    @Given("use of implicite wait after selecting the element")
    public void useOfImpliciteWaitAfterSelectingTheElement() {

    }

    @Given("user should count the sites open in tabs")
    public void userShouldCountTheSitesOpenInTabs() {
SpiceJetHomePage.newTabsCount();
    }


    @Given("User should implements the methods")
    public void userShouldImplementsTheMethods() {
        Boolean oneway = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).isSelected();
        Assert.assertTrue(oneway);

        Boolean twoway = driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();
        Assert.assertTrue(twoway);

        driver.findElement(By.xpath("//label[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_LabelMarketStation1']")).isDisplayed();
    }
}
