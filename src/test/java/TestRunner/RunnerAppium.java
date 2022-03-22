package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "./src/test/java/Features",
		glue = "StepDefination",
	//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = "@smoke" 
		)
public class RunnerAppium extends AbstractTestNGCucumberTests {
}



