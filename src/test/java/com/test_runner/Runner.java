package com.test_runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\Login.feature",
glue = {"com.Teams.StepDefinitions","com.hooks"},
dryRun =false, 
publish=true,
//monochrome = true,
plugin={"pretty","html:test-output",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)
public class Runner{

}

//.\\Features --> for all 
//.\\Features\\Login.feature
// .\\Features\\Settings.feature
//.\\Features\\Searchbar.feature
// .\\Features\\Filterfunctionality.feature
// .\\Features\\Calendar.feature
