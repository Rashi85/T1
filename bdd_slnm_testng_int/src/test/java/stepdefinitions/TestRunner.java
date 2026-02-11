package stepdefinitions;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/googlesearch.feature"
,glue={"stepdefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports.html"
		,"json:target/JSONReports"}
		)				

public class TestRunner extends
AbstractTestNGCucumberTests{


	

}
