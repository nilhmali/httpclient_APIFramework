package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import StepDefination.GetTestcases;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"resource"} ,
glue= {"StepDefination"},plugin={"pretty","html:CucumberReport/cucumber"})

public class runner extends AbstractTestNGCucumberTests {
	
	//nileshsdfdsf
}
