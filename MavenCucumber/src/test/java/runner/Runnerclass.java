package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
		features=("C:/Users/HP/workspace/MavenCucumber/src/test/java/feature/Login.feature"),
		glue = ("stepDefinition"),
		dryRun=false,
		monochrome=true,
		plugin={"pretty","html:reports\\loginreport.html"}
		)

public class Runnerclass extends AbstractTestNGCucumberTests
{
		
}

	