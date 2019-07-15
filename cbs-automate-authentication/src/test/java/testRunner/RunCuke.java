package testRunner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(features = "classpath:featureFile",
glue = "classpath:stepsDefinitions",
plugin = {"pretty", "html:target/cucumber-html-report",
"json:target/cucumber.json"}
)
public class RunCuke extends AbstractTestNGCucumberTests{
	
	
}


 
 
