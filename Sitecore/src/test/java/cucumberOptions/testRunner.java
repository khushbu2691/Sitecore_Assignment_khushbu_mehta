package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features ="src/test/java/Features",
	    glue="myStepDefinitions")
public class testRunner extends AbstractTestNGCucumberTests  {

}

