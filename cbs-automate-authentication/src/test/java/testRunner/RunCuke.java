package testRunner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(features = "classpath:featureFile",
glue = "classpath:stepsDefinitions"
)
public class RunCuke extends AbstractTestNGCucumberTests{
	
	
}


 
 
