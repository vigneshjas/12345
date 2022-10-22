package como.testrun;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Nagarasu\\eclipse-workspace\\HomeLoan.zip_expanded\\HomeLoan\\src\\test\\resources\\Features\\TC_HomeLoan.feature", glue="como.stepdefinition",stepNotifications=true,publish=true,
dryRun=false,monochrome=true,plugin = {"pretty","json:target\\output.json"},snippets=SnippetType.CAMELCASE)


public class TestRunner {
	
}

