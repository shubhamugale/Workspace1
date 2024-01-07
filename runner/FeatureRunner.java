package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //press cntrl+space
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinationfile"},
       tags = "@LoginFunctionality",
       // tags = "@Multi",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/report.json",
                "junit:target/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class FeatureRunner {
}
