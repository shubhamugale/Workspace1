package runner1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)

    @CucumberOptions(

            //press cntrl+space
            features = {"src/test/resources/featurefile1"},
            glue = {"stepdefinationfile1"},
            tags = "@SC01",
            plugin = "pretty"
    )
    public class FeatureRunner1 {
    }
