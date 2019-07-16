package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

@CucumberOptions(features = "classpath:resources",
glue = "classpath:stepsDefinitions",
plugin = {"pretty", "html:target/cucumber-html-report",
"json:target/cucumber.json"}
)
public class RunCuke extends AbstractTestNGCucumberTests{
	
	
}


 
 
