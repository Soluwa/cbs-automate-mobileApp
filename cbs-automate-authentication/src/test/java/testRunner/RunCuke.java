package testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "/cbs-automate-authentication/src/main/java/featureFile",
glue = {"/cbs-automate-authentication/src/main/java/stepDefinitions"},
tags = {""},
plugin = {"pretty", "html:target/cucumber-html-report",
"json:target/cbs-cucumberJVM-reportscucumber.json"},
monochrome = true
)
public class RunCuke {
	
	public TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "runs the feature files", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
	}
	
	@DataProvider
	public Object [][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		
		testNGCucumberRunner.finish();
	}

}
