package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurewithtags", 
glue = { "stepdefinitions" }, tags = " @run"
//use and or not for tags
// You place tags above the Feature, Scenario, or Scenario Outline keywords in
// your .feature file
//you cant place tags above @given...
)
public class TestRunnerwithTags {

}
